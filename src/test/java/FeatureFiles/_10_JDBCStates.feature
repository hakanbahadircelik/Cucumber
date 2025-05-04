Feature: Testing JDBC States

  Background:
    Given Navigate to Campus
    When Enter username and password click login button
    Then User should login successfully

    Scenario: States testing with JDBC
      And Click on the element in LeftNav
        | setup |
        | parameters |
        | states |
      Then Send the Query to Database "select * from states limit 10" and control match