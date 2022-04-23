package com.java.day06;

public enum Religion {
    Buddhism("불교"),
    Christian("기독교"),
    Confucianism("유교"),
    Muslim("이슬람교"),
    atheism("무신론");

    private final String description;

    Religion(String description) {
        this.description = description;
    }
}
