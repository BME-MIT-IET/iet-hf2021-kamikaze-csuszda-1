Feature: Check if two words are anagrams

  Scenario: Education is anagrams with auctioned
    When I check "education" and "auctioned"
    Then The result is "true"

  Scenario: Cat is not anagrams with dog
    When I check "cat" and "dog"
    Then The result is "false"