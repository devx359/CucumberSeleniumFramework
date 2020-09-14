package demo.spring.selenium.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	public static WebDriver driver;
	
	@Before
	public void openBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver_85.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void closeBrowser()
	{
		driver.quit();
	}

}
