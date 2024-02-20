package browserActions;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLunchDemoWebShop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//to lunch myntra.com
		driver.get("https://www.myntra.com/");
		System.out.println("User is able to lunch the myntra app");
		
	}

}
