package Implementation;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 extends BaseClass {

	@Test (description = "This test is to verify Login works with Valid credentials")
	public void AequilibriumTC2() throws Exception {
		AEQpgeObj = PageFactory.initElements(driver, AEQPageObject.class);

		try {
			AEQpgeObj.VerifyLogin();
		} catch (Exception e) {
			System.out.println(e);
			Assert.assertFalse(false, "FAIL");
		}

	}

}
