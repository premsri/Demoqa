Feature: Test Hooks

  @first
  Scenario Outline: Enter firstname and lastname
    Given User in Demoqa page
    When User enters "<firstname>" and "<lastName>"
    Then The user Verifies "<firstname>" and "<lastName>"

    Examples: 
      | firstname | lastName |
      | vadivel   | a1        |
      | praveen   | b1        |
