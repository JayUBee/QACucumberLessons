Feature: User Registration

  Scenario: Successful Registration

    Given the user is on the registration page
    When the user enters <name>, <email> and <password>
    And the user clicks on submit button
    Then I should see a confirmation message
    And I should be directed to the user dashboard
    And my account should be created with the provided email address

    Examples:
    | name | email | pasword |
    | tayyab | tayyab@gmail.com | TestPassword123! |
