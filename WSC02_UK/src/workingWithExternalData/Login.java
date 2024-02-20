package workingWithExternalData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		// File file = new File("./testData/TestData.xlsx");
		// FileInputStream fis = new FileInputStream(file);

		FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
		FileInputStream fis1 = new FileInputStream("./testData/Data.properties");
		Properties prop=new Properties();
		prop.load(fis1);
		

		// step 1 :create obejct for your extention of xlsx
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// step 2: to get in to sheet
		XSSFSheet sheet = workbook.getSheet("data");

		String emailID = sheet.getRow(1).getCell(0).getStringCellValue();
		 String password = sheet.getRow(1).getCell(1).toString();
		System.out.println(emailID);
		System.out.println(password);

		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(emailID);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
}
