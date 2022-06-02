package com.school.boardgame.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class RequestLoginDto {

    String email;
    String pw;
}
