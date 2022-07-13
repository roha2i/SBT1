package com.study.sbt1.domain.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface postRepository extends JpaRepository<postEntity, Long> {
    //JpaRepository<Entity class, PK type> 을 상속받으면 기본 CRUD 메소드가 자동 생성됨
}
