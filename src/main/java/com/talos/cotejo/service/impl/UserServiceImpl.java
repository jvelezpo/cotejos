package com.talos.cotejo.service.impl;

import com.talos.cotejo.dao.UserDao;
import com.talos.cotejo.entity.User;
import com.talos.cotejo.service.UserService;

public class UserServiceImpl implements UserService{
	
	private UserDao userDao;

	public User getUserById(int id) {
		if(id <= 0){
			return null;
		}
		return userDao.getUserById(id);
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}	
}
