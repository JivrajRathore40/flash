package Seleniumeasy.Test.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Seleniumeasy.GenericLib.TestBase;
import Seleniumeasy.PageLib.InputCheckBox;

public class InpurtCheckBoxTest extends TestBase{
	@Test
public void verify_checkbox() {
	InputCheckBox chack = PageFactory.initElements(TestBase.driver, InputCheckBox.class);

    chack.selectedCheckBox();	
    String expected = "Success - Check box is checked";
    String actual = "S uccess - Check box is checked";
    Assert.assertEquals(actual, expected);
}
}
