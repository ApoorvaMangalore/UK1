package workingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingContextClick {
//context click is for rightclick of the webelement
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		// step1: create object for actions class

		// actions.contextClick().perform();// with out parameter

		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		// step 2: call the respective method then call perform()
		actions.contextClick(rightClick).build().perform();// with parameter

		driver.quit();
	}

}
