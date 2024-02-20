package simpleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemoWebshop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("acm@123.com");

		driver.findElement(By.id("Password")).sendKeys("12345");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.id("Email")).sendKeys("acm@123.com");
		driver.findElement(By.name("send-email")).click();

	}

}
