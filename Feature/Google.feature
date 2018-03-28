Feature: Google verification


  Scenario Outline: Verify Selenium is Displayed
    Given The user is in google.com
    When The user enters "<Text1>"and click on search
    Then The user verify "<Text1>" is displayed

    Examples: 
      | Text1    |
      | Selenium |
      | TestNG   |
      | Cucumber |
