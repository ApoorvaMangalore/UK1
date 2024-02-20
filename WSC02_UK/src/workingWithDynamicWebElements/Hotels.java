package workingWithDynamicWebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Hotels {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://in.via.com/hotels");
		Actions actions = new Actions(driver);

		driver.findElement(By.id("destination")).sendKeys("Algarve,Portugal");
		actions.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.id("checkIn")).click();
		WebElement date = driver.findElement(By
				.xpath("//div[@id='depart-cal']//span[text()=' 2024']//span[text()='Jan']/../../..//div[text()='10']"));
		date.click();
		driver.findElement(By.id("vc-close")).click();
		//Thread.sleep(50000);
	}
}
