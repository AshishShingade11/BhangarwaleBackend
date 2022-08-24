package com.bhangarwale.www.interfaces;

import com.bhangarwale.www.model.UserInformation;
import com.bhangarwale.www.responses.UserInformationResponse;

public interface UserInformationInterface {
	
	public UserInformationResponse register(UserInformation information);

}
