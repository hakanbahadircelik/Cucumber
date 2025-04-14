Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password click login button
    Then User should login successfully

  Scenario Outline: Create country
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | countries  |

    And Click on the element in Dialog
      | addButton  |

    And User sending the keys in Dialog
      | nameInput  | <name> |
      | codeInput  | <code> |

    And Click on the element in Dialog
      | saveBtn |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | ba0ha001 |

    Examples:
      | name    | code   |
      | baaHHa1 | b1b1b1 |
      | baaHHa2 | b2b2b2 |
      | baaHHa3 | b3b3b3 |
      | baaHHa4 | b4b4b4 |
