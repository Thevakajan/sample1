package org.automation.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {
   
	public static Object fetchProperty(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./config/config.properties");
		Properties property = new Properties();
		property.load(fis);
		
		  return property.get(key);
	}
	public static String fetchLocatorValue(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./config/Elements.properties");
		Properties property = new Properties();
		property.load(fis);
		
		  return property.get(key).toString();
	}
}
