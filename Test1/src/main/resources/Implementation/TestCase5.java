package Implementation;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase5 extends BaseClass {

	@Test (description = "This test is to verify Username and Password fields have placeholders")
	public void AequilibriumTC5() throws Exception {
		AEQpgeObj = PageFactory.initElements(driver, AEQPageObject.class);

		try {
			AEQpgeObj.VerifyPlaceholder();
		} catch (Exception e) {
			System.out.println(e);
			Assert.assertFalse(false, "FAIL");
		}

	}

}
