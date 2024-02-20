package workingWithUnitTestingTool;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithHardAssert {

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Reporter.log("User is able to open empty browser", true);
		driver.manage().window().maximize();
		Reporter.log("User is able to maximize the browser", true);

		String expUrl = "https://demowebshop.tricentis.com/";
		String expTitle = "Demo Web Shop. Login";

		driver.get("https://demowebshop.tricentis.com/");
		String actulUrl = driver.getCurrentUrl();
		Reporter.log(actulUrl + "  ", true);
		assertEquals(expUrl, actulUrl, "User is not able to open demowebshop");
		Reporter.log(actulUrl + "user is able to open demo webshop", true);

		driver.findElement(By.linkText("Log in")).click();

		driver.findElement(By.id("Email")).sendKeys("apoorva.z@testyantra.com");

		driver.findElement(By.id("Password")).sendKeys("9880001279");

		WebElement checkBox = driver.findElement(By.id("RememberMe"));
		checkBox.click();

		driver.findElement(By.xpath("//input[@value='Log in']")).click();

		driver.quit();

	}
}
