package testNG_HMS;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class HMS_Mouseoveractions {
	public WebDriver driver;
	
  @Test
  public void Mouseover()throws Exception {
	  //here new batch option not clicking
	  Actions a =new Actions(driver);
	  Thread.sleep(3000);
	  WebElement str= driver.findElement(By.xpath("//*[@id='menu-item-72']/a"));
	  Thread.sleep(3000);
	  a.moveToElement(str).build().perform();
	  a.keyDown(Keys.CONTROL).sendKeys(Keys.DOWN).build().perform();
	  Thread.sleep(3000);
	  a.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://www.seleniumbymahesh.com");
	  driver.manage().window().maximize();
  }

}
