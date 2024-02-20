package workingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions act = new Actions(driver);

		driver.get("https://the-internet.herokuapp.com/key_presses");

		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.SPACE).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.NUMPAD1).perform();
		Thread.sleep(2000);
		driver.quit();
		
		
	}
}
