package toLunchEmptyBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyChromeBrowser {
//To lunch empty browser in chrome
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		System.out.println("Empty browser is opened");

		// To Maximize The browser
		driver.manage().window().maximize();
		System.out.println("Browser is Maximized");

	}

}
