Feature: Visit Guardian website in order to open main news article

  Scenario: Open main article in the Guardian website
    Given I am on the guardian website
    When I select the main article
    Then the article is opened