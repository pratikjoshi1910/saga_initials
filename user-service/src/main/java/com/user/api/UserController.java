package com.user.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.dto.UserDTO;
import com.user.entity.User;
import com.user.repository.UserRepository;
import com.user.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	UserRepository userRepository;

	@PostMapping
	public ResponseEntity<String> createUser(@RequestBody UserDTO userDTO) {
		String userId = userService.createUser(userDTO);
		return new ResponseEntity<String>(userId, HttpStatus.OK);

	}

	@GetMapping
	public ResponseEntity<List<UserDTO>> getAllUsers()

	{
		List<User> users = userRepository.findAll();
		List<UserDTO> userDTOs = new ArrayList<>();
		for (User user : users) {
			UserDTO userDTO = new UserDTO(user);
			userDTOs.add(userDTO);
		}
		return new ResponseEntity<>(userDTOs, HttpStatus.OK);
	}

}
