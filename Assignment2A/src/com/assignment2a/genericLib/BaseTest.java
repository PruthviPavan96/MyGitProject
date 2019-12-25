package com.assignment2a.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoConsts {

	public static WebDriver driver;
	FileLib flib;
	WebdriverCommonLib wlib;

	@BeforeClass
	public void openBrowser() throws Throwable {
		flib = new FileLib();
		wlib = new WebdriverCommonLib();
		String browserValue = flib.getKeyPropValue(PROPERTY_PATH, "browser");
		if (browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver = new ChromeDriver();
		}

		else if (browserValue.equalsIgnoreCase("firefox")) {
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver = new FirefoxDriver();
		} else {
			Reporter.log("Enter Correct Browser Name", true);
		}
		String url = flib.getKeyPropValue(PROPERTY_PATH, "url");
		driver.get(url);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
