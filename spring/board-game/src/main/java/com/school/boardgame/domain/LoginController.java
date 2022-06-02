package com.school.boardgame.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {

    private final UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody RequestLoginDto request) {
        if (userService.login(request))
            return "OK";
        else
            return "FUCK YOU";
    }

}
