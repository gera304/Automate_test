package bookings;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddBill {
	

		ChromeDriver driver;

		@BeforeMethod

		public void bill() throws InterruptedException {
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
		public void b() throws InterruptedException
		{
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[1]/div[2]/div[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/a[2]")).click();
			Thread.sleep(5000);
			//if(driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]"))!=null)
			if(driver.findElement(By.xpath("//div[contains(@class,'dashboard_container')]"))!=null)	
			{
				driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[5]/span[1]")).click(); //Click on add bill
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//div[@class='options-container']//div[6]")).click();
				
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("100");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]")).click();
			}
			
			else
			{
				System.out.println("Test close");
				driver.quit();
				
			}
			
		}
}