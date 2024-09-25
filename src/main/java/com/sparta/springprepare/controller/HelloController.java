package com.sparta.springprepare.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller 가 들어가면 ... (주석 참고)
public class HelloController {


    // @Controller 와 @ResponseBody 를 쓰는것과 동일하다.
    @GetMapping("/api/hello")
    // @ResponseBody
    public String hello(){
        return "Hello World!";
    }

}
