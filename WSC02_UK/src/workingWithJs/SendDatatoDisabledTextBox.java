package workingWithJs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendDatatoDisabledTextBox {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.get("https://demoapp.skillrary.com/#");
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("apoorva");

		WebElement disableTextBox = driver.findElement(By.xpath("//input[@class='form-control']"));

		jse.executeScript("arguments[0].value='Apoorva'", disableTextBox);
		Thread.sleep(2000);
		jse.executeScript("arguments[0].value='Mangalore'", disableTextBox);
		Thread.sleep(2000);

		driver.quit();
	}
}
