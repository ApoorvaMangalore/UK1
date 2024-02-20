package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpathByText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.xpath("(//input[contains(@id,'gender')])[2]")).click();
		driver.findElement(By.xpath("//input[contains(@data-val-required,'First name')]")).sendKeys("apoorva");
		
		
		
		
		
		
		
		/*
		 * driver.findElement(By.id("gender-female")).click();
		 * driver.findElement(By.id("register-button")).click();
		 */

		/*
		 * WebElement errorMsg =
		 * driver.findElement(By.xpath("//span[text()='First name is required.']"));
		 * 
		 * System.out.println(errorMsg.getText()); //System.out.println(text);
		 * 
		 * WebElement errorMsg2 =
		 * driver.findElement(By.xpath("//span[text()='Last name is required.']"));
		 * String text2 = errorMsg2.getText();
		 * 
		 * System.out.println(text2); driver.quit();
		 */

	}

}
