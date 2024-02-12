package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.ForCorporatePage;
import testBase.BaseClass;

public class TC_04 extends BaseClass {
	@Test(priority=5, groups={"sanity","regression"})
	void test_ForCorporatesPage() throws Throwable{
		try {
			ForCorporatePage fcp=new ForCorporatePage(driver);
			logger.info("*****Starting TC_04_Finding Hospitals*****");
			logger.info("** Clicking on For Corporates **");
			fcp.clickForCorporates();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority=6, groups={"regression"})
	void test_sendPositiveValues() throws Throwable {
		try {
			ForCorporatePage fcp=new ForCorporatePage(driver);
			logger.info("** Sending Positive Values **");
			fcp.send_positiveValues();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority=7, groups={"regression"})
	void test_ValidationPositive() throws Throwable {
		try {
			ForCorporatePage fp=new ForCorporatePage(driver);
			logger.info("** Validating Thank You message for scheduling a demo for sending positive values **");
			boolean validation=fp.text_validation();
			Assert.assertEquals(validation, true,"ThankYou message has not been displayed");
			logger.info("*****Ending TC_04_Finding Hospitals*****");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
