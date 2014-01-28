package com.talosdigital.cotejo.service.impl;

import com.talosdigital.cotejo.dao.UserDao;
import com.talosdigital.cotejo.entity.User;
import com.talosdigital.cotejo.service.UserService;

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
