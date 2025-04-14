
Feature: Login functionality

  @SmokeTest
  Scenario: Login with valid username and password

    Given Navigate to Campus
    When Enter username and password click login button
    Then User should login successfully