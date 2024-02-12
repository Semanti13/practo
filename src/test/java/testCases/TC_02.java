package testCases;

import org.testng.annotations.Test;

import PageObjects.DoctorsPage;
import testBase.BaseClass;

public class TC_02 extends BaseClass {
	@Test(priority=2, groups={"regression"})
	void test_DoctorsPage() throws Throwable {
		try {
			DoctorsPage dp= new DoctorsPage(driver);
			logger.info("*****Starting TC_02_Finding Hospitals*****");
			logger.info("**Displaying Doctors' Details**");
			dp.selectpatientstories();
			dp.selectexperienceyears();
			dp.selectallfilters();
			dp.selectfees();
			dp.selectallfilters();
			dp.selectavailabilty();
			dp.selectrelevance();
			dp.DoctorDetails();
			Thread.sleep(5000);
			logger.info("*****Ending TC_02_Finding Hospitals*****");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
