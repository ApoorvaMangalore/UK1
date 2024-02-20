package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClassName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// class name is duplicate if it is very unique it will identify
		driver.get("https://demowebshop.tricentis.com");

		driver.findElement(By.className("ico-register")).click();

		// class name is duplicate(no sush element)
		driver.findElement(By.className("text-box single-line")).sendKeys("acm");
	}

}
