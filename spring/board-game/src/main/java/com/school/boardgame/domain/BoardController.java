package com.school.boardgame.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private BoardRepository boardRepository;

    @PostMapping(value = "/newBoard")
    @ResponseBody
    public Board selectAllUser(Board newBoard, MultipartFile[] files){
        GregorianCalendar gc = new GregorianCalendar();
        String today = new SimpleDateFormat("yyyyMMddhhmmss").format(gc.getTime());

        Path currentPath = Paths.get("");
        //프로젝트경로
        String projectPath = currentPath.toAbsolutePath().toString();
        //저장경로
        String savePath=projectPath+"/src/main/resources/images";
        //파일유무 없으면 생성
        File folder;
        folder = new File(savePath);
        if(!folder.exists()) folder.mkdirs();
        List<FileInfo> urls = new ArrayList<FileInfo>();
        if(files!=null) {
            for (MultipartFile file : files) {
                String originalFileName = file.getOriginalFilename();
                String saveFileName = today + originalFileName.substring(originalFileName.lastIndexOf('.'));
                if (!originalFileName.isEmpty()) {
                    try{
                        file.transferTo(new File(folder, saveFileName));
                        System.out.println("파일업로드");
                        FileInfo fi = new FileInfo();
                        fi.setUrl(folder+"/"+saveFileName);
                        System.out.println("파일저장 "+folder+"/"+saveFileName);
                        urls.add(fi);
                    }catch (Exception e){
                        System.out.println("파일처리못함 "+e.toString());
                    }
                }
            }
        }
        System.out.println("파일정보 보드에 추가");
        newBoard.setFileInfo(urls);
        System.out.println("newBoard "+newBoard.toString());
        Board saveBoard = boardRepository.save(newBoard);

        return saveBoard;
    }

    @GetMapping(value = "/board")
    @ResponseBody
    public List<Board> allUser(@RequestParam(required = false) String name){
        Map<String, Object> response = new HashMap<>();
        //jpa에 있는 findAll사용

        List<Board> boardList = null;
        if (name != null) {
            boardList = boardRepository.findAllByName(name);
        } else {
            boardList = boardRepository.findAll();
        }

        System.out.println("findAll");
        return boardList;
    }

    @Transactional
    @Modifying
    @PostMapping(value = "/deleteBoard")
    @ResponseBody
    public Boolean DeleteBoard(@RequestParam("board") Long id) {
        try{
            boardRepository.deleteById(id);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    @Transactional
    @Modifying
    @PostMapping(value = "/updateBoard")
    @ResponseBody
    public Optional<Board> UpdateBoard(
            @RequestParam("boardId") Long id,
            @RequestParam("name") String name,
            @RequestParam("distributor") String distributor,
            @RequestParam("min_person") int min_person,
            @RequestParam("max_person") int max_person
    ) {
        Optional<Board> oldBoard = boardRepository.findById(id);
        oldBoard.ifPresent(selectBoard ->{
            selectBoard.setName(name);
            selectBoard.setDistributor(distributor);
            selectBoard.setMin_person(min_person);
            selectBoard.setMax_person(max_person);
            Board updatedBoard = (Board) boardRepository.save(selectBoard);
        });
        return boardRepository.findById(id);
    }


}
