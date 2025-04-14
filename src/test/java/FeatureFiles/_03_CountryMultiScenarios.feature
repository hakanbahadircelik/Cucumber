Feature: Country Multi Scenario

  Background:  # works for both scenario beginning
    Given Navigate to Campus
    When Enter username and password click login button
    Then User should login successfully
    And Navigate to country

  @Regression
  Scenario: Create country
    When Create a country
    Then Success message should be displayed

  Scenario: Create country 2
    When Create a country name as "baha007" code as "B007"
    Then Success message should be displayed