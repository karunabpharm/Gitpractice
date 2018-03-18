package testNG_HMS;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Print_Headerpage {
	public WebDriver driver;
	
  @Test
  public void Printing_Headers() throws Exception{
	  //Here i cant able to print the messages
	 String str;
  driver.findElement(By.xpath("//*[@id='topHeader']/div/div/div/div")).getText();
	 // System.out.println(str);
	  Thread.sleep(3000);
	   str=driver.findElement(By.xpath("//*[@id='topHeader']/div/img")).getText();
	 System.out.println(str);
	 str=driver.findElement(By.xpath("//*[@id='myCarousel']/div/div[2]/img")).getText();
	 System.out.println(str);
	 
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://seleniumbymahesh.com");
	  driver.manage().window().maximize();
  }

}
