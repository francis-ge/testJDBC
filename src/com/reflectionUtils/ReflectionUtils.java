package com.reflectionUtils;

import java.lang.reflect.Method;

public class ReflectionUtils {
	
	public static Method getDeclareMehtod( Object obj, String methodName, Class<?>[] parametertypes) throws NoSuchMethodException, SecurityException{
		
		Class clazz = obj.getClass();
	
		Method method = clazz.getDeclaredMethod(methodName, parametertypes);
		return method;
	}
}
