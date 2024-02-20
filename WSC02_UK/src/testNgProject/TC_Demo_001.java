package testNgProject;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Demo_001 extends BaseClass {

	@Test
	public void verifyThatUserIsAbleTOClickOnLinks() {

		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Reporter.log("User is able to click on shopping cart link", true);
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		Reporter.log("User is able to click on wishlist link", true);
	}
}
