package com.dvaltrick.personal.services;

import java.util.List;

import com.dvaltrick.personal.models.Personal;
import com.dvaltrick.personal.repositories.PersonalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * PersonalService
 */
@Service
public class PersonalService {
    @Autowired 
	private PersonalRepository repository;
    
    public List<Personal> findAll() {
        return repository.findAll();
    }

}