package testNG_HMS;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class HMS_Login_RegistrationPage {
	public WebDriver driver;
  @Test
  public void verifyingLogin() throws Exception{
	  driver.findElement(By.xpath("//*[@id='menu-item-186']/a")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("html/body/div[2]/div/form/input[1]")).sendKeys("user1");
	  driver.findElement(By.xpath("html/body/div[2]/div/form/input[2]")).sendKeys("user1");
	  driver.findElement(By.xpath("html/body/div[2]/div/form/input[3]")).click();
  }
  @Test
  public void verifying_Registration() throws Exception{
	  driver.findElement(By.xpath("//*[@id='navigation']/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id='navigation']/li[1]/ul/li[1]/a")).click();
	  Thread.sleep(3000);
	  new Select(driver.findElement(By.xpath("//*[@id='form1']/div[1]/table/tbody/tr[1]/td[2]/select"))).selectByVisibleText("Staff");
	  new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
		driver.findElement(By.name("PNT_NAME")).sendKeys("Tagotre");
		driver.findElement(By.name("MIDDLE_NAME")).sendKeys("elephant");
		driver.findElement(By.name("LAST_NAME")).sendKeys("nallamothu");
		driver.findElement(By.name("DOB")).sendKeys("19/02/2018");
		driver.findElement(By.name("AGE")).sendKeys("30");
		new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
		new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
		new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
		new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("Telugu");
		new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
		driver.findElement(By.name("MOTHER_NAME")).sendKeys("tagu");
		Thread.sleep(3000);
		new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("AAdhar Card");
		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("123456789");
		new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("Yes");
		new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("B.Tech");
		new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Employee");
		new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("A+");
		new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("Yes");
		driver.findElement(By.name("image")).sendKeys("C:\\Users\\karuna\\Desktop\\karuna 1.JPG");
	  
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
