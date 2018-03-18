package testNG_FaceBook;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Creating_Accouant {
	public WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.name("firstname")).sendKeys("karunakara");
	  driver.findElement(By.name("lastname")).sendKeys("kalvapalli");
	  driver.findElement(By.name("reg_email__")).sendKeys("karunabpharm@gmail.com");
	  driver.findElement(By.name("reg_passwd__")).sendKeys("123456");
	  new Select(driver.findElement(By.name("birthday_day"))).selectByVisibleText("30");
	  new Select(driver.findElement(By.name("birthday_month"))).selectByVisibleText("Jan");
	  new Select(driver.findElement(By.name("birthday_year"))).selectByVisibleText("2010");
	  driver.findElement(By.name("sex")).click();
	  
	  
	 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\lib\\chromedriver.exe");
			driver=new ChromeDriver();
		  //driver=new FirefoxDriver();
		  driver.get("http://www.facebook.com");
		  driver.manage().window().maximize();
  }

}
