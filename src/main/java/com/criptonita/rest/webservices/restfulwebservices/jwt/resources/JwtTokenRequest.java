package com.criptonita.rest.webservices.restfulwebservices.jwt.resources;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  	private String username;
  	private String password;
    
    /*{
    	"token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJqaXJvdXMiLCJleHAiOjE1ODUxNTU4NjEsImlhdCI6MTU4NDU1MTA2MX0.7X3htk-QJ9hbaIHgU5BdXknY9uwLBBi7s6SfXkVRh2Hkki4J2eplNVtCmmv3yakXNDK39hABuC9DBgbpKUIPJw"
    	}  */  

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}