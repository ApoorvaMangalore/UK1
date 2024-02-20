package workingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithMoveToElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);

		WebElement computers = driver.findElement(By.partialLinkText("COMPUTERS"));

		actions.moveToElement(computers).perform();

		// driver.findElement(By.partialLinkText("Notebooks")).click();

		WebElement noteBook = driver.findElement(By.partialLinkText("Notebooks"));

		actions.click(noteBook).perform();

	}
}
