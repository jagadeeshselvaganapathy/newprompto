Feature: Prompto Portal Testing failcase

  Scenario: validating the Prompto Portal failcase
    Given user with valid credentials they login failcase
    When user validate check failcase
    Then user logout failcase
