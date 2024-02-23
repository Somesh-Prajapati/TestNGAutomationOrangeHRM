package PageObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibrary.BaseClass;

public class Dashboard extends BaseClass {
	
	@FindBy (xpath ="//a[@href='/web/index.php/recruitment/viewRecruitmentModule']")
	private WebElement RECRUITMENT;
	
	@FindBy (xpath ="//span[text()='PIM']")
	private WebElement PIM;
	
	
	public void Click_On_RECRUITMENT() {
		RECRUITMENT.click();
	}
	
	public void Click_On_PIM() {
		PIM.click();
	}

}
