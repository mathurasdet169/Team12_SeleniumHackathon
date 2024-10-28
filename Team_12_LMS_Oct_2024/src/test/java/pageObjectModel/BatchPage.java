package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.driverFactory;

public class BatchPage extends BasePage{
	
public BatchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

//BatchPage batchpage=new BatchPage(WebDriver driver)
//			{
//		super(driver);
//		}

	String login_page_URL="https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/login";
	String landing_page_URL="https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/";
	String batch_page_URL="https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/batch";
	
	@FindBy(xpath="//*[@id=\'username\']")
	private WebElement UserName;
	
	@FindBy(xpath="//*[@id=\'password\']")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"login\"]")
	private WebElement login;
	
	@FindBy(xpath="//span[normalize-space()='Batch']")
	private WebElement batch_tab;
	
	@FindBy(xpath="//span[normalize-space()='LMS - Learning Management System']")
	private WebElement LMSTitle;
	
	@FindBy(xpath="//div[normalize-space()='Manage Batch']")
	private WebElement manageBatchHeading;
	
	@FindBy(xpath="//button[@class='p-button-danger p-button p-component p-button-icon-only']//span[@class='p-button-icon pi pi-trash']")
	private WebElement deleteicon;
	
	@FindBy(xpath="//span[@class='p-paginator-current ng-star-inserted']")
	private WebElement pagination;
	
	@FindBy(xpath="//button[@role='menuitem']")
	private WebElement addNewBatch_tab;
	
	@FindBy(xpath="//div[@class='p-checkbox-box']")
	private WebElement tableHeaderCheckBox;

	@FindBy(xpath="//div[@class=\"ng-tns-c168-84 p-dialog-content\"]")
	private WebElement batchPopupWindow;
	
	
	public boolean check_loginPage()
{
	
	return false;
	
}

public void Login(String username,String pwd) {
	UserName.sendKeys(username);
	password.sendKeys(pwd);
	login.click();
}

public void click_BatchTab()
{
	batch_tab.click();
}
public boolean check_landingPage()
{
	String currentURL;
	currentURL=driverFactory.getDriver().getCurrentUrl();
	System.out.println(currentURL);
	Boolean actual=landing_page_URL.equals(currentURL);
	return actual;
}

public boolean check_batchPage()
{
	String currentURL;
	currentURL=driverFactory.getDriver().getCurrentUrl();
	System.out.println(currentURL);
	Boolean actual=batch_page_URL.equals(currentURL);
	return actual;
}

public boolean isVisible_LMSTitle()
{
	boolean LMS_title=LMSTitle.isDisplayed();
	return LMS_title;
}
public boolean isVisible_manageBatchHeading()
{
	boolean Heading=manageBatchHeading.isDisplayed();
	return Heading;
}
public boolean isVisible_deleteIcon()
{
	boolean delete_Icon=deleteicon.isDisplayed();
	return delete_Icon;
}
public boolean isVisible_pagination()
{
	boolean pagination_bool=pagination.isDisplayed();
	return pagination_bool;
}
public boolean check_editIcon()
{
	List<WebElement> rowsNumber = driver.findElements(By.xpath("//tr//span[@class='p-button-icon pi pi-pencil']"));
			int rowCount = rowsNumber.size();
			System.out.println("No of editIcons in this table : " + rowCount);
			boolean actual=(rowCount==5);
			return actual;
}
public boolean check_deleteIcon()
{
	List<WebElement> rowsNumber = driver.findElements(By.xpath("//tr//span[@class='p-button-icon pi pi-trash']"));
			int rowCount = rowsNumber.size();
			System.out.println("No of deleteIcons in this table : " + rowCount);
			boolean actual=(rowCount==5);
			return actual;
}
public boolean check_checkboxIcon()
{
	List<WebElement> rowsNumber = driver.findElements(By.xpath("//tr//div[@class='p-checkbox-box p-component']"));
			int rowCount = rowsNumber.size();
			System.out.println("No of checkboxes in this table : " + rowCount);
			boolean actual=(rowCount==5);
			return actual;
}
public void check_tableheaders()
{
	WebElement Header = driver.findElement(By.xpath("//table/thead"));

			List<WebElement> header_names = Header.findElements(By.tagName("th"));

			int headers_count = header_names.size();

			//WebUI.verifyEqual(headers_count, ExpectedHeaders, FailureHandling.CONTINUE_ON_FAILURE)

			for (int column = 0; column < headers_count; column++) {
			String headertext = header_names.get(column).getText();
			System.out.println(headertext);
			}
}

public boolean check_checkboxInHeader()
{
	boolean actual=tableHeaderCheckBox.isDisplayed();
	return actual;
	}
public boolean check_sortIconsInTableHeader()
{
	//
	List<WebElement> rowsNumber = driver.findElements(By.xpath("//th[@role='columnheader']/p-sorticon"));
	int rowCount = rowsNumber.size();
	System.out.println("No of sortIcons in this tableHeader : " + rowCount);
	boolean actual=(rowCount==5);
	return actual;
	
}
public boolean check_addNewBatch()
{
	boolean actual=addNewBatch_tab.isDisplayed();
	return actual;
}
public void click_addNewBatch()
{
	addNewBatch_tab.click();
}
public boolean check_batchPopupWindow()
{
	boolean actual=batchPopupWindow.isDisplayed();
	return actual;
}

}
