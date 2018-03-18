package testNG_HMS;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class HMS_Links {
	public WebDriver driver;
  @Test
  public void verifying_Links() {
 List<WebElement> str= driver.findElements(By.tagName("a"));
	System.out.println(str.size());
	for (int i=0;i<str.size();i++)
	{
		System.out.println(str.get(i).getText());
	}
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://seleniumbymahesh.com");
	  driver.manage().window().maximize();
  }

}
