package PageObjects;

import java.io.File;
import java.io.IOException;
//import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class ForCorporatePage extends BasePage {

	public ForCorporatePage(WebDriver driver) {
		super(driver);

	}

	Actions act = new Actions(driver);
//	WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(15));

	@FindBy(xpath = "//div[@class='nav-right text-right']/div[1]")
	WebElement for_corporates;
	@FindBy(xpath = "//div[@class='u-d nav-dropdown text-left active-state']/div[1]")
	WebElement health_wellness_plan;
	@FindBy(xpath = "//div[@class='corporate-form']/form/div/input[@id='name']")
	WebElement name;
	@FindBy(xpath = "//div[@class='corporate-form']/form/div/input[@id='organizationName']")
	WebElement organization_name;
	@FindBy(xpath = "//div[@class='corporate-form']/form/div/input[@id='contactNumber']")
	WebElement contact_number;
	@FindBy(xpath = "//div[@class='corporate-form']/form/div/input[@id='officialEmailId']")
	WebElement official_EmailId;
	@FindBy(xpath = "//div[@class='corporate-form']/form/div[5]/select[@id='organizationSize']")
	WebElement organization_size;
	@FindBy(xpath = "//div[@class='corporate-form']/form/div[5]/select[@id='organizationSize']/option[3]")
	WebElement org_size_option;
	@FindBy(xpath = "//div[@class='corporate-form']/form/div[6]/select[@id='interestedIn']")
	WebElement interested_In;
	@FindBy(xpath = "//div[@class='corporate-form']/form/div[6]/select[@id='interestedIn']/option[2]")
	WebElement interestedIn_option;
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/form/button")
	WebElement schedule_demo;
	@FindBy(xpath = "/html/body/div[4]/div")
	WebElement page;

	public void clickForCorporates() throws Throwable {
		act.moveToElement(for_corporates).click().build().perform();
		Thread.sleep(1000);
		act.moveToElement(health_wellness_plan).click().build().perform();
	}

	public void send_positiveValues() throws Throwable {
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		name.sendKeys(generatedString1);
		String generatedString2 = RandomStringUtils.randomAlphabetic(5);
		organization_name.sendKeys(generatedString2);
		String generatedNumber1 = RandomStringUtils.randomNumeric(9);
		contact_number.sendKeys("9"+generatedNumber1);
		String generatedString3 = RandomStringUtils.randomAlphabetic(5);
		String generatedNumber2 = RandomStringUtils.randomNumeric(3);
		official_EmailId.sendKeys(generatedString3 + generatedNumber2 + "@gmail.com");
		act.moveToElement(organization_size).build().perform();
		organization_size.click();
		Thread.sleep(2000);
		Select drp = new Select(organization_size);
		drp.selectByVisibleText("1001-5000");
		Thread.sleep(1000);
		Select drp2 = new Select(interested_In);
		drp2.selectByVisibleText("Taking a demo");
		Thread.sleep(3000);
		schedule_demo.click();
		Thread.sleep(10000);

	}

	public boolean text_validation() throws Throwable {
		System.out.println("Validation for positive input : ");
		String expected_text = "THANK YOU";
		String actual_text = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]")).getText();
		System.out.println("Expected text : " + expected_text);
		System.out.println("Actual text : " + actual_text);
		try {
			return (expected_text.equals(actual_text));
		} catch (Exception e) {
			return false;
		}

	}

	public void thankYouScreenshot() throws Throwable {
		WebElement thankyou_page = driver.findElement(By.xpath("//div[@class='ReactModalPortal']/div/div"));
		File src = thankyou_page.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(
				"C:\\Users\\2303443\\eclipse-workspace\\FindingHospitalsHackathon\\screenshots\\thankyou.png");
		try {
			FileUtils.copyFile(src, DestFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
	}

	public void send_negativeValues() throws Throwable {
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		name.sendKeys(generatedString1);
		String generatedString2 = RandomStringUtils.randomAlphabetic(5);
		organization_name.sendKeys(generatedString2);
		String generatedNumber1 = RandomStringUtils.randomNumeric(9);
		contact_number.sendKeys("9"+generatedNumber1);
		String generatedString3 = RandomStringUtils.randomAlphabetic(6);
		official_EmailId.sendKeys(generatedString3);
		act.moveToElement(organization_size).build().perform();
		organization_size.click();
		Thread.sleep(2000);
		Select drp = new Select(organization_size);
		drp.selectByVisibleText("1001-5000");
		Thread.sleep(1000);
		Select drp2 = new Select(interested_In);
		drp2.selectByVisibleText("Taking a demo");
		Thread.sleep(3000);
		boolean status = schedule_demo.isEnabled();
		System.out.println("Validation for negative input : ");
		System.out.println("The status for 'Schedule a demo' button is : " + status);
		System.out.println("Thank You message is not displayed");
	}

}
