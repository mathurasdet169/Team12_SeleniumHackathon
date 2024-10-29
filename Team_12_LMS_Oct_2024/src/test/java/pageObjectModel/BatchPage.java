package pageObjectModel;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.driverFactory;
import io.cucumber.messages.types.Duration;

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
	String batch_name="TeamTwelveSelenium";
	String batch_name1="JENKINS";
	String value_for_prefixbox="NewBatch";
	
	String login_page_URL="https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/login";
	String landing_page_URL="https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/";
	String batch_page_URL="https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/batch";

	@FindBy(xpath="//*[@id=\'username\']")
	private WebElement UserName;

	@FindBy(xpath="//*[@id=\'password\']")
	private WebElement password;

	@FindBy(xpath="//*[@id=\"login\"]")
	private WebElement login;

	/*---------------BatchPageObjects----------------*/
	
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

	/*-------------------AddNewBatchPopUp-----------------------*/
	
	@FindBy(css="label[for='programName']")
	private WebElement batchPopupWindow;

	@FindBy(xpath="//div[@role='dialog']")
	private WebElement batchPopupDiv;

	@FindBy(xpath="//*[@id='programName']/div/div[2]")
	private WebElement popUpDropDown;

	@FindBy(xpath="//*[@id='batchProg']")
	private WebElement batchNamePrefixBox;
	
	@FindBy(xpath="//*[@id='batchName']")
	private WebElement batchNameInEdit;

	@FindBy(xpath="//span[normalize-space()='TeamTwelveJava']")
	private WebElement DropDownElement;

	@FindBy(css="body > app-root:nth-child(1) > app-batch:nth-child(3) > p-dialog:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > input:nth-child(3)")
	private WebElement popupBatchCode;

	@FindBy(xpath="//input[@id='batchDescription']")
	private WebElement BatchDescription;

	@FindBy(xpath="//p-radiobutton[@ng-reflect-input-id='ACTIVE']")
	private WebElement activeRadioBtn;
	
	
	@FindBy(xpath="//input[@id='batchNoOfClasses']")
	private WebElement No_Of_Classes;

	@FindBy(xpath="//button[@class='p-button-rounded p-button-success p-button p-component ng-star-inserted']")
	private WebElement saveBtn;

	@FindBy(xpath="(//button[@icon=\"pi pi-pencil\"])[1]")
	private WebElement editIconBtn;

	@FindBy(xpath="//*[@id='text-danger']")
	private WebElement errorMsg;
	
	@FindBy(xpath="//button[@ng-reflect-label='Cancel']")
	private WebElement popUpCancelBtn;
	
	@FindBy(xpath="//span[@class='p-dialog-header-close-icon ng-tns-c168-6 pi pi-times']")
	private WebElement popUpCloseIcon;
	
	/*------------------------------EditFeature--------------------------------------------*/
	
	@FindBy(xpath="//div[@class='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing']")
	private WebElement overlayContainer;
	
	@FindBy(xpath="//div[@class='p-toast-detail ng-tns-c91-30']")
	private WebElement editSuccessMessage;
	
	/*------------------------------Delete Feature-------------------------------------------*/
	
	@FindBy(xpath="(//span[@class='p-button-icon pi pi-trash'])[1]")
	private WebElement BatchDeleteButton;
	
	
	@FindBy(xpath="(//div[@class='ng-trigger ng-trigger-animation ng-tns-c204-17 p-dialog p-confirm-dialog p-component ng-star-inserted']")
	private WebElement DeleteConfirmDialogBox;
	
	@FindBy(xpath="//button[@ng-reflect-ng-class='p-confirm-dialog-reject']")
	private WebElement DeleteRejectButton;

	
	@FindBy(xpath="//button[@class='ng-tns-c204-17 p-dialog-header-icon p-dialog-header-close p-link ng-star-inserted']")
	private WebElement DeleteCofirmDialogCloseButton;
	
	@FindBy(xpath="//div[@class='p-toast-detail ng-tns-c91-22']")
	private WebElement DeleteSuccessMessage;
	
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
	public void click_PopupDropDown()
	{
		boolean bool=popUpDropDown.isDisplayed();
		System.out.println(bool);
		popUpDropDown.click();
	}

	public void check_FieldsInpopUp()
	{
		
		 WebElement parentDiv = driver.findElement(By.xpath("//div[@class=\"ng-tns-c168-6 p-dialog-content\"]")); // Replace with your parent <div> ID

         // Retrieve the child elements
         List<WebElement> childElements = parentDiv.findElements(By.xpath("./*")); // Retrieves all direct child elements

         // Iterate through the list and print out the type (tag name) of each child element
         for (WebElement child : childElements) {
        	 
             String tagName = child.getTagName();
             System.out.println("Child Element Tag: " + tagName);
         }
		
//		WebElement element=driver.findElement(By.xpath("//div[@role='dialog']"));
//		// Find the child element
//		List<WebElement> list = element.findElements(By.xpath("./child::*"));
//		// iterate the list
//		for ( WebElement i : list ) {
//			// Print the child elements
//			System.out.println(i.getText());
//		}
//		List<WebElement> tagname = driver.findElements(By.className("p-field.ng-star-inserted"));


	}
	public void input_prefixbox()
	{
		//batchNamePrefixBox.click();
		batchNamePrefixBox.sendKeys(value_for_prefixbox);
		
	}
	public boolean check_emptyPrefixBox()
	{
		boolean bool;
		String value=batchNamePrefixBox.getAttribute("ng-reflect-model");
		if(value==null)
			bool=true;
		else bool=false;
		return bool;
	}

	public boolean check_batchPrefixBox() throws InterruptedException
	{
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='programName']/div/div[2]"));
		dropdown.click(); // assuming you have to click the "dropdown" to open it	
		WebElement listItem = driver.findElement(By.xpath("//span[normalize-space()='"+batch_name1+"']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", listItem);
		listItem.click();
		//WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		String newPrefix=batchNamePrefixBox.getAttribute("ng-reflect-model");
		System.out.println("txt in prefix box:"+newPrefix);
		boolean bool=(newPrefix.contentEquals(batch_name1));
		return bool;
	}
	public void create_NewBatch()
	{
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='programName']/div/div[2]"));
		dropdown.click(); // assuming you have to click the "dropdown" to open it		
		WebElement listItem = driver.findElement(By.xpath("//span[normalize-space()='"+batch_name1 +"']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", listItem);
		listItem.click();
		popupBatchCode.sendKeys("002");
		BatchDescription.sendKeys("Team12 batch new Description Mathu");
		activeRadioBtn.click();
		No_Of_Classes.sendKeys("10");
		saveBtn.click();
	}

	public void create_NewBatchMissingMandatoryField()
	{
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='programName']/div/div[2]"));
		dropdown.click(); // assuming you have to click the "dropdown" to open it		
		WebElement listItem = driver.findElement(By.xpath("//span[normalize-space()='"+ batch_name1+"']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", listItem);
		listItem.click();
		popupBatchCode.sendKeys("");
		BatchDescription.sendKeys("Team12 batch new Description Mathu");
		activeRadioBtn.click();
		No_Of_Classes.sendKeys("10");
		saveBtn.click();
	}

	public void get_successMessage()
	{
		WebElement alert = driver.findElement(By.xpath("//div[@role='alert']"));
		String alertText = alert.getText();
		System.out.println("Alert Text: " + alertText);

	}
	
	public void get_errorMessage()
	{
		String error_msg=errorMsg.getText();
		System.out.println(error_msg);
	}
	
	public void click_popUPCancelBtn()
	{
		popUpCancelBtn.click();
	}
	
	public boolean check_popUpisClosed()
	{
	boolean bool=!(batchPopupDiv.isDisplayed());
	return bool;
	}
	public void click_editIcon()
	{

		editIconBtn.click();
	}
	
	public void click_popUpCloseIcon()
	{
		popUpCloseIcon.click();
	}
	public void click_overlay()
	{
		overlayContainer.click();
	}
	public boolean check_editIconBtn()
	{
		boolean bool;
		editIconBtn.click();
		if(batchPopupDiv.isDisplayed())
		bool=true;
		else bool=false;
			return bool;
	}
	public boolean check_programNameIsReadOnlyInEditFeature()
	{
		
		WebElement programTextBox=driver.findElement(By.xpath("//p-dropdown[@id='programName']")) ;
		 String isReadOnly = programTextBox.getAttribute("ng-reflect-is-disabled");
         System.out.println("progam name field is disabled:"+isReadOnly);
         boolean bool=isReadOnly.equals("true");
		return bool;
	}
	
	public boolean check_batchNameIsReadOnlyInEditFeature()
	{
		WebElement programTextBox=driver.findElement(By.xpath("//*[@id='batchProg']")) ;
		//boolean isDisabled = programTextBox.getAttribute("disabled") != null;
         String isReadOnly = batchNameInEdit.getAttribute("ng-reflect-is-disabled");
         System.out.println("batch name field is disabled:"+isReadOnly);
         boolean bool=isReadOnly.equals("true");
		return bool;
	}
	
	public void validate_batchDescriptionInEditFeaturewithInvalidData()
	{
	
		BatchDescription.click();
		BatchDescription.clear();
		BatchDescription.sendKeys("1234");
	}
	
	public boolean check_batchDescriptionErrorMsg()
	{
		boolean bool;
		String error_msg=errorMsg.getText();
		String exp_error="This field should start with an alphabet and min 2 character.";
		if(error_msg.equals(exp_error))
			bool=true;
		else bool=false;
		return bool;
		}
	public void input_validEditData()
	{
		BatchDescription.clear();
		BatchDescription.sendKeys("NewBatchDescriptionByMathu");
		driver.findElement(By.xpath("//*[@id='batchStatus']/div/div[2]\r\n")).click();
	}
	public boolean check_EditSuccessMessage()
	{
		boolean bool;
		driver.findElement(By.xpath("//button[@ng-reflect-label='Save']")).click();
		String success_msg=editSuccessMessage.getText();
		System.out.println("Success message from Edit Feature:"+success_msg);
		if(success_msg.equals("batch Updated"))
			bool=true;
		else bool=false;
		return bool;
	}
	
	public void click_EditCancelButton()
	{
		driver.findElement(By.xpath("//button[@ng-reflect-label='Cancel']")).click();
	}
	public boolean check_EditCancelButton()
	{
		boolean bool;
		if(batchPopupDiv.isDisplayed())
			bool=false;
			else bool=true;
				return bool;
	}
	public void click_BatchDeleteButton()
	{
		BatchDeleteButton.click();
	}
	
	public boolean check_batchDeleteButton()
	{
		boolean bool=DeleteConfirmDialogBox.isDisplayed();
		return bool;
	}
	
	public void click_DeleteRejectBtn()
	{
		DeleteRejectButton.click();
	}
	public boolean check_DeleteRejectBtn()
	{
		boolean bool=!(DeleteConfirmDialogBox.isDisplayed());
		return bool;
	}
	public void click_DeleteAcceptBtn()
	{
		DeleteAcceptButton.click();
	}
	public boolean check_DeleteAcceptBtn()
	{
		boolean bool=DeleteSuccessMessage.getText().equals("batch Deleted");
		return bool;
	}
	public void click_DeleteCofirmDialogCloseButton()
	{
		DeleteCofirmDialogCloseButton.click();
	}
	public boolean check_DeleteCofirmDialogCloseButton()
	{
		boolean bool=!(DeleteConfirmDialogBox.isDisplayed());
		return bool;
		}
	
	
	}


