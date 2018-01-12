package Seleniumeasy.Test.tests;

import org.openqa.selenium.support.PageFactory;

import Seleniumeasy.GenericLib.TestBase;
import Seleniumeasy.PageLib.RadoiButtonPage;

public class RadioButtonTest extends TestBase{
            
	public void selectedRadio() {
		RadoiButtonPage button = PageFactory.initElements(TestBase.driver, RadoiButtonPage.class);
		button.checkedButton();
		
	}
}
