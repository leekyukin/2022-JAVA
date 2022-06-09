package com.example.boardgame.controller;

import com.example.boardgame.entity.dto.SessionConst;
import com.example.boardgame.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }


    @PostMapping("/login")
    @ResponseBody
    public String loginId(@RequestBody UserDto user, HttpServletRequest request) {
        System.out.println("로그인22");
        if(loginService.login(user)){

            HttpSession session = request.getSession();
            session.setAttribute(SessionConst.LOGIN_USER, user);
            System.out.println("세션 추가");

;            return "Ok";
        }else{
            return "Fail";
        }
    }
}

