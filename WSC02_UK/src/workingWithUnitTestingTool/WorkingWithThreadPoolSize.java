
package workingWithUnitTestingTool;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WorkingWithThreadPoolSize {// TC_ID
// in the critical situation to run our test case parallell we can use this helping attribute
	@Test(invocationCount = 5)
	public void demo() {
		System.out.println("Hello demo");
	}
//try with invocationCount<threadPoolSize
//try with invocationCount>threadPoolSize
//try with invocationCount=threadPoolSize
//Use driver.quit

	@Test( invocationCount = 5,threadPoolSize = 5)
	public void aopenAmazon() throws InterruptedException {// testcase decr
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 25);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
	}

}
