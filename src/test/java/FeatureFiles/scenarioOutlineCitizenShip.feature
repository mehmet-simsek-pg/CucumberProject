Feature: Citizenship with scenario outline

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to citizenship page

  Scenario Outline: Citizen create and delete with scenario outline
    When User a citizenship name as "<citizenShipName>" shortname as "<shortName>"
    Then Already exists message should be displayed
    And Click on close button

    When User delete the "<citizenShipName>"
    Then Success massage should be displayed

    Examples:
      | citizenShipName | shortName |
      | Turkish2        | TR        |
      | Turkish3        | TR        |
      | Turkish4        | TR        |
      | Turkish5        | TR        |


