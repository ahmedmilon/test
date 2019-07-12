Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: Title of your scenario outline
   Given user navigate homepage
    When I want to enter firstname "<firstname>" as name
    And I want to enter lastname "<lastname>" as name
    Then I  want to enter password "<password>" as pass

    Examples: 
      | firstname | lastname | password |
      | ahmed     | milon    | success  |
      | sadat     | hoss     | Fail     |
