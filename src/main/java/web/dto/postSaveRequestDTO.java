package web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import com.study.sbt1.domain.post.postEntity;

@NoArgsConstructor  //기본 생성자 자동 추가 == public Posts()
@Getter         //getter 메소드 자동 추가
public class postSaveRequestDTO {
    private String title;
    private String text;
    private String author;

    @Builder        //Dto에서 필요한 부분을 entity화 시킴
    public postSaveRequestDTO(String title, String text, String author) {
        this.title = title;
        this.text = text;
        this.author = author;
    }

    public postEntity toEntity(){
        return postEntity.builder()
                .title(title)
                .author(author)
                .text(text)
                .build();
    }
}
