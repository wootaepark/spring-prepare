package com.sparta.springprepare.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    @ResponseBody
    public String handleTypeMismatch(MethodArgumentTypeMismatchException ex) {
        return "잘못된 형식의 입력입니다. 나이는 숫자여야 합니다.";
    }
}
// 이 코드는 다른 컨트롤러 보다 상단에 있어야 동작한다.
