package com.dev.thossen.usermms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.thossen.usermms.model.User;
import com.dev.thossen.usermms.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
 
    
    @Override
    public User saveUser(User user) {
    	return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
             return userRepository.findAll();        
    }

    @Override
    public User getUserById(Long id) {
        
    return userRepository.findById(id).get();
        
    }

    @Override
    public boolean deleteUser(Long id) {
        User user =  userRepository.findById(id).get();
        userRepository.delete(user);
        return true;
    }

    @Override
    public User updateUser(Long id, User user) {
    	
    	User olduser =userRepository.findById(id).get();
    	if (olduser != null) {
			user.setId(id);
			return userRepository.save(user);
		}

		return null;
    }
        
    }




