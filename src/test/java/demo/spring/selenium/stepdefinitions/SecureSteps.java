package demo.spring.selenium.stepdefinitions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.springframework.beans.factory.annotation.Autowired;

import demo.spring.selenium.pages.SecurePage;
import io.cucumber.java.en.Then;


public class SecureSteps {

	@Autowired
	private SecurePage securePage;

	  @Then("^I see \"(.*)\" message$")
	  public void iSeeMessage(String message) {
	    assertThat(this.securePage.getMessage(), is(message));
	  }
}
