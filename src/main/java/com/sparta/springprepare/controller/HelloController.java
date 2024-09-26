package com.sparta.springprepare.controller;

import org.springframework.web.bind.annotation.*;

@RestController // @Controller 가 들어가면 ... (주석 참고)
@RequestMapping("/api")
public class HelloController {


    // @Controller 와 @ResponseBody 를 쓰는것과 동일하다.
    @GetMapping("/hello")
    // @ResponseBody
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("/get")
    public String get(){
        return "GET Method 요청";
    }

    @PostMapping("/post")
    public String post(){
        return "POST Method 요청";
    }

    @PutMapping("/put")
    public String put(){
        return "PUT Method 요청";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return  "DELETE Method 요청";
    }

}
