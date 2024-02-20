package workingWithUnitTestingTool;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WorkingWithTimeOut {
//in the critical situation if you want to run script with in specific time limits
	@Test(timeOut = 1000)
	public void aopenAmazon() throws InterruptedException {// testcase decr
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 25);
		driver.get("https://demowebshop.tricentis.com/");
		driver.quit();
	}
}
