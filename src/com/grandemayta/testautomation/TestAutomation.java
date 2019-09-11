package com.grandemayta.testautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		// Check if the title is equal to google
		if (driver.getTitle().toLowerCase().equalsIgnoreCase("google")) {
			System.out.println("The string is equal to Google");
		} else {
			System.out.println("The String is not equal to Google");;
		}
	}
}
