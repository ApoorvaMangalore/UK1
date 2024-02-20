package workingWithSelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		WebElement multiSelect = driver.findElement(By.id("multiselect1"));
		Select select = new Select(multiSelect);
		select.selectByIndex(3);
		select.selectByIndex(4);
		select.selectByIndex(5);
		select.selectByIndex(6);
		
			
		select.selectByVisibleText("Audi");
		Thread.sleep(2000);

		List<WebElement> allOptions = select.getOptions();
		for (WebElement option : allOptions) {
			System.out.println(option.getText());
		}
		Thread.sleep(2000);
		System.out.println("****************************************");

		List<WebElement> allSelected = select.getAllSelectedOptions();
		for (WebElement selected : allSelected) {
			System.out.println(selected.getText());
		}
		Thread.sleep(2000);
		System.out.println("****************************************");

		WebElement firstSelected = select.getFirstSelectedOption();
		System.out.println(firstSelected.getText());
		System.out.println("****************************************");
		
		driver.quit();

	}
}
