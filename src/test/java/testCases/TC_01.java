package testCases;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import testBase.BaseClass;

public class TC_01 extends BaseClass {

	@Test(priority = 1, groups = { "sanity", "regression" })
	void test_HomePage() throws Throwable {
		try {
			HomePage hp = new HomePage(driver);
			logger.info("*****Starting TC_01_Finding Hospitals*****");
			logger.info("**Finding Doctors**");
			hp.clickFindDoctors();
			hp.selectcitybox();
			hp.searchcity();
			hp.selectcityname();
			hp.selectdoctor();
			logger.info("*****Ending TC_01_Finding Hospitals*****");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
