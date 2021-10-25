Feature: Homepage feature test
  Scenario: Search for product
    Given User on Tokopedia homepage
    When User enter product name on the search bar
    And Press on Enter key
    Then User should be redirected to search result page

  Scenario: