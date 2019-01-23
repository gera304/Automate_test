package bookings;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Bookings extends Base{
	
	

	@Test
	
	public void create() throws InterruptedException
	
	{
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[contains(text(),'New Booking')]")).click();       //Click new booking button
		
		Thread.sleep(5000);
       
       	
		driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Mukul Gera");  //Enter user name
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("8295050806"); //Enter mob number
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]")).click(); //Click create booking
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]")).click(); //Click checkin button
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]")).click();  //
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(5000);
		Select s= new Select(driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")));
		s.selectByIndex(3);
	}     //comment
	
	     @Test
	     
	     public void upcoming_booking() throws InterruptedException
	     {
	    	 
	    	 Thread.sleep(5000);
	    	 driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[1]/div[2]/div[1]")).click();
	    	 Thread.sleep(5000);
	    	 driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]")).click();
	    	 Thread.sleep(5000);
	    	 //if(driver.findElement(By.xpath("//div[contains(@class,'booking_detail_left_body_title')]//div[contains(@class,'')][contains(text(),'Checkin Now')]"))!= null)
	    	 if(driver.findElement(By.xpath("//div[contains(@class,'booking_detail_left_body_title')]//div[contains(@class,'')][contains(text(),'Checkin Now')]"))!=null)
	    	 {
	    		
	    		 driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]")).click(); //Click checkin button
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
	    		 //driver.findElement(By.xpath("//div[contains(text(),'New Booking')]")).click();
	    		 //driver.findElement(By.xpath("//div[@class='button button-primary']")).click();
	    		 driver.findElement(By.xpath("//div[contains(text(),'New Booking')]")).click();
	    		

	    		 
	    	 }
	    	
	     }
	
	}
