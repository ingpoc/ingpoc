package com.cog.ingpoc.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cog.ingpoc.dao.UserDao;
import com.cog.ingpoc.data.User;
import com.cog.ingpoc.model.UserForm;
import com.cog.ingpoc.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserDao userDao;
	
	@Override
	public User createUser(User user) {
		 
		return userDao.createUser(user);
		
	}

	

}
