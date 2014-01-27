package com.talos.cotejo.service.impl;

import com.talos.cotejo.dao.FieldDao;
import com.talos.cotejo.entity.Field;
import com.talos.cotejo.entity.User;
import com.talos.cotejo.service.FieldService;

public class FieldServiceImpl implements FieldService{
	
	private FieldDao fieldDao;

	public Field getFieldById(int id) {
		return fieldDao.getFieldById(id);
	}

	public void saveField(Field field) {
		// TODO Auto-generated method stub
		
	}

	public boolean bookField(Field field, User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public void setFieldDao(FieldDao fieldDao) {
		this.fieldDao = fieldDao;
	}
}
