package demo.spring.selenium.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class WebDriverManager {
	
	@Bean
	@Scope("cucumber-glue")
	public WebDriver webDriverFactory()
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver_85.exe");
		WebDriver driver = new ChromeDriver();
		return driver ;
	}

}
