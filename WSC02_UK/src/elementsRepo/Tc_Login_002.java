package elementsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_Login_002 {// testCaseId
	@Test
	public void validateThatTheUserIsAbletoClickOnCheckBox() {// TestCase
		// TestSteps1:Open the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Step 2: Enter the URl
		driver.get("https://demowebshop.tricentis.com/");

		// Step 3: Click on login link
		loginPage lp = new loginPage(driver);
		lp.getLogInLink().click();

		// Step 4: Click on checkBox

		lp.getRememberMeCheckBox().click();

		driver.quit();

	}
}
