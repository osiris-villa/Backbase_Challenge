$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test.feature");
formatter.feature({
  "line": 1,
  "name": "Test CRUD actions",
  "description": "Validate the CRUD actions on the Computers database",
  "id": "test-crud-actions",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5248001629,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I Navigate to \"https://computer-database.herokuapp.com/computers\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://computer-database.herokuapp.com/computers",
      "offset": 15
    }
  ],
  "location": "StepDefs_CRUD.i_Navigate_to(String)"
});
formatter.result({
  "duration": 890282723,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Add a new computer",
  "description": "",
  "id": "test-crud-actions;add-a-new-computer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I want to add a new computer",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter details: Computer name \"New Computer Name - Osiris\" and Introduced date \"1990-12-18\" and Discontinued date \"2000-12-18\" and Company \"Nokia\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I validate the computer \"New Computer Name - Osiris\" has been \"created\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefs_CRUD.i_want_to_add_a_new_computer()"
});
formatter.result({
  "duration": 273474699,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New Computer Name - Osiris",
      "offset": 32
    },
    {
      "val": "1990-12-18",
      "offset": 81
    },
    {
      "val": "2000-12-18",
      "offset": 116
    },
    {
      "val": "Nokia",
      "offset": 141
    }
  ],
  "location": "StepDefs_CRUD.i_enter_details_Computer_name_Introduced_date_Discontinued_date_and_Company(String,String,String,String)"
});
formatter.result({
  "duration": 585970323,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New Computer Name - Osiris",
      "offset": 25
    },
    {
      "val": "created",
      "offset": 63
    }
  ],
  "location": "StepDefs_CRUD.i_validate_the_computer_has_been_added(String,String)"
});
formatter.result({
  "duration": 20985697,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 543543964,
  "status": "passed"
});
formatter.before({
  "duration": 2125369474,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I Navigate to \"https://computer-database.herokuapp.com/computers\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://computer-database.herokuapp.com/computers",
      "offset": 15
    }
  ],
  "location": "StepDefs_CRUD.i_Navigate_to(String)"
});
formatter.result({
  "duration": 759281897,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Verify if the computer added is present when filtering",
  "description": "",
  "id": "test-crud-actions;verify-if-the-computer-added-is-present-when-filtering",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I search for \"New Computer Name - Osiris\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I validate \"New Computer Name - Osiris\" is present",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "New Computer Name - Osiris",
      "offset": 14
    }
  ],
  "location": "StepDefs_CRUD.i_search_for(String)"
});
formatter.result({
  "duration": 215837602,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New Computer Name - Osiris",
      "offset": 12
    }
  ],
  "location": "StepDefs_CRUD.i_validate_is_present(String)"
});
formatter.result({
  "duration": 195963825,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 485697436,
  "status": "passed"
});
formatter.before({
  "duration": 2109055647,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I Navigate to \"https://computer-database.herokuapp.com/computers\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://computer-database.herokuapp.com/computers",
      "offset": 15
    }
  ],
  "location": "StepDefs_CRUD.i_Navigate_to(String)"
});
formatter.result({
  "duration": 670018393,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Edit an existing computer",
  "description": "",
  "id": "test-crud-actions;edit-an-existing-computer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I search for \"New Computer Name - Osiris\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Open the \"New Computer Name - Osiris\" details",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter details: Computer name \"EditedComputer\" and Introduced date \"1998-10-20\" and Discontinued date \"2012-10-15\" and Company \"Sony\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I validate the computer \"EditedComputer\" has been \"updated\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "New Computer Name - Osiris",
      "offset": 14
    }
  ],
  "location": "StepDefs_CRUD.i_search_for(String)"
});
formatter.result({
  "duration": 201614462,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New Computer Name - Osiris",
      "offset": 10
    }
  ],
  "location": "StepDefs_CRUD.open_the_details(String)"
});
formatter.result({
  "duration": 366813553,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EditedComputer",
      "offset": 32
    },
    {
      "val": "1998-10-20",
      "offset": 69
    },
    {
      "val": "2012-10-15",
      "offset": 104
    },
    {
      "val": "Sony",
      "offset": 129
    }
  ],
  "location": "StepDefs_CRUD.i_enter_details_Computer_name_Introduced_date_Discontinued_date_and_Company(String,String,String,String)"
});
formatter.result({
  "duration": 579595925,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EditedComputer",
      "offset": 25
    },
    {
      "val": "updated",
      "offset": 51
    }
  ],
  "location": "StepDefs_CRUD.i_validate_the_computer_has_been_added(String,String)"
});
formatter.result({
  "duration": 11249754,
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 515910766,
  "status": "passed"
});
formatter.before({
  "duration": 2110814413,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I Navigate to \"https://computer-database.herokuapp.com/computers\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://computer-database.herokuapp.com/computers",
      "offset": 15
    }
  ],
  "location": "StepDefs_CRUD.i_Navigate_to(String)"
});
formatter.result({
  "duration": 632061141,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Delete computer",
  "description": "",
  "id": "test-crud-actions;delete-computer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "I search for \"EditedComputer\"",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Open the \"EditedComputer\" details",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I delete the computer",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I validate the computer \"EditedComputer\" has been \"deleted\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "EditedComputer",
      "offset": 14
    }
  ],
  "location": "StepDefs_CRUD.i_search_for(String)"
});
formatter.result({
  "duration": 545274574,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EditedComputer",
      "offset": 10
    }
  ],
  "location": "StepDefs_CRUD.open_the_details(String)"
});
formatter.result({
  "duration": 386967195,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs_CRUD.i_delete_the_computer()"
});
formatter.result({
  "duration": 264817533,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EditedComputer",
      "offset": 25
    },
    {
      "val": "deleted",
      "offset": 51
    }
  ],
  "location": "StepDefs_CRUD.i_validate_the_computer_has_been_added(String,String)"
});
formatter.result({
  "duration": 12253144,
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 513996945,
  "status": "passed"
});
});