package testNG_SpiceJet;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class spicejet_Links {
	public WebDriver driver;
  @Test
  public void f() {
	 List<WebElement> str=driver.findElements(By.tagName("a"));
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
	  
	 // driver=new FirefoxDriver();
	  driver.get("http://www.spicejet.com");
	  driver.manage().window().maximize();
  }

}
