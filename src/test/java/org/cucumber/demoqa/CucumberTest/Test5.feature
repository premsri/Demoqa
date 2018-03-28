Feature: Test Hooks

  @fifth
  Scenario Outline: Enter firstname and lastname
    Given User in Demoqa page
    When User enters "<firstname>" and "<lastName>"
    Then The user Verifies "<firstname>" and "<lastName>"

    Examples: 
      | firstname | lastName |
      | vadivel   |a5        |
      | praveen   |a6        |
