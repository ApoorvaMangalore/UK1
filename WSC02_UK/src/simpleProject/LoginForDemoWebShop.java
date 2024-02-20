package simpleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Test case:validate that user is able to login with valid credientials
public class LoginForDemoWebShop {//testcaseId Tc_0001_Login

	public static void main(String[] args) {//TestCasename
		String actualUrl = "https://demowebshop.tricentis.com/";
		String actualTitle = "Demo Web Shop";
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// step1:Open the browser
		System.out.println("Browser is maximized");

		// step2: Enter the Url
		driver.get("https://demowebshop.tricentis.com");//TestSteps
		System.out.println("User is able to open Demo webshop");
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current url of the page " + currentUrl);
		if (actualUrl.equalsIgnoreCase(currentUrl)) {
			System.out.println("URL is correct");
		} else {
			System.out.println("URL is not correct");
		}
		String title = driver.getTitle();
		System.out.println("Title of the page is " + title);
		if (actualTitle.equalsIgnoreCase(title)) {
			System.out.println("Title of the Application is correct");
		} else {
			System.out.println("Title of the Application is not correct");
		}
		// Step3:Click on log in button
		driver.findElement(By.linkText("Log in")).click();
		System.out.println("User is able to click on login link");
		
		// step4:Enter the valid data for the emial textbox
		WebElement emailTb = driver.findElement(By.id("Email"));
		emailTb.sendKeys("apoorvamangalore40@gmail.com");
		String valueEnterdForemail = emailTb.getAttribute("value");
		System.out.println("Value entered is " + valueEnterdForemail);

		// step5:Enter the valid data for the password textbox
		WebElement passwordTb = driver.findElement(By.id("Password"));
		passwordTb.sendKeys("apoorva123");
		String valueEnterdForPassword = passwordTb.getAttribute("value");
		System.out.println("Value entered is " + valueEnterdForPassword);
		
		//Step6:Click on remember me checkbox
		
		//Step7:Click on Login button(capture the url title)
		
		driver.quit();
		System.out.println("Demo web shop is closed");
	}

}
