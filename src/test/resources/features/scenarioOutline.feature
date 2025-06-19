Feature: Scenario Outline Page


Scenario Outline: Login with invalid credentials

Given the user is on th Login Page
When the user enters "<user name>" and "<password>"
And the user clicks the login button
Then the user should be logged in successfully

Examples:
| user name | password |
| april | 123456       |
| chay  | 345@678 |
|mercator | 9723469 |