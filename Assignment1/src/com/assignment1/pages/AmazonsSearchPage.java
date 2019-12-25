package com.assignment1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonsSearchPage {

	@FindBy(id="twotabsearchtextbox") private WebElement srtb;

	public WebElement getSrtb() {
		return srtb;
	}

	public void setSrtb(String sr) {
		srtb.sendKeys(sr);
	}
	
	@FindBy(xpath="//input[@value='Go']") private WebElement gobtn;

	public WebElement getGobtn() {
		return gobtn;
	}

	public void clickGobtn() {
		gobtn.click();
	}
	
	@FindBy(xpath="//span[.='Apple iPhone XR (64GB) - Yellow']") private WebElement mobbtn;
	
	public WebElement getMobbtn() {
		return mobbtn;
	}

	public void setMobbtn() {
		mobbtn.click();
	}
	
	

	public void search(String sr)
	{
		srtb.sendKeys(sr);
		gobtn.click();
		mobbtn.click();
		
		
	}
	
	
	
	public AmazonsSearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
