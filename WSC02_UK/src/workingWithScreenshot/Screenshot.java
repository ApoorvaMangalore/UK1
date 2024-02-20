package workingWithScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		// step 1: TakesScreenshot down cast it
		// TakesScreenshot Take_Screenshot = (TakesScreenshot) driver;

		WebElement reglink = driver.findElement(By.linkText("Register"));

		// step 2: call the method to take scrnshot "getScreenshotAs"
		File src = reglink.getScreenshotAs(OutputType.FILE);

		// to store it in project
		File dest = new File("./errrorShots/webelement.jpg");
		Files.copy(src, dest);

		driver.quit();
	}
}
