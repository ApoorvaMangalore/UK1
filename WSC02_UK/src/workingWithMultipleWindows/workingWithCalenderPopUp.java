package workingWithMultipleWindows;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import okio.Options;

public class workingWithCalenderPopUp {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.get("https://in.via.com/");

		driver.findElement(By.id("source")).sendKeys("Ba");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		// Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.name("destination")).sendKeys("Hy");
		Actions actions = new Actions(driver);
		// Thread.sleep(3000);
		WebElement Hyd = driver.findElement(By.xpath("//span[text()='Hyderabad,Hyderabad - India']"));
		actions.moveToElement(Hyd).click().perform();

		String month = "Oct";
		String date = "30";

		// driver.findElement(By.id("departure")).click();
		// driver.findElement(By.xpath("//span[text()='Oct']/../../..//div[text()='30']")).click();
		driver.findElement(By.xpath("//span[text()='" + month + "']/../../..//div[text()='" + date + "']")).click();

		// Thread.sleep(3000);
		WebElement return1 = driver.findElement(By.id("return"));
		actions.click(return1).perform();
		// Thread.sleep(5000);

		driver.findElement(By.xpath(
				"(//div[@id='return-cal']//span[text()=' 2023']//span[text()='Nov']/../../..//div[text()='4'])[1]"))
				.click();

	}
}
