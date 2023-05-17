Feature: Iterate over elements using Iterator pattern

  Scenario: Iterate over elements in MyCollection
    Given a MyCollection with elements "A", "B", "C"
    When I iterate over the collection
    Then the elements should be returned in order "A", "B", "C"
