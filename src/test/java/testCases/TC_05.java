package testCases;

import org.testng.annotations.Test;

import PageObjects.ForCorporatePage;
import testBase.BaseClass;

public class TC_05 extends BaseClass{
	@Test(priority=8, groups={"regression"})
	void test_Screenshot() throws Throwable {
		ForCorporatePage fc=new ForCorporatePage(driver);
		logger.info("*****Starting TC_05_Finding Hospitals*****");
		logger.info("** Taking screenshot for validating Thank You message **");
		fc.thankYouScreenshot();
		logger.info("*****Ending TC_05_Finding Hospitals*****");
	}
}
