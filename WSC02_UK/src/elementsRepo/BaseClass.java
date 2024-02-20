package elementsRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public WebDriver driver;

	@BeforeSuite
	public void dataBaseOpen() {
		System.out.println("Data base connection is opened");
	}

	@AfterSuite
	public void closeDataBase() {
		System.out.println("Data base connection closed");
	}

	@BeforeTest // Beforeclass
	public void browserSetUp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}
	@BeforeMethod
	public void logIn() {
		System.out.println("login");
	}
	@BeforeMethod
	public void logOut() {
		System.out.println("logout");
	}

	@AfterTest()
	public void browserQuit() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();

	}

}
