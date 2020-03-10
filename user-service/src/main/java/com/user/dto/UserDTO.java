package com.user.dto;

import com.user.entity.User;
import com.user.enums.UserStatus;
import com.user.enums.UserType;

public class UserDTO {

	private String userId;

	private String userName;

	private UserType type;

	private UserStatus status;

	private String email;

	public UserDTO() {

	}

	public UserDTO(User user) {

		this.userId = user.getUserId().toString();
		this.userName = user.getUserName();
		this.type = user.getType();
		this.status = user.getStatus();
		this.email = user.getEmail();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	public UserStatus getStatus() {
		return status;
	}

	public void setStatus(UserStatus status) {
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
