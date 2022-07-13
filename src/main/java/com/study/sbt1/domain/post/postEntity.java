package com.study.sbt1.domain.post;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor      //기본생성자 자동 추가 == public Posts{}
@Getter         //getter 메소드 자동 추가
@javax.persistence.Entity //게시판 post에 관한 Entity
public class postEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    //PK -> auto Increment

    @Column(length = 500, nullable = false)     //varchar(255)가 기본 > 500으로 늘림
    private String title;

    @Column(columnDefinition = "Text", nullable = false)        //varchar(255)가 기본 > type을 TEXT로 변경
    private String text;

    private String author;

    @Builder        //builder 클래스 자동 생성 > 생성자 대신 사용
    public postEntity(String title, String text, String author) {
        this.title = title;
        this.text = text;
        this.author = author;
    }

}
