package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTagName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// tag name are duplicate so we will prefer
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		driver.findElement(By.tagName("img")).click();
		Thread.sleep(4000);
		driver.findElement(By.tagName("input")).sendKeys("mobiles");
	}

}
