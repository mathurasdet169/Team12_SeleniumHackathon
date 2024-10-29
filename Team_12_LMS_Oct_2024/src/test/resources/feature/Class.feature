#Feature file for class module
#tostage and commit
Feature: Class Module

 #manage class
  Scenario: Userhb is able to validate Class page
    Given Userhb is in Dashboard page
    When Userhb clicks Class navigation bar
    Then Userhb is redirected to validate UI of ManageClass page
#add new class
  Scenario: Userhb is able to validate Add a new Class popup
    Given Userhb is in manage class page
    When Userhb clicks add new class dropdown
    Then Userhb is redirected to validate UI of Add a new Class popup

#pagination
Scenario: Userhb is able to validate pagination next link in manage class
    Given userhb is in manage classpage
    When userhb click on next link
    Then userhb should see the prev and first link enabled

  Scenario: Userhb is able to validate pagination last link in manage class
    Given userhb is in manage classpage
    When userhb click on last link
    Then userhb should see the next link disabled

  Scenario: Userhb is able to validate pagination prev link in manage class
    Given userhb is in manage classpage
    When userhb click on prev link
    Then userhb should see the next link and last link enabled

  Scenario: Userhb is able to validate pagination first link in manage class
    Given userhb is in manage classpage
    When userhb click on first link
    Then userhb should see the prev link disabled
    
#navigation
Scenario: userhb is able to navigate from manage class page to program page
    Given userhb is in manage classpage
    When userhb clicks program button
    Then userhb is redirected to program page

  Scenario: userhb is able to navigate from manage class page to batch page
    Given userhb is back in manage class page
    When userhb clicks batch button
    Then userhb is redirected to batch page

  Scenario: userhb is able to navigate from manage class page to self
    Given userhb is redirected to manage class page
    When userhb clicks class button
    Then userhb is still in the manage class page

  Scenario: userhb is able to logout from manage class page
    Given userhb is again in manage class page
    When userhb clicks logout button
    Then userhb is redirected to login page
