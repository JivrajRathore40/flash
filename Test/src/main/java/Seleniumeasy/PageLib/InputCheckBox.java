package Seleniumeasy.PageLib;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputCheckBox {
	
@FindBy(xpath="//label[text()='Click on this check box']")
WebElement checkBox;

public void selectedCheckBox() {
	try {
	checkBox.click();
	}
	catch(NoSuchElementException e) {
		System.out.println(e);
	}
}
/*public String getMassage() {
	
}*/
}
