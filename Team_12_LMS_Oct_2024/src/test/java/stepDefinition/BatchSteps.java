package stepDefinition;

import java.util.Properties;

import org.openqa.selenium.Alert;
import org.testng.Assert;

import factory.driverFactory;
import io.cucumber.java.en.*;
import pageObjectModel.BatchPage;
import utilities.ConfigReader;

public class BatchSteps {
	BatchPage batchpageobject=new BatchPage(driverFactory.getDriver());
	ConfigReader config=new ConfigReader();

	@Given("Admin successfully Logged on to the LMS Portal and Admin is on the Dashboard Page")
	public void admin_successfully_logged_on_to_the_lms_portal_and_admin_is_on_the_dashboard_page() throws InterruptedException {

		BatchPage batchpageobject=new BatchPage(driverFactory.getDriver());
		driverFactory.getDriver().get("https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/login");
		batchpageobject.Login("Sdet@gmail.com","LmsHackathon@2024");
		//	Thread.sleep(2000);
		//	Boolean actual=batchpageobject.check_landingPage();
		//	Assert.assertEquals(true,actual);
		//	
	}

	@When("Admin Clicks on the Batch menu from the header")
	public void admin_clicks_on_the_batch_menu_from_the_header() {
		BatchPage batchpageobject=new BatchPage(driverFactory.getDriver());
		batchpageobject.click_BatchTab();
	}

	@Then("Admin should be in the Manage Batch Page")
	public void admin_should_be_in_the_manage_batch_page() {
		BatchPage batchpageobject=new BatchPage(driverFactory.getDriver());
		boolean actual=batchpageobject.check_batchPage();
		Assert.assertEquals(actual, true);
	}

	@Then("Admin should see the LMS-LearningManagementSystem Title")
	public void admin_should_see_the_lms_learning_management_system_title() {
		BatchPage batchpageobject=new BatchPage(driverFactory.getDriver());
		boolean actual=batchpageobject.isVisible_LMSTitle();
		Assert.assertEquals(actual, true);

	}

	@Then("Admin should see the Manage Batch Heading")
	public void admin_should_see_the_manage_batch_heading(){
		BatchPage batchpageobject=new BatchPage(driverFactory.getDriver());
		boolean actual=batchpageobject.isVisible_manageBatchHeading();
		Assert.assertEquals(actual, true);

	}

	@Then("Admin should see the disabled Delete Icon under the header")
	public void admin_should_see_the_disabled_delete_icon_under_the_header() {
		BatchPage batchpageobject=new BatchPage(driverFactory.getDriver());
		boolean actual=batchpageobject.isVisible_deleteIcon();
		Assert.assertEquals(actual, true);
	}

	@Then("Admin should see the enabled pagination controls under the datatable")
	public void admin_should_see_the_enabled_pagination_controls_under_the_datatable() {
		BatchPage batchpageobject=new BatchPage(driverFactory.getDriver());
		boolean actual=batchpageobject.isVisible_pagination();
		Assert.assertEquals(actual, true);
	}

	@Then("Admin should see the edit icon in each row")
	public void admin_should_see_the_edit_icon_in_each_row() {
		BatchPage batchpageobject=new BatchPage(driverFactory.getDriver());
		boolean actual=batchpageobject.check_editIcon();
		Assert.assertEquals(actual, true);
	}

	@Then("Admin should see the delete icon in each row")
	public void admin_should_see_the_delete_icon_in_each_row() {
		BatchPage batchpageobject=new BatchPage(driverFactory.getDriver());
		boolean actual=batchpageobject.check_deleteIcon();
		Assert.assertEquals(actual, true);
	}

	@Then("Admin should the checkbox in each row")
	public void admin_should_the_checkbox_in_each_row() {
		BatchPage batchpageobject=new BatchPage(driverFactory.getDriver());
		boolean actual=batchpageobject.check_checkboxIcon();
		Assert.assertEquals(actual, true);
	}

	@Then("Admin should see the datatable headers Batch name, Batch Description,Batch Status, No Of classes, Program Name, Edit\\/Delete")
	public void admin_should_see_the_datatable_headers_batch_name_batch_description_batch_status_no_of_classes_program_name_edit_delete() {
		BatchPage batchpageobject=new BatchPage(driverFactory.getDriver());
		batchpageobject.check_tableheaders();
	}

	@Then("Admin should see the checkbox in the datatable header row")
	public void admin_should_see_the_checkbox_in_the_datatable_header_row() {
		BatchPage batchpageobject=new BatchPage(driverFactory.getDriver());
		boolean actual=batchpageobject.check_checkboxInHeader();
		Assert.assertEquals(actual, true);
	}

	@Then("Admin should see the sort icon next to all Datatable headers")
	public void admin_should_see_the_sort_icon_next_to_all_datatable_headers() {
		BatchPage batchpageobject=new BatchPage(driverFactory.getDriver());
		boolean actual=batchpageobject.check_sortIconsInTableHeader();
		Assert.assertEquals(actual, true);
	}

