Feature: Traffic Queue

  Background:
    Given I navigate to the website

  Scenario: A user can make a request to the website and receive an expected response
    Given The user limit has not been exceeded
    When The page loads
    Then I should see the expected page

  Scenario: A user makes a request when the number of allowed users has been exceeded
    Given The user limit has been exceeded
    When The page loads
    Then I am placed in the queue

  Scenario: A user requests and updated queue position
    Given The user limit has been exceeded
    When The page loads
    And I am placed in the queue
    And I request an updated queue position
    Then I should see my updated queue position

  Scenario: A user in the queue gains access to the website when it becomes available
    Given I am placed in the queue
    When The website becomes available
    Then I should see the expected page
