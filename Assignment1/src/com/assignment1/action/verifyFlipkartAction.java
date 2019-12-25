package com.assignment1.action;



import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.assignment1.genericLib.BaseTest;
import com.assignment1.genericLib.FileLib;
import com.assignment1.genericLib.WebdriverCommonLib;
import com.assignment1.pages.FlipkartSearchPage;
import com.assignment1.pages.FlipkartPricePage;

import org.testng.annotations.Test;



public class verifyFlipkartAction extends BaseTest{

		FileLib flib;
		WebdriverCommonLib wlib;
		FlipkartSearchPage fsp;
		FlipkartPricePage fpp;
		
      
      public String verifyFlipkartActionTest() throws Throwable
      {
    	  flib=new FileLib();
  		  wlib=new WebdriverCommonLib();
  		  fsp= new FlipkartSearchPage(driver);
  		  fpp=new FlipkartPricePage(driver);
  		  
  		  String url = flib.getKeyPropValue(PROPERTY_PATH, "url2");
  		  driver .get(url);
  		  String searctb1 = flib.getKeyPropValue(PROPERTY_PATH, "search");
  		  fsp.searchpg(searctb1);
  		  
  		  
  		  wlib.performWindowHandles(wlib.getPageTitle(),flib.getCellData(EXCEL_PATH, "Invalid", 1, 0));
  		
  		  String pricecard2= fpp.price();
  		  return pricecard2;
      }
      
      public void verifyFlipkartAction(WebDriver driver)
      {
    	  PageFactory.initElements(driver, this);
      }

}
