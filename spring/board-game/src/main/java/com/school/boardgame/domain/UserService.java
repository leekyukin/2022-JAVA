package com.school.boardgame.domain;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public boolean login(RequestLoginDto request) {
        User val = userRepository.login(request.getEmail(), request.getPw());
        log.info("request resutl : {}", request);
        log.info("login result : {}",val);
        if (val == null || !val.getPw().equals(request.getPw()) )
            return false;
        else
            return true;
    }
}
