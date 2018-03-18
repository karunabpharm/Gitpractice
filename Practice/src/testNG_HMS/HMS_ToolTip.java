package testNG_HMS;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class HMS_ToolTip {
 public WebDriver driver;
  @Test
  public void f() {
	 
	  //not Printing
	  String str=driver.findElement(By.linkText("SeleniumByMahesh")).getAttribute("SeleniumByMahesh");
	  System.out.println(str);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://www.seleniumbymahesh.com");
	  driver.manage().window().maximize();
  }

}
