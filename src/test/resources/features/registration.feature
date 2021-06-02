@run
Feature: Registration
  #user should be able to register

  Scenario: User should be able to register
    Given user is on register page
    When when user enter all registration details
    Then user should be able to register successfully


