package com.school.boardgame.domain;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@ToString(of = {"email", "pw"})
public class User {

    @Id @GeneratedValue
    private Long id;

    private String name;

    private String email;

    private String pw;
}
