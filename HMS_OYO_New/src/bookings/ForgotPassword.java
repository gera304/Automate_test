package bookings;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ForgotPassword {

	ChromeDriver driver;

	@BeforeTest

	public void a() {
		System.setProperty("webdriver.chrome.driver", "/Users/oyo/Desktop/chromedriver");
		driver = new ChromeDriver();

		driver.get("http://www.oyoos.com/");

	}

	@Test

	public void method() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='text']")).click();

		driver.findElement(By.xpath("//input[@type='text']")).clear();
		

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("oyo003@oyoproperties.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("oyo@12345");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("div.button-container")).click();   //Click on login button
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/a[1]/span[1]")).click(); //click on forgotpassword
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("oyo003@oyoproperties.com"); //Enter email
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]")).click(); //Click on otp sent button
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")).clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("334444");  //Enter otp
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/input[1]")).clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/input[1]")).sendKeys("mukulgera"); //enter password
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/input[1]")).sendKeys("mukulgera"); //confirm password
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]")).click();
	}

}
