package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithID {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(4000);
		/*
		 * driver.findElement(By.id("gender-female")).click(); Thread.sleep(4000);
		 * 
		 * driver.findElement(By.id("FirstName")).sendKeys("Apoorva");
		 * Thread.sleep(4000); driver.quit();
		 */
		
		
	}

}
