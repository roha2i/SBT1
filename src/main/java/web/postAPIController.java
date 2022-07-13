package web;

import com.study.sbt1.service.post.postService;
import web.dto.postSaveRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RequiredArgsConstructor        //Bean 주입 > @Autowired 대신 생성자로
@RestController
public class postAPIController {
    private final postService postService;


    @PostMapping("/saveForm/post")
    public Long save(@RequestBody postSaveRequestDTO requestDTO){       //dto에 내용 담겨 넘어와
        return postService.save(requestDTO);       //postService의 save메소드로 넘겨줌
    }

}
