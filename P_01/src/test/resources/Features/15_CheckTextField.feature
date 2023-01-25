Feature: Prompto Portal Testing fifteen

  Scenario: validating the Prompto Portal click TextField
    Given user with valid credentials they login TextField
    When user validate click TextField
    Then user logoutTextField
