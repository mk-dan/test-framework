Feature: User signs in

  In order to buy an item on amazon
  As a customer
  I want to be able to sign-in to the amazon website with my details


  Scenario: Successful sign-in

    User should be greeted personally by the site once signed in

    Given I am on the Amazon website
    When I sign in with valid details
    Then I should see a personalised greeting