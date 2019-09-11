package common;

import org.openqa.selenium.WebDriver;

public class BasePage {
	public final String LOGIN_URL = "https://workshops-fe-gm.firebaseapp.com/login";
	public final String HOMEPAGE_URL = "https://workshops-fe-gm.firebaseapp.com/";
	public static WebDriver driver;
	
	public void printMessage(String message) {
		System.out.println(message);
	}
}
