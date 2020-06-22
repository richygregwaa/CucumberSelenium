Feature: Google Search


  Scenario: Search results page displayed successfully when user searches any text on google
    Given I am on the Google search page
    When I enter any search keyword on search textbox
    And I click on search button
    Then I should be redirected to search results page
