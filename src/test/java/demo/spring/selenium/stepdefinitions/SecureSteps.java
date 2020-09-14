package demo.spring.selenium.stepdefinitions;

import demo.spring.selenium.pages.SecurePage;
import io.cucumber.java.en.Then;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;


public class SecureSteps {

	private SecurePage securePage = new SecurePage(Hooks.driver);

	  @Then("^I see \"(.*)\" message$")
	  public void iSeeMessage(String message) {
	    assertThat(this.securePage.getMessage(), is(message));
	  }
}
