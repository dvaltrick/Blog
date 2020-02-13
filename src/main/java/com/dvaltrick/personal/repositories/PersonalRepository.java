package com.dvaltrick.personal.repositories;

import java.util.List;

import com.dvaltrick.personal.models.Personal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * PersonalRepository
 */
@Repository
public interface PersonalRepository extends JpaRepository<Personal, Integer> {
    
}