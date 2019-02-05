package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utilities {

	public static String getDataFromProperties(String filepath, String key) throws FileNotFoundException, IOException {
		
		Properties obj= new Properties();
		
		FileInputStream f= new FileInputStream(filepath);
		obj.load(f);
		return obj.getProperty(key);
	}


	
}


/*public static data(String filepath, String key)
{
	Properties p= new Properties();
	FileInputStream f= new FileInputStream(filepath);
	p.load(f);
	return p.getProperty(key);
}*/