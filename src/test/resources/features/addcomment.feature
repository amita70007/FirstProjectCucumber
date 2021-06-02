@run
Feature: Add comment to online shop
  #user should be able to add comment

  Scenario: User should be able to add comment successfully
    Given user is on home page
    When user enter comment
    Then user should be able see comment added successfully