package workingWithUnitTestingTool;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithChronologicalOrder {
	@Test // We are writing our script in @test
	public void test() {
		System.out.println("I am test");
		Reporter.log("hello test", true);
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am beforeSuite");

	}
	@Test // We are writing our script in @test
	public void test1() {
		System.out.println("I am test1");
	}

	@Test // We are writing our script in @test
	public void test2() {
		System.out.println("I am test2");
	}


	@AfterSuite
	public void afterSuite() {
		System.out.println("I am afterSuite");
		// System.out.println(" close Report genration ");//Close DB
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println(" I am before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println(" I am After Test");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am after class");
		Reporter.log("hello after class", true);
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am Before class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am after method");
	}

}
