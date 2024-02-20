package workingWithActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);

		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		WebElement drag = driver.findElement(By.id("draggable"));

		WebElement drop = driver.findElement(By.id("droppable"));

		actions.clickAndHold(drag).perform();
		Thread.sleep(9000);
		actions.dragAndDrop(drag, drop).perform();
	}

}
