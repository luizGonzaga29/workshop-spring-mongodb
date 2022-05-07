package com.luizgonzaga.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.luizgonzaga.workshopmongo.domain.User;
import com.luizgonzaga.workshopmongo.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResources {

	@Autowired
	private UserService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		
		List<User> lista = service.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
}
