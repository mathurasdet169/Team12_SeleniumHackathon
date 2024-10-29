package pageObjectModel;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.driverFactory;

public class ClassPage extends BasePage {
	
	public ClassPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private WebDriver driver = driverFactory.getDriver();
	
	String login_page_URL="https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/login";
	String landing_page_URL="https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/";
	String class_page_URL="https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/session";
	String batch_page_URL="https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/batch";
	String program_page_URL="https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/program";
	
	@FindBy(xpath="//*[@id=\'username\']")
	private WebElement UserName;
	@FindBy(xpath="//*[@id=\'password\']")
	private WebElement password;
	@FindBy(xpath="//*[@id=\"login\"]")
	private WebElement login;
	
	@FindBy(xpath="//span[normalize-space()='Class']")
	private WebElement class_tab;
	@FindBy(xpath="//span[normalize-space()='Program']")
	private WebElement program_tab;
	@FindBy(xpath="//span[normalize-space()='Batch']")
	private WebElement batch_tab;
	@FindBy(xpath="//span[normalize-space()='Class']")
	private WebElement logout_tab;
	
	@FindBy(xpath="//span[normalize-space()='LMS - Learning Management System']")
	private WebElement LMSTitle;
	
	@FindBy(xpath="//div[normalize-space()='Manage Class']")
	private WebElement manageClassHeading;
	
	
	@FindBy(xpath="//input[@id='filterGlobal']")
	private WebElement classSearchBar;

	@FindBy(xpath="//th[normalize-space()='Batch Name']")
	private WebElement classtable_batchname_title;

	@FindBy(xpath="//th[normalize-space()='Class Topic']")
	private WebElement classtable_classtopic_title;
	
	@FindBy(xpath="//th[normalize-space()='Class Description']")
	private WebElement classtable_classdescri_title;
	
	@FindBy(xpath="//th[normalize-space()='Status']")
	private WebElement classtable_status_title;
	
	@FindBy(xpath="//th[normalize-space()='Class Date']")
	private WebElement classtable_classdate_title;
	
	@FindBy(xpath="//th[normalize-space()='Staff Name']")
	private WebElement classtable_staffname_title;
	
	@FindBy(xpath="//th[normalize-space()='Edit / Delete']")
	private WebElement classtable_editdel_title;
	
	
	@FindBy(xpath="//p-sorticon[@field='batchName']")
	private WebElement classtable_batchname_sort;
	
	@FindBy(xpath="//p-sorticon[@field='classTopic']")
	private WebElement classtable_classtopic_sort;
	
	@FindBy(xpath="//p-sorticon[@field='classDescription']")
	private WebElement classtable_classdescri_sort;
	
	@FindBy(xpath="//p-sorticon[@field='classStatus']")
	private WebElement classtable_status_sort;
	
	@FindBy(xpath="//p-sorticon[@field='classDate']")
	private WebElement classtable_date_sort;
	
	@FindBy(xpath="//p-sorticon[@field='classStaffName']")
	private WebElement classtable_staffname_sort;
	
	@FindBy(xpath="//div[contains(text(), \"In total there are\")]")
	private WebElement bottomText;

	@FindBy(xpath="//button[@class='p-paginator-last p-paginator-element p-link p-ripple ng-star-inserted']")
	private WebElement page_last;
	
	//addnewclass	
	@FindBy(xpath="//button[normalize-space()='Add New Class']")
	private WebElement addnewclass_button;
	public void click_AddNewClassButton() {
		addnewclass_button.click();
	}
	@FindBy(xpath="//input[@placeholder='Select a Batch Name']")
	private WebElement addnewclasspopup_batchname;

	@FindBy(xpath="//div[@role='dialog']")
	private WebElement addnewclassPopupDiv;
	
	public boolean isvisible_addnewclasspopup() {
		return addnewclassPopupDiv.isDisplayed();
	}

	@FindBy(xpath="//*[@id='programName']/div/div[2]")
	private WebElement popUpDropDown;


