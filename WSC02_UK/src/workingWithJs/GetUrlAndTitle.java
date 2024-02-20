package workingWithJs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlAndTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//Title of the page
		String title = (String)jse.executeScript(" return document.title");
		System.out.println(title);
		//URL of the Application
		String URL = (String)jse.executeScript(" return document.URL");
		System.out.println(URL);
		//Base URI of application
		String URI = (String)jse.executeScript(" return document.baseURI");
		System.out.println(URI);
		//with out return type ----null
		String title1 = (String)jse.executeScript(" window.document.title");
		System.out.println(title1);
		
		driver.quit();
	    
	}

}
