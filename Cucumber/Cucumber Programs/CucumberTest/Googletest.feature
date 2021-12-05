Feature: This test the google website

  Scenario: Test the google search page
    Given the user opens the browser
    When the user navigates to google
    And the user enters the search
    Then the search results are displayed