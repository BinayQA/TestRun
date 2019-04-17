package select;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_class {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BinayBaba\\TestRun\\App\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
        WebElement wb=driver.findElement(By.xpath("//select[contains(@name,'selenium_commands')]"));
       Select sel=new Select(wb);
       System.out.println(sel.isMultiple());
       List<WebElement> lst=driver.findElements(By.xpath("//select[contains(@name,'selenium_commands')]"));
       for(int i=0;i<lst.size();i++)
       {
    	   System.out.println(lst.get(i).getText());
    	   sel.getAllSelectedOptions();
    	   
       }
       
       
		
	}

}
