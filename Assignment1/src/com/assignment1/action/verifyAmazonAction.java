package com.assignment1.action;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.assignment1.genericLib.BaseTest;
import com.assignment1.genericLib.FileLib;
import com.assignment1.genericLib.WebdriverCommonLib;
import com.assignment1.pages.AmazonsSearchPage;
import com.assignment1.pages.AmazonPricePage;

public class verifyAmazonAction extends BaseTest{

		FileLib flib;
		WebdriverCommonLib wlib;
		AmazonsSearchPage asp;
		AmazonPricePage app;
		
    
     
      public  String verifyAmazonActionTest() throws Throwable
      {
    	  flib=new FileLib();
  		  wlib=new WebdriverCommonLib();
  		  asp=new AmazonsSearchPage(driver);
  		  app=new AmazonPricePage(driver);
  		  
  		  String url=flib.getKeyPropValue(PROPERTY_PATH, "url1");
  		  driver.get(url);
  		  String searctb = flib.getKeyPropValue(PROPERTY_PATH, "search");
  		  asp.search(searctb);
  		
  		  wlib.performWindowHandles(wlib.getPageTitle(), flib.getCellData(EXCEL_PATH, "Invalid", 1, 0));
  		  String pricecard1 = app.price();
  		  return pricecard1;
      }
      public void verifyAmazonAction(WebDriver driver)
      {
    	  PageFactory.initElements(driver, this);
      }

}
