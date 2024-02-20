package workingWithAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConformAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		driver.findElement(By.id("confirm")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.dismiss();
		//alert.accept();
	}
}
