package com.bhangarwale.www.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bhangarwale.www.model.UserInformation;

@Repository
@Transactional
public interface UserInformationRepository extends CrudRepository<UserInformation, Integer> {
	

}
