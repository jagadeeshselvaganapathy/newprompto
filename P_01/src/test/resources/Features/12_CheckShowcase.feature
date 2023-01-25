Feature: Prompto Portal Testing twelve

  Scenario: validating the Prompto Portal click showcase
    Given user with valid credentials they login showcase
    When user validate click showcase
    Then user logout showcase
