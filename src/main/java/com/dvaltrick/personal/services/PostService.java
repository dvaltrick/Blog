package com.dvaltrick.personal.services;

import java.util.List;

import com.dvaltrick.personal.models.Post;
import com.dvaltrick.personal.repositories.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * PostService
 */
@Service
public class PostService {
    @Autowired
    private PostRepository repository;

    public List<Post> findAll() {
        return repository.findAll();
    }
    
}