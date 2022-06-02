package com.example.boardgame.controller;

import com.example.boardgame.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }


    @PostMapping("/login")
    @ResponseBody
    public String loginId(@RequestBody UserDto user) {
        System.out.println("로그인22");
        if(loginService.login(user)){
            return "Ok";
        }else{
            return "Fail";
        }
    }
}

