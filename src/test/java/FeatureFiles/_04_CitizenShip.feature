Feature: Citizenship

  Scenario: Citizenship Registration
    Given Navigate to Campus
    When Enter username and password click login button
    Then User should login successfully
    And Navigate to citizenship
    When Create a citizenship
    Then Success message should be displayed