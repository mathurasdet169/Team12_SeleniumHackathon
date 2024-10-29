package stepDefinition;

import java.io.IOException;
import java.net.URISyntaxException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import factory.driverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.sourceforge.tess4j.TesseractException;
//import net.sourceforge.tess4j.TesseractException;
import pageObjectModel.ProgramPage;
//import pageObjectModel.login;
import pageObjectModel.LoginPage;
public class LoginSteps {
	
	LoginPage Login = new LoginPage (driverFactory.getDriver());
	
	
	public static WebDriver driver;
	@Given("Admin launch the browse vh")
	public void admin_launch_the_browse_vh() {
		driver = new ChromeDriver();
		  driver.manage().window().maximize();
	}

	@When("Admin gives the correct LMS portal URL vh")
	public void admin_gives_the_correct_lms_portal_url_vh() {
		driverFactory.getDriver().get("https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/login");
	}

//	@Then("Admin should land on the login page vh")
//	public void admin_should_land_on_the_login_page_vh() {
//	    Login.checkpleaselogin();
//	}

	@When("Admin gives the invalid LMS portal URL vh")
	public void admin_gives_the_invalid_lms_portal_url_vh() {
		driverFactory.getDriver().get("https://lms-frontend-hackathon-oct24-173fe394.herokuapp.com/login");
	}

	@Then("Admin should recieve {int} page not found error vh")
	public void admin_should_recieve_page_not_found_error_vh(Integer int1) {
	    Login.CheckIfValidURL();
	}

	@When("Admin gives the correct LMS portal URL a vh")
	public void admin_gives_the_correct_lms_portal_url_a_vh() {
		driverFactory.getDriver().get("https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/login");
	}
	
	@Then("HTTP response >= {int}. Then the link is broken vh")
	public void http_response_then_the_link_is_broken_vh(Integer int1) throws URISyntaxException {
		Login.brokenLink();
			}
	
	@Then("Admin should see correct spellings in all fields vh")
	public void admin_should_see_correct_spellings_in_all_fields_vh() {
	   Login.CheckSpellings();
	}

	@Then("Admin should see logo on the left side vh")
	public void admin_should_see_logo_on_the_left_side_vh() {
	    Login.verifylogo();
	    }

	@Then("Admin should see LMS - Learning Management System vh")
	public void admin_should_see_lms_learning_management_system_vh() throws IOException, TesseractException {
	   Login.appNameOnLogo();
	}

		@Then("Admin should see company name below the app name vh")
	public void admin_should_see_company_name_below_the_app_name_vh() throws IOException, TesseractException {
			Login.companyNameOnLogo();
	}
			    
//	@Then("Admin should see {string} vh")
//	public void admin_should_see_vh(String string) {
//	    Login.checkpleaselogin();
//	}

	@Then("Admin should see two text field vh")
	public void admin_should_see_two_text_field_vh() {
		Login.verifyTwoTextFields();
	}

	@Then("Admin should {string} in the first text field vh")
	public void admin_should_in_the_first_text_field_vh(String string) {
	    Login.VerifyUser();
	}

	@Then("Admin should see field mandatory *symbol next to Admin text vh")
	public void admin_should_see_field_mandatory_symbol_next_to_admin_text_vh() {
	   Login.VerifyStarWithUserTextBox();
	}

	@Then("Admin should {string} in the second text field vh")
	public void admin_should_in_the_second_text_field_vh(String string) {
		Login.Verifypassword();
	}

	@Then("Admin should see * symbol next to password text vh")
	public void admin_should_see_symbol_next_to_password_text_vh() {
		Login.VerifyStarWithPasswordTextBox();
	}

	@Then("Admin should see input field on the centre of the page vh")
	public void admin_should_see_input_field_on_the_centre_of_the_page_vh() {
	 Login.positionOfInputBox();
	}

	@Then("Admin should see login button vh")
	public void admin_should_see_login_button_vh() {
	   Login.VerifyLoginButton();
	}

	@Then("Admin should see login button on the centre of the page vh")
	public void admin_should_see_login_button_on_the_centre_of_the_page_vh() {
	   Login.positionOfLoginBtn();
	}
	@Then("Admin should see Admin in gray color vh")
	public void admin_should_see_admin_in_gray_color_vh() {
	    Login.checkIfUserFontColorIsGray();
	}

	@Then("Admin should see password in gray color vh")
	public void admin_should_see_password_in_gray_color_vh() {
	    Login.checkIfPasswordFontColorIsGray();
	}
	@Given("Admin is in login Page vh")
	public void admin_is_in_login_page_vh() {
	   Login.Homepageverification();
	}

	@When("Admin enter valid credentials and clicks login button Admin should land on dashboard page vh")
	public void admin_enter_valid_credentials_and_clicks_login_button_admin_should_land_on_dashboard_page_vh() {
		Login.validcredencial();
	}

	@Then("Admin should land on dashboard page vh")
	public void admin_should_land_on_dashboard_page_vh() {
	    Login.dashboardVerification();
	}

	@When("Admin enter invalid credentials and clicks login button vh")
	public void admin_enter_invalid_credentials_and_clicks_login_button_vh() {
		Login.invalidcredencial();
	}

	@Then("Error message please check Adminname\\/password vh")
	public void error_message_please_check_adminname_password_vh() {
         Login.invalidErrorMsg();
	}

	@When("Admin enter value only in password and clicks login button vh")
	public void admin_enter_value_only_in_password_and_clicks_login_button_vh() {
	  Login.onlypassword();
	}

	@Then("Error message please check Adminname\\/password a vh")
	public void error_message_please_check_adminname_password_a_vh() {
	    Login.enterPasswordMsg();
	}

	@When("Admin enter value only in Adminname and clicks login button vh")
	public void admin_enter_value_only_in_adminname_and_clicks_login_button_vh() {
	   Login.onlyusername();
	}

	@Then("Error message please check Adminname\\/password  b vh")
	public void error_message_please_check_adminname_password_b_vh() {
		 Login.invalidErrorMsg();
	}

	@When("Admin enter valid credentials and clicks login button through keyboard vh")
	public void admin_enter_valid_credentials_and_clicks_login_button_through_keyboard_vh() {
		Login.validcredencialwithkeyboard();
	}

	@Then("Admin should land on dashboard page a vh")
	public void admin_should_land_on_dashboard_page_a_vh() {
	    Login.dashboardVerification();
	}

	@When("Admin enter valid credentials and clicks login button through mouse vh")
	public void admin_enter_valid_credentials_and_clicks_login_button_through_mouse_vh() {
	    Login.validcredencial();
	}

	@Then("Admin should land on dashboard page b vh")
	public void admin_should_land_on_dashboard_page_b_vh() {
		Login.dashboardVerification();
	}
}

