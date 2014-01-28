package com.talosdigital.cotejo.service;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.talosdigital.cotejo.dao.UserDao;
import com.talosdigital.cotejo.entity.User;
import com.talosdigital.cotejo.exception.NoSuchUser;
import com.talosdigital.cotejo.service.UserService;
import com.talosdigital.cotejo.service.impl.UserServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
	
	private static final int USER_ID = 1;
	private static final int NEGATIVE_USER_ID = -1;
	
	@Mock
	private UserDao userDao;
	
	@Mock
	private User user;
	
	private UserService userService;
	
	@Before
	public void init(){
		userService = new UserServiceImpl();
		userService.setUserDao(userDao);
	}
	
	@Test
	public void testGetUserById(){
		when(userDao.getUserById(USER_ID)).thenReturn(user);
		when(user.getId()).thenReturn(USER_ID);
		User tempUser = userService.getUserById(USER_ID);
		assertEquals(USER_ID, tempUser.getId());
	}
	
	@Test
	public void testGetUserByNegativeId(){
		User tempUser = userService.getUserById(NEGATIVE_USER_ID);
		assertNull(tempUser);
	}
	
	@Test(expected=NoSuchUser.class)
	public void testNoUserWithSuchId(){
		when(userDao.getUserById(USER_ID)).thenThrow(NoSuchUser.class);
		userService.getUserById(USER_ID);
	}

}
