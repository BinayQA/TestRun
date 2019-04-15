package AppTesting.Apps;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowsHandle {
	
	@Test
	public void TestUp() throws InterruptedException
	{
		
	WebDriver driver;
	
	
		driver=new FirefoxDriver();		
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
String parent=driver.getWindowHandle();
Set<String> s1=driver.getWindowHandles();
Iterator<String> i1=s1.iterator();
while(i1.hasNext())
{
	String child_window=i1.next();
	if(!parent.equals(child_window))
	{
		driver.switchTo().window(child_window);
	System.out.println(driver.switchTo().window(child_window).getTitle());
	driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("binayredrose@gmail.com");
	driver.findElement(By.xpath("//input[@name='btnLogin']")).submit();	
	driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
	}
	//driver.close();
}
		
		
		
}
}