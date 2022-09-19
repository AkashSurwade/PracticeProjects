package testPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg {

	@BeforeTest
	public void chrome() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void firefox() {
		System.out.println("After test");
	}

	@BeforeClass
	public void test() {
		System.out.println("BeforeClass A");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod A");
	}

	@Test

	public void testMethod() {
		System.out.println("TestMethod A");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod A");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass A");
	}

}
