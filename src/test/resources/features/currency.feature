@all
Feature: Currency change of product price
  #user should be able to change currency with success

  @test2
  Scenario: User should be able change currency successfully
    Given user is on home page
    When user change currency from selector menu
    Then user should be able see changed currency successfully