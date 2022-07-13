package com.study.sbt1.service.post;

import com.study.sbt1.domain.post.postRepository;
import web.dto.postSaveRequestDTO;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@RequiredArgsConstructor
@Service
public class postService {
    private final postRepository postRepository;

    @Transactional
    public Long save(postSaveRequestDTO requestDTO){
        return postRepository.save(requestDTO.toEntity()).getId();
    }


}
