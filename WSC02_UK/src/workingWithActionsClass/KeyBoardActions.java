package workingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
// to capture the text which is present in the bottom of the page
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);

		driver.get("https://demowebshop.tricentis.com/");
//if your are are able to find the element which is in the bottom of the page go for actions class and 
//perform the action by keyboard methods.
		actions.sendKeys(Keys.PAGE_UP).perform();//Keys:enum
		Thread.sleep(2000);
		actions.sendKeys(Keys.PAGE_DOWN).perform();//perform() must
		Thread.sleep(2000);
		actions.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(2000);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);

		WebElement text = driver.findElement(By.xpath("//div[contains(text(),'Copyright © 2023')]"));
		System.out.println(text.getText());
		driver.quit();
		
		
	}

}
