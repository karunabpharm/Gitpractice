package testNG_HMS;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Print_alldropdown_HMS {
	public WebDriver driver;
  @Test
  public void f()throws Exception {
	  driver.findElement(By.xpath("//*[@id='menu-item-186']/a")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("html/body/div[2]/div/form/input[1]")).sendKeys("user1");
	  driver.findElement(By.xpath("html/body/div[2]/div/form/input[2]")).sendKeys("user1");
	  driver.findElement(By.xpath("html/body/div[2]/div/form/input[3]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Registration")).click();
	  Thread.sleep(3000);
	 List<WebElement>str= driver.findElements(By.tagName("select"));
	 System.out.println(str.size());
	 for (int i=0;i<str.size();i++)
	 {
		 System.out.println("location loc:"+ str.get(i).getAttribute("name"));
	 }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.get("http://www.seleniumbymahesh.com");
		driver.manage().window().maximize();
  }

}
