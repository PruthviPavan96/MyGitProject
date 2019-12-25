package com.assignment1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartSearchPage {

@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']") private WebElement canbtn;
	
	
	public WebElement getCanbtn() {
	     return canbtn;
    }

    public void clickCanbtn() {
	    canbtn.click();
    }

	@FindBy(xpath="//input[@class='LM6RPg']") private WebElement srtb;

	public WebElement getSrtb() {
		return srtb;
	}

	public void setSrtb(String sr) {
		srtb.sendKeys(sr);
	}
	
	@FindBy(xpath="//button[@class='vh79eN']") private WebElement gobtn;

	public WebElement getGobtn() {
		return gobtn;
	}

	public void clickGobtn() {
		gobtn.click();
	}
	
	@FindBy(xpath="//div[@class='_3wU53n']") private WebElement mobbtn;
	
	public WebElement getMobbtn() {
		return mobbtn;
	}

	public void setMobbtn() {
		mobbtn.click();
	}
	
	

	public void searchpg(String sr)
	{
		canbtn.click();
		srtb.sendKeys(sr);
		gobtn.click();
		mobbtn.click();
		
		
	}
	
	
	
	public FlipkartSearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
}
