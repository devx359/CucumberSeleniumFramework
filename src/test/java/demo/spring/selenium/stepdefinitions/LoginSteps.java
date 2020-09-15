package demo.spring.selenium.stepdefinitions;

import org.springframework.beans.factory.annotation.Autowired;

import demo.spring.selenium.pages.LoginPage;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Autowired
	private LoginPage loginpage;
	
	@When("^username \"(.*)\" is provided$")
	public void username_is_provided(String username)
	{
		this.loginpage.typeUserName(username);
	}
	
	//@When("^password \"(.*)\"  is provided$")
	@When("password {string} is provided")
	public void passwordisprovided(String password)
	{
		this.loginpage.typePassword(password);
	}
	
	@When("^User clicks the login button$")
	public void Userclickstheloginbutton()
	{
		this.loginpage.clickLogin();
	}
	

}
