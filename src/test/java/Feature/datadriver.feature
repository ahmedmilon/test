#Author: your.email@your.domain.com
Feature: signup validation with postive data
 @regression
  Scenario: validate signup with positive data1
    Given user navigate homepage
    When enter   first name "ahmed"
    And enter   last name "milpn"
    And enter   password "2121"
    
  Scenario: validate signup with positive data1
    Given user navigate homepage
    When enter   first name "sadat"
    And enter   last name "hossain"
    And enter   password "21asa21"