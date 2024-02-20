package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkinWithLinkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// TODO Auto-generated method stub

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		driver.findElement(By.partialLinkText("Books")).click();

	}

}
