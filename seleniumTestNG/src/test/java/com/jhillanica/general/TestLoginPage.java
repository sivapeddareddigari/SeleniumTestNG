package com.jhillanica.general;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLoginPage {
	//adding a comment 
	//added a modification
	WebDriver driver;

	@Test(priority = 1)
	public void CheckLogin() {

		driver.findElement(By.xpath(".//*[@id='a-autoid-0-announce']")).click();
		System.out.println("From CheckLofin");
		driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("shivaprasadareddy@gmail.com");
		driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys("Civic2017");
		driver.findElement(By.xpath(".//*[@id='signInSubmit']")).submit();

	}

	@Test(priority = 2)
	public void CheckLogout()  {

		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		
		
		
		
//		Actions actions = new Actions(driver);
	//	WebElement menu = driver.findElement(By.xpath(".//*[@id='nav-item-signout']/span"));
	//	actions.moveToElement(menu);
	//	WebElement submenu = driver.findElement(By.xpath(".//*[@id='nav-item-signout']/span"));
	//	actions.moveToElement(submenu);
	//	actions.click().build().perform(); /*
		
		
		System.out.println("Inside CheckLogout");
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='nav-item-signout']/span"))); 
		//driver.findElement(By.xpath(".//*[@id='nav-flyout-accountList']/span[2]/span")).click();	
		//driver.findElement(By.xpath(".//*[@id='nav-item-signout']/span")).click();
		//driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		//driver.findElement(By.id("nav-item-signout")).click();
	}

	@BeforeClass
	public void Invokebrower() {
		String tUrl = "http://www.amazon.ca";

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumPoC\\ChromeWebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get(tUrl);

		System.out.println("from Before class");
	}

	@AfterClass
	public void TearDown() {
		driver.quit();
		
	}
	

}
