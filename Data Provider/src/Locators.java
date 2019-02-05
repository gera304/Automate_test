import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.qa.util.Utilities;

public class Locators {

	public static void main(String[] args) throws IOException {
		
		//String s=getDataFromProperties("./config/config.properties","Email");
		String s=Utilities.getDataFromProperties("./src/gera.properties","Email");
		System.out.println(s);
		//String s=obj.getProperty("Email");

	}

}
