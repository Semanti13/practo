package PageObjects;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DoctorsPage extends BasePage {

	public DoctorsPage(WebDriver driver) {
		super(driver);
	}

	Actions act = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	@FindBy(xpath = "//div[@class='c-filter__box u-pos-rel c-dropdown'][2]/span/i")
	WebElement patient_stories_dropdown;
	@FindBy(xpath = "//div[@class='c-filter__box u-pos-rel c-dropdown open']/ul/li[2]")
	WebElement patient_stories_number;
	@FindBy(xpath = "//div[@class='c-filter__top__wrapper']/div[3]")
	WebElement experience_btn;
	@FindBy(xpath = "//div[@class='c-filter__box u-pos-rel c-dropdown open']/ul/li[3]")
	WebElement experience_year;
	@FindBy(xpath = "//div[@class='u-d-inlineblock u-color--white u-c-pointer']/i")
	WebElement all_filters;
	@FindBy(xpath = "//div[@class='pure-u-4-24'][1]/div[1]/label[2]/div")
	WebElement fees;
	@FindBy(xpath = "//div[@class='pure-u-4-24'][2]/div/label[4]")
	WebElement availabilty;
	@FindBy(xpath = "//div[@class='c-filter__top__wrapper']/div[6]/div/div")
	WebElement relevance_btn;
	@FindBy(xpath = "//div[@class='c-sort ']/div/div/ul/li[2]")
	WebElement relevance_type;
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[4]/div/div[1]/div/div[2]/div[1]/div/div[1]")
	WebElement doctor1;
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div/div[1]")
	WebElement doctor2;
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[4]/div/div[1]/div/div[4]/div[1]/div/div[1]")
	WebElement doctor3;
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[4]/div/div[1]/div/div[5]/div[1]/div/div[1]")
	WebElement doctor4;
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[4]/div/div[1]/div/div[6]/div[1]/div/div[1]")
	WebElement doctor5;
	File src;
	File DestFile;

	public void DoctorDetails() throws Throwable {

		List<WebElement> doctordetails = driver.findElements(By.xpath("//div[@class='info-section']"));
		for (int i = 1; i <= 5; i++) {
			System.out.println("The details of Doctor : " + i);
			String d = doctordetails.get(i).getText();
			System.out.println(d);
			WebElement doctor_details = doctordetails.get(i);
			File src = doctor_details.getScreenshotAs(OutputType.FILE);
			File DestFile = new File(
					"C:\\Users\\2303443\\eclipse-workspace\\FindingHospitalsHackathon\\screenshots\\doctors" + i
							+ ".png");
			FileUtils.copyFile(src, DestFile);

		}
	}

	public void selectpatientstories() throws Throwable {
		act.moveToElement(patient_stories_dropdown).click().build().perform();
		act.moveToElement(patient_stories_number).click().build().perform();
		Thread.sleep(3000);
	}

	public void selectexperienceyears() throws Throwable {
		act.moveToElement(experience_btn).click().build().perform();
		act.moveToElement(experience_year).click().build().perform();
		Thread.sleep(3000);
	}

	public void selectallfilters() throws Throwable {
		act.moveToElement(all_filters).click().build().perform();
		Thread.sleep(3000);
	}

	public void selectfees() throws Throwable {
		act.moveToElement(fees).click().build().perform();
		Thread.sleep(3000);
	}

	public void selectavailabilty() throws Throwable {
		act.moveToElement(availabilty).click().build().perform();
		Thread.sleep(3000);
	}

	public void selectrelevance() {
		act.moveToElement(relevance_btn).click().build().perform();
		act.moveToElement(relevance_type).click().build().perform();
	}

}
