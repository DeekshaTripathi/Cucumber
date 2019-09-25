
Feature: Login Action
  

 
  Scenario Outline: Successful Login with Valid Credentials
    Given User is open the application
    And User click on to signin link
    When user enters "<username>" and "<password>"
    Then Message displayed login Successfully
   
 
    Examples: 
      | username   |     password       |
      | lalitha    |     password123    | 
      | admin      |     password456    |
