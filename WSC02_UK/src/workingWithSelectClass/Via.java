package workingWithSelectClass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Via {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// to handel dynamic pop up
		// ChromeOptions options=new ChromeOptions();
		// options.addArguments("--disable-notifications");
		// ChromeDriver driver = new ChromeDriver(options);

		// to handel headless browser

		// ChromeOptions options=new ChromeOptions();
		// options.addArguments("--headless");
		// ChromeDriver driver = new ChromeDriver(options);

		// maxmize the screen
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://in.via.com/");
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url);
		System.out.println(title);
	}
}
