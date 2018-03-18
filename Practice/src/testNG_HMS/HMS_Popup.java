package testNG_HMS;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class HMS_Popup {
	public WebDriver driver;	 
  @Test
  public void Popup() throws Exception {
	  driver.findElement(By.xpath("//*[@id='menu-item-186']/a")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("html/body/div[2]/div/form/input[1]")).sendKeys("user1");
	  driver.findElement(By.xpath("html/body/div[2]/div/form/input[2]")).sendKeys("user1");
	  driver.findElement(By.xpath("html/body/div[2]/div/form/input[3]")).click();
	  Thread.sleep(3000);
	String str;
		str=driver.getWindowHandle();
		driver.findElement(By.linkText("Feedback")).click();
		Thread.sleep(5000);
		driver.switchTo().window(str);
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("tagore");
		driver.findElement(By.id("email")).sendKeys("asdfg@gmail.com");
		new Select(driver.findElement(By.id("car"))).selectByVisibleText("Volvo");
		driver.findElement(By.id("message")).sendKeys("hi welcome");
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(str);
		//driver.findElement(By.name("ADDRESS1")).sendKeys("hyd");
		driver.findElement(By.xpath("//*[@id='form1']/div[1]/table/tbody/tr[14]/td[2]/input")).sendKeys("hyderabad");
		driver.findElement(By.name("MOBILE_NO")).sendKeys("9908338185");
		driver.findElement(By.name("EMAIL_ID")).sendKeys("abe@gmail.com");
		new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");
		driver.findElement(By.name("ADDRESS2")).sendKeys("guardianway");
		driver.findElement(By.name("ZIP")).sendKeys("522403");
		driver.findElement(By.linkText("Logout")).click();
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
	  //driver=new FirefoxDriver();
	  driver.get("http://www.seleniumbymahesh.com");
	  driver.manage().window().maximize();
  }

}
