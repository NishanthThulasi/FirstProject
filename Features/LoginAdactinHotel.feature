Feature: Validation of AdactinHotel Loginpage

Scenario: Login AdactinHotel with vaild Username and Password
Given launch the browser
And open th AdactinHotel page
When enter the username and password
When click the login button
Then validate the Success message
