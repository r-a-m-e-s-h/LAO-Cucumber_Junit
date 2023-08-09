Feature: This is a parameterization Example Feature

  Scenario: This ia a parameterization Scenario
  
    Given User enters the login page
    #When user enters the <username> and <password>
    When user enters the credentials Admin and admin123
    And user clicks on the loginBtn
    Then user redirects to login page
    
    
   # Examples:
    # |username||password|
     # |Admin||admin123|
    
    
    
