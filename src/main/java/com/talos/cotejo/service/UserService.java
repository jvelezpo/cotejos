package com.talos.cotejo.service;

import com.talos.cotejo.dao.UserDao;
import com.talos.cotejo.entity.User;

public interface UserService {

	User getUserById(int id);

	void setUserDao(UserDao userDao);
}
