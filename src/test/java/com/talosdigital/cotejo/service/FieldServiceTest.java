package com.talosdigital.cotejo.service;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.talosdigital.cotejo.dao.FieldDao;
import com.talosdigital.cotejo.entity.Field;
import com.talosdigital.cotejo.service.FieldService;
import com.talosdigital.cotejo.service.impl.FieldServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class FieldServiceTest {

	private static final int FIELD_ID = 1;
	
	@Mock
	private FieldDao fieldDao;
	
	@Mock
	private Field field;
	
	private FieldService fieldService;
	
	@Before
	public void init(){
		fieldService = new FieldServiceImpl();
		fieldService.setFieldDao(fieldDao);
	}
	
	@Test
	public void testGetFieldById(){
		when(fieldDao.getFieldById(FIELD_ID)).thenReturn(field);
		when(field.getId()).thenReturn(FIELD_ID);
		Field tempField = fieldService.getFieldById(FIELD_ID);
		assertEquals(FIELD_ID, tempField.getId());
	}
}
