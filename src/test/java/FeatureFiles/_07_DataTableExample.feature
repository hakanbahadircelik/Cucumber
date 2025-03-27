Feature: DataTable Example

  Scenario: Users List
    When write username "baha"
    And Write username and Password "baha" and "1234"
    
    And Write username as DataTable
    | baha |
    | jack |
    | sean |
    | jon  |
    
    And Write username and Password as DataTable
    | baha | 1234   |
    | jack | 12345  |
    | sean | 123456 |