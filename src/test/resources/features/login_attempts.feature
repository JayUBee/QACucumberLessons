Feature: Login Functionality

  Background:
    Given the user is on Login Page

  Scenario Outline: User attempting different combinations of username and
  password

    When the user enters <username> and <password>
    Then The system should display a login error message

    Examples:
    | username | password |
    | invalid1 | wrongPass |
    | validUser | wrongPass |
    | invalid2 | correctPass |