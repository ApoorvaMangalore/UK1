package workingWithScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WebpageScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		// step 1: TakesScreenshot down cast it
		TakesScreenshot Take_Screenshot = (TakesScreenshot) driver;

		// step 2: call the method to take scrnshot "getScreenshotAs"
		File src = Take_Screenshot.getScreenshotAs(OutputType.FILE);

		// to store it in project
		File dest = new File("./errrorShots/webpage1.jpg");
		Files.copy(src, dest);

		driver.quit();

	}
}
