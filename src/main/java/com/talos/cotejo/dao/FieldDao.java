package com.talos.cotejo.dao;

import com.talos.cotejo.entity.Field;
import com.talos.cotejo.entity.User;

public interface FieldDao {

	Field getFieldById(int id);

	void saveField(Field field);

	boolean bookField(Field field, User user);
}
