Feature: Test Linkedin smoke scenario

  Scenario: Test Login with unregistered user
    Given Open Linkedin and start application
    When  I Enter username and password
    Then  User does not exist
    
   Scenario: Successful Login with Valid Credentials
	 Given User is on Home Page
	 When User Navigate to LogIn Page
	 Then Message displayed Login Successfully
	 And Search contact
