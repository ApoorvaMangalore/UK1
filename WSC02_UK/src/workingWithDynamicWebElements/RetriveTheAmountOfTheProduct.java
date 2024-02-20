package workingWithDynamicWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetriveTheAmountOfTheProduct {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/books");
		String text = driver.findElement(By.xpath("(//span[text()='10.00'])[1]")).getText();
		System.out.println(text);

		WebElement text1 = driver.findElement(By
				.xpath("//img[@alt='Picture of Computing and Internet']/../../..//span[@class='price actual-price']"));
		System.out.println(text1.getText());

		WebElement text3 = driver.findElement(By.xpath("(//span[contains(text(),'10')])[1]"));
		System.out.println(text3.getText());

		driver.quit();
	}

}
