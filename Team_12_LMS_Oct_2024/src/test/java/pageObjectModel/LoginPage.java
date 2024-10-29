package pageObjectModel;


import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.openqa.selenium.support.Color;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import utilities.AppUtils;
import utilities.ConfigReader;
//import utilities.excelReader;

public class LoginPage extends BasePage{

	public static WebDriver driver;
//public WebDriver driver;
String userNameExcelValue;
String passwordExcelValue;
//public static excelReader reader = new excelReader();

	
public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	
	}
//public void login(WebDriver driver) {  
//	    this.driver = driver;
//	}
	By homepageverification = By.xpath("//*[@class='signin-content']");
	By PleaseLoginToLMSapp = By.xpath("//p[text()='Please login to LMS application']");
	By user = By.xpath("//*[@ID='username']");
	By password =By.xpath("//*[@ID='password']");
	By btnlogin = By.xpath("//*[@class='mat-button-wrapper']");
	//By links = By.name('a');
	By logo	= By.xpath("//*[@class='images']");
	By dashboardverification = By.xpath("/html/body/app-root/app-header/mat-toolbar");
	//private By username;
	By textbox = By.xpath("//input");
	By invaliderrormsg = By.xpath(("//*[@id ='errormessage']"));
	By enterpasswordmsg = By.xpath("//*[@id='mat-error-7']");
	By positionofinputbox = By.xpath("//*[@class= 'mat-card-content']");
	
	public void Homepageverification() {
		driver.findElement(homepageverification).isDisplayed();
	}
	public void CheckSpellings() {
		Assert.assertEquals(driver.findElement(PleaseLoginToLMSapp), "Please login to LMS application");
		Assert.assertEquals(driver.findElement(user),"User *");
		Assert.assertEquals(driver.findElement(password),"Password *");
		Assert.assertEquals(driver.findElement(btnlogin), "Login");
	}
	
	public void VerifyStarWithUserTextBox() {
		Assert.assertEquals(driver.findElements(user).contains("*"), true);
	}
	
	public void VerifyStarWithPasswordTextBox() {
		Assert.assertEquals(driver.findElements(password).contains("*"), true);
	}
	
	public void VerifyLoginButton() {
		Assert.assertEquals(driver.findElements(btnlogin).contains("Login"), true);
	}
	public boolean CheckIfValidURL(){
		 String pageSource = driver.getPageSource().toLowerCase();
		 return !(pageSource.contains("error") ||
					pageSource.contains("404") ||
					(pageSource.contains("not") && pageSource.contains("found")));
		}
	public void verifylogo() {
		Assert.assertEquals(driver.findElement(logo).isDisplayed(), true);
	}
//	public void checkpleaselogin() {
//		Assert.assertEquals(driver.findElements(PleaseLoginToLMSapp).contains("Please login to LMS application"), true);
//	}
//	
	public void VerifyUser() {
		Assert.assertEquals(driver.findElement(user).getText().toLowerCase().contains("User"), true);
		//Assert.assertEquals(driver.findElements(user).contains("User"), true);
	
	}
	
	public void Verifypassword() {
		//Assert.assertEquals(driver.findElements(password).contains("Password"), true);
		Assert.assertEquals(driver.findElement(password).getText().toLowerCase().contains("Password"), true);
	}
	
	/*public void readDataFromSheet(String sheetName, Integer rowNumber) throws IOException{
	    utilities.excelReader reader = new excelReader();
	    List<Map<String, String>> testdata = reader.getData(".src/test/resources/Team_12_data_sheet.xlsx", sheetName);
	    userNameExcelValue = testdata.get(rowNumber).get("Username");
	    passwordExcelValue = testdata.get(rowNumber).get("Password");
	    System.out.println(userNameExcelValue);
	    }*/
	
	public void sendUserName() {
	   
	   driver.findElement(user).sendKeys(userNameExcelValue); 
	}

	public void sendPassword() {
	   
	   driver.findElement(password).sendKeys(passwordExcelValue);
	}

	public void loginButton() {
	   
	   driver.findElement(btnlogin).click();
	}
	public void dashboardVerification() {
	driver.findElement(dashboardverification);
	}
	public void verifyTwoTextFields() {
		Assert.assertEquals(textbox.equals(2), true);
	}
	public void invalidErrorMsg() { 
	driver.findElement(invaliderrormsg).isDisplayed();
	}
	
	public void enterPasswordMsg() {
		driver.findElement(enterpasswordmsg).isDisplayed();
	}
	
	public void brokenLink() throws URISyntaxException {
		 
		  List<WebElement> links = driver.findElements(By.tagName("iframe"));
			
			for (WebElement link : links) {
				
				String url = link.getAttribute("src");
				if (url== null || url.isEmpty()) {
					System.out.println("URL is empty");
					
					continue;
				}
				try {
					URL appLink = new URI(url).toURL();
					HttpURLConnection huc = (HttpURLConnection) (appLink.openConnection());
					huc.connect();
					if (huc.getResponseCode()>=400 ) {
						
						System.out.println(url + " is broken");
						
					}
					else
					{
						System.out.println(url + " is valid");
					}
					
				} catch (MalformedURLException e) {
			
					e.printStackTrace();
				} catch (IOException e) {
					
					e.printStackTrace();
				} 
				
			}
	  }
	
	public void appNameOnLogo() throws IOException, TesseractException {
		
		String imageURL = driver.findElement(logo).getAttribute("src");
		URL url = new URL(imageURL);
		BufferedImage image1 = ImageIO.read(url);
		 Tesseract tesseract = new Tesseract();
		 tesseract.setDatapath("C:\\Git\\Test14_TestingSprinters_LMS_UI\\Team14_LMS_UI_TestingSprinters\\captureImg\\image.png");
		 tesseract.setLanguage("eng");
		  String extractedText = tesseract.doOCR(image1);
	
          System.out.println("Extracted Text: " + extractedText);
}
	
