package TestRepo;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import BusinessRepo.DashboardBusiness;
import BusinessRepo.LoginBusiness;
import GenericLibrary.BaseClass;

public class DashboardTestCases extends BaseClass {
	
	
	@BeforeMethod
	public void GearUp()
	{
		LaunchBrowser("Chrome");
		OpenUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		implicitWait();
	}	
	
	
	@Test(enabled = true)
	public void Click_On_RECRUITMENT() {
		LoginBusiness.send_USERNAME_AND_PASSWORD();
		LoginBusiness.click_on_LOGIN();
		DashboardBusiness.Click_On_RECRUITMENT();
	}
	
	@Test(enabled = true)
	public void Click_On_PIM() {
		LoginBusiness.send_USERNAME_AND_PASSWORD();
 		LoginBusiness.click_on_LOGIN();
		DashboardBusiness.Click_On_PIM();
	}
	
	@Test(enabled = true)
	public void Title_Validation() {
		LoginBusiness.send_USERNAME_AND_PASSWORD();
 		LoginBusiness.click_on_LOGIN();
		AssertionMethods();
		assertion.assertEquals(driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText(),"Dashboard","Data Mismatched");
	}
	
	@Test(enabled = false)
	public void URL_Validation() {
		LoginBusiness.send_USERNAME_AND_PASSWORD();
 		LoginBusiness.click_on_LOGIN();
		AssertionMethods();
		assertion.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index","Failed");
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	

}
