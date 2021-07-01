Feature: Country Create Edit Delete Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country page


  Scenario: Create a country

    When Create a country name as "New Dortmund" code as "ND"
    Then Success massage should be displayed

  Scenario: Edit a country

    When User edit the "New Dortmund" to "Alt Stadt"
    Then Success massage should be displayed

  Scenario: Delete a country

    When User delete the "Alt Stadt"
    Then Success massage should be displayed