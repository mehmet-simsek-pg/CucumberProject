Feature: Item categories

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Item Category page

  Scenario Outline:
    When User create a item categories name as "<InventoryItemName>" short name as "<UserTypeOption>"
    Then Success massage should be displayed

    When User delete the "<InventoryItemName>"
    Then Success massage should be displayed
    Examples:
      | InventoryItemName |  | UserTypeOption |
      | Laptop2343         |  | Student        |
      | Desk12            |  | Manager        |
      | Table13           |  | Teacher        |