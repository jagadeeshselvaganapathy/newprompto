Feature: Prompto Portal Testing seventeen

  Scenario: validating the Prompto Portal click url 
    Given user with valid credentials they login url
    When user validate click url
    Then user logout url
