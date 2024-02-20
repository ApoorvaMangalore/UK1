package browserActions;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWebdriverMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// to lunch demowebshop.com
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("User is able to lunch the demowebshop app");

		// to get the title of the page
		String tiltePageOfThePage = driver.getTitle();
		System.out.println(tiltePageOfThePage + " titleOfThePage");

		// getPageSource
		String pageSource = driver.getPageSource();
		System.out.println(pageSource + "page source");

		// getcurrentUrl
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL + "url of the application");
		
		Thread.sleep(2000);
		//to close the browser
		//best practice to use quit
		driver.quit();
		driver.close();
		System.out.println("user is able to close the browser");
	}

}
