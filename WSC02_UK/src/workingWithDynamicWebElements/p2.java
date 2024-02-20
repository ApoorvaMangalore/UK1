package workingWithDynamicWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {
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
		cellValue(driver, "3", "5");
		checkBox(driver, "3");

	}

	public static void cellValue(ChromeDriver driver, String rowNum, String clmNum) {
		String value = driver.findElement(By.xpath("//table[@id='countries']//tr[" + rowNum + "]//td[" + clmNum + "]"))
				.getText();
		System.out.println(value);

	}

	public static void checkBox(ChromeDriver driver, String rowNum) {
		driver.findElement(By.xpath("//table[@id='countries']//tr[" + rowNum + "]//td[1]")).click();

	}
}
