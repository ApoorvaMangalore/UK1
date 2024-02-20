package workingWithWebDriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitPrograms {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// casting operation
		driver.manage().window().maximize();// manage()----maximize
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 25);

		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		WebElement facebook = driver.findElement(By.linkText("Facebook"));
		//facebook.click();
		// wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Facebook")));

		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Facebook")));

		 wait.until(ExpectedConditions.elementToBeClickable(facebook));

		 driver.findElement(By.linkText("Facebook")).click();
	}
}