	@Given("Admin is on batch page")
	public void admin_is_on_batch_page() {
		BatchPage batchpageobject=new BatchPage(driverFactory.getDriver());
		driverFactory.getDriver().get("https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/login");
		batchpageobject.Login("Sdet@gmail.com","LmsHackathon@2024");
		//batchpageobject.click_BatchTab();

	}

	@When("Admin clicks Batch on the navigation bar")
	public void admin_clicks_batch_on_the_navigation_bar() throws InterruptedException {
		BatchPage batchpageobject=new BatchPage(driverFactory.getDriver());
		batchpageobject.click_BatchTab();
		Thread.sleep(2000);
	}

	@Then("Admin should see sub menu in menu bar as Add New Batch")
	public void admin_should_see_sub_menu_in_menu_bar_as_add_new_batch() {
		BatchPage batchpageobject=new BatchPage(driverFactory.getDriver());
		batchpageobject.check_addNewBatch();
	}

	@Given("Admin is on the Dashboard page")
	public void admin_is_on_the_dashboard_page() {
		BatchPage batchpageobject=new BatchPage(driverFactory.getDriver());
		driverFactory.getDriver().get("https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/login");
		batchpageobject.Login("Sdet@gmail.com","LmsHackathon@2024");
	}

	@When("Admin clicks on {string} under the {string} menu bar")
	public void admin_clicks_on_under_the_menu_bar(String string, String string2) throws InterruptedException {
		BatchPage batchpageobject=new BatchPage(driverFactory.getDriver());
		batchpageobject.click_BatchTab();
		Thread.sleep(2000);
		batchpageobject.click_addNewBatch();
		
	}

	@Then("Admin should see the Batch Details pop up window")
	public void admin_should_see_the_batch_details_pop_up_window() {
		//BatchPage batchpageobject=new BatchPage(driverFactory.getDriver());
//		batchpageobject.click_addNewBatch();
		driverFactory.getDriver().switchTo().activeElement();
		boolean actual=batchpageobject.check_batchPopupWindow();
		Assert.assertEquals(actual, true);

	}
	@Given("Admin is on the Batch Details Pop Up WIndow")
	public void admin_is_on_the_batch_details_pop_up_window() {


	}

	@When("Admin checks all the fields are enabled")
	public void admin_checks_all_the_fields_are_enabled() {
		batchpageobject.click_BatchTab();
		batchpageobject.click_addNewBatch();
		driverFactory.getDriver().switchTo().activeElement();
	}

	@Then("The pop up should include the fields Batch Name,Number of classes and Description as text box, Program Name as drop down, Status as radio button")
	public void the_pop_up_should_include_the_fields_batch_name_number_of_classes_and_description_as_text_box_program_name_as_drop_down_status_as_radio_button() {
		batchpageobject.check_FieldsInpopUp();
	}

	@When("Admin selects program name present in the dropdown")
	public void admin_selects_program_name_present_in_the_dropdown() {
		batchpageobject.click_BatchTab();
		batchpageobject.click_addNewBatch();
		driverFactory.getDriver().switchTo().activeElement();

	}

	@Then("Admin should see selected program name in the batch name prefix box")
	public void admin_should_see_selected_program_name_in_the_batch_name_prefix_box() throws InterruptedException {
		boolean actual=batchpageobject.check_batchPrefixBox();
		Assert.assertEquals(actual, true);
	}

	@When("Admin enters alphabets in batch name prefix box")
	public void admin_enters_alphabets_in_batch_name_prefix_box() {
		batchpageobject.click_BatchTab();
		batchpageobject.click_addNewBatch();
		driverFactory.getDriver().switchTo().activeElement();
		batchpageobject.input_prefixbox();

	}

	@Then("Admin should see empty text box")
	public void admin_should_see_empty_text_box() {
		boolean actual=batchpageobject.check_emptyPrefixBox();
		Assert.assertEquals(actual, true);
	}

	@When("Admin enters the data only to the mandatory fields and clicks save button")
	public void admin_enters_the_data_only_to_the_mandatory_fields_and_clicks_save_button() throws InterruptedException {
		batchpageobject.click_BatchTab();
		batchpageobject.click_addNewBatch();
		driverFactory.getDriver().switchTo().activeElement();
		batchpageobject.create_NewBatch();   
	}

	@Then("Admin should get a successful message")
	public void admin_should_get_a_successful_message() {
		batchpageobject.get_successMessage();
	}

	@When("Admin leaves blank one of the mandatory fields")
	public void admin_leaves_blank_one_of_the_mandatory_fields() {

		batchpageobject.click_BatchTab();
		batchpageobject.click_addNewBatch();
		driverFactory.getDriver().switchTo().activeElement();
		batchpageobject.create_NewBatchMissingMandatoryField();   

	}

