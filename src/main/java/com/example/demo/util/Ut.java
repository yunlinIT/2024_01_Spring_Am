package com.example.demo.util;

import java.lang.reflect.Array;
import java.util.Map;

public class Ut {

	public static boolean isNullOrEmpty(Object obj) {
		if(obj == null) {
			return true;
		}
		
		if (obj instanceof String) {
			return ((String) obj).trim().length() == 0;
		}
		
		if (obj instanceof Map) {
			return ((Map<?, ?>) obj).isEmpty();
		}
		
		if (obj.getClass().isArray()) {
			return Array.getLength(obj) == 0;
		}
		return false;
	}

}