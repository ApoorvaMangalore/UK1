package workingWithUnitTestingTool;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegWithDemoweb {
	@DataProvider
	public String[][] regdemo() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
		Workbook ref = WorkbookFactory.create(fis);
		int numRows = ref.getSheet("regdata").getPhysicalNumberOfRows();
		int numofCells = ref.getSheet("regdata").getRow(0).getPhysicalNumberOfCells();
		System.out.println(numRows);
		System.out.println(numofCells);

		String[][] data = new String[numRows][numofCells];
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numofCells; j++) {
				data[i][j] = ref.getSheet("regdata").getRow(i).getCell(j).toString();
			}
		}
		return data;

	}

	@Test(dataProvider = "regdemo")
	public void regForDemoWebshop(String[] dataToReg) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		if (dataToReg[0].equalsIgnoreCase("male")) {
			driver.findElement(By.id("gender-male")).click();
		} else {
			driver.findElement(By.id("gender-female")).click();
		}
		driver.findElement(By.id("FirstName")).sendKeys(dataToReg[1]);
		driver.findElement(By.id("LastName")).sendKeys(dataToReg[2]);
		driver.findElement(By.id("Email")).sendKeys(dataToReg[3]);
		driver.findElement(By.id("Password")).sendKeys(dataToReg[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(dataToReg[5]);

		driver.quit();
	}
}
