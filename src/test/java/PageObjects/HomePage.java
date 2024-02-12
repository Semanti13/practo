package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

	}

	// Elements
	@FindBy(xpath = "//div[@class ='product-tab'][1]/a/div[1]")
	WebElement find_doctors;
	@FindBy(xpath = "//div[@class='c-omni-searchbox_wrapper ']/span/span")
	WebElement clear_button;
	@FindBy(xpath = "//input[@placeholder='Search location']")
	WebElement city_inputbox;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div")
	WebElement practo;
	@FindBy(xpath = "//div[@class='c-omni-suggestion-group']/div/span/div[starts-with(text(),'Bangalore')]")
	WebElement select_city;
	@FindBy(xpath = "//input[@placeholder='Search doctors, clinics, hospitals, etc.']")
	WebElement doctor_inputbox;
	@FindBy(xpath = "//div[@class='c-omni-suggestion-item']/span/div[text()='Cardiologist']")
	WebElement choose_doctor;

	// Actions
	public void clickFindDoctors() {
		find_doctors.click();

	}

	public void selectcitybox() {
		Actions act = new Actions(driver);
		act.moveToElement(city_inputbox).build().perform();
		city_inputbox.click();
		city_inputbox.clear();
	}

	public void searchcity() throws Throwable {
		city_inputbox.sendKeys("Banga");
		Thread.sleep(3000);
	}

	public void selectcityname() {
		Actions act = new Actions(driver);
		act.moveToElement(select_city).click().build().perform();
	}

	public void selectdoctor() {
		doctor_inputbox.sendKeys("cardio");
		Actions act = new Actions(driver);
		act.moveToElement(choose_doctor).click().build().perform();
	}

}
