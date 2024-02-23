package BusinessRepo;

import org.openqa.selenium.support.PageFactory;

import GenericLibrary.BaseClass;
import PageObjectRepo.LoginPage;

public class LoginBusiness extends BaseClass {
	
	public static  void click_on_LOGIN() {
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.click_on_LOGIN();
	}

	public static void send_USERNAME_AND_PASSWORD() {
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.send_USERNAME_PASSWORD();
	}

	public static String GetLoginAssertion() {
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		return login.GetLoginAssertion();
	}

}