	@FindBy(xpath="//button[@class='p-button-rounded p-button-success p-button p-component ng-star-inserted']")
	private WebElement saveBtn;

	@FindBy(xpath="(//button[@icon=\"pi pi-pencil\"])[1]")
	private WebElement editIconBtn;

	@FindBy(xpath="//*[@id='text-danger']")
	private WebElement errorMsg;
	
	@FindBy(xpath="//button[@ng-reflect-label='Cancel']")
	private WebElement popUpCancelBtn;
	
	@FindBy(xpath="//div[@class='p-dialog-header ng-tns-c168-17 ng-star-inserted']/div/button]")
	private WebElement popUpCloseIcon;
	
	public void switchtoPopUp() {
	String mainWindowHandle = driver.getWindowHandle();

	for (String windowHandle : driver.getWindowHandles()) {
	    if (!windowHandle.equals(mainWindowHandle)) {
	        driver.switchTo().window(windowHandle); 
	        break;
	    }
	}
	}
	public void click_popupCloseIcon() {
		popUpCloseIcon.click();
	}
	
	//pagination
	@FindBy(xpath="//span[@class='p-paginator-current ng-star-inserted']")
	private WebElement classtable_paginator_title;	
	@FindBy(xpath="//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']/button[1]")
	private WebElement classtable_firstlink;	
	@FindBy(xpath="//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']/button[2]")
	private WebElement classtable_prevlink;	
	@FindBy(xpath="//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']/button[4]")
	private WebElement classtable_lastlink;	
	@FindBy(xpath="//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']/button[3]")
	private WebElement classtable_nextlink;
	@FindBy(xpath="//span[@class='p-paginator-pages ng-star-inserted']/button")
	private List<WebElement> pageButtons;
	
	//delete
	@FindBy(xpath="//mat-card-title[@class='mat-card-title']/div[2]/div/button")
	private WebElement multiDelButton;
	@FindBy(xpath="//tbody/tr[1]/td[8]/div[1]/span[1]/button[2]")
	private WebElement rowDelButton;	
	@FindBy(xpath="//button[@class='ng-tns-c204-8 p-dialog-header-icon p-dialog-header-close p-link ng-star-inserted']")
	private WebElement delPopup_close;
	@FindBy(xpath="//div[@class='p-dialog-footer ng-tns-c204-8 ng-star-inserted']/button[1]")
	private WebElement delPopup_no;
	@FindBy(xpath="//div[@class='p-dialog-footer ng-tns-c204-8 ng-star-inserted']/button[2]")
	private WebElement delPopup_yes;
	

