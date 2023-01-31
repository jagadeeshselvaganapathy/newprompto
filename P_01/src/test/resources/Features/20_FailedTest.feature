Feature: Prompto Portal Testing failing

  Scenario: validating the Prompto Portal check for failing
    Given user with valid credentials they login failing
    When user validate check failing
    Then user logout failing
