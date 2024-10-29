package stepDefinition;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import factory.driverFactory;
import io.cucumber.java.en.*;
import pageObjectModel.ProgramPage;
import utilities.ConfigReader;
import utilities.LoggerLoad;
import utilities.excelReader;

public class ProgramSteps {

	ProgramPage  ProgramPageobject=new  ProgramPage (driverFactory.getDriver());
	String s = RandomStringUtils.randomAlphabetic(8);
	
@Given("Admin is on dashboard page after Login SM")
public void admin_is_on_dashboard_page_after_login1() throws InterruptedException {
		
    driverFactory.getDriver().get("https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/login");
	ProgramPageobject.Login("Sdet@gmail.com","LmsHackathon@2024");
}

@When("Admin clicks Program on the navigation bar SM")
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

@When("Admin Click on {string} button SM")
public void admin_click_on_button1(String string) {
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

@When("Admin clicks on {string} button SM")
public void admin_clicks_on_button1(String string) {
	if(string=="Yes")
	ProgramPageobject.ClickYes();
	else
		if(string=="No")
			ProgramPageobject.ClickNO();
}

@Then("Admin can see {string} message SM")
public void admin_can_see_message1(String string) {
	String msg= "Successful Program Deleted";
	Assert.assertEquals(msg, "Successful Program Deleted");
}

//@When("Admin Searches for {string}")
//public void admin_searches_for1(String string) {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}

@Then("There should be zero results.")
public void there_should_be_zero_results11() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("Admin is on Program Confirm Deletion Page after selecting a program to deleteSM")
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

//Kowsika

ProgramPage Program = new  ProgramPage(driverFactory.getDriver());


@Given("Admin gives the correct LMS portal URLKPD")
public void admin_gives_the_correct_lms_portal_urlkpd() {
    
driverFactory.getDriver().get("https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/login");
	
}

@When("Admin is on login pageKPD")
public void admin_is_on_login_page_kpd() {

	System.out.println("login page");
    LoggerLoad.info("...Admin is on page....");
}

@When("Admin enters credentials and clicks login pageKPD")
public void admin_enters_credentials_and_clicks_login_page_kpd() {

	Program.Login("Sdet@gmail.com","LmsHackathon@2024");
}

@Then("Admin is on program module after reaching dashboard")
public void admin_is_on_program_module_after_reaching_dashboard() {
	
	
	Program.Programmodule();

	
	System.out.println("Program Module clicked");
	LoggerLoad.info("... Program Module clicked...");
    
}

@Given("Admin is on Program moduleKP")
public void admin_is_on_program_module_kp() {
	
	System.out.println("Program Module");
    LoggerLoad.info("....Program Module....");
}

@When("Admin selects more than one program by clicking on the checkbox")
public void admin_selects_more_than_one_program_by_clicking_on_the_checkbox() {
   
	Program.Checkbox();
	System.out.println("Checkbox is clicked");
	LoggerLoad.info("....Checkbox is clicked....");
}

@Then("Programs get selected")
public void programs_get_selected() {
	
	System.out.println("Programs selectec");
	LoggerLoad.info("...Programs selected...");
   
	
}

@Given("Admin is on Program moduleKP1")
public void admin_is_on_program_module_kp1() {
	

	Program.Programmodule();
	System.out.println("Admin is on Program Module");
	LoggerLoad.info("...Program Module...");
}

@When("Admin clicks on the delete button on the left top of the program page")
public void admin_clicks_on_the_delete_button_on_the_left_top_of_the_program_page() {
     
	Program.deletebutton();
}

@Then("Admin lands on Confirmation form")
public void admin_lands_on_confirmation_form() {
	
	System.out.println("Confirmation form");
	LoggerLoad.info("...Conformation form...");
    
}

@Given("Admin is on Confirmation form")
public void admin_is_on_confirmation_form() {
	
	Program.conformbox();
    
	
}

@When("Admin clicks on {string} button")
public void admin_clicks_on_button(String string) {
    
	Program.button();
	
	
}

@Then("Admin can see {string} message")
public void admin_can_see_message(String string) {
    
	Program.mess();
	
  System.out.println("Successfully deleted message");
  LoggerLoad.info("...Successfully deleted...");
}


@Given("Admin is on Program moduleKP3")
public void admin_is_on_program_module_kp3() {
	
	
	Program.Programmodule();
	
	System.out.println("Program Modeule");
	LoggerLoad.info("..Program Module..");
}

@When("Admin Searches for {string}")
public void admin_searches_for(String string) throws Exception {
	
//	excelReader reader = new excelReader();	
//	@SuppressWarnings("static-access")
//	List<Map<String, String>>  testdata = reader.getData("./src/test/resources/Team_12_data_sheet.xlsx","Sheet1");
//	String Test = testdata.get(4).get("Name");
//	
//	Program.searchbar(Test);
     
	Program.searchbar();
	
	System.out.println("Searching program");
	LoggerLoad.info("...Searching program...");
}

@Then("There should be zero results")
public void there_should_be_zero_results() {
    
	Program.zeroresults();
	
	System.out.println("Zero deleted names");
	LoggerLoad.info("...No display deleted name...");
}

@Then("Admin can see Programs are still selected and not deleted")
public void admin_can_see_programs_are_still_selected_and_not_deleted() {
	
	Program.Checkbox();
	Program.deletebutton(); 
	
	
}

@Given("Admin is on Program Confirm Deletion Page after selecting a program to delete")
public void admin_is_on_program_confirm_deletion_page_after_selecting_a_program_to_delete() {
    
	Program.conformbox();
}

@When("Admin Click on {string} button")
public void admin_click_on_button(String string) {
   
	Program.Nodelete();
	
}

@Then("Admin can see Confirm Deletion form disappear")
public void admin_can_see_confirm_deletion_form_disappear() {
    
	Program.deletion();
}

// Search Bar

@Given("Admin is on Program moduleKPSB")
public void admin_is_on_program_module_kpsb() {
	
	
	//Program.Programmodule();
	
	Program.click();
	
	System.out.println("Admin is on Programe Module");
	LoggerLoad.info("..Program Module...");
}

@When("Admin enter the program to search By program name")
public void admin_enter_the_program_to_search_by_program_name() throws Exception {
	
	/*excelReader reader = new excelReader();	
	@SuppressWarnings("static-access")
	List<Map<String, String>>  testdata = reader.getData("./src/test/resources/team_12_data_sheet.xlsx","Sheet1");
	String Test0 = testdata.get(0).get("Name");
    
	Program.searchname(Test0);*/
	
	Program.searchname();
	
	System.out.println("Searching name");
	LoggerLoad.info("...Searching Name..");
	
}

@Then("Admin should able to see Program name, description, and status for searched program name")
public void admin_should_able_to_see_program_name_description_and_status_for_searched_program_name() {
    
	
	Program.zeroresults();
	
	System.out.println("Program name box");
	LoggerLoad.info("...Program name box...");
      
}

@Given("Admin is on Program moduleKPSB2")
public void admin_is_on_program_module_kpsb2() {
    

	Program.Programmodule();
	
	System.out.println("Program module");
	LoggerLoad.info("...Program Module...");
}

@When("Admin enter the program to search By program description")
public void admin_enter_the_program_to_search_by_program_description() throws Exception {
	
	//excelReader reader = new excelReader();	
	//@SuppressWarnings("static-access")
	//List<Map<String, String>>  testdata = reader.getData("./src/test/resources/team_12_data_sheet.xlsx","Sheet1");
//	String Test1 = testdata.get(1).get("Name");
    
	//Program.searchpro(Test1);
	
	Program.searchpro();
	
	System.out.println("Program searching");
	LoggerLoad.info("...Searching Program...");
}

@Then("Admin should able to see Program name, description, and status for searched program description")
public void admin_should_able_to_see_program_name_description_and_status_for_searched_program_description() {
    
        Program.zeroresults();
	
	System.out.println("See Program name,status,description");
	LoggerLoad.info("...See Program staus,description, name");
	
}

@Given("Admin is on Program moduleKPSB3")
public void admin_is_on_program_module_kpsb3() {
	
	
	
	Program.Programmodule();
	
	System.out.println("Program module");
	LoggerLoad.info("...Program Module...");
    
}

@When("Admin enter the program to search By program name that does not exist")
public void admin_enter_the_program_to_search_by_program_name_that_does_not_exist() throws Exception {
	
//	excelReader reader = new excelReader();	
//	@SuppressWarnings("static-access")
//	List<Map<String, String>>  testdata = reader.getData("./src/test/resources/team_12_data_sheet.xlsx","Sheet1");
//	String Test2 = testdata.get(2).get("Name");
//    
//	Program.byprogramname(Test2);
//	
	Program.byprogramname();
	System.out.println("Search Program name");
	LoggerLoad.info("...Search program Name");
}

@Then("There should be zero results1")
public void there_should_be_zero_results1() {
    
	Program.zeroresults();
	
	System.out.println("Program not exist");
	LoggerLoad.info("..Program not exist..");
}

@Given("Admin is on Program moduleKPSB4")
public void admin_is_on_program_module_kpsb4() {
	
	
	Program.Programmodule();
	
	System.out.println("Program module");
	LoggerLoad.info("...Program Module...");
    
}

@When("Admin enter the program to search By partial name of program")
public void admin_enter_the_program_to_search_by_partial_name_of_program() throws Exception {
	
//	excelReader reader = new excelReader();	
//	@SuppressWarnings("static-access")
//	List<Map<String, String>>  testdata = reader.getData("./src/test/resources/team_12_data_sheet.xlsx","Sheet1");
//	String Test3 = testdata.get(3).get("Name");
//    
//	Program.partialname(Test3);
	
	Program.partialname();
	
	System.out.println("Enter partial name");
	LoggerLoad.info("...Enter Partial name...");
}

@Then("Admin should able to see Program name, description, and status for searched program name11")
public void admin_should_able_to_see_program_name_description_and_status_for_searched_program_name11() {

    
	Program.zeroresults();
}

//Sorting

@Given("Admin is on Program moduleKPSP")
public void admin_is_on_program_module_kpsp() {
	

	Program.Programmodule();
	
	System.out.println("Program module");
	LoggerLoad.info("...Program Module...");
    
}

@When("Admin clicks on Arrow next to program Name")
public void admin_clicks_on_arrow_next_to_program_name() {
	
	Program.sortprogramname();
	System.out.println("Program ascending/descending order click");
	LoggerLoad.info("...Program ascending/descending order...");
   
}

@Then("Admin See the Program Name is sorted in Ascending order\\/Descending orderKPSP")
public void admin_see_the_program_name_is_sorted_in_ascending_order_descending_order_kpsp() {
	
	System.out.println("Program ascending/descending order click");
	LoggerLoad.info("...Program ascending/descending order...");
    
}

@Given("Admin is on Program moduleKPSP2")
public void admin_is_on_program_module_kpsp2() {
	
	
	Program.Programmodule();
	System.out.println("Program module");
	LoggerLoad.info("...Program Module...");
}

@When("Admin clicks on Arrow next to Program DescriptionKPSP2")
public void admin_clicks_on_arrow_next_to_program_description_kpsp2() {
	
	    Program.sortpogdescription();
	   
	   System.out.println("Program Description in asc/desc order ");
	   LoggerLoad.info("...Program Description in asc/desc order...");
    
}

@Then("Admin See the program Description is sorted in Ascending order\\/Descending orderKPSP2")
public void admin_see_the_program_description_is_sorted_in_ascending_order_descending_order_kpsp2() {
	
	System.out.println("Program Description in asc/desc order ");
	   LoggerLoad.info("...Program Description in asc/desc order...");
}

@Given("Admin is on Program moduleKPSP3")
public void admin_is_on_program_module_kpsp3() {
	
	
	Program.Programmodule();
	
	System.out.println("Program module");
	LoggerLoad.info("...Program Module...");
}

@When("Admin clicks on Arrow next to Program status")
public void admin_clicks_on_arrow_next_to_program_status() {
   Program.sortporstatus();
   
   System.out.println("Program status in asc/desc order ");
   LoggerLoad.info("...Program status in asc/desc order...");
}

@Then("Use See the Program Status is sorted in Ascending order\\/Descending orderKPSP3")
public void use_see_the_program_status_is_sorted_in_ascending_order_descending_order_kpsp3() {
    
	  System.out.println("Program status in asc/desc order ");
	   LoggerLoad.info("...Program status in asc/desc order...");
}

//Pagination

@Given("Admin is on Program moduleKPPP")
public void admin_is_on_program_module_kppp() {
	

	Program.Programmodule();
	
	System.out.println("Admin is on Programe Module");
	LoggerLoad.info("..Program Module...");
    
}

@When("Admin clicks Next page link on the program table")
public void admin_clicks_next_page_link_on_the_program_table() {
  
	boolean pagerright = Program.pageright();
    Assert.assertTrue(pagerright);
    
	//Program.pageright();
	
}

@Then("Admin should see the Pagination has {string} active link")
public void admin_should_see_the_pagination_has_active_link(String string) {
    
	System.out.println(" Next Page ");
	LoggerLoad.info("...Next page...");
}


@When("Admin clicks Last page link")
public void admin_clicks_last_page_link() {
	
	 boolean pgaedoubleclick = Program.pgaedoubleclick();
	    Assert.assertTrue(pgaedoubleclick);
   
	 //Program.pgaedoubleclick();
	 
}

@Then("Admin should see the last page record on the table with Next page link are disabled")
public void admin_should_see_the_last_page_record_on_the_table_with_next_page_link_are_disabled() {
  
	System.out.println("Last page");
   LoggerLoad.info("....Last Page...");
}

@Given("Admin is on last page of Program module table")
public void admin_is_on_last_page_of_program_module_table() {
   
	System.out.println("Last of Programe Module");
	LoggerLoad.info("..Last Page of Programe Module..");
	
}

@When("Admin clicks Previous page link")
public void admin_clicks_previous_page_link() {
	
	boolean pageleft = Program.pageleft();
    Assert.assertTrue(pageleft);
    
	//Program.pageleft();
    
	 System.out.println("Previous page");
	 LoggerLoad.info("....Previous page...");
}

@Then("Admin should see the previous page record on the table with pagination has previous page link")
public void admin_should_see_the_previous_page_record_on_the_table_with_pagination_has_previous_page_link() {
    
	System.out.println("Record of Previous Page...");
	LoggerLoad.info("...Record of Previous Page...");
	
}

@Given("Admin is on Previous Program page")
public void admin_is_on_previous_program_page() {
    
	System.out.println("Previous PAge");
	LoggerLoad.info(".. Previous Page...");
}

@When("Admin clicks First page link")
public void admin_clicks_first_page_link() {
	
	 boolean pagedoubleleft = Program.pagedoubleleft();
	    Assert.assertTrue(pagedoubleleft);
    
	//Program.pagedoubleleft();
	
}

@Then("Admin should see the very first page record on the table with Previous page link are disabled")
public void admin_should_see_the_very_first_page_record_on_the_table_with_previous_page_link_are_disabled() {
   
	Program.pagedisbled();
	
	System.out.println("page disabled");
	LoggerLoad.info("...Page disabled...");
}

@Given("Admin is on dashboard page after Login")
public void admin_is_on_dashboard_page_after_login() {
    
    Program.Programmodule();
    
	System.out.println("Program module");
	LoggerLoad.info("...Program Module...");
}

@When("Admin clicks {string} on the navigation barKPP")
public void admin_clicks_on_the_navigation_bar_kpp(String string) {
    
	Program.navigationbar();
	
	System.out.println("Navigation bar");
	LoggerLoad.info("...Navigation bar...");
}

@Then("Admin should not see any pagination icons and message {string}")
public void admin_should_not_see_any_pagination_icons_and_message(String string) {
    
	System.out.println(" Pagination icons records not found");
	LoggerLoad.info("...pagination Records Not found...");
}

@When("Admin clicks {string} on the navigation bar")
public void admin_clicks_on_the_navigation_bar(String string) {
    
    Program.navigationbar();
	
	System.out.println("Navigation bar");
	LoggerLoad.info("...Navigation bar...");
}

@Then("Admin should see pagination icons disabled")
public void admin_should_see_pagination_icons_disabled() {
    
	System.out.println("pagination disabled");
	LoggerLoad.info("... PAgination disabled...");
}

}
