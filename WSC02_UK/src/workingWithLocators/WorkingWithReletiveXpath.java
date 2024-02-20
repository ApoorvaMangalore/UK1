package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithReletiveXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(4000);

		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("apoorva");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("mangalore");
		Thread.sleep(4000);
	}
}
