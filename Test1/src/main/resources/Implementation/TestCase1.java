package Implementation;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 extends BaseClass {

	@Test (description = "This test is to verify all Login page Web elements")
	public void AequilibriumTC1() throws Exception {
		AEQpgeObj = PageFactory.initElements(driver, AEQPageObject.class);

		try {
			AEQpgeObj.VerifyElements();
		} catch (Exception e) {
			System.out.println(e);
			Assert.assertFalse(false, "FAIL");
		}

	}

}
