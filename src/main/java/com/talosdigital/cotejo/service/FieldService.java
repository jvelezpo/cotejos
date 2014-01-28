package com.talosdigital.cotejo.service;

import com.talosdigital.cotejo.dao.FieldDao;
import com.talosdigital.cotejo.entity.Field;
import com.talosdigital.cotejo.entity.User;

public interface FieldService {

	Field getFieldById(int id);

	void saveField(Field field);

	boolean bookField(Field field, User user);
	
	void setFieldDao(FieldDao fieldDao);
}
