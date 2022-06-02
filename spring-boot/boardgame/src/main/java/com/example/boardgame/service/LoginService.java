package com.example.boardgame.service;

import com.example.boardgame.controller.UserDto;
import com.example.boardgame.entity.User;
import com.example.boardgame.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class LoginService {

    @Autowired
    //private final userRepository userRepository;
    private final UserRepository userRepository;

    public boolean login(UserDto user) {
        User findUser = userRepository.findUser(user.getEmail(),user.getPassword());

        if(findUser == null){
            return false;
        }
        if(!findUser.getPassword().equals(user.getPassword())){
            return false;
        }
        return true;    
    }
}
