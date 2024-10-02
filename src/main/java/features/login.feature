#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login feature
Background:
Given I landed on login page 

  @tag1
  Scenario: Validate valid login
  
    When I entered valid username
    And I entered valid password
  And I clicked login button
    Then I should be on homepage
    Scenario: Validate in-valid login
    When I enter invalid username
    And enter invalid password
    And I clicked login button
    Then I should be seeing error message
     #Scenario Outline: Login to the app
   # Given I want go to "<url>"
  #  When I enter "<username>" and "<password>"
   # Then I click on the login button

 #   Examples: 
     # | url                         | username | password  |
   #   |https://login.salesforce.com |    rohini | Chennai12p1  |
    #  | https://login.salesforce.com|deekshith | deek1234  |


