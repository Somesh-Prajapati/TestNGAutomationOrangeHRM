package BusinessRepo;

import java.awt.AWTException;

import org.openqa.selenium.support.PageFactory;

import GenericLibrary.BaseClass;
import PageObjectRepo.Nav_Recruitment;

public class Nav_Recuritment_Business extends BaseClass {

	public static void add_NEWRECRUIT() {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.add_NEWRECRUIT();
	}

	public static void send_FIRSTNAME(String string) {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.send_FIRSTNAME(string);
	}

	public static void send_MIDDLENAME(String string) {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.send_MIDDLENAME(string);
	}

	public static void send_LASTNAME(String string) {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.send_LASTNAME(string);
	}

	public static void fill_VACANCY(String string) {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.fill_VACANCY(string);
	}

	public static void send_EMAIL(String string) {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.send_EMAIL(string);
	}

	public static void send_CONTACTNUMBER(String string) {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.send_CONTACTNUMBER(string);
	}

	public static void send_KEYWORDS(String string) {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.send_KEYWORDS(string);
	}

	public static void fill_DATEOFAPPLICATION(String string) {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.fill_DATEOFAPPLICATION(string);
	}

	public static void send_NOTES(String string) {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.send_NOTES(string);
	}

	public static void tick_CHECKBOX() {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.tick_CHECKBOX();
	}

	public static void fill_FILEUPLOAD(String string) throws AWTException {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.fill_FILEUPLOAD(string);
	}

	public static void click_SAVE() {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.click_SAVE();
	}

	public static void click_EDIT() {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.click_EDIT();
	}

	public static void click_SHORTLIST() {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.click_SHORTLIST();
	}

	public static void click_REJECT() {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.click_REJECT();
	}

	public static void click_EDITPOPUPACCEPT() {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.click_EDITPOPUPACCEPT();
	}

	public static void click_EDITPOPUPREJECT() {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.click_EDITPOPUPREJECT();
	}

	public static void click_SCHEDULEINTERVIEW() {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.click_SCHEDULEINTERVIEW();

	}

	public static void fill_INTERVIEWTITLE(String string) {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.fill_INTERVIEWTITLE(string);
	}

	public static void fill_INTERVIEWER(String string) throws AWTException {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.fill_INTERVIEWER(string);
	}

	public static void fill_INTERVIEWDATE(String string) {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.fill_INTERVIEWDATE(string);
	}

	public static void fill_INTERVIWERTIME(String string) {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.fill_INTERVIWERTIME(string);
	}

	public static void fill_ADDHINTS(String string) {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.fill_ADDHINTS(string);
	}

	public static void fill_INTERVIEWNOTES(String string) {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.fill_INTERVIEWNOTES(string);
	}
	
	public static void click_INTERVIEWPASSED() {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.click_INTERVIEWPASSED();
	}
	
	public static void click_INTERVIEWFAILED() {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.click_INTERVIEWFAILED();
	}
	
	public static void click_REJECTCANDIDATE() {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.click_REJECTCANDIDATE();
	}
	
	public static void click_OFFERJOB() {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.click_OFFERJOB();
	}
	
	public static void click_HIRE() {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.click_HIRE();
	}
	
	public static void click_REJECTOFFER() {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.click_REJECTOFFER();
	}
	
	public static void click_OFFERDECLINED() {
		Nav_Recruitment nav_recruit = PageFactory.initElements(driver, Nav_Recruitment.class);
		nav_recruit.click_OFFERDECLINED();
	}
	
	
}
