package bookings;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Search {
	ChromeDriver driver;
	
	@BeforeTest
	
	public void c()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/oyo/Desktop/chromedriver");
		driver = new ChromeDriver();

		driver.get("http://hms.oyorooms.com/");
	}
	
	
  
	
	@Test
	
	public void search() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@type='text']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("oyo003@oyoproperties.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("oyo@123456");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("div.button-container")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("search_text")).sendKeys("mukul gera");
		Thread.sleep(3000);
		//open search result
		driver.findElement(By.xpath("//body[contains(@onload,'onLoad()')]/div[@id='root']/div[contains(@class,'appContainer')]/div[@id='dashboard']/div[contains(@class,'booking-search-container')]/div[contains(@class,'booking-search-content')]/div[contains(@class,'filtered-bookings-container')]/div/div/div/div[contains(@class,'table')]/div[contains(@class,'table-header-row-container')]/div/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		

	}
	
	 
		@Test
		
		public void search2() throws InterruptedException
		{
			driver.findElement(By.className("search_text")).sendKeys("sahil");
			Thread.sleep(5000);
			
			if(driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]"))!=null)
				
			{
				System.out.println("no result found");
				driver.close();
			}
			
		}
	
	
	
}


