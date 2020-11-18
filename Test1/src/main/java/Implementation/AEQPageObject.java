package Implementation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class AEQPageObject

{
	WebDriver driver;
	WebDriverWait mywait;

	@FindBy(id = "user-name")
	private WebElement Username;

	@FindBy(id = "password")
	private WebElement Password;

	@FindBy(id = "login-button")
	private WebElement Login;

	@FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/h3")
	private WebElement ErrorMsg;

	public AEQPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements((driver), this);
	}

	@Test
	public void VerifyElements() {

		if (Username.isDisplayed()) {
			System.out.println("Username field has displayed");
			Reporter.log("Username field has displayed");

		} else {
			System.out.println("Username field did not display");
			Reporter.log("Username field did not display");

		}

		if (Password.isDisplayed()) {
			System.out.println("Password field has displayed");
			Reporter.log("Password field has displayed");


		} else {
			System.out.println("Password field did not display");
			Reporter.log("Password field did not display");

		}

		if (Login.isDisplayed()) {
			System.out.println("Login button has displayed");
			Reporter.log("Login button has displayed");


		} else {
			System.out.println("Login button did not display");
			Reporter.log("Login button did not display");

		}
	}

	@Test
	public void VerifyLogin() {
		Username.sendKeys("standard_user");
		Password.sendKeys("secret_sauce");
		Login.click();
		String URLpostlogin = driver.getCurrentUrl();

		if (URLpostlogin.contains("inventory")) {
			System.out.println("Login is successful");
			Reporter.log("Login is successful");

		} else {
			System.out.println("Login is unsuccessful");
			Reporter.log("Login is unsuccessful");


		}

	}

	@Test
	public void VerifyFailLogin() {
		Username.sendKeys("standard_user12");
		Password.sendKeys("secret_sauce12");
		Login.click();

		if (ErrorMsg.isDisplayed()) {
			System.out.println("Invalid credentials did not work");
			Reporter.log("Invalid credentials did not work");

		} else {
			System.out.println("Login works even with invalid credentials");
			Reporter.log("Login works even with invalid credentials");


		}

	}

	@Test
	public void VerifyLoginUsingEnter() {
		Username.sendKeys("standard_user");
		Password.sendKeys("secret_sauce");
		Login.sendKeys(Keys.RETURN);
		String URLpostlogin = driver.getCurrentUrl();

		if (URLpostlogin.contains("inventory")) {
			System.out.println("Login is successful");
			Reporter.log("Login is successful");

		} else {
			System.out.println("Login is unsuccessful");
			Reporter.log("Login is unsuccessful");


		}

	}

	@Test
	public void VerifyPlaceholder() {
		String Usernameplaceholder = Username.getAttribute("placeholder");
		String Passwordplaceholder = Password.getAttribute("placeholder");

		if (Usernameplaceholder.contains("Username")) {
			System.out.println("Username Placeholder is correct");
			Reporter.log("Username Placeholder is correct");

		} else {
			System.out.println("Username Placeholder is incorrect");
			Reporter.log("Username Placeholder is incorrect");


		}
		if (Passwordplaceholder.contains("Password")) {
			System.out.println("Password Placeholder is correct");
			Reporter.log("Password Placeholder is correct");

		} else {
			System.out.println("Password Placeholder is incorrect");
			Reporter.log("Password Placeholder is incorrect");


		}

	}
}
