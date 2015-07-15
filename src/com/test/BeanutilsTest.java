package com.test;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

public class BeanutilsTest {
	
	@Test
	public void testSetProperty() throws IllegalAccessException, InvocationTargetException{
		Object bean = new Student();
		
		BeanUtils.setProperty(bean, "name", "Lily");
		
		System.out.println(bean);
	}
}
