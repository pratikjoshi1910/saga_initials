package com.user.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dto.UserDTO;
import com.user.entity.User;
import com.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepoSitory;

	@Override
	public String createUser(UserDTO userDTO) {

		User user = new User();
		BeanUtils.copyProperties(userDTO, user);
		user = userRepoSitory.save(user);
		return user.getUserId().toString();
	}

}
