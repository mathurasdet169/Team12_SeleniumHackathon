package stepDefinition;

import org.junit.Assert;

import factory.driverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjectModel.BatchPage;
import pageObjectModel.ClassPage;
import utilities.ConfigReader;

public class ClassSteps {
	
    ClassPage classpage=new ClassPage(driverFactory.getDriver());
    
	//verify ui 
	@Given("Userhb is in Dashboard page")
	public void userhb_is_in_dashboard_page() throws InterruptedException {
		driverFactory.getDriver().get("https://lms-frontend-hackathon-oct24-173fe394c071.herokuapp.com/login");

		Thread.sleep(2000);
		classpage.Login("Sdet@gmail.com","LmsHackathon@2024");
		Thread.sleep(2000);
		Assert.assertEquals(classpage.check_landingPage(), true);

	}

	@When("Userhb clicks Class navigation bar")
	public void userhb_clicks_class_navigation_bar() {
	    // Write code here that turns the phrase above into concrete actions
		classpage.click_classTab();
	}

	@Then("Userhb is redirected to validate UI of ManageClass page")
	public void userhb_is_redirected_to_validate_ui_of_manage_class_page() {
		//validating Manage page url
				boolean classurl=classpage.check_ClassPage();
				Assert.assertEquals(classurl, true);
				//validating lms_title
				boolean lmstitle=classpage.isVisible_LMSTitle();
				Assert.assertEquals(lmstitle,true);
				//manage class header
				String title=classpage.check_manageClassTitle();
				Assert.assertEquals(title,"Manage Class");
				//searchbar
				boolean searchbar_visible=classpage.isVisible_classSearchBar();
				Assert.assertEquals(searchbar_visible, true);
				//datatable headings
				Assert.assertEquals(classpage.isVisible_classBatchName(),true);
				Assert.assertEquals(classpage.isVisible_classTopic(),true);
				Assert.assertEquals(classpage.isVisible_classDescri(),true);
				Assert.assertEquals(classpage.isVisible_classStatus(),true);
				Assert.assertEquals(classpage.isVisible_classDate(),true);
				Assert.assertEquals(classpage.isVisible_classStaffname(),true);
				Assert.assertEquals(classpage.isVisible_classEditDel(),true);
				//showing x to y of z entries and enabled pagination controls
				Assert.assertEquals(classpage.isVisible_classPaginatorTitle(),true);
				Assert.assertEquals(classpage.isVisible_classFirstLink(),true);
				Assert.assertEquals(classpage.isVisible_classLastLink(),true);
				Assert.assertEquals(classpage.isVisible_classNextLink(),true);
				Assert.assertEquals(classpage.isVisible_classPrevLink(),true);
				//see sort icon of all fields
				Assert.assertEquals(classpage.isVisible_batchnameSort(),true);
				Assert.assertEquals(classpage.isVisible_classDateSort(),true);
				Assert.assertEquals(classpage.isVisible_classdescriSort(),true);
				Assert.assertEquals(classpage.isVisible_classStaffnameSort(),true);
				Assert.assertEquals(classpage.isVisible_classStatusSort(),true);
				Assert.assertEquals(classpage.isVisible_classtopicSort(),true);
				//see top delete button
				Assert.assertEquals(classpage.isVisible_multiDelButton(), true);
				//total no of classes
				Assert.assertEquals(classpage.isVisible_bottomText(), true);
				System.out.println("End of UI verfication  module");

	}
	
	
    @Given("Userhb is in manage class page")
	public void userhb_is_in_manage_class_page() {
		Assert.assertEquals(classpage.check_ClassPage(), true);
		System.out.println("in the second scenario");
	}
   //changing to stage and commit

@When("Userhb clicks add new class dropdown")
public void userhb_clicks_add_new_class1_dropdown() throws InterruptedException {
    classpage.click_AddNewClassButton();
    Thread.sleep(3000);
	
}
@Then("Userhb is redirected to validate UI of Add a new Class popup")
public void userhb_is_redirected_to_validate_ui_of_add_a_new_class_popup() {
	classpage.switchtoPopUp();
	Assert.assertEquals(classpage.isvisible_addnewclasspopup(),true);
	classpage.click_popupCloseIcon();
}

//pagination
		@Given("userhb is in manage classpage")
	public void userhb_is_in_manage_classpage() throws InterruptedException {

		classpage.switchtoPopUp();		
		Thread.sleep(2000);
		Assert.assertEquals(classpage.check_ClassPage(), true);  
		System.out.println("In Pagination module");
		}

