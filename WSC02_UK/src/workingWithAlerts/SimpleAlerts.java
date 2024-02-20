package workingWithAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		driver.findElement(By.xpath("//input[@value='ClickToGetAlert']")).click();
		// alert is interface

		//Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());
		alert.accept();

		//System.out.println(alert.getText()); // NoAlertPresentException
		//Thread.sleep(4000);

	}

}
