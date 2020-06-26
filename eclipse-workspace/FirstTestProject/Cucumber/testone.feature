Feature: Login functionality test
Scenario: positive testing with valid credentials
Given User able to go homepage

When user enter email
And user enter password
And user able to click login 
Then user login successfully