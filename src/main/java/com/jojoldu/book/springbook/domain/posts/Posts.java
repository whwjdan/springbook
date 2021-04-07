package com.jojoldu.book.springbook.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts {

    @Id // 해당 테이블의 PK필
    // 주민번호, 복합키 등은 유니크 키로 별도 추가
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // PK 생성규칙 IDENTITY -> auto_increment
    private Long id;

    @Column(length = 500, nullable = false)
    // 테이블의 컬럼을 나타냄, 사용하지 않아도 되나 변경할 옵션이 있을 시 사용
    // 문자열의 경우 varchar(255)가 기본이나 500으로 늘리고 싶거나 타입 변경시
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    // -> Setter 대체
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

}
