package workingWithIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3School {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		
		driver.switchTo().frame(1);
		
		WebElement firstName = driver.findElement(By.id("fname"));
		firstName.clear();
		firstName.sendKeys("apoorva");
		
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}
}
