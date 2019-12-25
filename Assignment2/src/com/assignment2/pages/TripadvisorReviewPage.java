package com.assignment2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TripadvisorReviewPage {

	@FindBy(id = "bubble_rating")
	private WebElement ratng;

	public WebElement getRatng() {
		return ratng;
	}

	@FindBy(id = "ReviewTitle")
	private WebElement rvtl;

	public WebElement getRvtl() {
		return rvtl;
	}

	public void setRvtl(String rt) {
		rvtl.sendKeys(rt);
	}

	@FindBy(id = "ReviewText")
	private WebElement rvt;

	public WebElement getRvt() {
		return rvt;
	}

	public void setRvt(String ra) {
		rvt.sendKeys(ra);
	}

	

	public void rating(String rt, String ra) throws InterruptedException {
		Thread.sleep(2000);
		rvtl.sendKeys(rt);
		Thread.sleep(2000);
		rvt.sendKeys(ra);
		Thread.sleep(2000);

	}

	
	public TripadvisorReviewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
