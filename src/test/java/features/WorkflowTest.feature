# new feature
# Tags: optional
    
Feature:
  As a user
  I want to be able to read the news
  So that i can stay informed


Scenario: Go to the guardian website
    Given I am on the guardian website
    When I select the main article
    Then the article is opened