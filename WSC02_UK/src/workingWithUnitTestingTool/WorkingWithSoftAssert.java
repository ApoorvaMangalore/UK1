package workingWithUnitTestingTool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class WorkingWithSoftAssert {

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Reporter.log("User is able to open empty browser", true);
		driver.manage().window().maximize();
		Reporter.log("User is able to maximize the browser", true);

		SoftAssert sa=new SoftAssert();
		
		String expUrl = "https://demowebsho.tricentis.com/";
		String expTitle = "Demo Web Shop. Login";
		String expemail = "aproova.z@testyantra.com";

		driver.get("https://demowebshop.tricentis.com/");
		String actulUrl = driver.getCurrentUrl();

		sa.assertEquals(expUrl, actulUrl, "User is not able to open demowebshop");
		

		driver.findElement(By.linkText("Log in")).click();

		WebElement emailTb = driver.findElement(By.id("Email"));
		emailTb.sendKeys("apoorva.z@testyantra.com");
		String value = emailTb.getAttribute("value");
		System.out.println(value);
		sa.assertEquals(value, expemail);

		driver.findElement(By.id("Password")).sendKeys("9880001279");
		WebElement checkBox = driver.findElement(By.id("RememberMe"));
		checkBox.click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.quit();

		sa.assertAll();

	}
}
