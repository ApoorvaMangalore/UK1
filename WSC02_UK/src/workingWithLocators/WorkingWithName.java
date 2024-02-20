package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithName {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String name = "apoorva";

		driver.get("https://demowebshop.tricentis.com/register");
		// Thread.sleep(4000);
		driver.findElement(By.id("gender-female")).click();
		// Thread.sleep(4000);
	    WebElement firstname = driver.findElement(By.name("FirstName"));
	    firstname.sendKeys("apoorva");
	   
	    
		driver.findElement(By.name("Password")).sendKeys("apoorva");

		// driver.quit();
	}
}
