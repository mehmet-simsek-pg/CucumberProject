Feature: Entrance Exam Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create a Exam
    When Navigate to exam page
    Then Create a Exam as "mehmet2313"
    Then Success massage should be displayed

    When Navigate to exam page
    Then User delete the "mehmet2313" from form
    And Success massage should be displayed
