package com.school.boardgame.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Properties;

@RestController
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
}
