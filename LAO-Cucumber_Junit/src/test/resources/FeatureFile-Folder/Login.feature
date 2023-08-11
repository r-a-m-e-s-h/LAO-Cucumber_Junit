Feature: Login featrure

  #@Test
  Scenario Outline: Login Scenario
    Given launch the browser
    When enter user name <UserName>
    And enter pwd <Pwd>
    Then click loginBtn

    Examples: 
      | UserName |  | Pwd      |
      | Admin    |  | admin123 |
