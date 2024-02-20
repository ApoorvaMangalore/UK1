package workingWithDynamicWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://cosmocode.io/automation-practice-webtable/");
		String varible = "Canada";
		String varible2 = "Belarus";

		int i = 2;

		WebElement text = driver.findElement(By.xpath("//table[@id='countries']//tr[" + i + "]"));
		String data = text.getText();
		System.out.println(data);

		WebElement particularWebElement = driver
				.findElement(By.xpath("//table[@id='countries']//strong[text()='Afghanistan']/../..//input"));
		particularWebElement.click();

		WebElement particularWebElement1 = driver
				.findElement(By.xpath("//table[@id='countries']//strong[text()='" + varible + "']/../..//input"));
		particularWebElement1.click();
		System.out.println(particularWebElement1.isSelected());

		WebElement particularWebElement2 = driver
				.findElement(By.xpath("//table[@id='countries']//strong[text()='" + varible2 + "']/../..//input"));
		particularWebElement2.click();
		System.out.println(particularWebElement2.isSelected());

		// driver.quit();
	}
}
