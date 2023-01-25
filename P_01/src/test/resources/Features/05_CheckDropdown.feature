Feature: Prompto Portal Testing five

  Scenario: validating the Prompto Portal click dropdown
    Given user with valid credentials they login dropdown
    When user validate click dropdown
    Then user logout dropdown