public void companyNameOnLogo() throws IOException, TesseractException {
		
		String imageURL = driver.findElement(logo).getAttribute("src");
		URL url = new URL(imageURL);
		BufferedImage image1 = ImageIO.read(url);
		 Tesseract tesseract = new Tesseract();
		 tesseract.setDatapath("C:\\Git\\Test14_TestingSprinters_LMS_UI\\Team14_LMS_UI_TestingSprinters\\captureImg\\image.png");
		 tesseract.setLanguage("eng");
		  String extractedText = tesseract.doOCR(image1);
	         System.out.println("Extracted Text: " + extractedText);
}

public Point positionOfLoginBtn() {
WebElement getbuttonposition = driver.findElement(btnlogin);
	Point xyposition = getbuttonposition.getLocation();
	int xvalue = xyposition.x;
	int yvalue = xyposition.y;
	System.out.println("Location ::" +getbuttonposition);
	Assert.assertEquals(xyposition.equals("34.260 x 36"), true);
	return xyposition;
}

public Point positionOfInputBox() {
WebElement getinputboxposition = driver.findElement(positionofinputbox);
	Point xyposition = getinputboxposition.getLocation();
	int xvalue = xyposition.getX();
	int yvalue = xyposition.getY();
	System.out.println("Location ::" +getinputboxposition);
	Assert.assertEquals(xyposition.equals("368 x 221.667"), true);
	return xyposition;
}

	   public void checkIfUserFontColorIsGray() {
	         String color = driver.findElement(user).getCssValue("color");
	         System.out.println("font color :: " + color);
	     		Assert.assertEquals(color.equals("rgba(0, 0, 0, 0.54)"), true);
	     	}
	        	        
	   public void checkIfPasswordFontColorIsGray() {
		   String color = driver.findElement(password).getCssValue("color");
		   System.out.println("font color :: " + color);
		   Assert.assertEquals(color.equals("rgba(0, 0, 0, 0.54)"), true);
}
	
	/*public void enterUserName() {
		//String userName = reader.getUsername();
		
		String filePath = reader.getData(".src/test/resources/Team_12_data_sheet.xlsx");

		String sheetName = "Login";
		Object[][] testData;
		try {
			testData = excelReader.readDataFromExcel(filePath, sheetName);			
			String userName = testData[0][3].toString();
			driver.findElement(user).sendKeys(userName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void enterPassword() {
		//String pass = reader.getPassword();
		String filePath =  reader.getExcelPath();
		String sheetName = "Login";
		Object[][] testData;
		try {
			testData = ExcelUtils.readDataFromExcel(filePath, sheetName);			
			String p= testData[0][2].toString();
			password.sendKeys(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
		
	public void invalidcredencial() {
		driver.findElement(user).sendKeys("sedt@gmail.com");
		driver.findElement(password).sendKeys("LMSHACKATHON@2024");
		driver.findElement(btnlogin).click();
	}
	public void validcredencial() {
		driver.findElement(user).sendKeys("Sdet@gmail.com");
		driver.findElement(password).sendKeys("LmsHackathon@2024");
		driver.findElement(btnlogin).click();
		
	}
	public void onlyusername() {
		driver.findElement(user).sendKeys("Sdet@gmail.com");
		driver.findElement(btnlogin).click();
	}
	public void onlypassword() {
		driver.findElement(password).sendKeys("LmsHackathon@2024");
		driver.findElement(btnlogin).click();
	}
	public void validcredencialwithkeyboard() {
		driver.findElement(user).sendKeys("Sdet@gmail.com");
		driver.findElement(password).sendKeys("LmsHackathon@2024");
		driver.findElement(btnlogin).sendKeys(Keys.ENTER);
		
	}
}