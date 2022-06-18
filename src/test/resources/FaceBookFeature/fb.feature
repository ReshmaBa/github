Feature:To validate the login functionality facebook application
Scenario: To validate login with Invalid Username and Valid Password

Given User has to launch the chrome browser and hit the url
When  User has to pass the invalid username in email field
And User has to pass valid password in password field
And User has to click the login button
And User has to navigate to the home page
And User has to navigate to amazon page
Then  User has to close the chrome browser