package com.assignment2a.action;

import org.testng.annotations.Test;

import com.assignment2a.genericLib.BaseTest;
import com.assignment2a.genericLib.FileLib;
import com.assignment2a.genericLib.WebdriverCommonLib;
import com.assignment2a.pages.TripadvisorActionPage;
import com.assignment2a.pages.TripadvisorReviewPage;
import com.assignment2a.pages.TripadvisorSearchPage;
import com.assignment2a.pages.TripadvisorratingPage;

public class verifyAction extends BaseTest {

	FileLib flib;
	WebdriverCommonLib wlib;
	TripadvisorActionPage tap;
	TripadvisorSearchPage tsp;
	TripadvisorReviewPage trp;
	TripadvisorratingPage tp;

	@Test
	public void verifyActionTest() throws Throwable {
		flib = new FileLib();
		wlib = new WebdriverCommonLib();
		tap = new TripadvisorActionPage(driver);
		tsp = new TripadvisorSearchPage(driver);
		trp= new TripadvisorReviewPage(driver);
		tp = new TripadvisorratingPage(driver);

		String searctb = flib.getKeyPropValue(PROPERTY_PATH, "search");
		tap.srch(searctb);

		wlib.performWindowHandles(wlib.getPageTitle(), flib.getCellData(EXCEL_PATH, "Invalid", 1, 0));

		tsp.review();

		wlib.performWindowHandles(wlib.getPageTitle(), flib.getCellData(EXCEL_PATH, "Invalid", 1, 1));

		wlib.mouseHover(trp.getRatng());

		String rvtl = flib.getKeyPropValue(PROPERTY_PATH, "revtitle");
		String rvtx = flib.getKeyPropValue(PROPERTY_PATH, "revtext");

		trp.rating(rvtl, rvtx);
		
		wlib.performScrollDown(tp.getHtrt().getLocation().getX(), tp.getHtrt().getLocation().getY());
		
		tp.submit();

	}
}
