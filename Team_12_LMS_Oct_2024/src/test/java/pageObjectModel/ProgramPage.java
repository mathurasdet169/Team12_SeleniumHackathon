package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProgramPage extends BasePage{
	
public ProgramPage(WebDriver driver) {
		super(driver);
	}
String login_page_URL="https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/login";
String landing_page_URL="https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/";
String program_page_URL="https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/program";

@FindBy(xpath="//*[@id=\'username\']")
private WebElement UserName;

@FindBy(xpath="//*[@id=\'password\']")
private WebElement password;

@FindBy(xpath="//*[@id=\"login\"]")
private WebElement login;

@FindBy(xpath="//*[@id=\"program\"]")
private WebElement Program1;

@FindBy(xpath="//*[@id=\"logout\"]")
private WebElement lgouttext;


@FindBy(xpath="//span[normalize-space()='LMS - Learning Management System']")
private WebElement lmsheadertext;

@FindBy(xpath="//*[@id=\"mat-menu-panel-0\"]")
private WebElement AddNewPrgtext;

@FindBy(xpath="//div[normalize-space()='Manage Program']")
private WebElement headningMngPrgtext;

@FindBy(xpath="//button[@class='p-button-danger p-button p-component p-button-icon-only']")
private WebElement dltbtn;

@FindBy(xpath="//input[@id='filterGlobal']")
private WebElement Searchtext;

@FindBy(xpath="//input[@id='filterGlobal']")
private WebElement prgChkBox;

@FindBy(xpath="//button[@role='menuitem']")
private WebElement clicknewprogrambtn;

@FindBy(xpath="//span[@id='pr_id_2-label']")
private WebElement prddtlstext;

@FindBy(xpath="//label[@for='programName']/span[contains(text(),'*')] ")
private WebElement mdtExist;

@FindBy(xpath="//span[normalize-space()='Save'] ")
private WebElement SaveBtn;

@FindBy(xpath="//small[normalize-space()='Program name is required.']")
private WebElement vrfymsgSave;

@FindBy(xpath="//span[normalize-space()='Cancel']")
private WebElement ClickCancelbtn;

@FindBy(xpath="//input[@id='programName']")
private WebElement NameText;

@FindBy(xpath="//input[@id='programDescription']")
private WebElement Descriptiontext;

@FindBy(xpath="//p-radiobutton[@ng-reflect-input-id='Active']//div[@ng-reflect-ng-class='[object Object]']//div[@ng-reflect-ng-class='[object Object]']")
private WebElement Activebtn;

@FindBy(xpath="//input[@id='filterGlobal']")
//@FindBy(xpath="/html/body/app-root/app-program/div/mat-card/mat-card-title/div[2]/div[2]/span/i")
private WebElement serachbtn;

@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-program[1]/div[1]/mat-card[1]/mat-card-content[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
private WebElement nametextval;

@FindBy(xpath="//span[@class='p-dialog-header-close-icon ng-tns-c168-6 pi pi-times']")
private WebElement ClickXBtn;

//span[@class='pi pi-times ng-tns-c204-7']

@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-program[1]/div[1]/mat-card[1]/mat-card-content[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/span[1]/button[1]/span[1]")
private WebElement ClickEditbtn;

@FindBy(xpath="//tbody/tr[1]/td[5]/div[1]/span[1]/button[2]/span[1]")
private WebElement dltbtnclk;

@FindBy(xpath="/html/body/app-root/app-program/p-confirmdialog/div/div/div[1]/span")
private WebElement confirmtag;

@FindBy(xpath="//span[@class='p-button-icon p-button-icon-left pi pi-check']")
private WebElement ClkYesBtn;

//button[@class='ng-tns-c204-7 p-confirm-dialog-accept p-ripple p-button p-component ng-star-inserted']
//span[@class='p-button-icon p-button-icon-left pi pi-check']

@FindBy(xpath="//span[@class='p-button-icon p-button-icon-left pi pi-times']")
private WebElement ClickNobtn;

@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-program[1]/p-confirmdialog[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
private WebElement ClickXbtn;

@FindBy(xpath="//th[normalize-space()='Program Status']")
private WebElement prgstatus;

@FindBy(xpath="//th[normalize-space()='Program Name']")
private WebElement prgnmclmname;

@FindBy(xpath="//th[normalize-space()='Program Description']")
private WebElement prgdsc;

@FindBy(xpath="//th[normalize-space()='Edit / Delete']")
private WebElement edtdlt;

@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-program[1]/div[1]/mat-card[1]/mat-card-content[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/p-tablecheckbox[1]/div[1]/div[2]")
private WebElement rowprgChkBox;

@FindBy(xpath="//p-sorticon[@field='programName']//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt']")
private WebElement nmarrow;

@FindBy(xpath="//p-sorticon[@field='status']//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt']")
private WebElement statarrow;

@FindBy(xpath="//p-sorticon[@field='description']//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt']")
private WebElement descarrow;

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

public void clickProgram()
{
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	Program1.click();	
}

public void checkurl() {
	String url=driver.getCurrentUrl();
	Assert.assertEquals(url,"https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/program");
	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	
}

public String findlmsHeader() {

	String lmsheaderText=lmsheadertext.getText();
	return lmsheaderText;
	
}

public String VerifyLogout() {
	
	String lgout=lgouttext.getText();
	return lgout;
}

public String VerifyAddNewPrg() {
	String AddNewPrg=AddNewPrgtext.getText();
	return AddNewPrg;
}

public String headningMngPrg() {
	String headningMngPrg=headningMngPrgtext.getText();
	return headningMngPrg;
}



public boolean verifyDeleteBtn() {
	boolean dltbtnstat= dltbtn.isEnabled();
	return dltbtnstat;
}

public String Search() {
	String searchtext=Searchtext.getAttribute("placeholder");
	return searchtext;
}

public boolean prgnamechkbox() {
	boolean prgchkBox=prgChkBox.isSelected();
	return prgchkBox;
}

public void clicknewprogram() {
	clicknewprogrambtn.click();
	
}

public String PrgmDetails() {
	String prdtls=prddtlstext.getText();
	return prdtls;
}

public boolean mandtryexist() {
	boolean mdtexist=mdtExist.isDisplayed();
	return mdtexist;
}

public void ClickSave() {
	SaveBtn.click();
	
}

public String verifymsgonSave() {
	String msg=vrfymsgSave.getText();
	return msg;
	
}

public void ClickCancel() {
	
	ClickCancelbtn.click();
}

public void Nametext(String string) {
	NameText.sendKeys(string);
	
}

public String verifyNameText() {
	String nametextval= NameText.getAttribute("value");
	return nametextval;
}

public void Descriptiontext(String string) {
	Descriptiontext.sendKeys(string);
	
}

public String verifydescriptionText() {
	String descriptionval= Descriptiontext.getAttribute("value");
	return descriptionval;
}

public void selectStatus() {
	Activebtn.click();
	
}

public boolean verifyactivebtn() {
	//boolean actbtn=Activebtn.getAttribute("checked");
	boolean actbtn=Activebtn.isEnabled();
	return actbtn;

}

public void clickSaveBtn() {
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	SaveBtn.click();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
}

public void searchrecord(String string) {
	//driver.navigate().refresh();
	serachbtn.sendKeys(string);
	
}

public String verifydrecordText() {
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	String vname=nametextval.getText();
	return vname;
}

public void clickXbtn() {
	ClickXBtn.click();
	
}

public void clickeditbtn() {
	driver.navigate().refresh();
	ClickEditbtn.click();
	
}

public void deletebtnclick() {
	driver.navigate().refresh();
	dltbtnclk.click();
	
}

public String verifypopup() {
	String msgtext=confirmtag.getText();
	return msgtext;
	
}

public void ClickYes() {
	ClkYesBtn.click();
	
}

public void ClickNO() {
	ClickNobtn.click();
	
}

public void ClickXbtn() {
	ClickXbtn.click();
	
}

public String prgnmclm() {
	String prg=prgnmclmname.getText();
	return prg;
}

public String descriptionclm() {
	String str=prgdsc.getText();
	return str;
}

public String statusclm() {
	String sts=prgstatus.getText();
	return sts;
}

public String edtdltclm() {
	String edt=edtdlt.getText();
	return edt;
}

public boolean rowprgnamechkbox() {
	boolean prgchkBox=rowprgChkBox.isSelected();
	return prgchkBox;
}

public boolean verifyarrowicon() {
	boolean narr=nmarrow.isDisplayed();
	boolean sarr=statarrow.isDisplayed();
	boolean darr=descarrow.isDisplayed();
	
	if(narr==sarr==darr==true)
		return true;
	else return false;
	
}






}