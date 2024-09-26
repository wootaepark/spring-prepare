package com.sparta.springprepare.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/response")
public class ResponseController {

    @GetMapping("/json/string")
    @ResponseBody
    public String helloStringJson() {
        return "{\"name\":\"Robbie\",\"age\":95}";
        // json 형태의 String 타입으로 반환 (비추천)
        // 응답 타입 : Content-Type : text/html
    }

    // Content-Type : application/json
    @GetMapping("/json/class")
    @ResponseBody
    public Star helloClassJson(){
        return new Star("Robbie", 95);
        // 자바 객체를 반환하면 JSON 형태로 변환해야 하는데
        // Spring 내부적으로 JSON 형태로 변환해준다.
    }
}
