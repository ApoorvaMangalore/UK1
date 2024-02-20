package workingWithJs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsInJs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("alert('ok')");// simple alert
		driver.switchTo().alert().dismiss();

		jse.executeScript("prompt('okkk')");// promt alert
		driver.switchTo().alert().dismiss();

		jse.executeScript("confirm('okkk')");// promt alert
		driver.switchTo().alert().dismiss();

		driver.quit();

	}

}
