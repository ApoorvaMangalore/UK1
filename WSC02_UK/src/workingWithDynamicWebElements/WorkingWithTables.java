
package workingWithDynamicWebElements;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		int rowCount = driver.findElements(By.xpath("//table[@id='table1']//tr")).size();
		System.out.println(rowCount);

		int colmCount = driver.findElements(By.xpath("//table[@id='table1']//tr[1]//td")).size();
		System.out.println(colmCount);

		for (int i = 1; i < rowCount; i++) {
			System.out.println(i + ":");
			for (int j = 1; j < colmCount; j++) {
				String value = driver.findElement(By.xpath("//table[@id='table1']//tr[" + i + "]//td[" + j + "]"))
						.getText();

				System.out.println(value);
			}
		}
		driver.quit();
	}

}
