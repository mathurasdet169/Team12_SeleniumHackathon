package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
	
	@FindBy(xpath="//*[@id=\"mat-menu-panel-7\"]")
	private WebElement addNewBatch_tab;
	
public boolean check_loginPage()
{
	
	return false;
	
}

public void enterUsername(String username) {
	UserName.sendKeys(username);
}

public void enterpassword(String pwd) {
	password.sendKeys(pwd);
}

public void Login(String username,String pwd) {
	UserName.sendKeys(username);
	password.sendKeys(pwd);
	login.click();
}
}
