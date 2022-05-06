package com.luizgonzaga.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.luizgonzaga.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResources {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("1", "Maria Silva", "maria@maria");
		User alex = new User("1", "Alex Gate", "alex@alex");
		List<User> lista = new ArrayList<>();
		lista.addAll(Arrays.asList(maria,alex));
		return ResponseEntity.ok().body(lista);
	}
	
}
