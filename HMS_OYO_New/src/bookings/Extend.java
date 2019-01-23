package bookings;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Extend {
	
	

	ChromeDriver driver;

	@BeforeMethod

	public void extend() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/oyo/Desktop/chromedriver");
		driver = new ChromeDriver();
		

		driver.get("https://www.oyoos.com/");
		
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("oyo003@oyoproperties.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("oyo@123456");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("div.button-container")).click();
	}
	
	 @Test
	 
	 public void t()
	 {
		 driver.findElement(By.xpath("//span[contains(text(),'Extend')]")).click();  //click on extend booking button
	 }
	

}
