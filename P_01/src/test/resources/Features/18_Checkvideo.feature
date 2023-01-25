Feature: Prompto Portal Testing ninteen

  Scenario: validating the Prompto Portal check video
    Given user with valid credentials they login video
    When user validate check video
    Then user logout video
