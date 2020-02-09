package com.seleniumwizard.application;

import org.openqa.selenium.WebDriver;

import com.seleniumwizard.core.DriverManager;

public class App {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver= new DriverManager().setChromeDriver();
		driver.get("https://www.google.com/");
		
	}
	

}
