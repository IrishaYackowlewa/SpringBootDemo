package com.exampleProject.demo.repo;

import com.exampleProject.demo.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
