package testNgProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_Demo_002 extends BaseClass {

	@Test
	public void validateThatUserIsAbleTiClickOnOneRadioButton() throws InterruptedException {
		driver.findElement(By.xpath("//label[text()='Poor']")).click();
		Thread.sleep(3000);
	}

	@Test
	public void verifyThatUserIsAbleTOClickOnLinks() throws InterruptedException {

		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		Thread.sleep(3000);
	}
}
