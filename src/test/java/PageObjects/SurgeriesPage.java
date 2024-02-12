package PageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utilities.excelUtils;

public class SurgeriesPage extends BasePage {

	public SurgeriesPage(WebDriver driver) {
		super(driver);

	}

	
	

	@FindBy(xpath = "//div[@class ='product-tab'][5]/a/div[1]")
	WebElement surgery;
	@FindBy(xpath = "//*[@id=\"surgeries\"]/div/div[1]/div/h1")
	WebElement popular_surgeries;

	public void clicksurgery() throws Throwable {
		Actions act = new Actions(driver);
		act.moveToElement(surgery).click().build().perform();
		//Thread.sleep(2000);
		//surgery.click();
		
	}

	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", popular_surgeries);
	}

	public void popularsurgeries() throws IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", popular_surgeries);
		List<WebElement> popular_surgery = driver
				.findElements(By.xpath("//div[@class='rounded-12px border-white-2 border']/div/div"));
		System.out.println("The popular surgeries are :-------");
		String file = System.getProperty("user.dir") + "\\testdata\\hackathon_data.xlsx";
		for (int i = 0; i < popular_surgery.size(); i++) {
			System.out.println(popular_surgery.get(i).getText());

			excelUtils obj = new excelUtils();
			obj.setCellData(file, "Sheet1", i + 1, 0, popular_surgery.get(i).getText());
		}
	}

	
}
////div[@class='rounded-12px border-white-2 border']/h1