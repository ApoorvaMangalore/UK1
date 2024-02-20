package browserActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/register/");

		WebElement radioButton = driver.findElement(By.id("gender-female"));
		// webelement method----1.click()/submit()
		radioButton.click();
		Thread.sleep(2000);
		String value = radioButton.getAttribute("value");
		System.out.println(value);

		WebElement firstNameTextBox = driver.findElement(By.id("FirstName"));
		// webelement method----2.sendKeys
		firstNameTextBox.sendKeys("Apoorva");

		String attributeValue = firstNameTextBox.getAttribute("value");
		String attributeValueId = firstNameTextBox.getAttribute("id");
		System.out.println(attributeValue);//Apoorva
		System.out.println(attributeValueId);//First Name

		// webelement method----3.clear 10.submit()
		firstNameTextBox.clear();
		firstNameTextBox.sendKeys("mangalore");
		String value2 = firstNameTextBox.getAttribute("value");
		System.out.println(value2);

		// webelement method----4.getTagName
		System.out.println(firstNameTextBox.getTagName());
		
		//webelement method----6.getLocation
		Point loc = firstNameTextBox.getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());

		// webelement method----5.getText
		WebElement firstNameHeader = driver.findElement(By.xpath("//label[text()='First name:']"));
		System.out.println(firstNameHeader.getText());
		
		
		//webelement method----7.isDisplayed(),8.isEnabled(),9.isSelected()
		System.out.println(radioButton.isDisplayed());
		System.out.println(radioButton.isEnabled());
		System.out.println(radioButton.isSelected());
		
		//webelement method----11.getCssValue()
		System.out.println(firstNameTextBox.getCssValue("writing-mode"));
		

		driver.quit();

	}

}
