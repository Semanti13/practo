package testCases;

import org.testng.annotations.Test;

import PageObjects.ForCorporatePage;
import testBase.BaseClass;

public class TC_06 extends BaseClass {
	@Test(priority = 9, groups = { "sanity", "regression" })
	void test_clickForCorporates() throws Throwable {
		try {
			ForCorporatePage cp = new ForCorporatePage(driver);
			logger.info("*****Starting TC_06_Finding Hospitals*****");
			logger.info("** Clicking on For Corporates **");
			cp.clickForCorporates();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 10, groups = { "regression" })
	void test_sendNegativeValues() throws Throwable {
		try {
			ForCorporatePage cp = new ForCorporatePage(driver);
			logger.info("** Sending Negative Values **");
			cp.send_negativeValues();
			logger.info("*****Ending TC_06_Finding Hospitals*****");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
