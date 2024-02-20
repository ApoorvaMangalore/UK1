package testNgProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

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

	@Parameters({ "browserName" })
	@AfterTest
	public void browser(String browserName) throws InterruptedException {

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			 driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "./driver/edgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println("browser is not valid");
		}
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		
	}

	@AfterTest()
	public void browserQuit() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();

	}

}
