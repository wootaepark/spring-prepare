package com.sparta.springprepare.response;

import lombok.Getter;

@Getter // 없으면 json 형태로 반환이 안됨 (406, Not Acceptable 에러)
public class Star {
    String name;
    int age;

    public Star(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Star() {}
}