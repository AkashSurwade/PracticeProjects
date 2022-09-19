package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{       WebDriver driver;
		@FindBy(xpath = "//*[text()='Admin']")
		private WebElement Admin;
		@FindBy(xpath = "//li [contains(@class,'oxd')]//*[text()='PIM']")
		private WebElement PIM;
		@FindBy(xpath = "//*[text()='Leave']")
		private WebElement Leave;
		@FindBy(xpath = "//*[text()='Time']")
		private WebElement Time;
		@FindBy(xpath = "//*[text()='Recruitment']")
		private WebElement Recruitment;
		@FindBy(xpath = "//*[text()='My Info']")
		private WebElement MyInfo;
		@FindBy(xpath = "//*[text()='Performance']")
		private WebElement Performance;
		@FindBy(xpath = "//*[text()='Dashboard']")
		private WebElement Dashboard;
		@FindBy(xpath = "//*[text()='Directory']")
		private WebElement Directory;
		@FindBy(xpath = "//*[text()='Maintenance']")
		private WebElement Maintenance;
		@FindBy(xpath = "//*[text()='Buzz']")
		private WebElement Buzz;

		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver=driver;
		}

		public void AdminTab() {
			Admin.isDisplayed();

		}

		public void PIMTab() {
			boolean result = PIM.isDisplayed();
			System.out.println(result);

		}

		public void LeaveTab() {
			boolean result2 = Leave.isDisplayed();
			System.out.println(result2);
		}

		public void TimeTab() {
			boolean result3 = Time.isDisplayed();
			System.out.println(result3);
		}

		public void RecruitmentTab() {
			boolean result4 = Recruitment.isDisplayed();
			System.out.println(result4);
		}

		public void MyInfoTab() {
			boolean result5 = MyInfo.isDisplayed();
			System.out.println(result5);
		}

		public void PerformanceTab() {
			boolean result6 = Performance.isDisplayed();
			System.out.println(result6);
		}

		public void DashboardTab() {
			boolean result7 = Dashboard.isDisplayed();
			System.out.println(result7);
		}

		public void DirectoryTab() {
			boolean result8=Directory.isDisplayed();
			System.out.println(result8);
		}

		public void MaintenanceTab() {
			boolean result9=Maintenance.isDisplayed();
			System.out.println(result9);
		}

		public void BuzzTab() {
			boolean result10=Buzz.isDisplayed();
			System.out.println(result10);
		}


}
