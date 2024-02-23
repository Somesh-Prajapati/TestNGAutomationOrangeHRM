package PageObjectRepo;

import java.awt.AWTException;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import GenericLibrary.BaseClass;

public class Nav_Recruitment extends BaseClass {
	
	Actions action = BaseClass.ActionsObj();
	
	@FindBy (xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement ADD;
	
	@FindBy (xpath = "//input[@name='firstName']")
	private WebElement FIRSTNAME;
	
	@FindBy (xpath = "//input[@name='middleName']")
	private WebElement MIDDLENAME;
	
	@FindBy (xpath = "//input[@name='lastName']")
	private WebElement LASTNAME;
	
	@FindBy (xpath = "//div[@class='oxd-select-text-input']")
	private WebElement VACANCY;
	
	@FindBy (xpath = "//label[text()='Email']/following::div/input[1]")
	private WebElement EMAIL;
	
	@FindBy (xpath = "//label[text()='Contact Number']/following::div/input[1]")
	private WebElement CONTACTNUMBER;
	
	@FindBy (xpath = "//input[@type='file']")
	private WebElement FILEUPLOAD;
	
	@FindBy (xpath = "//input[@placeholder='Enter comma seperated words...']")
	private WebElement KEYWORDS;
	
	@FindBy (xpath = "//input[@placeholder='yyyy-mm-dd']")
	private WebElement DATEOFAPPLICATION;
	
	@FindBy (xpath = "//textarea[@placeholder='Type here']")
	private WebElement NOTES;
	
	@FindBy (xpath = "//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input']")
	private WebElement CHECKBOX;
	
	@FindBy (xpath = "//button[text()=' Save ']")
	private WebElement SAVE;
	
	@FindBy (xpath = "//span[@data-v-13cf171c]")
	private List<WebElement> VACANYLIST;
	
	@FindBy (xpath = "//button[text()=' Shortlist ']")
	private WebElement SHORTLIST;
	
	@FindBy (xpath = "//button[text()=' Reject ']")
	private WebElement REJECT;
	
	@FindBy (xpath = "//label[text()='Edit']/span")
	private WebElement EDIT;
	
	
	@FindBy (xpath = "//button[text()=' Yes, Confirm ']")
	private WebElement EDITPOPUPACCEPT;
	
	@FindBy (xpath = "//button[text()=' No, Cancel ']")
	private WebElement EDITPOPUPREJECT;
	

	@FindBy (xpath = "//button[text()=' Schedule Interview ']")
	private WebElement SCHEDULEINTERVIEW;
	
	@FindBy (xpath = "//div[label[text()='Interview Title']]/following::div/input[@data-v-1f99f73c]")
	private WebElement INTERVIEWTITLE;
	
	@FindBy (xpath = "//input[@include-employees='onlyCurrent']")
	private WebElement INTERVIEWER;
	
	@FindBy (xpath = "//input[@placeholder='yyyy-mm-dd']")
	private WebElement INTERVIEWDATE;
	
	@FindBy (xpath = "//input[@placeholder='hh:mm']")
	private WebElement INTERVIEWHOUR;
	
	@FindBy (xpath = "//button[text()=' Add Another ']")
	private WebElement ADDHINTS;
	
	@FindBy (xpath = "//textarea[@placeholder='Type here']")
	private WebElement INTERVIEWNOTES;
	
	@FindBy (xpath = "//span[@data-v-1ccb3a64]")
	private List<WebElement> INTERVIEWERLIST;
	
	//LastSectionHiring/OfferLetter
	
	@FindBy (xpath = "//button[text()=' Mark Interview Passed ']")
	private WebElement INTERVIEWPASSED;
	
	@FindBy (xpath = "//button[text()=' Mark Interview Failed ']")
	private WebElement INTERVIEWFAILED;
	
	@FindBy (xpath = "//button[text()=' Reject ']")
	private WebElement REJECTCANDIDATE;
	
	@FindBy (xpath = "//button[text()=' Offer Job ']")
	private WebElement OFFERJOB;
	
	@FindBy (xpath = "//button[text()=' Hire ']")
	private WebElement HIRE;
	
	@FindBy (xpath = "//button[text()=' Offer Declined ']")
	private WebElement OFFERDECLINED;
	
	@FindBy (xpath = "//button[text()=' Reject ']")
	private WebElement REJECTOFFER;
	
	//Recruitment Page
	
	public void add_NEWRECRUIT() {
		ADD.click();
	}
	
	//Add Recruit Page
	
	public void send_FIRSTNAME(String string) {
		FIRSTNAME.sendKeys(string);
	}
	
	public void send_MIDDLENAME(String string) {
		MIDDLENAME.sendKeys(string);
	}
	
	public void send_LASTNAME(String string) {
		LASTNAME.sendKeys(string);
	}
	
	public void fill_VACANCY(String string) {
		action.scrollToElement(VACANCY);
		VACANCY.click();
		BaseClass.HANDLE_DROPDOWN(VACANYLIST, string);
	}
	
	public void send_EMAIL(String string) {
		EMAIL.sendKeys(string);
	}
	
	public void send_CONTACTNUMBER(String string) {
		CONTACTNUMBER.sendKeys(string);
	}
	
	public void send_KEYWORDS(String string) {
		KEYWORDS.sendKeys(string);
	}
	
	public void fill_FILEUPLOAD(String string) throws AWTException {
		FILEUPLOAD.sendKeys(string);
	}
	
	public void fill_DATEOFAPPLICATION(String string) {
		action.doubleClick(DATEOFAPPLICATION).click().sendKeys(Keys.BACK_SPACE).perform();
		DATEOFAPPLICATION.sendKeys(string);
	}
	
	public void send_NOTES(String string) {
		NOTES.sendKeys(string);
	}
	
	public void tick_CHECKBOX() {
		CHECKBOX.click();
	}
	
	//After Saving Option
	
	public void click_EDIT() {
		EDIT.click();
	}
	
	public void click_SHORTLIST() {
		BaseClass.JavaScriptExecutorScroll("-500");
		SHORTLIST.click();
	}
	
	public void click_REJECT() {
		REJECT.click();
	}
	
	//Edit Section Options
	
	public void click_EDITPOPUPACCEPT() {
		if (EDITPOPUPACCEPT.isDisplayed()) {
			EDITPOPUPACCEPT.click();
		}
	}
	
	public void click_EDITPOPUPREJECT() {
		EDITPOPUPREJECT.click();
	}
	
	public void click_SAVE() {
		SAVE.click();
	}
	
	//Interview Section Options
	
	public void click_SCHEDULEINTERVIEW() {
		SCHEDULEINTERVIEW.click();
	}
	
	public void fill_INTERVIEWTITLE(String string) {
		INTERVIEWTITLE.sendKeys(string);
	}
	
	public void fill_INTERVIEWER(String string) throws AWTException {
		INTERVIEWER.sendKeys(string);
		ElementPresence("//span[@data-v-1ccb3a64]");
		HANDLE_DROPDOWN(INTERVIEWERLIST, string);
	}

	public void fill_INTERVIEWDATE(String string) {
		INTERVIEWDATE.sendKeys(string);
	}
	
	public void fill_INTERVIWERTIME(String string) {
		INTERVIEWHOUR.sendKeys(string);
	}

	public void fill_ADDHINTS(String string) {
		ADDHINTS.sendKeys(string);
	}
	
	public void fill_INTERVIEWNOTES(String string) {
		INTERVIEWNOTES.sendKeys(string);
	}
	
	public void click_INTERVIEWPASSED() {
		INTERVIEWPASSED.click();
	}
	
	public void click_INTERVIEWFAILED() {
		INTERVIEWFAILED.click();
	}
	
	public void click_REJECTCANDIDATE() {
		REJECTCANDIDATE.click();
	}
	
	public void click_OFFERJOB() {
		OFFERJOB.click();
	}
	
	public void click_HIRE() {
		HIRE.click();
	}
	
	public void click_REJECTOFFER() {
		REJECTOFFER.click();
	}
	
	public void click_OFFERDECLINED() {
		OFFERDECLINED.click();
	}
	
}
