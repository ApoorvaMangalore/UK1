package workingWithUnitTestingTool;

import org.testng.annotations.Test;

public class WorkingWithEnable {
// default value en= true
	@Test()
	public void login() {
		System.out.println("user is able to login");
	}

	@Test(enabled = false)
	public void logout() {
		System.out.println("user is able to logout");
	}
//If you want to skip any test case
	@Test()
	public void openBrowser() {
		System.out.println("Open browser");
	}

	@Test(enabled = true)
	public void closeBrowser() {
		System.out.println("Close browser");
	}

	// if you want to run same test case multiple time
	@Test(invocationCount = 6)
	public void register() {
		System.out.println("User is able to reg");
	}
}
