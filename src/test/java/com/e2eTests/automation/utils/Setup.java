package com.e2eTests.automation.utils;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.cucumber.java.Before;

public class Setup {

	private static WebDriver driver;
 @Before
	public void setWebdriver() {
		String browser = System.getProperty("browser");
		if (browser == null) {
			browser = "chrome";

		}

		switch (browser) {
		case "chrome":
			ChromeOptions chromeOptions = new ChromeOptions();

			driver = new ChromeDriver(chromeOptions);
			chromeOptions.addArguments("['start-maximised']");
			break;

		case "firefox":
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.setCapability("plateform", Platform.WIN10);
			driver = new FirefoxDriver(firefoxOptions);
			
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			throw new IllegalArgumentException("Browser\"" + browser + "\" is not supported.");

		}

	}
	/* GETTER */
	public static WebDriver getDriver()  {
		return driver ;
		
	}

}