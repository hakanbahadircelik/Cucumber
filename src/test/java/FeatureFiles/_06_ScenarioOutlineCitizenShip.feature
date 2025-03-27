Feature: Citizenship

  Background:
    Given Navigate to Campus
    When Enter username and password click login button
    Then User should login successfully
    And Navigate to citizenship

  Scenario Outline: Citizenship Registration
    When Create a citizenship name as "<name>" short name as "<shortname>"
    Then Success message should be displayed

    When Create a citizenship name as "<name>" short name as "<shortname>"
    Then Already exist message should be displayed

    Examples:
      | name   | shortname |
      | ba1ha2 | b1b22     |
      | ba1ha3 | b1b33     |
      | ba1ha4 | b1b44     |
      | ba1ha5 | b1b55     |