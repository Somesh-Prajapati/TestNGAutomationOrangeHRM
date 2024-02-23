package PageObjectRepo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import GenericLibrary.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy (xpath = "//div[@class='orangehrm-login-error']//p[1]")
	private WebElement ADMIN;
	
	@FindBy (xpath = "//div[@class='orangehrm-login-error']//p[2]")
	private WebElement PASSSWORD;
	
	@FindBy (xpath = "//input[@placeholder='Username']")
	private WebElement SETUSERNAME;
	
	@FindBy (xpath = "//input[@placeholder='Password']")
	private WebElement SETPASSWORD;
	
	@FindBy (xpath = "//button[text()=' Login ']")
	private WebElement LOGIN;
	
	@FindBy (xpath = "//h6[text()='Dashboard']")
	private WebElement ValiadteLogin;
	
	
	public void send_USERNAME_PASSWORD() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='orangehrm-login-error']//p[1]")));
		String s1 = ADMIN.getText();
		String s2 = PASSSWORD.getText();
		String[] str1 = s1.split(":");
		String[] str2 = s2.split(":");
		SETUSERNAME.sendKeys(str1[1].trim());
		SETPASSWORD.sendKeys(str2[1].trim());
	}
	
	public String GetLoginAssertion() {
		return ValiadteLogin.getText();
	}
	
	public void click_on_LOGIN() {
		LOGIN.click();
	}
	
}