	//table
	@FindBy(xpath="//th")
	private List<WebElement> column_number;
	@FindBy(xpath="//tr")
	private List<WebElement> row_number;
	@FindBy(xpath="//td[2]")
	private List<WebElement> batchname_column;
	@FindBy(xpath="//td[3]")
	private List<WebElement> classtopic_column;
	@FindBy(xpath="//td[4]")
	private List<WebElement> classdescri_column;
	@FindBy(xpath="//td[5]")
	private List<WebElement> status_column;
	@FindBy(xpath="//td[6]")
	private List<WebElement> classdate_column;
	@FindBy(xpath="//td[7]")
	private List<WebElement> staffname_column;
	
	
	
	
	
public void Login(String username,String pwd) {
	UserName.sendKeys(username);
	password.sendKeys(pwd);
	login.click();
}

public void click_classTab(){
	class_tab.click();
}
public void click_programTab() {
	program_tab.click();
}
public void click_batchTab() {
	batch_tab.click();
}
public void click_logoutTab() {
	batch_tab.click();
}


public boolean check_loginPage(){
	String currentURL;
	currentURL=driverFactory.getDriver().getCurrentUrl();
	System.out.println("you are in "+currentURL);
	return login_page_URL.equals(currentURL);	
}
public boolean check_landingPage(){
	String currentURL;
	currentURL=driverFactory.getDriver().getCurrentUrl();
	System.out.println("you are in "+currentURL);
	return landing_page_URL.equals(currentURL);
}
public boolean check_ClassPage(){
	String currentURL;
	currentURL=driverFactory.getDriver().getCurrentUrl();
	System.out.println("you are in "+currentURL);
	return class_page_URL.equals(currentURL);
}
public boolean check_batchPage(){
	String currentURL;
	currentURL=driverFactory.getDriver().getCurrentUrl();
	System.out.println(currentURL);
	return batch_page_URL.equals(currentURL);
}
public boolean check_programPage(){
	String currentURL;
	currentURL=driverFactory.getDriver().getCurrentUrl();
	System.out.println(currentURL);
	return program_page_URL.equals(currentURL);
}

public String check_manageClassTitle(){
	return manageClassHeading.getText();
	}

public boolean isVisible_LMSTitle(){
	return LMSTitle.isDisplayed();	
}
public boolean isVisible_classSearchBar() {
	return classSearchBar.isDisplayed();
}
public boolean isVisible_classBatchName() {
	return classtable_batchname_title.isDisplayed();
}
public boolean isVisible_classTopic() {
	return classtable_classtopic_title.isDisplayed();
}
public boolean isVisible_classDescri() {
	return classtable_classdescri_title.isDisplayed();
}
public boolean isVisible_classStatus() {
	return classtable_status_title.isDisplayed();
}
public boolean isVisible_classDate() {
	return classtable_classdate_title.isDisplayed();
}
public boolean isVisible_classStaffname() {
	return classtable_staffname_title.isDisplayed();
}
public boolean isVisible_classEditDel() {
	return classtable_editdel_title.isDisplayed();
}
public boolean isVisible_classPaginatorTitle() {
	return classtable_paginator_title.isDisplayed();
}
public boolean isVisible_classFirstLink() {
	return classtable_firstlink.isDisplayed();
}
public boolean isVisible_classPrevLink() {
	return classtable_prevlink.isDisplayed();
}
public boolean isVisible_classNextLink() {
	return classtable_nextlink.isDisplayed();
}
public boolean isVisible_classLastLink() {
	return classtable_lastlink.isDisplayed();
}

public boolean isVisible_batchnameSort() {
	return classtable_batchname_sort.isDisplayed();
}
public boolean isVisible_classtopicSort() {
	return classtable_classtopic_sort.isDisplayed();
}
public boolean isVisible_classdescriSort() {
	return classtable_classdescri_sort.isDisplayed();
}
public boolean isVisible_classStatusSort() {
	return classtable_status_sort.isDisplayed();
}
public boolean isVisible_classDateSort() {
	return classtable_date_sort.isDisplayed();
}
public boolean isVisible_classStaffnameSort() {
	return classtable_staffname_sort.isDisplayed();
}
public boolean isVisible_multiDelButton() {
	return multiDelButton.isDisplayed();
}
public boolean isVisible_bottomText() {
	return bottomText.isDisplayed();
}

//pagination
//total no:of rows is the same as classes
//no:of pages will be pages list size

	public int calc_totalclasses() {
	String bt=bottomText.getText();
	int totalClasses=Integer.parseInt(bt.substring(bt.indexOf("are")+1,bt.indexOf("classes")-1));
	System.out.println("Total Classes: "+totalClasses);
	return totalClasses;
	}
	
	public int calc_totalPages() {
		return pageButtons.size();
	}
	
	public boolean isEnabled_firstLink() {
		return classtable_firstlink.isEnabled();
	}
	public boolean isEnabled_prevLink() {
		return classtable_prevlink.isEnabled();
	}
	public boolean isEnabled_nextLink() {
		return classtable_nextlink.isEnabled();
	}
	public boolean isEnabled_lastLink() {
		return classtable_nextlink.isEnabled();
	}

	public void click_firstlink() {
		classtable_firstlink.click();
	}
	public void click_prevlink() {
		classtable_prevlink.click();
	}
	public void click_nextlink() {
		classtable_nextlink.click();
	}
	public void click_lastlink() {
		classtable_lastlink.click();
	}

	public void lastlinkclick() {
		page_last.click();
	}

