Feature: Country Multi Scenario

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country page

  Scenario: Create a country
    When Create a country
    Then Success massage should be displayed

  Scenario: Create a country with parameter
    When Create a country name as "Dortmund Merkez" code as "45426"
    Then Success massage should be displayed