package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp(){
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	
	
	@Test
	public void doLogin() {
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.id("identifierId")).sendKeys("rajeshmaldar@gmail.com");
		//driver.findElement(By.id("Password")).sendKeys("sdfas");
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
	}

}
