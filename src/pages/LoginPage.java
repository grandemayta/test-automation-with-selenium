package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.BasePage;

public class LoginPage extends BasePage {
	
	public void openLoginPage() {
		driver = new ChromeDriver();
		driver.get(LOGIN_URL);
	}
	
	public void fillinEmail(String email) {
		WebElement emailElement = driver.findElement(By.name("email"));
		
		if (emailElement.isDisplayed()) {
			emailElement.sendKeys(email);
		} else {
			printMessage("Email field is not displayed");
		}
	}
	
	public void fillinPassword(String password) {
		WebElement passwordElement = driver.findElement(By.name("password"));
		
		if (passwordElement.isDisplayed()) {
			passwordElement.sendKeys(password);
		} else {
			printMessage("Password field is not displayed");
		}
	}
	
	public void pressLogin() {
		WebElement rootElement = driver.findElement(By.id("root"));
		WebElement loginElement = rootElement.findElement(By.className("is-link"));
		
		if (loginElement.isDisplayed()) {
			loginElement.click();
		} else {
			printMessage("Password field is not displayed");
		}
	}
	
	public void loginOK() {
		String currentUrl = driver.getCurrentUrl();
		
		if (!currentUrl.contentEquals(HOMEPAGE_URL)) {
			printMessage("You are not logged successfully");
		}
		driver.close();
	}
	
	public void loginKO(String message) {
		WebElement messageElement = driver.findElement(By.className("message-body"));
		
		if (!messageElement.isDisplayed() && !messageElement.getText().equalsIgnoreCase(message)) {
			printMessage("messageElement did not find");
		}
		driver.close();
	}
	
}
