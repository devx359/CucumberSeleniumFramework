package demo.spring.selenium.stepdefinitions;

import io.cucumber.java.Scenario;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import demo.spring.selenium.SpringContextConfiguration;
import demo.spring.selenium.config.DemoSpringSeleniumProperties;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;

@Slf4j //for logging purposes ..uses lombok slf4j
@CucumberContextConfiguration
@SpringBootTest(classes={SpringContextConfiguration.class})
public class Hooks {
	
	@Autowired 	public  WebDriver driver;
	@Autowired 	public DemoSpringSeleniumProperties properties;
	
	@Before
	public void openBrowser(Scenario scenario)
	{
		
		/*System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver_85.exe");
		driver = new ChromeDriver(); */
		driver.manage().window().maximize();
		driver.get(properties.getHost());
		log.info("[STARTED] Scenario: " +scenario.getName());
	}
	
	@After
	public void closeBrowser(Scenario scenario)
	{
		scenario.log("get status"+scenario.getStatus().toString());
		if (scenario.isFailed())
		{
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
			scenario.log(scenario.getSourceTagNames().toString());
			scenario.log("test failed ,screenshot taken");
		}
		driver.quit();
		log.info("[ENDED] Scenario: " + scenario.getName());

	}

}
