package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// if you do not have name and id the go for css(and it should be unique)
		
		
		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("mobiles");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		Thread.sleep(3000);
		
		
		driver.quit();
	}

}
