package demo.spring.selenium.stepdefinitions;

import org.springframework.beans.factory.annotation.Autowired;

import demo.spring.selenium.pages.HomePage;
import io.cucumber.java.en.Given;

public class HomeSteps {
	
	@Autowired
	private HomePage homepage; 
	
	
	@Given("^The login page is opened$")
	public void The_login_page_is_opened()
	{
		
		homepage.clickFormAuthentication();
	}
	
	@Given("^base condition is set$")
	public void base_condition_is_set()
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver_83.exe");
		System.out.println("Driver path setProperty done ");
	}
}
