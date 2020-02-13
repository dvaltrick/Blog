package com.dvaltrick.personal.repositories;

import com.dvaltrick.personal.models.Post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * PostRepository
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

    
}