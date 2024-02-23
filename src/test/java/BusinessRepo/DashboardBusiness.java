package BusinessRepo;

import org.openqa.selenium.support.PageFactory;

import GenericLibrary.BaseClass;
import PageObjectRepo.Dashboard;

public class DashboardBusiness extends BaseClass {
	
	public static void Click_On_RECRUITMENT() {
		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
		dashboard.Click_On_RECRUITMENT();
	}
	
	public static void Click_On_PIM() {
		Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);
		dashboard.Click_On_PIM();
	}

}
