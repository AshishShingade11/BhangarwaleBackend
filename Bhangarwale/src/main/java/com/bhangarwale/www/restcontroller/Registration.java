package com.bhangarwale.www.restcontroller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bhangarwale.www.exceptions.UserNotFounfException;
import com.bhangarwale.www.interfaces.UserInformationInterface;
import com.bhangarwale.www.model.UserInformation;
import com.bhangarwale.www.responses.UserInformationResponse;

@RestController
@RequestMapping("/thebhangarwale")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Registration {
	
	
	@Autowired
	UserInformationInterface informationInterface;
	
	@RequestMapping("/registration")
	public ResponseEntity<?> registration(@RequestBody UserInformation information)
	{

		
		
	    Optional<UserInformation> opt = Optional.ofNullable(information);
	    
	    opt.orElseThrow(NullPointerException::new);
	    
	    if(opt.isPresent())
	    {
	    	
	    	informationInterface.register(opt.get());
	    	
	    }
	    

//	    opt.ifPresent(userInformation -> {
//	    	
//	   informationInterface.register(information);
//	    	
//	    	
//	    });
	    
	    
	    return new ResponseEntity<Object>(null, HttpStatus.OK);
		
	}
	@RequestMapping("/test")
	public String test()
	{
		
		
	return "All working fine";	
	}

}
