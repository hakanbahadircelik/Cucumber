Feature: Country Multi Scenario

  Background:  # works for both scenario beginning
    Given Navigate to Campus
    When Enter username and password click login button
    Then User should login successfully
    And Navigate to country

  Scenario: Create country
    When Create a country
    Then Success message should be displayed

  Scenario: Create country 2
    When Create a country 2
    Then Success message should be displayed 2