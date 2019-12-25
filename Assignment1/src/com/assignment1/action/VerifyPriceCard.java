package com.assignment1.action;

import org.testng.annotations.Test;

import com.assignment1.genericLib.BaseTest;
import com.assignment1.genericLib.WebdriverCommonLib;

public class VerifyPriceCard extends BaseTest {

	String value1;

	@Test(priority = 1)
	public void Verify1() throws Throwable {
		verifyAmazonAction vaa = new verifyAmazonAction();
		value1 = vaa.verifyAmazonActionTest();
		System.out.println(value1);
	}

	@Test(priority = 2)
	public void verify2() throws Throwable {
		verifyFlipkartAction vfa = new verifyFlipkartAction();
		String value2 = vfa.verifyFlipkartActionTest();
		System.out.println(value2);

		int val = value1.compareTo(value2);

		if (val < 0) {
			System.out.println("Final Result: " + value1);
		} else {
			System.out.println("Final Result: " + value2);
		}
	}

}
