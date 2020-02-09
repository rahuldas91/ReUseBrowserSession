package com.seleniumwizard.core;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {

	public DriverManager() {

	}

	public WebDriver setChromeDriver() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Work\\Workspaces\\STS4\\SeleWiz\\ReUseBrowserSession\\ReUse-Browser-Session\\config\\drivers\\chromedriver.exe");
	
		ChromeOptions option = new ChromeOptions();
		option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		option.addArguments("--disable-infobars");
		option.addArguments("--disable-popup-blocking");
		Map<String, Object> prefs = new ConcurrentHashMap<String, Object>();
		prefs.put("safebrowsing.enabled", "true");
		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("safebrowsing.enabled", "false");
		prefs.put("download.prompt_for_download", "false");
		option.setExperimentalOption("prefs", prefs);
		return new ChromeDriver(option);

	}

}
