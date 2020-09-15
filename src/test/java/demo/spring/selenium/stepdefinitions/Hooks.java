package demo.spring.selenium.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import demo.spring.selenium.SpringContextConfiguration;
import demo.spring.selenium.config.DemoSpringSeleniumProperties;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes={SpringContextConfiguration.class})
public class Hooks {
	
	@Autowired 	public  WebDriver driver;
	@Autowired 	public DemoSpringSeleniumProperties properties;
	
	@Before
	public void openBrowser()
	{
		
		/*System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver_85.exe");
		driver = new ChromeDriver(); */
		driver.manage().window().maximize();
		driver.get(properties.getHost());
	}
	
	@After
	public void closeBrowser()
	{
		driver.quit();
	}

}
