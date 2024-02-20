package workingWithExternalData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataForDemoWebshop {

	public static void main(String[] args) throws IOException {
		// step1:Create object for fis
		FileInputStream fis = new FileInputStream("./testData/data.properties");

		// step 2: Create object for prop files
		Properties prop = new Properties();

		// step 3: To read Data from prop
		prop.load(fis);

		String url = prop.getProperty("url");// getProperty will return us String type
		String key = prop.getProperty("chromeKey");
		String value = prop.getProperty("chromeValue");
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
		
		Object url1 = prop.get("url");// get will return us object type

		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.quit();

	}

}
