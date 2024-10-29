@Dashboard
Feature: Dashboard Functionality

  Scenario: Login
    Given Admin gives the correct LMS portal URLKP
    When Admin is on login pageKP
    And Admin enters credentials and clicks login pageKP

  @Dashboard1
 Scenario: Verify after login Admin lands on dashboard pageKP
    Then Admin sohnould see dashboardKP

  @Dashboard23
  Scenario: Admin Verify the response time
    Then Maximun navigation time in milliseconds, defaults to 30 seconds

  @Dashboard3
  Scenario: Admin verify broken link
    Then HTTP response>=400.then link is broken

  @Dashborad4
  Scenario: Admin verify LMS title
    Then Admin should see LMS -Learning management system as title

  @Dashboard5
  Scenario: Admin Verify LMS title alignment
    Then LMS title should be on the top left corner of page

  @Dashboard6
  Scenario: Admin Validate navigation bar text
    Then Admin should see correct spelling in navigation bar text

  @Dashboard7
  Scenario: Admin Validate LMS title has correct spelling and space
    Then Admin should see correct spelling and space in LMS title

  @Dashboard8
  Scenario: Admin Validate alignment for navigation bar
    Then Admin should see the navigation bar text on the top right side

  @Dashboard9
  Scenario: Admin Validate navigation bar order 1st home
    Then Admin should see Home in the 1st place

  @Dashboard10
  Scenario: Admin Validate navigation bar order 2nd program
    Then Admin should see program in the 2nd place

  @Dashboard11
  Scenario: Admin Validate navigation bar order 3rd batch
    Then Admin should see batch in the 3rd place

  @Dashboard12
  Scenario: Admin Validate navigation bar order 4th class
    Then Admin should see class in the 4th place

  @Dashbord13
  Scenario: Admin validate navigation bar order 5 th logout
    Then Admin should see logout in the 5th place

