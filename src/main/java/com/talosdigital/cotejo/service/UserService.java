package com.talosdigital.cotejo.service;

import com.talosdigital.cotejo.dao.UserDao;
import com.talosdigital.cotejo.entity.User;

public interface UserService {

	User getUserById(int id);

	void setUserDao(UserDao userDao);
}
