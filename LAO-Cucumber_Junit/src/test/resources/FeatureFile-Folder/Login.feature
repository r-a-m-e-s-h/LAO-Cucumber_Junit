Feature: Login featrure

  #@Test
  Scenario Outline: Login Scenario
    Given enter user name <UserName>
    When enter pwd <Pwd>
    Then click loginBtn

    Examples: 
      | UserName |  | Pwd      |
      | Admin    |  | admin123 |
