package workingWithMultipleWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/user/Downloads/Selenium/Selenium(PPT)/PracticePage/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();

		String parentWindow = driver.getWindowHandle();// only parent window
		Thread.sleep(8000);
		Set<String> allWindows = driver.getWindowHandles();// parent + child
		int size = allWindows.size();

		System.out.println(parentWindow);
		System.out.println(allWindows);
		System.out.println(size);

		for (String i : allWindows) {
			driver.switchTo().window(i);
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getPageSource());
		}

		// driver.quit(); parent and child windows will be closed
		driver.close(); // only parent window is closed close
	}

}
