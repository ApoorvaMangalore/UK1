package workingWithJs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByJs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");// to scroll till bottom

		jse.executeScript("window.scrollBy(0,1000)");// page down Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,-500)");// page up

	}

}
