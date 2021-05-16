Feature: Check if a number is square

  Scenario: 9 is square
    When I check if 9 is square
    Then The answer is "true"

  Scenario: 5 is not Square
    When I check if 5 is square
    Then The answer is "false"