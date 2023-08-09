Feature: This is to search Google search

  Scenario: Google Search screnario
    Given user entering google.co.in
    When user type search term "Hello World"
    And user clicks on enter key
    Then check for the page Title
