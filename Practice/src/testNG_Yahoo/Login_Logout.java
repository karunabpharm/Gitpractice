package testNG_Yahoo;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Login_Logout {
	public WebDriver driver;
  @Test
  public void verifylogin()throws Exception {
	  driver.findElement(By.id("login-username")).sendKeys("karuna_111");
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("login-passwd")).sendKeys("07429186166Kr");
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(3000);	  
  }
  @Test
  public void verifylogout()throws Exception {
	  Thread.sleep(300);
	  driver.findElement(By.cssSelector("span.D(ib) Maw(100px) Ov(h) Whs(nw) Tov(e) Lh($userNavTextLh) Pstart(8px) Fz(14px) Fw(b) Va(t) ua-ie7_D(n) C(#4d00ae)")).click();
	  driver.findElement(By.linkText("Sign out")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.yahoomail.com");
		driver.manage().window().maximize();
  }

}
