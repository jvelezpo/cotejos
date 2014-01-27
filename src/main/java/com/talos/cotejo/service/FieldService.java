package com.talos.cotejo.service;

import com.talos.cotejo.dao.FieldDao;
import com.talos.cotejo.entity.Field;
import com.talos.cotejo.entity.User;

public interface FieldService {

	Field getFieldById(int id);

	void saveField(Field field);

	boolean bookField(Field field, User user);
	
	void setFieldDao(FieldDao fieldDao);
}
