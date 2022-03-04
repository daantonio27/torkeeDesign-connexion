package com.daantonio.torkeeDesign.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.daantonio.torkeeDesign.model.User;
import com.daantonio.torkeeDesign.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
