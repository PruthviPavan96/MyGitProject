package com.assignment2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TripadvisorratingPage {
	@FindBy(xpath = "//div[.='Hotel Ratings']")
	private WebElement htrt;

	public WebElement getHtrt() {
		return htrt;
	}

	public void clickHtrt() {
		htrt.click();
	}

	@FindBy(id = "noFraud")
	private WebElement strv;

	public WebElement getStrv() {
		return strv;
	}

	public void clickStrv() {
		strv.click();
	}

	@FindBy(id = "qid12_bubbles")
	private WebElement srvrtng;

	public WebElement getSrvrtng() {
		return srvrtng;
	}

	@FindBy(id = "qid11_bubbles")
	private WebElement cleanrtng;

	public WebElement getCleanrtng() {
		return cleanrtng;
	}

	@FindBy(id = "qid190_bubbles")
	private WebElement locrtng;

	public WebElement getLocrtng() {
		return locrtng;
	}
	public void submit() throws InterruptedException {
		strv.click();
		Thread.sleep(2000);
	}

	public TripadvisorratingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
