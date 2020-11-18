package Implementation;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 extends BaseClass {

	@Test (description = "This test is to verify Login fails with invalid credentials")
	public void AequilibriumTC3() throws Exception {
		AEQpgeObj = PageFactory.initElements(driver, AEQPageObject.class);

		try {
			AEQpgeObj.VerifyFailLogin();
		} catch (Exception e) {
			System.out.println(e);
			Assert.assertFalse(false, "FAIL");
		}

	}

}
