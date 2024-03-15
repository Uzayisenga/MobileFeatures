Feature: Ratings

  @RadionButtons
  Scenario: Give Ratings Score
    When a user tap on views link
    And the user tap on rating bar
    And the user tap on rating icons <rating>
    # Then the ratings score should be updated

    Examples: 
      | rating |
      |    0.5 |
      |    1.5 |
      |    2.5 |
    #   |    3.5 |
    #   |    4.5 |
       |    5.0 |
