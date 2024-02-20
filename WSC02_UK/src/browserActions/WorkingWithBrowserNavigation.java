package browserActions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithBrowserNavigation {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.manage().window().fullscreen();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);

		// browser related actions, to will call internally get method
		driver.navigate().to("https://www.zomato.com");

		// create url type obeject aad pass it in to();
		URL url = new URL("https://www.zinghr.com/");
		driver.navigate().to(url);

		/*
		 * driver.navigate().back();// empty browser Thread.sleep(4000);
		 * driver.navigate().forward();// demo webshop Thread.sleep(4000);
		 * driver.navigate().refresh(); Thread.sleep(4000);
		 */

		// driver.quit();
	}

}
