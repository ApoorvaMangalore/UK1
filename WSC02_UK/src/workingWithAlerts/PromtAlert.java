package workingWithAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromtAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		driver.findElement(By.id("prompt")).click();

		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("password");
		Thread.sleep(6000);
		System.out.println(alert.getText());
		Thread.sleep(6000);
		alert.accept();
		Thread.sleep(6000);
		driver.quit();
	}
}
