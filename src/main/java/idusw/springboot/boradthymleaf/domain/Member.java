package idusw.springboot.boradthymleaf.domain;

import lombok.*; // 애노테이션 기반 상용코드(boiler-plate code)를 생성해주는 라이브러리

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@ToString
@EqualsAndHashCode

public class Member {
    private Long seq;
    private String email;
    private String name;
    private String pw;
}
