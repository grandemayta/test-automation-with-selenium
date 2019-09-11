package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDefs_Login {

	@Given("^Open the login page$")
	public void open_the_login_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Open the login page");
	}

	@When("^I fill in the email with \"([^\"]*)\"$")
	public void i_fill_in_the_email_with(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I fill in the email with " + arg1);
	}

	@When("^I fill in the password with \"([^\"]*)\"$")
	public void i_fill_in_the_password_with(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I fill in the password with " + arg1);
	}

	@When("^I press the login button$")
	public void i_press_the_button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I press the login button");
	}

	@Then("^I should be on the homepage$")
	public void i_should_be_on_the_homepage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I should be on the homepage");
	}
}
