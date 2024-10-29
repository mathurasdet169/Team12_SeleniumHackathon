package stepDefinition;

import java.util.Properties;

import factory.driverFactory;
import io.cucumber.java.en.*;
import pageObjectModel.BatchPage;
import utilities.ConfigReader;

public class BatchSteps {
	
	@Given("Admin successfully Logged on to the LMS Portal and Admin is on the Dashboard Page")
	public void admin_successfully_logged_on_to_the_lms_portal_and_admin_is_on_the_dashboard_page() throws InterruptedException {
//		 Config = new ConfigReader();
//         Properties prop  = Config.init_prop();
// 		init_driver(prop.getProperty("browser"));
// 	}
		
		BatchPage batchpageobject=new BatchPage(driverFactory.getDriver());
	driverFactory.getDriver().get("https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/login");
	
	//Thread.sleep(2000);
	batchpageobject.Login("Sdet@gmail.com","LmsHackathon@2024");
	
	
	}

	@When("Admin Clicks on the Batch menu from the header")
	public void admin_clicks_on_the_batch_menu_from_the_header() {
	System.out.println("iam from when");   
	}

	@Then("Admin should be in the Manage Batch Page")
	public void admin_should_be_in_the_manage_batch_page() {
		System.out.println("iam from then");
		}

