Feature: Homepage
  Scenario Outline: Search for product
    Given '<actor>' on Tokopedia homepage
    When he enter '<product>' name on the search bar
    Then he should be redirected to search result page for '<product>' or '<alt>'
    Examples:
      | actor | product | alt  |
      | Ana   | Buku    | buku |