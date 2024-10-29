package pageObjectModel;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v114.css.model.RuleMatch;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utilities.ConfigReader;

import org.openqa.selenium.Point;

public class DashboardPage<JLanguageTool>  extends BasePage{
	
	
	//Constructor

	public static WebDriver driver;
	public DashboardPage(WebDriver driver) {
			
		super(driver);
		}


		public static ConfigReader file = new ConfigReader();
		
		
		@FindBy(xpath="//*[@id=\"username\"]")
		 public WebElement username;
		
		@FindBy(xpath="//*[@id=\"password\"]")
		 public WebElement password;
		
		@FindBy(xpath="//*[@id=\"login\"]")
		public WebElement login;
		
		@FindBy(xpath="//span[normalize-space()='Program']")
		WebElement programvd;
		
		@FindBy(xpath="//span[normalize-space()='Batch']")
		WebElement batchvd;
		
		@FindBy(xpath="//span[normalize-space()='Class']")
		WebElement classvd;
		
		@FindBy(xpath="//*[@id=\"logout\"]/span[1]")
		WebElement logoutvd;
		
		
		@FindBy(xpath="//span[normalize-space()='LMS - Learning Management System']")
		WebElement LMSvalidate;
		
		@FindBy(xpath="//div[@class='ng-star-inserted']")
		WebElement navigationbar;
		

	  /* public void Url() {
			@SuppressWarnings("unused")
			String url = file.getApplicationURL();
			driver.get("https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/login");
		}*/

		public void Username(String user) {
			//String username =file.getusername();
			username.sendKeys(user);
		}
		
		public void Password(String pwd) {
			//String password =file.getpassword();
			password.sendKeys(pwd);
		}
		
		public void clicklog() {
			login.click();
		}
		
		public void Login(String user,String pwd) {
			username.sendKeys(user);
			password.sendKeys(pwd);
			login.click();
		}
		
		public void pagenavi() throws InterruptedException {
			
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/");
			Thread.sleep(5000);
		}
		
		@SuppressWarnings("unchecked")
		public void brokenlink() throws InterruptedException {
			 
		List<WebElement> links = (List<WebElement>) driver.findElement(By.tagName("link"));
			System.out.println(links.size());
			
			for(WebElement link:links) {
				try {
					String linkURL =link.getAttribute("href");
					URL url =new URL(linkURL);
					HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
					HttpURLConnection httpURLConnection=(HttpURLConnection) urlConnection;
					httpURLConnection.setConnectTimeout(5000);
					httpURLConnection.connect();
					
					if(httpURLConnection.getResponseCode()>=400)
					{
						System.out.println(url + "-" + "is broken link");
					}else {
						System.out.println(url + "-" + "is valid link");
					}
				}catch (Exception e)
				{
					System.out.println("This is code for broken link");
				}
			}
			Thread.sleep(5000);
	}
		
		public boolean CheckURL(){
			 String pageSource = driver.getPageSource().toLowerCase();
			 return !(pageSource.contains("error") ||
						pageSource.contains("404") ||
						(pageSource.contains("not") && pageSource.contains("found")));
			}
		
		public void validatelms() throws InterruptedException {
			
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='LMS - Learning Management System']")));
			
			String ExpectedTitle ="LMS - Learning Management System";
	         Assert.assertEquals(LMSvalidate.getText(),ExpectedTitle);
	         Thread.sleep(5000);
		}
		
		public void lmspage() {
			WebElement lms =LMSvalidate;
		      Point p = lms.getLocation();
		      System.out.println("x-cord-"+p.x+" " +p.getX());
		      System.out.println("y-cord-"+p.y+" " +p.getY());
		      Dimension d = lms.getSize();
		      System.out.println("width-" +d.width+" " +d.getWidth());
		      System.out.println("height-" +d.height+" " +d.getHeight());
		}
		
		public void checkSpelling() {
			
			Assert.assertEquals(LMSvalidate.getText(), "LMS - Learning Management System");
			Assert.assertEquals(programvd.getText(), "Program");
			Assert.assertEquals(batchvd.getText(), "Batch");
			Assert.assertEquals(classvd.getText(), "Class");
			Assert.assertEquals(logoutvd.getText(), "Logout");
		
		}
		
	/*	public void checkTitleSpelling() {
			
			WebElement ele = driver.findElement(By.xpath("(//span[normalize-space()='LMS - Learning Management System'])[1]"));
			String pageText = ele.getText();
			System.out.println(pageText);
			
			//initialize languageTool
			JLanguageTool languageTool = new JLanguageTool(new AmericanEnglish());
			try {
				List<RuleMatch> errors =  languageTool.check(pageText);
				if(errors.isEmpty()) {
					System.out.println("No spelling mistakes found");
				}else {
					System.out.println("spelling mistakes found");
					for(RuleMatch error: errors) {
						System.out.println("potential type at line" +  error.getLine() + ",column"+ error.getColumn() + ":" +error.getMessage());
						System.out.println("context:" + error.getShortMessage());
						System.out.println("suggested correction:" +error.getSuggestedReplacements());
						System.out.println("....");
					} catch(IOException e) {
					e.printStackTrace();
				}
				
	} */
	 
				public void navigbar() {
					WebElement lms = navigationbar;
				      Point p = lms.getLocation();
				      System.out.println("x-cord-"+p.x+" " +p.getX());
				      System.out.println("y-cord-"+p.y+" " +p.getY());
				      Dimension d = lms.getSize();
				      System.out.println("width-" +d.width+" " +d.getWidth());
				      System.out.println("height-" +d.height+" " +d.getHeight());
						}
		   		
		public void validateprogram() {
			
			boolean programvalidate = programvd.isDisplayed();
			if(programvalidate) {
				System.out.println("Program is Displayed");
			}else 
			
			{
				System.out.println("Program is not Displayed");
			}
		}
		
		public void validatebatch() {
			
			boolean batchvalidate = batchvd.isDisplayed();
			if(batchvalidate) {
				System.out.println("Batch is Displayed");
			}else {
				System.out.println("atch is not Displayed");
			}
		}
		
		public void validateclass() {
			
			boolean classvalidate = classvd.isDisplayed();
			if(classvalidate) {
				System.out.println("Class is Displayed");
			}else {
				System.out.println("Class is not Displayed");
			}
		}
		
		public void validatelogout() {
			boolean logoutvalidate = logoutvd.isDisplayed();
			
			if(logoutvalidate) {
				System.out.println("logout is Displayed");
			}else {
				System.out.println("logout is not Displayed");
			}
		}


		
	
	
	
}
