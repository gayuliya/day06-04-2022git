@P1 @FBUI @Login
Feature: FaceBook Page Login Fnction 

@TC01 @FBLogin @Regression @Smoke
Scenario: To validate FB pae login function with invalid credentials
    Given User Launch the browser
    And User enters the Url
    When User enters the username and password
					|hello|12345| 
					|gaya|liya|
					|prabha|liya|   
    And User enters the login button
    Then User navigate to login failure page

@TC02 @FBLogin @Regression @Smoke
Scenario Outline: To validate FB page login function with combination of all credentials
	Given User Launch the browser
	And User enters the Url
	When User enters the "<UserName>" and "<PassWord>"
	And User enters the login button
	Then User navigate to login failure page
	

	Examples:
	| UserName | Password|
	| Gayathri | liya    |
	