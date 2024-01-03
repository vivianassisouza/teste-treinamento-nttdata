@selenium
Feature: Google search

  Scenario: Search a dog on google
    Given a search for dog
    Then im find results about dogs