Feature: Citizenship with scenario outline

  Scenario: Citizen create and delete with scenario outline
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to citizenship page
