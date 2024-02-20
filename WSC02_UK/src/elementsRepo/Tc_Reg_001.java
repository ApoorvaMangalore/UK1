package elementsRepo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Tc_Reg_001 extends BaseClass {
	
	@Test
	public void validateThatUserIsAbleaToRegister() {
		
		registerPage reg=new registerPage(driver);
		reg.getRegisterLink().click();
		reg.getFemaleRadioButton().click();
		reg.getFirstNameTextBox().sendKeys("apoorva");
		reg.getLastNametextBox().sendKeys("mangalore");
		reg.getEmailtextBox().sendKeys("apoorva.c@testyantra.com");
		
	}

}
