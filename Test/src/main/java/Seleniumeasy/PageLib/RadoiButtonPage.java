package Seleniumeasy.PageLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadoiButtonPage {
	
	@FindBy(xpath="(//label[text()='Male'])[1]")
	WebElement SelectMale;
	
	@FindBy(xpath = "(//label[text()='Female'])[1]")
	WebElement selectFemale;
	
	@FindBy(xpath = "//button[text()='Get Checked value']")
	WebElement submit;
	
	public void checkedButton() {
		submit.click();
	}

}
