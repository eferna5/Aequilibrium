package Implementation;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase4 extends BaseClass {

	@Test (description = "This test is to verify Login functionality works by pressing Return/Enter")
	public void AequilibriumTC4() throws Exception {
		AEQpgeObj = PageFactory.initElements(driver, AEQPageObject.class);

		try {
			AEQpgeObj.VerifyLoginUsingEnter();
		} catch (Exception e) {
			System.out.println(e);
			Assert.assertFalse(false, "FAIL");
		}

	}

}
