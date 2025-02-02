package com.app.service;

import java.util.List;

import com.app.dto.LoginDto;
import com.app.dto.UserDto;
import com.app.entity.User;

public interface UserService {

	String newUser(UserDto userDto);

	List<User> fetchAll();

	String removeUser(int id);

	boolean editUser(int id, UserDto userDto);

	User userLogin(LoginDto loginDto);

	User getById(int id);

}
