Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password click login button
    Then User should login successfully

  Scenario: Create country
    And Click on the element in LeftNav
    | setup      |
    | parameters |
    | countries  |

    And Click on the element in Dialog
    | addButton  |

    And User sending the keys in Dialog
    | nameInput  | ba0ha001 |
    | codeInput  | i1234 |

    And click on the element in Dialog
    | saveBtn |

    Then Success message should be displayed

    And User delete item from Dialog Content
    | ba0ha001 |