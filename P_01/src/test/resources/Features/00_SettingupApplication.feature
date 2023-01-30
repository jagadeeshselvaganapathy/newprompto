Feature: Prompto Portal Testing zero

  Scenario: validating the Prompto Portal setting up
    Given user with valid credentials they login to setup
    When user validate the application for execution
    Then user logout the application
