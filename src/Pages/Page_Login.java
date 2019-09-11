package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.Page_BasePage;

public class Page_Login extends Page_BasePage {
	
	public void openLoginPage() {
		driver = new ChromeDriver();
		driver.get("https://workshops-fe-gm.firebaseapp.com/login");
	}
	
	public void fillinEmail(String email) {
		WebElement emailElement = driver.findElement(By.name("email"));
		
		if (emailElement.isDisplayed()) {
			emailElement.sendKeys(email);
		} else {
			System.out.println("Email field is not displayed");
		}
	}
	
	public void fillinPassword(String password) {
		WebElement passwordElement = driver.findElement(By.name("password"));
		
		if (passwordElement.isDisplayed()) {
			passwordElement.sendKeys(password);
		} else {
			System.out.println("Password field is not displayed");
		}
	}
	
	public void pressLogin() {
		WebElement rootElement = driver.findElement(By.id("root"));
		WebElement loginElement = rootElement.findElement(By.className("is-link"));
		
		if (loginElement.isDisplayed()) {
			loginElement.click();
		} else {
			System.out.println("Password field is not displayed");
		}
	}
	
	public void loginOk() {
		String currentUrl = driver.getCurrentUrl();
		
		if (currentUrl.equalsIgnoreCase("https://workshops-fe-gm.firebaseapp.com/")) {
			System.out.println("You are logged successfully");
		} else {
			System.out.println("You are not logged successfully");
		}
	}
	
}
