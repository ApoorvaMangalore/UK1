package workingWithIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/user/Downloads/Selenium/Selenium(PPT)/PracticePage/iframe.html");
		
		driver.findElement(By.linkText("Google")).click();
		driver.navigate().back();
		
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("Register")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Register")).click();
		
	}
}
