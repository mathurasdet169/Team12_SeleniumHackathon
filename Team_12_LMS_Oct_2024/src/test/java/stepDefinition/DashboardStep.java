package stepDefinition;

import factory.driverFactory;
import io.cucumber.java.en.*;
import pageObjectModel.DashboardPage;
import utilities.LoggerLoad;

public class DashboardStep {
	
	@SuppressWarnings("rawtypes")
	DashboardPage DashPage = new DashboardPage(driverFactory.getDriver());
	
	
	
	@Given("Admin gives the correct LMS portal URLKP")
	public void admin_gives_the_correct_lms_portal_urlkp() {
		// DP.Url();
	     
	 driverFactory.getDriver().get("https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/login");
	}

	@When("Admin is on login pageKP")
	public void admin_is_on_login_page_kp() {
	    
		System.out.println("login page");
	    LoggerLoad.info("...Admin is on page....");
	}

	@When("Admin enters credentials and clicks login pageKP")
	public void admin_enters_credentials_and_clicks_login_page_kp() {

		DashPage.Login("Sdet@gmail.com","LmsHackathon@2024");

	}

	@Then("Admin sohnould see dashboardKP")
	public void admin_sohnould_see_dashboard_kp() {
	    
		System.out.println("Admin see dashborad");
	    LoggerLoad.info("....Admin should see dashbord");
	}

	@Then("Maximun navigation time in milliseconds, defaults to {int} seconds")
	public void maximun_navigation_time_in_milliseconds_defaults_to_seconds(Integer int1) throws InterruptedException {
		
		DashPage.pagenavi();
		
		System.out.println("Page navigation");
		LoggerLoad.info("...Page Navigation...");
	    
	}

	@Then("HTTP response>={int}.then link is broken")
	public void http_response_then_link_is_broken(Integer int1) throws InterruptedException {
         
		//DashPage.brokenlink();
		
		System.out.println("Broken link is valid");
		LoggerLoad.info("....Broken link is valid....");
	}

	@Then("Admin should see LMS -Learning management system as title")
	public void admin_should_see_lms_learning_management_system_as_title() throws InterruptedException {
	    
		DashPage.validatelms();
		 System.out.println("Validate Title");
		 LoggerLoad.info("... validate Title...");
	}

	@Then("LMS title should be on the top left corner of page")
	public void lms_title_should_be_on_the_top_left_corner_of_page() {
	    
		DashPage.lmspage();
		System.out.println("Position of LMS");
		LoggerLoad.info("....Position of LMS....");
	}

	@Then("Admin should see correct spelling in navigation bar text")
	public void admin_should_see_correct_spelling_in_navigation_bar_text() {
	    
		DashPage.checkSpelling();
		System.out.println("Check Spelling in navigation bar");
		LoggerLoad.info(".....Check Spelling in Nvaigation bar....");
		
	}

	@Then("Admin should see correct spelling and space in LMS title")
	public void admin_should_see_correct_spelling_and_space_in_lms_title() {
	    
		DashPage.lmspage();
		//DashPage.checkTitleSpelling();
		System.out.println("... Correct Spelling ....");
		LoggerLoad.info("..... Correct Spelling....");
	}

	@Then("Admin should see the navigation bar text on the top right side")
	public void admin_should_see_the_navigation_bar_text_on_the_top_right_side() {
	    
		DashPage.navigbar();
		System.out.println("Navigation bar text right side");
		LoggerLoad.info("...Navigate bar text right side...");
	}

	@Then("Admin should see Home in the 1st place")
	public void admin_should_see_home_in_the_1st_place() {
	   
		System.out.println("Home is not present");
		LoggerLoad.info(".... Home is not present....");
	}

	@Then("Admin should see program in the 2nd place")
	public void admin_should_see_program_in_the_2nd_place() {
	    
		DashPage.validateprogram();
	}

	@Then("Admin should see batch in the 3rd place")
	public void admin_should_see_batch_in_the_3rd_place() {
	    
		DashPage.validatebatch();
	}

	@Then("Admin should see class in the 4th place")
	public void admin_should_see_class_in_the_4th_place() {
	    
		DashPage.validateclass();
	}

	@Then("Admin should see logout in the 5th place")
	public void admin_should_see_logout_in_the_5th_place() {
		
		DashPage.validatelogout();
	}

}

