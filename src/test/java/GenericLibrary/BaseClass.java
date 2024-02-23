package GenericLibrary;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Random;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;


public class BaseClass {
	
	protected static WebDriver driver;
	protected static Select select;
	protected static WebDriverWait wait;
	protected static Actions action;
	protected static Robot robot;
	protected static Assertion assertion;

	public static void LaunchBrowser(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	}
	
	public static void SelectByVisibleText(WebElement element, String string) {
		select = new Select(element);
		select.selectByVisibleText(string);
	}
	
	public static void OpenUrl(String url) {
		driver.get(url);
	}
	
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	
	public static void QuitBrowser() {
		driver.quit();
	}
	
	public static Actions ActionsObj() {
		action = new Actions(driver);
		return action;
	}
	
	public static Robot RobotObj() throws AWTException {
		robot = new Robot();
		return robot;
	}
	
	public static void ElementClickable(WebElement webelement) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(webelement));
	}
	
	public static void ElementsClickable(List<WebElement> list) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		for (int i = 0; i < list.size(); i++) {
			wait.until(ExpectedConditions.elementToBeClickable(list.get(i)));
		}
	}
	
	public static void ElementPresence(String Xpath) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
	}
	
	public static void SuccessAlertValidation() {
		ElementPresence("//div[@class='oxd-toast-start']//p");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='oxd-toast-start']//p")).getText(),"Success","This Is Correct");
	}
	
	public static void GetScreenShot(String testname) {
		Random random = new Random();
		int randomInRange = random.nextInt(1000);
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		File source =  screenshot.getScreenshotAs(OutputType.FILE);
		String destination = "C:\\Users\\HP\\eclipse-workspace\\OrangeHRM\\FailedShot\\"+testname+"_"+randomInRange+".jpg";
		File destinationFile = new File(destination);
		try {
			FileUtils.copyFile(source, destinationFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	public static void SwitchToIframe(WebElement webelement) {
		driver.switchTo().frame(webelement);
	}

	public static void HANDLE_DROPDOWN(List<WebElement> VACANYLIST, String string) {
		List<WebElement> List =  VACANYLIST;
		for (int i = 0; i < List.size(); i++) {
			List =  VACANYLIST;
			if (List.get(i).getText().equalsIgnoreCase(string)) {
				List.get(i).click();
				break;
			}
		}
	}
	
	public static void AssertionMethods() {
		assertion = new Assertion();
	}

	public static void JavaScriptExecutorScroll(String string) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+string+");");
	}
	

}