	//deletion
	public void click_rowdelButton() {
		rowDelButton.click();
	}
	public void click_multidelButton() {
		multiDelButton.click();
	}
	public void click_delpopoupClose() {
		delPopup_close.click();
	}
	public void click_delpopoupNo() {
		delPopup_no.click();
	}
	public void click_delpopoupYes() {
		delPopup_yes.click();
	}
	
	//table column value list
	public List<String> batchname_list(){		
		//finding no:of pages
		int totalPages=calc_totalPages();
		List<String> final_batchname_list=new ArrayList<String>();
		//Clicking through each page button
		for(int i=0;i<=totalPages;i++) {
			driver.findElement(By.xpath("//span[@class='p-paginator-pages ng-star-inserted']/button["+i+"]")).click();
			//adding batch column values to a list
			for(WebElement we:batchname_column) {
				String column_value=we.getText();
				final_batchname_list.add(column_value);	
			}
		}
		System.out.println("final List of batchnames"+final_batchname_list);
		return final_batchname_list;
	}
}



//public boolean isVisible_manageBatchHeading()
//{
//	boolean Heading=manageBatchHeading.isDisplayed();
//	return Heading;
//}
//public boolean isVisible_deleteIcon()
//{
//	boolean delete_Icon=deleteicon.isDisplayed();
//	return delete_Icon;
//}
//public boolean isVisible_pagination()
//{
//	boolean pagination_bool=pagination.isDisplayed();
//	return pagination_bool;
//}
//public boolean check_editIcon()
//{
//	List<WebElement> rowsNumber = driver.findElements(By.xpath("//tr//span[@class='p-button-icon pi pi-pencil']"));
//			int rowCount = rowsNumber.size();
//			System.out.println("No of editIcons in this table : " + rowCount);
//			boolean actual=(rowCount==5);
//			return actual;
//}
//public boolean check_deleteIcon()
//{
//	List<WebElement> rowsNumber = driver.findElements(By.xpath("//tr//span[@class='p-button-icon pi pi-trash']"));
//			int rowCount = rowsNumber.size();
//			System.out.println("No of deleteIcons in this table : " + rowCount);
//			boolean actual=(rowCount==5);
//			return actual;
//}
//public boolean check_checkboxIcon()
//{
//	List<WebElement> rowsNumber = driver.findElements(By.xpath("//tr//div[@class='p-checkbox-box p-component']"));
//			int rowCount = rowsNumber.size();
//			System.out.println("No of checkboxes in this table : " + rowCount);
//			boolean actual=(rowCount==5);
//			return actual;
//}
//public void check_tableheaders()
//{
//	WebElement Header = driver.findElement(By.xpath("//table/thead"));
//
//			List<WebElement> header_names = Header.findElements(By.tagName("th"));
//
//			int headers_count = header_names.size();
//
//			//WebUI.verifyEqual(headers_count, ExpectedHeaders, FailureHandling.CONTINUE_ON_FAILURE)
//
//			for (int column = 0; column < headers_count; column++) {
//			String headertext = header_names.get(column).getText();
//			System.out.println(headertext);
//			}
//}
//
//public boolean check_checkboxInHeader()
//{
//	boolean actual=tableHeaderCheckBox.isDisplayed();
//	return actual;
//	}
//public boolean check_sortIconsInTableHeader()
//{
//	//
//	List<WebElement> rowsNumber = driver.findElements(By.xpath("//th[@role='columnheader']/p-sorticon"));
//	int rowCount = rowsNumber.size();
//	System.out.println("No of sortIcons in this tableHeader : " + rowCount);
//	boolean actual=(rowCount==5);
//	return actual;
//	
//}
//public boolean check_addNewBatch()
//{
//	boolean actual=addNewBatch_tab.isDisplayed();
//	return actual;
//}
//public void click_addNewBatch()
//{
//	addNewBatch_tab.click();
//}
//public boolean check_batchPopupWindow()
//{
//	boolean actual=batchPopupWindow.isDisplayed();
//	return actual;
//}
//}
