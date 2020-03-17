package com.criponita.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHCService {
	private static List<Todo> todos= new ArrayList();
	private static int idCounter = 0;

	static {
		todos.add(new Todo(++idCounter, "jirous","Aprender React", new Date(),false));
		todos.add(new Todo(++idCounter, "jirous","Ganhar Experiencia", new Date(),false));
		todos.add(new Todo(++idCounter, "jirous","Ficar Rico", new Date(),false));
	}
	
	public List<Todo> findAll(){
		return todos;
	}
}
