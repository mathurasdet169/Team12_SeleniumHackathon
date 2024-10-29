@tagnavigationprogram
 Feature: Navigation
 

  Scenario: Verify that Admin is able to navigate to Program module
    Given Admin is on dashboard page after Login
    When Admin clicks Program on the navigation bar
    Then Admin should be navigated to Program module
    #
    #Scenario: Verify any broken links on program page  
    #Given Admin is on dashboard page after Login
    #When Admin clicks "Program" on the navigation bar
    #Then Admin should not have any broken links for Program module
    
      Scenario: Verify heading in menu bar
    Given Admin is on dashboard page after Login
    When Admin clicks Program on the navigation bar
    Then Admin should see the heading "LMS - Learning Management System"
    
       #Scenario: Verify other module's name displayed in menu bar
    #Given Admin is on dashboard page after Login
    #When Admin clicks "Program" on the navigation bar
    #Then Admin should see the module names as in order "Home Program Batch Class Admin Assignment Attendance"
    #
       Scenario: Verify Logout displayed in menu bar
    Given Admin is on dashboard page after Login
    When Admin clicks Program on the navigation bar
    Then Admin should see Logout in menu bar
    
    #
    Scenario: Verify sub menu displayed in program menu bar
    Given Admin is on dashboard page after Login
    When Admin clicks Program on the navigation bar
    Then Admin should see sub menu in menu bar as "Add New Program"
    
       Scenario: Verify heading in manage program
    Given Admin is on dashboard page after Login
    When Admin clicks Program on the navigation bar
    Then Admin should see the heading Manage Program
    
       Scenario: Verify view details of programs
    Given Admin is on dashboard page after Login
    When Admin clicks Program on the navigation bar
    Then Admin should able to see Program name, description, and status for each program
    
       Scenario: Verify the Multiple Delete button state 
    Given Admin is on dashboard page after Login
    When Admin clicks Program on the navigation bar
    Then Admin should see a Delete button in left top is disabled
    #
       Scenario: Verify the Search button 
    Given Admin is on dashboard page after Login
    When Admin clicks Program on the navigation bar
    Then Admin should see Search bar with text as "Search..."
    #
       Scenario: Verify column header name of data table
    Given Admin is on dashboard page after Login
    When Admin clicks Program on the navigation bar
    Then Admin should see data table with column header on the Manage Program Page as  Program Name, Program Description, Program Status, Edit/Delete
    
       Scenario: Verify checkbox default state beside Program Name column header
    Given Admin is on dashboard page after Login
    When Admin clicks Program on the navigation bar
    Then Admin should see checkbox default state as unchecked beside Program Name column header as 
    #
       Scenario: Verify checkboxes default state beside each Program names in the data table 
    Given Admin is on dashboard page after Login
    When Admin clicks Program on the navigation bar
    Then Admin should see check box default state as unchecked on the left side in all rows against program name 
    #
       Scenario: Verify Sort icon in manage program
    Given Admin is on dashboard page after Login
    When Admin clicks Program on the navigation bar
    Then Admin should see the sort arrow icon beside to each column header except Edit and Delete 
    
       #Scenario: Verify edit and delete icon in manage program
    #Given Admin is on dashboard page after Login
    #When Admin clicks "Program" on the navigation bar
    #Then Admin should see the Edit and Delete buttons on each row of the data table
    #
       #Scenario: Verify pagination icons below data table in manage program
    #Given Admin is on dashboard page after Login
    #When Admin clicks "Program" on the navigation bar
    #Then Admin should see the text as "Showing x to y of z entries" along with Pagination icon below the table. x- starting record number on that pagey-ending record number on that pagez-Total number of records
    #
       #Scenario: Verify footer message in manage program
    #Given Admin is on dashboard page after Login
    #When Admin clicks "Program" on the navigation bar
    #Then Admin should see the footer as "In total there are z programs". z- Total number of records
    #
    #
   Scenario: Admin is on program module after reaching dashboard
       Scenario: Verify add New Program
    Given Admin is on Program module
    When Admin clicks on New Program under the Program menu bar
    Then Admin should see pop up window for program details
    #
       Scenario: Verify title of the pop up window
    Given Admin is on Program module
    When Admin clicks on New Program under the Program menu bar
    Then Admin should see window title as "Program Details"
    
       Scenario: Verify mandatory fields with red "*" mark 
    Given Admin is on Program module
    When Admin clicks on New Program under the Program menu bar
    Then Admin should see red "*" mark beside mandatory field "Name"
    #
       Scenario: Verify empty form submission
    Given Admin is on Program details form
    When Admin clicks save button without entering mandatory 
    Then Admin gets message 'Program name is required.'
    
       Scenario: Verify cancel button
    Given Admin is on Program details form
    When Admin clicks Cancel button
    Then Admin can see Program Details form disappears 
    
       Scenario: Verify enter program name
    Given Admin is on Program details form
    When Admin enters the Name in the text box
    Then Admin can see the text entered
    
       Scenario: Verify enter description
    Given Admin is on Program details form
    When Admin enters the Description in text box
    Then Admin can see the text entered in description box
    #
       Scenario: Verify select Status
    Given Admin is on Program details form
    When Admin selects the status of the program by clicking on the radio button "(Active/InActive)"
    Then Admin can see 'Active/Inactive' status selected
    #
       Scenario: Verify Admin is able to save the program details
    Given Admin is on Program details form
    When Admin enter valid details for mandatory fields and Click on save button
    Then Admin gets message Successful Program created
    
        
        
        Scenario: Verify cancel program details
    Given Admin is on Program details form
    When Admin clicks Cancel button
    Then Admin can see Program Details form disappears
    
    
    #
        Scenario: Verify added Program is created
    Given Admin is on Program module
    When Admin searches with newly created "Program Name"
    Then Records of the newly created  "Program Name" is displayed and match the data entered
    
        Scenario: Verify close window with "X" 
    Given Admin is on Program details form
    When Admin Click on "X" button
    Then Admin can see Program Details form disappears
    
    
 #Background:   Admin is on program module after reaching dashboard
        Scenario: Verify Edit option
    Given Admin is on Program module
    When Admin clicks on Edit option for particular program
    Then Admin is on Program details form
    #
        Scenario: Verify mandatory fields with red "*" mark 
    Given Admin is on Program module
    When Admin clicks on Edit option for particular program
    Then Admin should see red "*" mark beside mandatory field "Name"
    #
        #Scenario: Verify edit Program Name
    #Given Admin is on Program module
    #When Admin edits the program name and click on save button
    #Then Updated program name is seen by the Admin
    #
        #Scenario: Verify edit Description
    #Given Admin is on Program module
    #When Admin edits the description text and click on save button
    #Then Admin can see the description is updated
    #
        #Scenario: Verify edit Status
    #Given Admin is on Program module
    #When Admin can change the status of the program and click on save button
    #Then Status updated can be viewed by the Admin
    #
        #Scenario: Verify Admin is able to click Save
    #Given Admin is on Program module
    #When Admin click on save button
    #Then Admin can see the updated program details
    #
        #Scenario: Verify Admin is able to click Cancel
    #Given Admin is on Program module
    #When Admin click on cancel button
    #Then Admin can see the Program details form disappears
    #
        #Scenario: Verify edited Program details
    #Given Admin is on Program module
    #When Admin searches with newly updated "Program Name"
    #Then Admin verifies that the details are correctly updated.
    #
        #Scenario: Verify close the window with "X" 
    #Given Admin is on Program module
    #When Admin Click on "X" button
    #Then Admin can see program details form disappear
    #
    #Background:   Admin is on program module after reaching dashboard
        Scenario: Verify delete feature
    Given Admin is on Program module
    When Admin clicks on delete button for a program
    Then Admin will get confirm deletion popup
    
        Scenario: Verify Admin is able to click 'Yes'
    Given Admin is on Confirm deletion form
    When Admin clicks on "Yes" button
    Then Admin can see 'Successful Program Deleted' message
    
        #Scenario: Verify Admin is able to deleted program
    #Given Admin is on Program module
    #When Admin Searches for "Deleted Program name"
    #Then There should be zero results.
    #
    Scenario: Verify Admin is able to click 'No'
    Given Admin is on Program Confirm Deletion Page after selecting a program to delete
    When Admin clicks on "No" button
    Then Admin can see Confirmation form disappears
    #
     Scenario: Verify Admin is able to close the window with "X" 
    Given Admin is on Program Confirm Deletion Page after selecting a program to delete
    When Admin Click on X button
    Then Admin can see Confirmation form disappears
    
     #
