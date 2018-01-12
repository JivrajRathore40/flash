package Seleniumeasy.PageLib;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputFormPage {

	@FindBy(xpath = "//input[@id='sum1']")
	private WebElement Enter_Text1;

	@FindBy(xpath = "//input[@id='sum2']")
	private WebElement Enter_Text2;

	@FindBy(xpath = "//button[text()='Get Total']")
	private WebElement btn_Get_Total;

	@FindBy(xpath = "//span[@id='displayvalue']")
	private WebElement Value;

	public void click_On_Button() {
		try {
			btn_Get_Total.click();
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
		}
	}

	public void enter_Text(String num1, String num2) {

		Enter_Text1.sendKeys(num1);
		Enter_Text2.sendKeys(num2);

	}

	public String getText() {
		System.out.println("My given msg is : " + Value.getText());
		return Value.getText();

	}
}