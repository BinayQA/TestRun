package AppTesting.Apps;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginPage {
	
	public static void main(String[] args) {
	
		
	

	/*@Test
	public void SetUp() 
	{*/
	
		System.out.println("Initilize All required method like Launch the Bro,Wait,...");
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("https://accounts.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement weblogin=driver.findElement(By.xpath("//div[@class='vgHGpc RRP0oc']"));		
		weblogin.click();
		weblogin.sendKeys("binay.qa@gmail.com");
		driver.quit();
		
	}
	
	}
