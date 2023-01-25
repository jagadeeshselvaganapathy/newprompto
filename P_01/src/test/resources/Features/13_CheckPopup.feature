Feature: Prompto Portal Testing thirteen

  Scenario: validating the Prompto Portal click popups
    Given user with valid credentials they login popups
    When user validate click popups
    Then user logout popups
