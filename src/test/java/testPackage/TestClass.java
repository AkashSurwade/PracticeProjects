package testPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPackage.HomePage;
import pomPackage.LoginPage;

public class TestClass 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akash\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPage login = new LoginPage(driver);
		login.SendUserName();
		login.SendPassword();
		login.ClickLoginButton();
		HomePage home = new HomePage(driver);
		home.AdminTab();
		home.PIMTab();
		home.LeaveTab();
		home.TimeTab();
		home.RecruitmentTab();
		home.MyInfoTab();
		home.PerformanceTab();
		home.DashboardTab();
		home.DirectoryTab();
		home.MaintenanceTab();
		home.BuzzTab();
	}

}