			@When("userhb click on next link")
			public void userhb_click_on_next_link(){
			
			    classpage.click_nextlink();
			    System.out.println("next link clicked");
			}

			@Then("userhb should see the prev and first link enabled")
			public void userhb_should_see_the_prev_and_first_link_enabled() {
			    Assert.assertEquals(classpage.isEnabled_firstLink(),true);
			    Assert.assertEquals(classpage.isEnabled_prevLink(),true);
			}

			@When("userhb click on last link")
			public void userhb_click_on_last_link() {
				classpage.click_lastlink();
			}

			@Then("userhb should see the next link disabled")
			public void userhb_should_see_the_next_link_disabled() {
				 Assert.assertEquals(classpage.isEnabled_nextLink(),false);
			}


			@When("userhb click on prev link")
			public void userhb_click_on_prev_link() {
				classpage.click_prevlink();
			}

			@Then("userhb should see the next link and last link enabled")
			public void userhb_should_see_the_next_link_and_last_link_enabled() {
				Assert.assertEquals(classpage.isEnabled_lastLink(),true);
			    Assert.assertEquals(classpage.isEnabled_nextLink(),true);    
			}


			@When("userhb click on first link")
			public void userhb_click_on_first_link() {
				 classpage.click_firstlink();
			}

			@Then("userhb should see the prev link disabled")
			public void userhb_should_see_the_prev_link_disabled() {  
				Assert.assertEquals(classpage.isEnabled_prevLink(),false);
	}
		
			//navigation module
			

			@When("userhb clicks program button")
			public void userhb_clicks_program_button() {
			classpage.click_classTab();
			   classpage.click_programTab();
			}

			@Then("userhb is redirected to program page")
			public void userhb_is_redirected_to_program_page() {
				
				Assert.assertEquals(classpage.check_programPage(), true);
			}

			@Given("userhb is back in manage class page")
			public void userhb_is_back_in_manage_class_page() {
				Assert.assertEquals(classpage.check_ClassPage(), true); 
			}

			@When("userhb clicks batch button")
			public void userhb_clicks_batch_button() {
			   classpage.click_batchTab();
			}

			@Then("userhb is redirected to batch page")
			public void userhb_is_redirected_to_batch_page() {
				Assert.assertEquals(classpage.check_batchPage(), true); 
			}

			@Given("userhb is redirected to manage class page")
			public void userhb_is_redirected_to_manage_class_page() {
				Assert.assertEquals(classpage.check_ClassPage(), true); 
			}

			@When("userhb clicks class button")
			public void userhb_clicks_class_button() {
			    classpage.click_classTab();
			}

			@Then("userhb is still in the manage class page")
			public void userhb_is_still_in_the_manage_class_page() {
				Assert.assertEquals(classpage.check_ClassPage(), true); 
			}

			@Given("userhb is again in manage class page")
			public void userhb_is_again_in_manage_class_page() {
				Assert.assertEquals(classpage.check_ClassPage(), true); 
			}

			@When("userhb clicks logout button")
			public void userhb_clicks_logout_button() {
			    classpage.click_logoutTab();
			}

			@Then("userhb is redirected to login page")
			public void userhb_is_redirected_to_login_page() {
				Assert.assertEquals(classpage.check_loginPage(), true); 
			}


}




