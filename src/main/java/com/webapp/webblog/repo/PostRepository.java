package com.webapp.webblog.repo;

import com.webapp.webblog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
