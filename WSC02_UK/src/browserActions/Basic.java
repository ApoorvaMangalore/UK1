package browserActions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		System.out.println("Chrome Browser is opened and Maximised");
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		System.out.println("User is able to open Amazon Page");
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println("User is able to launch flipcart using navigate_to(String) method");
		Thread.sleep(2000);
		URL url = new URL("https://demowebshop.tricentis.com/");
		driver.navigate().to(url);
		System.out.println("User is able to launch DemoWebShop page using navigate_to(URL) method");
		Thread.sleep(2000);
	// driver.navigate().to(url="new Demo("https://demowebshop.tricentis.com/"));
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		String titleofPage = driver.getTitle();
		System.out.println("Title of Current Page is:" + titleofPage);
		driver.navigate().forward();
		// Thread.sleep(4000);
		String titleofPage1 = driver.getTitle();
		System.out.println("Title of Current Page is:" + titleofPage1);
		String pagesource = driver.getPageSource();
		System.out.println("Page Source of Current Page is:" + pagesource);
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL is:" + currentURL);
		driver.quit();

	}
}
