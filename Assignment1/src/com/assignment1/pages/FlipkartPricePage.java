package com.assignment1.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPricePage {
	@FindBy(xpath="//div[@class='_1vC4OE _3qQ9m1']") private WebElement pricebk;
	
	public WebElement getPricebk() {
		return pricebk;
	}

	
	public String price()
	{
		return pricebk.getText();
	}
	

	public FlipkartPricePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
