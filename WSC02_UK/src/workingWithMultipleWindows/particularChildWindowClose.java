package workingWithMultipleWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class particularChildWindowClose {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/user/Downloads/Selenium/Selenium(PPT)/PracticePage/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();

		String parentWindow = driver.getWindowHandle();// only parent window
		Thread.sleep(8000);
		Set<String> allWindows = driver.getWindowHandles();// parent + child

		System.out.println(parentWindow);
		System.out.println(allWindows);
		allWindows.remove(parentWindow);// to remove particular window

		String windowname = "Olive Garden Italian Restaurant | Family Style Dining | Italian Food";
		for (String i : allWindows) {
			driver.switchTo().window(i);
			String title = driver.getTitle();
			System.out.println(title);
			if (title.equals("Olive Garden Italian Restaurant | Family Style Dining | Italian Food")) {
				driver.close();
			} // 1

			/*
			 * if (title.equals(windowname)) {// 2 driver.close(); } if
			 * (title.contains("Olive Garden")) {// 3 driver.close(); }
			 * 
			 * if (title.equalsIgnoreCase(windowname)) {// 4 driver.close(); }
			 */
		}

	}
}
