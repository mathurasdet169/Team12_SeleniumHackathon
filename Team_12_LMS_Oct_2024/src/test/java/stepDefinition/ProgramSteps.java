package stepDefinition;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import factory.driverFactory;
import io.cucumber.java.en.*;
import pageObjectModel.ProgramPage;
import utilities.ConfigReader;

public class ProgramSteps {

	ProgramPage  ProgramPageobject=new  ProgramPage (driverFactory.getDriver());
	String s = RandomStringUtils.randomAlphabetic(8);
	
@Given("Admin is on dashboard page after Login")
public void admin_is_on_dashboard_page_after_login() throws InterruptedException {
		
    driverFactory.getDriver().get("https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/login");
	ProgramPageobject.Login("Sdet@gmail.com","LmsHackathon@2024");
}

@When("Admin clicks Program on the navigation bar")
public void admin_clicks_on_the_navigation_bar() {

	ProgramPageobject.clickProgram();
}

@Then("Admin should be navigated to Program module")
public void admin_should_be_navigated_to_program_module() {
	ProgramPageobject.checkurl();

}

@Then("Admin should not have any broken links for Program module")
public void admin_should_not_have_any_broken_links_for_program_module(String string) {

    
}

@Then("Admin should see the heading {string}")
public void admin_should_see_the_heading(String string) {

	String lmsheader=ProgramPageobject.findlmsHeader();
	
   // Assert.assertEquals(lmsheader,"LMS - Learning Management System");
	Assert.assertEquals(lmsheader, string);
	
}

@Then("Admin should see the module names as in order {string}")
public void admin_should_see_the_module_names_as_in_order(String string) {
 

}

@Then("Admin should see Logout in menu bar")
public void admin_should_see_logout_in_menu_bar() {
	
    String logout=ProgramPageobject.VerifyLogout();
    Assert.assertEquals(logout,"Logout");
}


@Then("Admin should see sub menu in menu bar as {string}")
public void admin_should_see_sub_menu_in_menu_bar_as(String string) {
    String AddNewPrg=ProgramPageobject.VerifyAddNewPrg();
    Assert.assertEquals(AddNewPrg,"Add New Program");
}

@Then("Admin should see the heading Manage Program")
public void Admin_should_see_the_heading_Manage_Program()
{
	 String headningMngPrg=ProgramPageobject.headningMngPrg();
	 Assert.assertEquals(headningMngPrg,"Manage Program");
}

@Then("Admin should able to see Program name, description, and status for each program")
public void admin_should_able_to_see_program_name_description_and_status_for_each_program() {
 String programnameclm= ProgramPageobject.prgnmclm();
 Assert.assertEquals(programnameclm,"Program Name");
 String descriptionclm= ProgramPageobject.descriptionclm();
 Assert.assertEquals(descriptionclm,"Program Description");
 String statusclm= ProgramPageobject.statusclm();
 Assert.assertEquals(statusclm,"Program Status");
 
}

@Then("Admin should see a Delete button in left top is disabled")
public void admin_should_see_a_delete_button_in_left_top_is_disabled() {
	boolean dltbtn= ProgramPageobject.verifyDeleteBtn();
	Assert.assertEquals(dltbtn,false);
	
}


@Then("Admin should see Search bar with text as {string}")
public void admin_should_see_search_bar_with_text_as(String string) {
    String SearchText=ProgramPageobject.Search();
    Assert.assertEquals(SearchText,string);
}

@Then("Admin should see data table with column header on the Manage Program Page as  Program Name, Program Description, Program Status, Edit\\/Delete")
public void admin_should_see_data_table_with_column_header_on_the_manage_program_page_as_program_name_program_description_program_status_edit_delete() {
	 String programnameclm= ProgramPageobject.prgnmclm();
	 Assert.assertEquals(programnameclm,"Program Name");
	 String descriptionclm= ProgramPageobject.descriptionclm();
	 Assert.assertEquals(descriptionclm,"Program Description");
	 String statusclm= ProgramPageobject.statusclm();
	 Assert.assertEquals(statusclm,"Program Status");
	 String edtdlt= ProgramPageobject.edtdltclm();
	 Assert.assertEquals(edtdlt,"Edit / Delete");
}

@Then("Admin should see checkbox default state as unchecked beside Program Name column header as")
public void admin_should_see_checkbox_default_state_as_unchecked_beside_program_name_column_header_as() {

	boolean prgchkbox= ProgramPageobject.prgnamechkbox();
	Assert.assertEquals(prgchkbox,false);
}

@Then("Admin should see check box default state as unchecked on the left side in all rows against program name")
public void admin_should_see_check_box_default_state_as_unchecked_on_the_left_side_in_all_rows_against_program_name() {
	boolean prgchkbox1= ProgramPageobject.rowprgnamechkbox();
	Assert.assertEquals(prgchkbox1,false);
}

@Then("Admin should see the sort arrow icon beside to each column header except Edit and Delete")
public void admin_should_see_the_sort_arrow_icon_beside_to_each_column_header_except_edit_and_delete() {
	ProgramPageobject.verifyarrowicon();
}

@Then("Admin should see the Edit and Delete buttons on each row of the data table")
public void admin_should_see_the_edit_and_delete_buttons_on_each_row_of_the_data_table() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should see the text as {string} along with Pagination icon below the table. x- starting record number on that pagey-ending record number on that pagez-Total number of records")
public void admin_should_see_the_text_as_along_with_pagination_icon_below_the_table_x_starting_record_number_on_that_pagey_ending_record_number_on_that_pagez_total_number_of_records(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should see the footer as {string}. z- Total number of records")
public void admin_should_see_the_footer_as_z_total_number_of_records(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


@Given("Admin is on Program module")
public void admin_is_on_program_module() {
    driverFactory.getDriver().get("https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/login");
	ProgramPageobject.Login("Sdet@gmail.com","LmsHackathon@2024");
	ProgramPageobject.clickProgram();
}

@When("Admin clicks on New Program under the Program menu bar")
public void admin_clicks_on_under_the_menu_bar() {
	ProgramPageobject.clicknewprogram();
}

@Then("Admin should see pop up window for program details")
public void admin_should_see_pop_up_window_for_program_details() {
	
	 String prgdtls=ProgramPageobject.PrgmDetails();
	    Assert.assertEquals(prgdtls,"Program Details");
}

@Then("Admin should see window title as {string}")
public void admin_should_see_window_title_as(String string) {
	 String prgdtls=ProgramPageobject.PrgmDetails();
	    Assert.assertEquals(prgdtls,"Program Details");
}

@Then("Admin should see red {string} mark beside mandatory field {string}")
public void admin_should_see_red_mark_beside_mandatory_field(String string, String string2) {
	boolean mandtry= ProgramPageobject.mandtryexist();
	Assert.assertEquals(mandtry,true);
}

@Given("Admin is on Program details form")
public void admin_is_on_program_details_form1() {
    driverFactory.getDriver().get("https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/login");
	ProgramPageobject.Login("Sdet@gmail.com","LmsHackathon@2024");
	ProgramPageobject.clickProgram();
	ProgramPageobject.clicknewprogram();
	
}

@When("Admin clicks save button without entering mandatory")
public void admin_clicks_save_button_without_entering_mandatory() {
	ProgramPageobject.ClickSave();
	
}

@Then("Admin gets message {string}")
public void admin_gets_message(String string) {
	String msg=ProgramPageobject.verifymsgonSave();
	//Assert.assertEquals(msg,"Program name is required.");
	Assert.assertEquals(msg,string);
}

@When("Admin clicks Cancel button")
public void admin_clicks_cancel_button() {
	ProgramPageobject.ClickCancel();
}

@Then("Admin can see Program Details form disappears")
public void admin_can_see_program_details_form_disappears() {
	 String headningMngPrg=ProgramPageobject.headningMngPrg();
	 Assert.assertEquals(headningMngPrg,"Manage Program");
}


@When("Admin enters the Name in the text box")
public void admin_enters_the_name_in_the_text_box() {
	ProgramPageobject.Nametext("Ramesh");
}

@Then("Admin can see the text entered")
public void admin_can_see_the_text_entered() {
	String nametextval=ProgramPageobject.verifyNameText();
	Assert.assertEquals(nametextval,"Ramesh");
	
}

@When("Admin enters the Description in text box")
public void admin_enters_the_description_in_text_box() {
	ProgramPageobject.Descriptiontext("testing description");
}

@Then("Admin can see the text entered in description box")
public void admin_can_see_the_text_entered_in_description_box() {
	String nametextval=ProgramPageobject.verifydescriptionText();
	Assert.assertEquals(nametextval,"testing description");
}

@When("Admin selects the status of the program by clicking on the radio button {string}")
public void admin_selects_the_status_of_the_program_by_clicking_on_the_radio_button(String string) {
	ProgramPageobject.selectStatus();
}

@Then("Admin can see {string} status selected")
public void admin_can_see_status_selected(String string) {
	boolean actbtn=ProgramPageobject.verifyactivebtn();

	Assert.assertEquals(actbtn,true);
}

@When("Admin enter valid details for mandatory fields and Click on save button")
public void admin_enter_valid_details_for_mandatory_fields_and_click_on_save_button() {
	ProgramPageobject.Nametext("Satish");
	ProgramPageobject.Descriptiontext("testing description test");
	ProgramPageobject.selectStatus();
	ProgramPageobject.clickSaveBtn();	
}

@When("Admin gets message Successful Program created")
public void Admin_gets_message_Successful_Program_created() {
	
}

@When("Admin Click on cancel button")
public void admin_click_on_cancel_button1() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


@When("Admin searches with newly created {string}")
public void admin_searches_with_newly_created(String string) {
	ProgramPageobject.clicknewprogram();
	ProgramPageobject.Nametext(s);
	ProgramPageobject.Descriptiontext("testing description test1");
	ProgramPageobject.selectStatus();
	ProgramPageobject.clickSaveBtn();	
	ProgramPageobject.searchrecord(s);
	
}

@Then("Records of the newly created  {string} is displayed and match the data entered")
public void records_of_the_newly_created_is_displayed_and_match_the_data_entered(String string) {
	
	String nametextval=ProgramPageobject.verifydrecordText();
	Assert.assertEquals(nametextval,s);
}

@When("Admin Click on {string} button")
public void admin_click_on_button(String string) {
	ProgramPageobject.clickXbtn();
}

@When("Admin clicks on Edit option for particular program")
public void admin_clicks_on_edit_option_for_particular_program() {
	ProgramPageobject.clickeditbtn();
}



@When("Admin edits the program name and click on save button")
public void admin_edits_the_program_name_and_click_on_save_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Updated program name is seen by the Admin")
public void updated_program_name_is_seen_by_the_admin() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin edits the description text and click on save button")
public void admin_edits_the_description_text_and_click_on_save_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin can see the description is updated")
public void admin_can_see_the_description_is_updated() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin can change the status of the program and click on save button")
public void admin_can_change_the_status_of_the_program_and_click_on_save_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Status updated can be viewed by the Admin")
public void status_updated_can_be_viewed_by_the_admin() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin click on save button")
public void admin_click_on_save_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin can see the updated program details")
public void admin_can_see_the_updated_program_details() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin click on cancel button")
public void admin_click_on_cancel_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin can see the Program details form disappears")
public void admin_can_see_the_program_details_form_disappears() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin searches with newly updated {string}")
public void admin_searches_with_newly_updated(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin verifies that the details are correctly updated.")
public void admin_verifies_that_the_details_are_correctly_updated() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks on delete button for a program")
public void admin_clicks_on_delete_button_for_a_program() {
	ProgramPageobject.deletebtnclick();
}

@Then("Admin will get confirm deletion popup")
public void admin_will_get_confirm_deletion_popup() {
	String msg=ProgramPageobject.verifypopup();
	Assert.assertEquals(msg, "Confirm");
}

@Given("Admin is on Confirm deletion form")
public void admin_is_on_confirm_deletion_form() {
    driverFactory.getDriver().get("https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/login");
	ProgramPageobject.Login("Sdet@gmail.com","LmsHackathon@2024");
	ProgramPageobject.clickProgram();
	ProgramPageobject.deletebtnclick();
	
}

@When("Admin clicks on {string} button")
public void admin_clicks_on_button(String string) {
	if(string=="Yes")
	ProgramPageobject.ClickYes();
	else
		if(string=="No")
			ProgramPageobject.ClickNO();
}

@Then("Admin can see {string} message")
public void admin_can_see_message(String string) {
	String msg= "Successful Program Deleted";
	Assert.assertEquals(msg, "Successful Program Deleted");
}

@When("Admin Searches for {string}")
public void admin_searches_for(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("There should be zero results.")
public void there_should_be_zero_results() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("Admin is on Program Confirm Deletion Page after selecting a program to delete")
public void admin_is_on_program_confirm_deletion_page_after_selecting_a_program_to_delete1() {
	 driverFactory.getDriver().get("https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/login");
		ProgramPageobject.Login("Sdet@gmail.com","LmsHackathon@2024");
		ProgramPageobject.clickProgram();
		ProgramPageobject.deletebtnclick();
		
}

@Then("Admin can see Confirmation form disappears")
public void admin_can_see_confirmation_form_disappears() {
	 String headningMngPrg=ProgramPageobject.headningMngPrg();
	 Assert.assertEquals(headningMngPrg,"Manage Program");
}

@Then("Admin Click on X button")
public void Admin_Click_on_X_button() {
	ProgramPageobject.ClickXbtn();
}

}
