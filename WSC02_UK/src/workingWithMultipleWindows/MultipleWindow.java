package workingWithMultipleWindows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("file:///C:/Users/user/Downloads/Selenium/Selenium(PPT)/PracticePage/MultipleWindow.html");

		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(6000);
		String parentWindow = driver.getWindowHandle();
		Set<String> allwindowID = driver.getWindowHandles();
		System.out.println(allwindowID.size());

		System.out.println(parentWindow);
		System.out.println(allwindowID);
		allwindowID.remove(parentWindow);

		for (String i : allwindowID) {
			driver.switchTo().window(i);
			String titleOfPage = driver.getTitle();
			driver.close();
			System.out.println(titleOfPage);
		}
	}
		

}
