package workingWithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAbsoluteXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(4000);
		
		//Very difficult to identify element with this
		//in real time/practically  its not at all posible
		//If html hage it self chenge this will not help us
		//very lengthy and time taken
		//idexing is possible in xpath
		driver.findElement(By.xpath("(/html/body/div/div/div/div)[1]")).click();
	}
}
