package workingWithJs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDoodles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		driver.get("https://www.google.com/doodles");

		for (;;) {
			try {
				driver.findElement(By.linkText("Trinidad & Tobago Independence Day 2023")).click();
				String text = driver.findElement(By.xpath("//h2[text()='Trinidad & Tobago Independence Day 2023']"))
						.getText();
				System.out.println(text);
				break;
			} catch (Exception e) {
				jse.executeScript("window.scrollBy(0,500)");
			}

		}

	}
}
