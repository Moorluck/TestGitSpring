package com.example.test.repository;

import com.example.test.model.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {
    Post findByMessage(String message);

    @Query(value = "SELECT * FROM post p WHERE LENGTH(p.message) > 10", nativeQuery = true)
    List<Post> findLongPost();
}
