import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.util.Utilities;

public class Login{
	public static void main(String[] args) throws InterruptedException, IOException
	
	
	
	{
	
	 System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
        WebDriver driver = new ChromeDriver();              
        driver.get("http://www.facebook.com");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        
        Properties obj= new Properties();
        FileInputStream f= new FileInputStream("D:\\Rahul\\Gera\\Data Provider\\src\\gera.properties");
        obj.load(f);
		//String s=obj.getProperty("Email");
		Thread.sleep(5000);
        driver.findElement(By.className(obj.getProperty("Email"))).sendKeys("abc");
        Thread.sleep(5000);
        driver.findElement(By.id(obj.getProperty("Password"))).sendKeys("123456");
        
        String g=Utilities.getDataFromProperties("./src/gera.properties","Password");
        System.out.println(g);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;                         // Scroll page
        js.executeScript("window.scrollBy(0,1000)");
        
}
}