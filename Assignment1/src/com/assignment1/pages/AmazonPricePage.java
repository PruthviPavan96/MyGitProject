package com.assignment1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPricePage {
	@FindBy(xpath="//span[@id='priceblock_ourprice']") private WebElement pricebk;
	
	public WebElement getPricebk() {
		return pricebk;
	}

	public String setPricebk() {
		return pricebk.getText();
	}

	public String price()
	{
		return pricebk.getText();
	}
	

	public AmazonPricePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
