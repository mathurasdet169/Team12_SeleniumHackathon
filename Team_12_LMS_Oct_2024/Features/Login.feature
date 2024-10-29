@login	
Feature:login  

Background:
Given Admin launch the browse vh

@login1
Scenario: launch of lms website 
When Admin gives the correct LMS portal URL vh
Then Admin should land on the login page vh
   
@login2
Scenario:Verify Admin is able to land on home page with invalid URL 
When Admin gives the invalid LMS portal URL vh
Then Admin should recieve 404 page not found error vh
  
@login3
Scenario: Verify for broken link
When Admin gives the correct LMS portal URL a vh
Then HTTP response >= 400. Then the link is broken vh

@login4
Scenario:Verify the text spelling in the page
Then Admin should see correct spellings in all fields vh 

@login5
Scenario: Verify the company logo 
Then Admin should see logo on the left side vh

@login6
Scenario: Verify application name
Then Admin should see LMS - Learning Management System vh

@login7
Scenario: Verify company name
Then Admin should see company name below the app name vh

@login8
Scenario:Validate sign in content
Then Admin should see "Please login to LMS application" vh

@login9
Scenario:Verify text field is present
Then Admin should see two text field vh

@login10
Scenario:Verify text on the first text field
Then Admin should "User" in the first text field vh

@login11
Scenario: Verify asterik next to Admin text
Then Admin should see field mandatory *symbol next to Admin text vh

@login12
Scenario: Verify text on the second text field
Then Admin should "Password" in the second text field vh

@login13
Scenario:Verify asterik next to password text
Then Admin should see * symbol next to password text vh

@login14
Scenario:Verify the alignment input field for the login
Then Admin should see input field on the centre of the page vh

@login15
Scenario:verify Login button is present
Then Admin should see login button vh

@login16
Scenario: Verify the alignment of the login button
Then Admin should see login button on the centre of the page vh

@login17
Scenario: Verify input descriptive test in Admin field 
Then Admin should see Admin in gray color vh

@login18
Scenario:Verify input descriptive test in password field 
Then Admin should see password in gray color vh

@login19
Scenario:Validate login with valid credentials
Given Admin is in login Page vh
#When Admin enter valid credentials and clicks login button Admin should land on dashboard page vh
Then Admin should land on dashboard page vh

@login20
Scenario:Validate login with invalid credentials
When Admin enter invalid credentials and clicks login button vh
Then Error message please check Adminname/password vh


@login21
Scenario:Validate login credentials with null Adminname 
When Admin enter value only in password and clicks login button vh
Then Error message please check Adminname/password a vh

@login22
Scenario:Validate login credentials with null password 
When Admin enter value only in Adminname and clicks login button vh 
Then Error message please check Adminname/password  b vh

@login23
Scenario: verify login button action through keyboard 
When Admin enter valid credentials and clicks login button through keyboard vh
Then Admin should land on dashboard page a vh

@login24
Scenario:verify login button action through mouse 
When Admin enter valid credentials and clicks login button through mouse vh
Then Admin should land on dashboard page b vh