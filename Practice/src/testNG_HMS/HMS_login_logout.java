package testNG_HMS;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class HMS_login_logout {
	public WebDriver driver;
  @Test
  public void verifying_Login()throws Exception {
	  driver.findElement(By.xpath("//*[@id='menu-item-186']/a")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("html/body/div[2]/div/form/input[1]")).sendKeys("user1");
	  driver.findElement(By.xpath("html/body/div[2]/div/form/input[2]")).sendKeys("user1");
	  driver.findElement(By.xpath("html/body/div[2]/div/form/input[3]")).click();
  }
  @Test
  public void verifying_Logout()throws Exception {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("html/body/div[2]/div/h3/a")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://www.seleniumbymahesh.com");
	  driver.manage().window().maximize();

  }

}
