Feature: Test CRUD actions
  Validate the CRUD actions on the Computers database

  Background: 
    Given I Navigate to "https://computer-database.herokuapp.com/computers"

  Scenario: Add a new computer
    When I want to add a new computer
    And I enter details: Computer name "New Computer Name - Osiris" and Introduced date "1990-12-18" and Discontinued date "2000-12-18" and Company "Nokia"
    Then I validate the computer "New Computer Name - Osiris" has been "created" 

  Scenario: Verify if the computer added is present when filtering
    When I search for "New Computer Name - Osiris"
    Then I validate "New Computer Name - Osiris" is present

  Scenario: Edit an existing computer
    When I search for "New Computer Name - Osiris"
    And Open the "New Computer Name - Osiris" details
    And I enter details: Computer name "EditedComputer" and Introduced date "1998-10-20" and Discontinued date "2012-10-15" and Company "Sony"
    Then I validate the computer "EditedComputer" has been "updated" 

   Scenario: Delete computer
   When I search for "EditedComputer"
    And Open the "EditedComputer" details
    And I delete the computer
    Then I validate the computer "EditedComputer" has been "deleted"