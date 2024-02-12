package testCases;

import org.testng.annotations.Test;

import PageObjects.SurgeriesPage;
import testBase.BaseClass;

public class TC_03 extends BaseClass{
	@Test(priority=3, groups={"sanity","regression"})
	void test_ClickSurgeriesPage() throws Throwable {
		try {
			SurgeriesPage sp=new SurgeriesPage(driver);
			logger.info("*****Starting TC_03_Finding Hospitals*****");
			logger.info("**Popular Surgeries**");
			sp.clicksurgery();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=4, groups={"regression"})
	void test_SurgeriesPage() {
		try {
			SurgeriesPage sp=new SurgeriesPage(driver);
			sp.scroll();
			sp.popularsurgeries();
			logger.info("*****Ending TC_03_Finding Hospitals*****");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
