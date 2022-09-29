package com.dev.thossen.usermms.service;

import java.util.List;

import com.dev.thossen.usermms.model.User;

public interface UserService {
	
public    User saveUser(User user);
public    List<User> getAllUsers();
public    User getUserById(Long id);
public    boolean deleteUser(Long id);
public    User updateUser(Long id, User user);

}
