Feature: Rediff Account Functionality

  Scenario: User signs in with valid credentials
    Given I am in thereddif page
    When I enter valid username and password
    And I click on the Sign-in button
    Then I logged in the reddif
    Given I am on the Rediff Create Account page
    When I fill in the registration details
    And I submit the form
    Then my Rediff account should be created successfully