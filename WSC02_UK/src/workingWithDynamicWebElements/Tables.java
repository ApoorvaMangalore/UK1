package workingWithDynamicWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tables {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://cosmocode.io/automation-practice-webtable/");

		int rowcount = driver.findElements(By.xpath("//table[@id='countries']//tr")).size();
		System.out.println(rowcount);

		int columnsCount = driver.findElements(By.xpath("//table[@id='countries']//tr[1]//td")).size();
		System.out.println(columnsCount);

		for (int i = 2; i <= rowcount; i++) {
			System.out.println(i + ":");
			for (int j = 2; j <= columnsCount; j++) {
				String value = driver.findElement(By.xpath("//table[@id='countries']//tr[" + i + "]//td[" + j + "]"))
						.getText();

				System.out.println(value);
			}
		}
	}
}
