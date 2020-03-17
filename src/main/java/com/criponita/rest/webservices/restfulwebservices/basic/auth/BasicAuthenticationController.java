package com.criponita.rest.webservices.restfulwebservices.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
@CrossOrigin(origins = {"http://localhost:3000", "https://react.criptonita.info"})
public class BasicAuthenticationController {
	//GET
	//URI - /hello-word
	//method - "Hello World"
	//@RequestMapping(method=RequestMethod.GET, path= "/hello-world")

	//hello-world-bean
	@GetMapping(path= "/basicauth")
	public AuthenticationBean helloWorldBean() {
		return new AuthenticationBean("Login efetuado com sucesso");
	}

}
