package demo.spring.selenium.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;

@Component
public class WebDriverManager {
	/*
	@Bean
	@Scope("cucumber-glue")
	public WebDriver webDriverFactory()
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver_85.exe");
		WebDriver driver = new ChromeDriver();
		return driver ;
	}
	*/
	private static final String DOCKER_HOST = "http://127.0.0.1";
	private static final String SELENIUM_PORT = "4444";
	private static final String CHROME = "chrome";

	@Autowired
	private DemoSpringSeleniumProperties properties;

	@Bean
	@Scope("cucumber-glue")
	public WebDriver webDriverFactory() throws IOException {
		if(properties.getContext().equals("remote")) { //if you need remote grid execution
			return getRemoteWebDriver(properties.getBrowser());
		}
		else //execute in local
		{
			return localChromeDriver(); //customize it,here we are using only chrome locally
		}
	}

	private WebDriver getRemoteWebDriver(String browser) throws IOException {
		String remote = String.format("%s:%s/wd/hub", DOCKER_HOST, SELENIUM_PORT);
		System.out.println(remote);
		if (browser.equalsIgnoreCase(CHROME)) {
			return new RemoteWebDriver(new URL(remote), new ChromeOptions());
		}
		return new RemoteWebDriver(new URL(remote), new FirefoxOptions());
	}

	public WebDriver localChromeDriver()
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver_85.exe");
		WebDriver driver = new ChromeDriver();
		return driver ;
	}

}
