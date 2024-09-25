package com.sparta.springprepare;

import lombok.*;

@Getter
@Setter
//@NoArgsConstructor // 기본 생성자, 아래의 RequiredArgsConstructor 와 같이 쓰일 수 없음 (필수 인자가 필요하기 떄문)
@AllArgsConstructor // 모든 인자를 가진 생성자
@RequiredArgsConstructor // 요구되는 필드들을 가지는 생성자 (final 을 가지는 필드를 가지는 생성자를 만들어준다.)
public class Memo {
    private final String username;
    private String contents;
}