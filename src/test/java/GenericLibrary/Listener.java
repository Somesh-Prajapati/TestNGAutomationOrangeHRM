package GenericLibrary;


import java.util.Random;import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


public class Listener implements ITestListener{

	ExtentReports extent = ExtentReporter.GenerateExtentReport();
	ExtentTest test;
	Random random = new Random();
	int randomInRange = random.nextInt(1000);

	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
		System.out.println(result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.getStatus();
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.addScreenCaptureFromBase64String("C:\\Users\\HP\\eclipse-workspace\\OrangeHRM\\InbuiltScreenShot\\"+result.getMethod().getMethodName()+".jpg");
		BaseClass.GetScreenShot(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		WebDriverWait s = new WebDriverWait(null, null);		
	}
	

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
