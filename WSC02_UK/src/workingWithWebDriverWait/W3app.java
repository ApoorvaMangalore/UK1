package workingWithWebDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class W3app {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    WebDriverWait wait=new WebDriverWait(driver, 25);
		
		driver.get("https://www.w3schools.com/w3css/tryit.asp?filename=tryw3css_progressbar_labels_js4");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Upload Photos']")).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[text()='Successfully uploaded 10 photos!']")));
		//use id and check
		WebElement text = driver.findElement(By.xpath("//p[text()='Successfully uploaded 10 photos!']"));
		System.out.println(text.getText());
		driver.quit();
		
	}
}
