package web.dto;

import com.study.sbt1.domain.post.postEntity;
import lombok.Getter;

@Getter         //getter메소드 자동 추가
public class postResponseDTO {
    private Long id;
    private String title;
    private String text;
    private String author;


    public postResponseDTO(postEntity entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.text = entity.getText();
        this.author = entity.getAuthor();
    }
}
