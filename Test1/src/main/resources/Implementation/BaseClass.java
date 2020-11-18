package Implementation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	WebDriver driver;
	public AEQPageObject AEQpgeObj;


	@BeforeTest
	@Parameters("browser")

	public void SetupApplication(String browser) throws InterruptedException, IOException {
		
		//Check if parameter passed from TestNG is 'firefox'
				if(browser.equalsIgnoreCase("Firefox")){
				//create firefox instance
					System.setProperty("webdriver.gecko.driver", "C:\\Users\\earl.fernandes\\Desktop\\Selenium drivers\\geckodriver.exe");
					driver = new FirefoxDriver();
				}
				//Check if parameter passed as 'chrome'
				else if(browser.equalsIgnoreCase("Chrome")){
					//set path to chromedriver.exe
					System.setProperty("webdriver.chrome.driver","C:\\Users\\earl.fernandes\\Desktop\\Selenium drivers\\chromedriver.exe");
					//create chrome instance
					driver = new ChromeDriver();
				}
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		
		try {

			driver.manage().window().maximize();
			String baseurl = "https://www.saucedemo.com/index.html";
			driver.get(baseurl);
			Thread.sleep(3000);

		} catch (Exception e) {
			e.getMessage();
			System.out.println(e);
		}
	}

	@AfterTest

	public void tearDown() {

		try

		{
			driver.quit();
		} catch (NullPointerException e) {
			e.getMessage();
			  Reporter.log("=====Browser Session End=====", true);

		}

	}

}