	@Then("Admin should get a error message on the respective mandatoryfield")
	public void admin_should_get_a_error_message_on_the_respective_mandatoryfield() {
		batchpageobject.get_errorMessage();
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
		batchpageobject.click_BatchTab();
		batchpageobject.click_addNewBatch();
		driverFactory.getDriver().switchTo().activeElement();
		batchpageobject.create_NewBatch();
		batchpageobject.click_popUPCancelBtn();

	}

	@Then("Admin can see the batch details popup closes without creating any batch")
	public void admin_can_see_the_batch_details_popup_closes_without_creating_any_batch() {
		boolean actual=batchpageobject.check_batchPopupWindow();
		Assert.assertEquals(actual, false);

	}

	@When("Admin clicks on the close icon")
	public void admin_clicks_on_the_close_icon() {
		batchpageobject.click_BatchTab();
		batchpageobject.click_addNewBatch();
		driverFactory.getDriver().switchTo().activeElement();
		batchpageobject.click_popUpCloseIcon();	
	}

	@Then("batch details pop up closes")
	public void batch_details_pop_up_closes() {
		boolean actual=batchpageobject.check_popUpisClosed();
		Assert.assertEquals(actual, false);
	}

	//	@Given("Admin is on the Batch page")
	//	public void admin_is_on_the_batch_page() {
	//	    // Write code here that turns the phrase above into concrete actions
	//	    throw new io.cucumber.java.PendingException();
	//	}

	@When("Admin clicks the edit icon")
	public void admin_clicks_the_edit_icon() {
	
	batchpageobject.click_BatchTab();
	batchpageobject.click_overlay();
	batchpageobject.click_editIcon();
	}

	//	@Then("Admin should see the Batch details pop up window")
	//	public void admin_should_see_the_batch_details_pop_up_window() {
	//	    // Write code here that turns the phrase above into concrete actions
	//	    throw new io.cucumber.java.PendingException();
	//	}

	@Then("Admin should see Program name value field is disabled for editing")
	public void admin_should_see_program_name_value_field_is_disabled_for_editing() {
		driverFactory.getDriver().switchTo().activeElement();
		boolean actual=batchpageobject.check_programNameIsReadOnlyInEditFeature();
		Assert.assertEquals(actual, true);
	}

	@Then("Admin should see batch name value field is disabled for editing")
	public void admin_should_see_batch_name_value_field_is_disabled_for_editing() {
		driverFactory.getDriver().switchTo().activeElement();
		boolean actual=batchpageobject.check_batchNameIsReadOnlyInEditFeature();
		Assert.assertEquals(actual, true);

	}

	@Given("Admin is on the Batch Details Page")
	public void admin_is_on_the_batch_details_page() {
	batchpageobject.click_BatchTab();
	batchpageobject.click_overlay();
	batchpageobject.click_editIcon();
	driverFactory.getDriver().switchTo().activeElement();
	
	}

	@When("Admin Updates any fields with invalid data and click save button")
	public void admin_updates_any_fields_with_invalid_data_and_click_save_button() {
		
		batchpageobject.validate_batchDescriptionInEditFeaturewithInvalidData();
		
	}

	@Then("Admin should get a error message under the respective field")
	public void admin_should_get_a_error_message_under_the_respective_field() {
		boolean actual=batchpageobject.check_batchDescriptionErrorMsg();
		Assert.assertEquals(actual,true);
			
	}
	
	@When("Admin enters the valid data to all the mandatory fields in editbatchpopup and click save button")
	public void admin_enters_the_valid_data_to_all_the_mandatory_fields_in_editbatchpopup_and_click_save_button() {
	   
	batchpageobject.input_validEditData();
	
	}

	@Then("Admin should get a succesesful message for editing the batch")
	public void admin_should_get_a_succesesful_message_for_editing_the_batch() {
	boolean actual=batchpageobject.check_EditSuccessMessage();	
	Assert.assertEquals(actual, true);
	}
	
	@When("Admin enters the valid data to all the mandatory fields in editbatchpopup and click cancel button")
	public void admin_enters_the_valid_data_to_all_the_mandatory_fields_in_editbatchpopup_and_click_cancel_button() {
	batchpageobject.click_EditCancelButton();
	}

	@Then("Admin can see the batch details popup closes without editing the batch")
	public void admin_can_see_the_batch_details_popup_closes_without_editing_the_batch() {
	boolean actual=batchpageobject.check_EditCancelButton();
	Assert.assertEquals(actual, false);
	}

	@When("Admin clicks the delete Icon on any row")
	public void admin_clicks_the_delete_icon_on_any_row() {
		batchpageobject.click_BatchTab();
		batchpageobject.click_overlay();
	batchpageobject.click_BatchDeleteButton();	
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

//	@Given("Admin is on the batch page")
//	public void admin_is_on_the_batch_page() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}

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
		throw new io.cucumber.java.PendingException();
	}
}
