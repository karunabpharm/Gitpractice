package testNG_SpiceJet;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Oneway_search {
	public WebDriver driver;

	//driver.get("http://www.spicejet.com");

  @Test
  public void verifyonewaysearch() throws Exception {
	  driver.get("http://www.spicejet.com");
	  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[1]/li[7]/a")).click();
	  driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
	  driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[2]/li[5]/a")).click();
	  driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date1']")).click();
	  driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[6]/a")).click();
	  new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']"))).selectByValue("3");
	  new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Child']"))).selectByValue("2");
	  new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Infant']"))).selectByValue("1");
	  new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']"))).selectByVisibleText("INR");
	  driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	  Thread.sleep(3000);
  }
	  
	  @Test
	  public void verifytwowaysearch() throws Exception {
		 driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		 driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[2]/li[6]/a")).click();
		 driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		 driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[4]/li[9]/a")).click();
		 driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date1']")).click();
		 driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[1]/a")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date2']")).click();
		 driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[4]/td[6]/a")).click();
		 new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']"))).selectByValue("3");
		  new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Child']"))).selectByValue("2");
		  new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Infant']"))).selectByValue("1");
		  new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']"))).selectByVisibleText("INR");
		  driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		 
		 
		 
		 
		   }
  private void Printalertmessage() {
	// TODO Auto-generated method stub
	
}
@BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	  
  }

}
