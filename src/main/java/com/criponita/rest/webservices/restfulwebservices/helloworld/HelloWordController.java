package com.criponita.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
@CrossOrigin(origins = {"http://localhost:3000", "https://react.criptonita.info"})
public class HelloWordController {
	//GET
	//URI - /hello-word
	//method - "Hello World"
	//@RequestMapping(method=RequestMethod.GET, path= "/hello-world")
	@GetMapping(path= "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	//hello-world-bean
	@GetMapping(path= "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean");
	}
	
	@GetMapping(path= "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		//throw new RuntimeException("Algo deu errado");
		return new HelloWorldBean(String.format("Hello World, %s",name));
	}	
}
