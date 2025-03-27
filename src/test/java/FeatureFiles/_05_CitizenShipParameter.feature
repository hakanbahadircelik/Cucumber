Feature: Citizenship

  Background:
    Given Navigate to Campus
    When Enter username and password click login button
    Then User should login successfully
    And Navigate to citizenship

  Scenario: Citizenship Registration
    When Create a citizenship name as "baha2" short name as "bb22"
    Then Success message should be displayed

    When Create a citizenship name as "baha2" short name as "bb22"
    Then Already exist message should be displayed