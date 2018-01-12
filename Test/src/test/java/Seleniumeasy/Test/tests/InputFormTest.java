package Seleniumeasy.Test.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import Seleniumeasy.GenericLib.*;
import Seleniumeasy.PageLib.InputFormPage;

public class InputFormTest extends TestBase {

	@Test
	public void verifying_Msg() {
		InputFormPage ifp = PageFactory.initElements(TestBase.driver, InputFormPage.class);
		ifp.enter_Text("2","4");
		ifp.click_On_Button();
		String expected = "6";
		String actual = ifp.getText();
		Assert.assertEquals(actual, expected);
	}
}
