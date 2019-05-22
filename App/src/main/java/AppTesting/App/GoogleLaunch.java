package AppTesting.App;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleLaunch {

	private static WebDriverWait WebDriverWait;

	public static void main(String[] args) {
				
		WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BinayBaba\\AppData\\Local\\Temp\\chromedriver.exe");
	driver=new ChromeDriver();
		
		driver.get("https://www.seleniumhq.org/projects/webdriver/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait =new WebDriverWait(driver,10);
		driver.findElement(By.xpath("//a[@title='Get Selenium']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'About Selenium')]")).click();
		
		//driver.close();

	}

}
