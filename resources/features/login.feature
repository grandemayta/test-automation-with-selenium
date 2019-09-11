Feature: Login

Scenario: Login with a valid credentials
 Given Open the login page
 When I fill in the email with "grandemayta@gmail.com"
 And I fill in the password with "forzainter"
 And I press the login button
 Then I should be on the homepage