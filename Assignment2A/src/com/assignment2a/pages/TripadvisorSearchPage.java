package com.assignment2a.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TripadvisorSearchPage {

	@FindBy(xpath = "//a[.='Write a review']")
	private WebElement wrlnk;

	public WebElement getWrlnk() {
		return wrlnk;
	}

	public void clickWrlnk() {
		wrlnk.click();
	}

	public void review() throws InterruptedException {
		wrlnk.click();
		Thread.sleep(3000);
	}

	public TripadvisorSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