	@Then("Admin should see the {string} Title")
	public void admin_should_see_the_title(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the {string} Heading")
	public void admin_should_see_the_heading(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the disabled {string} under the header")
	public void admin_should_see_the_disabled_under_the_header(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the enabled pagination controls under the datatable")
	public void admin_should_see_the_enabled_pagination_controls_under_the_datatable() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the edit icon in each row")
	public void admin_should_see_the_edit_icon_in_each_row() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the delete icon in each row")
	public void admin_should_see_the_delete_icon_in_each_row() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should the checkbox in each row")
	public void admin_should_the_checkbox_in_each_row() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the datatable headers Batch name, Batch Description,Batch Status, No Of classes, Program Name, Edit\\/Delete")
	public void admin_should_see_the_datatable_headers_batch_name_batch_description_batch_status_no_of_classes_program_name_edit_delete() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the checkbox in the datatable header row")
	public void admin_should_see_the_checkbox_in_the_datatable_header_row() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the sort icon next to all Datatable headers")
	public void admin_should_see_the_sort_icon_next_to_all_datatable_headers() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin is on batch page")
	public void admin_is_on_batch_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks Batch on the navigation bar")
	public void admin_clicks_batch_on_the_navigation_bar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see sub menu in menu bar as Add New Batch")
	public void admin_should_see_sub_menu_in_menu_bar_as_add_new_batch() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin is on the Dashboard page")
	public void admin_is_on_the_dashboard_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks on {string} under the {string} menu bar")
	public void admin_clicks_on_under_the_menu_bar(String string, String string2) {
		//batchpageobject.clicknewprogram();
	}

//	@Then("Admin should see the Batch Details pop up window")
//	public void admin_should_see_the_batch_details_pop_up_window() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@Given("Admin is on the Batch Details Pop Up WIndow")
	public void admin_is_on_the_batch_details_pop_up_w_indow() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin checks all the fields are enabled")
	public void admin_checks_all_the_fields_are_enabled() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The pop up should include the fields Batch Name,Number of classes and Description as text box, Program Name as drop down Status as radio button")
	public void the_pop_up_should_include_the_fields_batch_name_number_of_classes_and_description_as_text_box_program_name_as_drop_down_status_as_radio_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin selects program name present in the dropdown")
	public void admin_selects_program_name_present_in_the_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see selected program name in the batch name prefix box")
	public void admin_should_see_selected_program_name_in_the_batch_name_prefix_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters alphabets in batch name prefix box")
	public void admin_enters_alphabets_in_batch_name_prefix_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see empty text box")
	public void admin_should_see_empty_text_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters the data only to the mandatory fiields and clicks save button")
	public void admin_enters_the_data_only_to_the_mandatory_fiields_and_clicks_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should get a successful message")
	public void admin_should_get_a_successful_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin leaves blank one of the mandatory fields")
	public void admin_leaves_blank_one_of_the_mandatory_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should get a error message on the respective mandatoryfield")
	public void admin_should_get_a_error_message_on_the_respective_mandatoryfield() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters the valid data to all the mandatory fields and click save button")
	public void admin_enters_the_valid_data_to_all_the_mandatory_fields_and_click_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should get a succesesful message")
	public void admin_should_get_a_succesesful_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters the valid data to all the mandatory fields and click cancel button")
	public void admin_enters_the_valid_data_to_all_the_mandatory_fields_and_click_cancel_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin can see the batch details popup closes without creating any batch")
	public void admin_can_see_the_batch_details_popup_closes_without_creating_any_batch() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks on the close icon")
	public void admin_clicks_on_the_close_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("batch details pop up closes")
	public void batch_details_pop_up_closes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

//	@Given("Admin is on the Batch page")
//	public void admin_is_on_the_batch_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@When("Admin clicks the edit icon")
	public void admin_clicks_the_edit_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the Batch details pop up window")
	public void admin_should_see_the_batch_details_pop_up_window() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see Program name value field is disabled for editing")
	public void admin_should_see_program_name_value_field_is_disabled_for_editing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see batch name value field is disabled for editing")
	public void admin_should_see_batch_name_value_field_is_disabled_for_editing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin is on the Batch Details Page")
	public void admin_is_on_the_batch_details_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin Updates any fields with invalid data and click save button")
	public void admin_updates_any_fields_with_invalid_data_and_click_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should get a error message under the respective field")
	public void admin_should_get_a_error_message_under_the_respective_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should get a succesesful message for editing the batch")
	public void admin_should_get_a_succesesful_message_for_editing_the_batch() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin can see the batch details popup closes without editing the batch")
	public void admin_can_see_the_batch_details_popup_closes_without_editing_the_batch() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks the delete Icon on any row")
	public void admin_clicks_the_delete_icon_on_any_row() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the confirm alert box with yes and no button")
	public void admin_should_see_the_confirm_alert_box_with_yes_and_no_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin is on the batch confirm popup page")
	public void admin_is_on_the_batch_confirm_popup_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks on the delete icon and click yes buttton")
	public void admin_clicks_on_the_delete_icon_and_click_yes_buttton() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the successfull message and the batch should be deleted")
	public void admin_should_see_the_successfull_message_and_the_batch_should_be_deleted() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks on the delete icon and click no buttton")
	public void admin_clicks_on_the_delete_icon_and_click_no_buttton() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the alert box closed and the batch is not deleted")
	public void admin_should_see_the_alert_box_closed_and_the_batch_is_not_deleted() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the alert box closed")
	public void admin_should_see_the_alert_box_closed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin is on the batch page")
	public void admin_is_on_the_batch_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks on the delete icon under the Manage batch header")
	public void admin_clicks_on_the_delete_icon_under_the_manage_batch_header() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The respective row in the table should be deleted")
	public void the_respective_row_in_the_table_should_be_deleted() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks next page link on the data table")
	public void admin_clicks_next_page_link_on_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the Next enabled link")
	public void admin_should_see_the_next_enabled_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks last page link on the data table")
	public void admin_clicks_last_page_link_on_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the last page link with next page link disabled on the table")
	public void admin_should_see_the_last_page_link_with_next_page_link_disabled_on_the_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks backward page link on the data table")
	public void admin_clicks_backward_page_link_on_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the previous page on the table")
	public void admin_should_see_the_previous_page_on_the_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks first page link on the data table")
	public void admin_clicks_first_page_link_on_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the very first page on the data table")
	public void admin_should_see_the_very_first_page_on_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters the batch name in the serach text box")
	public void admin_enters_the_batch_name_in_the_serach_text_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the filtered batches in the data table")
	public void admin_should_see_the_filtered_batches_in_the_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks on the logout button")
	public void admin_clicks_on_the_logout_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see the Login screen Page")
	public void admin_should_see_the_login_screen_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();}
	    
	 
}
