package testNG_SpiceJet;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Print_dropdown_Adults {
	public WebDriver driver;
  @Test
  public void f() {
	/*WebElement str=new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']"))).getFirstSelectedOption();
	System.out.println(str.getText());
	if (str.getText().equalsIgnoreCase("1"))
	{
		System.out.println("default value is 1");
	}
	else
	{
		System.out.println("not default value is 1");
	}*/
	  List<WebElement> str=new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']"))).getOptions();
	  System.out.println(str.size());
	  for (int i=0;i<str.size();i++)
	  {
		  System.out.println(str.get(i).getText());
	  }
	
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.get("http://www.spicejet.com");
		driver.manage().window().maximize();
  }

}
