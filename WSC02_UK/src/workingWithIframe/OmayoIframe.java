package workingWithIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoIframe {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");
		// switch to frame by webelement

		WebElement frame = driver.findElement(By.name("navbar-iframe"));
		driver.switchTo().frame(frame);
					//OR
		// Switch to the frame by index
		//driver.switchTo().frame(0);
					//OR
		// Switch to the frame by name/id
		//driver.switchTo().frame("navbar-iframe");

		Thread.sleep(3000);
		driver.findElement(By.id("b-query")).sendKeys("apoorva");
		Thread.sleep(3000);

		// driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
