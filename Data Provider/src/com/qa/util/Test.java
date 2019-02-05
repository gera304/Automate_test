package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test extends Utilities {
	
	public static  String data(String filepath, String key) throws IOException
	{
		Properties obj= new Properties();
        FileInputStream f= new FileInputStream(filepath);
        obj.load(f);
        return key;
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
	String a=	Test.getDataFromProperties("./src/gera.properties", "Password");
	//System.out.println(a);
     String m=	Test.data("./src/gera.properties", "Email");
     System.out.println(m);
	
	

	}

}
