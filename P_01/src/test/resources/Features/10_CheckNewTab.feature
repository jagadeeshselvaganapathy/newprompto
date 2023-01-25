Feature: Prompto Portal Testing ten

  Scenario: validating the Prompto Portal click newtab
    Given user with valid credentials they login newtab
    When user validate click newtab
    Then user logout fiftinth time newtab
