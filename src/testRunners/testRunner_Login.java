package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "resources/features/login.feature", 
		glue = "steps",
		monochrome = true,
		strict = true,
		dryRun = false)

public class testRunner_Login {

}
