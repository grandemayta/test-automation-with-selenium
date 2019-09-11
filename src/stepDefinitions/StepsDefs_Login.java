package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Page_Login;

public class StepsDefs_Login {
	
	Page_Login loginPage = new Page_Login();

	@Given("^Open the login page$")
	public void open_the_login_page() throws Exception {
	    loginPage.openLoginPage();
	}

	@When("^I fill in the email with \"([^\"]*)\"$")
	public void i_fill_in_the_email_with(String email) throws Exception {
	    loginPage.fillinEmail(email);
	}

	@When("^I fill in the password with \"([^\"]*)\"$")
	public void i_fill_in_the_password_with(String password) throws Exception {
	    loginPage.fillinPassword(password);
	}

	@When("^I press the login button$")
	public void i_press_the_button() throws Exception {
	    loginPage.pressLogin();
	}

	@Then("^I should be on the homepage$")
	public void i_should_be_on_the_homepage() throws Exception {
	    loginPage.loginOK();
	}
	
	@Then("^I see a \"([^\"]*)\" message$")
	public void i_see_a_message(String message) throws Exception {
		Thread.sleep(500);
	    loginPage.loginKO(message);
	}
}
