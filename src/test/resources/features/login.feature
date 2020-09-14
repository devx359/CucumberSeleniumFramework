@Login
Feature: This is login for soarias website

  @smoke
  Scenario Outline:  Login sucessfully with username password
	  Given The login page is opened
		When  username "tomsmith" is provided
		When  password "SuperSecretPassword!" is provided
		Then  User clicks the login button
		Then I see "You logged into a secure area!" message
		
	Scenario Outline:  Login with invalid password
	  Given The login page is opened
		When  username "invalid" is provided
		When  password "SuperSecretPassword!" is provided
		Then  User clicks the login button
		Then I see "Your username is invalid!" message	