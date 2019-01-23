package bookings;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Upcoming {
ChromeDriver driver;
	
	@BeforeMethod
	public void a() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/oyo/Desktop/chromedriver");
		driver = new ChromeDriver();

		driver.get("http://www.oyoos.com/");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("oyo003@oyoproperties.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("oyo@123456");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("div.button-container")).click();
		System.out.println(driver.getTitle());
		
		
	}
	
    @Test
    
    public void upcoming() throws InterruptedException
    {
   	 
   	 Thread.sleep(5000);
   	 driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[1]/div[2]/div[1]")).click();
   	 Thread.sleep(5000);
   	 driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]")).click();
   	 Thread.sleep(5000);
   	 if(driver.findElement(By.xpath("//div[contains(@class,'booking_detail_left_body_title')]//div[contains(@class,'')][contains(text(),'Checkin Now')]")) != null)
   	 {
   		
   		 //driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]")).click(); //Click checkin button
   		 driver.findElement(By.xpath("//div[contains(@class,'booking_detail_left_body_title')]//div[contains(@class,'')][contains(text(),'Checkin Now')]")).click();
   			Thread.sleep(3000);
   			
   			driver.findElement(By.xpath("//body[contains(@onload,'onLoad()')]/div[@id='root']/div[contains(@class,'appContainer')]/div[@id='dashboard']/div[contains(@class,'dashboard_container')]/div[contains(@class,'dashboard_centerBody')]/div[contains(@class,'dashboard_contentDiv')]/div[contains(@class,'booking_container')]/div/div[contains(@class,'assign-room-container')]/div[contains(@class,'assign-rooms-body')]/div[contains(@class,'assign-rooms-active-container')]/div[1]/div[2]/div[1]")).click();
   			Thread.sleep(3000);
   			driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]")).click();
   			Thread.sleep(5000);
   			driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
   			Thread.sleep(5000);
   			driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]")).click();
   			Thread.sleep(5000);
   			driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
   			Thread.sleep(5000);
   			driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
   		 
   	 }
   	 
   	 else 
   	 {
   		 driver.findElement(By.xpath("//div[contains(text(),'New Booking')]")).click();

   		 
   	 }
   	
    }
}
