package com.oracle.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.dao.UserDao;
import com.oracle.model.User;
import com.oracle.service.UserService;

@Component
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Transactional(readOnly=true)
	public User getUserById(Integer id) {
		return userDao.getUserById(id);
	}

}
