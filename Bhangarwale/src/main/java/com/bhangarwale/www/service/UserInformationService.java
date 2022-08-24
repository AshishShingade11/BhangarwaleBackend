package com.bhangarwale.www.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhangarwale.www.interfaces.UserInformationInterface;
import com.bhangarwale.www.model.UserInformation;
import com.bhangarwale.www.repositories.UserInformationRepository;
import com.bhangarwale.www.responses.UserInformationResponse;

@Service
public class UserInformationService implements UserInformationInterface{
	
	@Autowired
	UserInformationRepository userInfoRepo;

	@Override
	public UserInformationResponse register(UserInformation information) {
		
		userInfoRepo.save(information);
		
		return null;
	}

}
