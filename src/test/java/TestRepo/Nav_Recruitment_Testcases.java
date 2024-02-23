package TestRepo;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BusinessRepo.DashboardBusiness;
import BusinessRepo.LoginBusiness;
import BusinessRepo.Nav_Recuritment_Business;
import DataProvider.Nav_Recruit_DataProvider;
import GenericLibrary.BaseClass;

public class Nav_Recruitment_Testcases extends BaseClass {
	
	
	@BeforeMethod
	public void Gearup() {
		LaunchBrowser("Chrome");
		OpenUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		implicitWait();
	}
	
	
	@Test(dataProvider = "nav-recruit-data-provider", dataProviderClass = Nav_Recruit_DataProvider.class)
	public void RecruitmentDetails(String Firstname,String Middlename,String Lastname,String Post, String Email, String ContactNo,String Filepath,String Keywords,String DateOfApplication,String Notes,String ChangedPost,String InterviewTitle,String Interviewer,String InterviewDate,String InterviewTime,String InterviewNotes) throws InterruptedException, AWTException {
		LoginBusiness.send_USERNAME_AND_PASSWORD();
		LoginBusiness.click_on_LOGIN();
		DashboardBusiness.Click_On_RECRUITMENT();
		Nav_Recuritment_Business.add_NEWRECRUIT();
		Nav_Recuritment_Business.send_FIRSTNAME(Firstname);
		Nav_Recuritment_Business.send_MIDDLENAME(Middlename);
		Nav_Recuritment_Business.send_LASTNAME(Lastname);
		Nav_Recuritment_Business.fill_VACANCY(Post);
		Nav_Recuritment_Business.send_EMAIL(Email);
		Nav_Recuritment_Business.send_CONTACTNUMBER(ContactNo);
		Nav_Recuritment_Business.fill_FILEUPLOAD(Filepath);
		Nav_Recuritment_Business.send_KEYWORDS(Keywords);
		Nav_Recuritment_Business.fill_DATEOFAPPLICATION(DateOfApplication);
		Nav_Recuritment_Business.send_NOTES(Notes);
		Nav_Recuritment_Business.tick_CHECKBOX();
		Nav_Recuritment_Business.click_SAVE();
		SuccessAlertValidation();
		Nav_Recuritment_Business.click_EDIT();
		Nav_Recuritment_Business.fill_VACANCY(ChangedPost);
		Nav_Recuritment_Business.click_SAVE();
		Nav_Recuritment_Business.click_EDITPOPUPACCEPT();
		SuccessAlertValidation();
		Nav_Recuritment_Business.click_SHORTLIST();
		Nav_Recuritment_Business.click_SAVE();
		SuccessAlertValidation();
		Nav_Recuritment_Business.click_SCHEDULEINTERVIEW();
		Nav_Recuritment_Business.fill_INTERVIEWTITLE(InterviewTitle);
		Nav_Recuritment_Business.fill_INTERVIEWER(Interviewer);
		Nav_Recuritment_Business.fill_INTERVIEWDATE(InterviewDate);
		Nav_Recuritment_Business.fill_INTERVIWERTIME(InterviewTime);
		Nav_Recuritment_Business.fill_INTERVIEWNOTES(InterviewNotes);
		Nav_Recuritment_Business.click_SAVE();
		SuccessAlertValidation();
		Nav_Recuritment_Business.click_INTERVIEWPASSED();
		Nav_Recuritment_Business.click_SAVE();
		SuccessAlertValidation();
		Nav_Recuritment_Business.click_OFFERJOB();
		Nav_Recuritment_Business.click_SAVE();
		SuccessAlertValidation();
		Nav_Recuritment_Business.click_HIRE();
		Nav_Recuritment_Business.click_SAVE();
		SuccessAlertValidation();
		Assert.assertEquals(driver.findElement(By.xpath("//p[text()='Status: Hired']")).getText(),"Status: Hired","This Is Correct");
	}
	
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}

}