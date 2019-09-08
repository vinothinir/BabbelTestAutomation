Feature: LoginPage Verification
  Scenario: Login Page
    Given I launch the Babbel login page
    Then I verify the login screen
    When I enter invalid credentials to login
    Then I Verify the error message


