Feature: Prompto Portal Testing eighteen

  Scenario: validating the Prompto Portal check draganddrop
    Given user with valid credentials they login draganddrop
    When user validate check draganddrop
    Then user logout draganddrop
