package testPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomPackage.LoginPage;

public class TestNG2 {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethohd B");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClasss B");
	}

	@Test // (dependsOnMethods= {"testA"})
	public void testB() {
		System.out.println("TeatB B");
	}

	@Test // (priority=-1,invocationCount=2,dependsOnMethods= {"testC"})
	public void testA() {
		System.out.println("TestA B");
	}

	@Test(priority = 1)
	public void testC() {
		System.out.println("TestC B");
		// Assert.fail();

	}

	@AfterMethod
	public void After() {
		System.out.println("AfterMethod B");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass B");
	}

}
