package elementsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerPage {
	public registerPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(linkText = "Register")
	private WebElement registerLink;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}

	public WebElement getLastNametextBox() {
		return lastNametextBox;
	}

	public WebElement getEmailtextBox() {
		return emailtextBox;
	}

	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;

	@FindBy(id = "FirstName")
	private WebElement firstNameTextBox;

	@FindBy(id = "LastName")
	private WebElement lastNametextBox;

	@FindBy(id = "Email")
	private WebElement emailtextBox;

}
