package TestRepo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import BusinessRepo.LoginBusiness;
import GenericLibrary.BaseClass;
import GenericLibrary.ExtentReporter;

public class LoginTestCases extends BaseClass {
	
	ExtentReports extent = ExtentReporter.GenerateExtentReport();
	
	@BeforeMethod
	private void GearUp() {
		LaunchBrowser("Chrome");
		OpenUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		implicitWait();
	}
	
	
	@Test
	public void LoginFlow() throws InterruptedException {
		LoginBusiness.send_USERNAME_AND_PASSWORD();
		LoginBusiness.click_on_LOGIN();
		Assert.assertEquals(LoginBusiness.GetLoginAssertion(), "Dashboard","Correct");
	}
	
	
	@AfterMethod
	private void TearDown() {
		driver.quit();
	}

}
