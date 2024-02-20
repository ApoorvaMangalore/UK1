package workingWithUnitTestingTool;

import org.testng.annotations.Test;

public class WorkingWithDependenceOnMethod {
	@Test
	public void register() {
		System.out.println("Reg");
	}

	@Test
	public void login() {
		System.out.println("Login");
	}

	@Test
	public void logout() {
		System.out.println("Logout");
	}

	@Test
	public void addtoCart() {
		System.out.println("a");
	}
}
