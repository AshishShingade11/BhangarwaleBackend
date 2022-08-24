package com.bhangarwale.www;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.bhangarwale.www.exceptions.UserNotFounfException;
import com.bhangarwale.www.model.UserInformation;

@SpringBootTest
@ActiveProfiles("stage")
class BhangarwaleApplicationTests {
	
	@Value("${server.port}")
	private String port;

	@Test
	void contextLoads() {
		
		
		System.out.println("the port number is : " + port);
		
	}
	
	@Test
	void userInformation() {
		
		UserInformation information=null;
		//information.setName("Ashish");;
		
		 Optional<UserInformation> opt = Optional.ofNullable(information);
		    
		    opt.orElseThrow(NullPointerException::new);	

		    opt.ifPresent(userInformation -> {
		    	
		    	System.out.println(userInformation.getName());
		    	
		    	
		    });

		
		System.out.println("the port number is : " + port);
		
	}

	

}
