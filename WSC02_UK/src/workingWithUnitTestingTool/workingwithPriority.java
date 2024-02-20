package workingWithUnitTestingTool;

import org.testng.annotations.Test;

public class workingwithPriority {
// default value of priority 0
//give 0,positive and negative value
	@Test(priority = 0)
	public void register() {
		System.out.println("User is abel to reg");
	}

	@Test()
	public void logout() {
		System.out.println("user is able to log out");
	}

	@Test(priority = 1)
	public void login() {
		System.out.println("User is able to login");
	}

	@Test(priority = 1)
	public void homepage() {
		System.out.println("User is able to land on home page");
	}

	@Test(priority = 3)
	public void prodSearch() {
		System.out.println("User is able to search ");
	}

}
