package demo.spring.selenium.stepdefinitions;

import demo.spring.selenium.pages.HomePage;
import io.cucumber.java.en.Given;

public class HomeSteps {
	
	private HomePage homepage = new HomePage(Hooks.driver); 
	
	@Given("^The login page is opened$")
	public void The_login_page_is_opened()
	{
		homepage.driver.get("https://soraia.herokuapp.com/");
		homepage.clickFormAuthentication();
	}
	
	@Given("^base condition is set$")
	public void base_condition_is_set()
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver_83.exe");
		System.out.println("Driver path setProperty done ");
	}
}
