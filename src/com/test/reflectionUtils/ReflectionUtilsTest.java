package com.test.reflectionUtils;

//import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.junit.Test;

import com.reflectionUtils.ReflectionUtils;

public class ReflectionUtilsTest {

	@Test
	public void testGetMethod() {
		Class clazz = Class.forName("com.test.Student");
		Object obj = clazz.newInstance();
		
		String methodName = "doSomething";
		Object [] args =  {"I'm student."};
		Class [] parameterTypes = new Class[args.length];
		Method method = ReflectionUtils.getDeclareMethod( obj, methodName, parameterTypes){
			
		}
	}
}
