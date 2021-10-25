Feature: Test Search feature
  Scenario: Search
    Given User on Google homepage
    When User enter search keyword
    And Hit enter
    Then User should be redirected to search result pages