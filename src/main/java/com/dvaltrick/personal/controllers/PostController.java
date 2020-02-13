package com.dvaltrick.personal.controllers;

import java.util.List;

import com.dvaltrick.personal.models.Post;
import com.dvaltrick.personal.services.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * PostController
 */
@RestController
public class PostController {
    @Autowired
    private PostService service;

    @RequestMapping(value="/api/post",
	        method={RequestMethod.GET},
	        produces=MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody
	public ResponseEntity<?> findAll(){
		try{
            return new ResponseEntity<List<Post>>(service.findAll(), HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
    
}