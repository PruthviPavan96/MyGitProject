package com.assignment2a.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TripadvisorActionPage {
	

	@FindBy(xpath = "//input[@class='_3qLQ-U8m']")
	private WebElement srtb;

	public WebElement getSrtb() {
		return srtb;
	}

	public void setSrtb(String sr) {
		srtb.sendKeys(sr);
	}

	@FindBy(xpath = "//span[@class='_2LyoLJ4U _2HBN-k68']")
	private WebElement srbutn;

	public WebElement getSrbutn() {
		return srbutn;
	}

	public void setSrbutn() {
		srbutn.click();
	}

	@FindBy(xpath = "//span[.='Club Mahindra Madikeri, Coorg']")
	private WebElement frlnk;

	public WebElement getFrlnk() {
		return frlnk;
	}

	public void setFrlnk() {
		frlnk.click();
	}

	public void srch(String sr) throws InterruptedException {
		
		srtb.sendKeys(sr);
		Thread.sleep(2000);
		srbutn.click();
		Thread.sleep(2000);
		frlnk.click();
		Thread.sleep(2000);
	}

	public TripadvisorActionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
