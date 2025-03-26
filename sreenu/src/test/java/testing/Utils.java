package testing;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Utils 
{
	static WebDriver driver;
	
		@BeforeTest
		public void launch()
		{
			System.out.println("Launching the web browser");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("https://testautomationpractice.blogspot.com/");
		}
		
		
		@Test
		public void registration() throws InterruptedException
		{
			driver.findElement(By.id("name")).sendKeys("ramu");
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sreenu@gmail.com");
			driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("123456789");
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.xpath("//*[@id='phone']")).getText());
//			driver.findElement(By.xpath("")).click();
		}
		
		@AfterTest
		public void close()
		{
			driver.close();
		}
		
	}
	

