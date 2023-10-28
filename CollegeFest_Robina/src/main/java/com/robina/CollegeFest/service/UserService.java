package com.vishal.CollegeFest.service;

import com.vishal.CollegeFest.dto.UserRegistrationDto;
import com.vishal.CollegeFest.entity.User;

public interface UserService {
	public User save(UserRegistrationDto registrationDto);


}
