package workingWithFindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnAllTheRadioButtons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));

		WebElement text = driver.findElement(By.xpath("//label[text()='Excellent']"));
		System.out.println(text.getText());

		// returntype singwebelemt: all webelemets(for each)
		for (WebElement radiobutton : radioButtons) {

			radiobutton.click();

			driver.findElement(By.xpath("//input[@value='Vote']")).click();
		}

		driver.quit();
	}
}
