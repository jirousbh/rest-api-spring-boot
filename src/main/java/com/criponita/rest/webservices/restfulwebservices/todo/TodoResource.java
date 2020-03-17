package com.criponita.rest.webservices.restfulwebservices.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.criponita.rest.webservices.restfulwebservices.todo.Todo;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class TodoResource {
	
	@Autowired
	private TodoHCService todoService;

	@GetMapping ("/users/{username}/todos")
	public List<Todo> getAllTodos(@PathVariable String username){
		return 	todoService.findAll();	
	}
}
