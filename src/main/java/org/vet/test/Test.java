package org.vet.test;

import java.net.URI;
import org.springframework.web.client.RestTemplate;
import org.vet.entity.User;



public class Test {

	public static final String REST_SERVICE_URI = "http://localhost:7070/vetservice";
	
	
	
	private static void login(){
		System.out.println("Testing getUser API----------");
		RestTemplate restTemplate = new RestTemplate();
		User user = new User("pooja@gmail.com", "abcd");
        String uri = restTemplate.postForObject(REST_SERVICE_URI+"/loginUser/", user, String.class);
        System.out.println("executed");
        System.out.println("Location : "+uri.toString());
	}
	
	
    public static void main(String args[]){
    	
    	login();
		
    }
}
