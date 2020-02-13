package com.dvaltrick.personal.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dvaltrick.personal.models.Personal;
import com.dvaltrick.personal.services.PersonalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * PersonalController
 */
@CrossOrigin(origins="*")
@RestController
public class PersonalController {
    @Autowired
    private PersonalService service;
    
    @RequestMapping(value="/api/personal",
	        method={RequestMethod.GET},
	        produces=MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody
	public ResponseEntity<?> findAll(){
		try{
            return new ResponseEntity<List<Personal>>(service.findAll(), HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
    
}