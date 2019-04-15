package AppTesting.Apps;

import java.util.concurrent.TimeUnit;

import javax.swing.text.html.CSS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.security.Credentials;
import org.testng.annotations.Test;

public class AlertOkDissmis {
	
	
	@Test
	public void TestUp() throws InterruptedException
	{
		
	WebDriver driver;
	
	
		driver=new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("binay");;
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		/*alert.dismiss();
		driver.findElement(By.xpath("//input[@name='res']")).click();
        driver.close();*/
		String s1=driver.switchTo().alert().getText();
		System.out.println(s1);
		Thread.sleep(2000);
		alert.accept();
		alert.accept();
		
		
		
		}
		}

