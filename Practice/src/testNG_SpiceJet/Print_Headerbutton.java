package testNG_SpiceJet;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Print_Headerbutton {
	public WebDriver driver;
  @Test
  public void f() {
	  WebElement str=driver.findElement(By.xpath("//*[@id='buttons']/div"));
	  System.out.println(str);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.spicejet.com");
		driver.manage().window().maximize();
  }

}
