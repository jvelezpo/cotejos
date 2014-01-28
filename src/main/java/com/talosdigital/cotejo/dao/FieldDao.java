package com.talosdigital.cotejo.dao;

import com.talosdigital.cotejo.entity.Field;
import com.talosdigital.cotejo.entity.User;

public interface FieldDao {

	Field getFieldById(int id);

	void saveField(Field field);

	boolean bookField(Field field, User user);
}
