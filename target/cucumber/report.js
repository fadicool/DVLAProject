$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 2,
  "name": "user",
  "description": "As a user of the website\r\nI want to be able to enter a vehicle registration number\r\nSo I check the vehicles make and colour.",
  "id": "user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test-Done"
    }
  ]
});
formatter.scenarioOutline({
  "line": 11,
  "name": "The user enters a valid vehicle registration number",
  "description": "",
  "id": "user;the-user-enters-a-valid-vehicle-registration-number",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 12,
  "name": "I enter vehicle registration number \u003cvalid-reg-number\u003e in the searchBox",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "press the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "the vehicles make \u003cmake\u003e and colour \u003ccolour\u003e should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "user;the-user-enters-a-valid-vehicle-registration-number;",
  "rows": [
    {
      "cells": [
        "valid-reg-number",
        "make",
        "colour"
      ],
      "line": 16,
      "id": "user;the-user-enters-a-valid-vehicle-registration-number;;1"
    },
    {
      "cells": [
        "KN09KTP",
        "MERCEDES-BENZ",
        "SILVER"
      ],
      "line": 17,
      "id": "user;the-user-enters-a-valid-vehicle-registration-number;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am on DVLAs Vehicles Information Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I proceed to check vehicles specific details",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.i_am_on_DVLAs_Vehicles_Information_Page()"
});
formatter.result({
  "duration": 7167067635,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.i_proceed_to_check_vehicles_specific_details()"
});
formatter.result({
  "duration": 6741530803,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "The user enters a valid vehicle registration number",
  "description": "",
  "id": "user;the-user-enters-a-valid-vehicle-registration-number;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Test-Done"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I enter vehicle registration number KN09KTP in the searchBox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "press the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "the vehicles make MERCEDES-BENZ and colour SILVER should be displayed",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "KN09KTP",
      "offset": 36
    }
  ],
  "location": "SearchSteps.i_enter_vehicle_registration_number_KN_KTP(String)"
});
formatter.result({
  "duration": 104544850,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.press_the_continue_button()"
});
formatter.result({
  "duration": 871689340,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MERCEDES-BENZ",
      "offset": 18
    },
    {
      "val": "SILVER",
      "offset": 43
    }
  ],
  "location": "SearchSteps.the_vehicles_make_and_colour_should_be_displayed(String,String)"
});
formatter.result({
  "duration": 126426655,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 20,
  "name": "The user enters an invalid vehicle registration number",
  "description": "",
  "id": "user;the-user-enters-an-invalid-vehicle-registration-number",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "I enter vehicle registration number \u003cinvalid-reg-number\u003e in the searchBox",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "press the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "an error \u003cerror-type\u003e should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "user;the-user-enters-an-invalid-vehicle-registration-number;",
  "rows": [
    {
      "cells": [
        "invalid-reg-number",
        "error-type"
      ],
      "line": 25,
      "id": "user;the-user-enters-an-invalid-vehicle-registration-number;;1"
    },
    {
      "cells": [
        "1234567",
        "page"
      ],
      "line": 26,
      "id": "user;the-user-enters-an-invalid-vehicle-registration-number;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am on DVLAs Vehicles Information Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I proceed to check vehicles specific details",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.i_am_on_DVLAs_Vehicles_Information_Page()"
});
formatter.result({
  "duration": 578470117,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.i_proceed_to_check_vehicles_specific_details()"
});
formatter.result({
  "duration": 3674594214,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "The user enters an invalid vehicle registration number",
  "description": "",
  "id": "user;the-user-enters-an-invalid-vehicle-registration-number;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Test-Done"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "I enter vehicle registration number 1234567 in the searchBox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "press the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "an error page should be displayed",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1234567",
      "offset": 36
    }
  ],
  "location": "SearchSteps.i_enter_vehicle_registration_number_KN_KTP(String)"
});
formatter.result({
  "duration": 87194675,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.press_the_continue_button()"
});
formatter.result({
  "duration": 99709825,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "page",
      "offset": 9
    }
  ],
  "location": "SearchSteps.an_error_should_be_displayed(String)"
});
formatter.result({
  "duration": 106197716,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 29,
  "name": "The user enters an invalid formatted vehicle registration number",
  "description": "",
  "id": "user;the-user-enters-an-invalid-formatted-vehicle-registration-number",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 30,
  "name": "I enter vehicle registration number \u003cinv-form-reg\u003e in the searchBox",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "press the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "an error \u003cerror-type\u003e should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 33,
  "name": "",
  "description": "",
  "id": "user;the-user-enters-an-invalid-formatted-vehicle-registration-number;",
  "rows": [
    {
      "cells": [
        "inv-form-reg",
        "error-type"
      ],
      "line": 34,
      "id": "user;the-user-enters-an-invalid-formatted-vehicle-registration-number;;1"
    },
    {
      "cells": [
        "ABC1234",
        "message"
      ],
      "line": 35,
      "id": "user;the-user-enters-an-invalid-formatted-vehicle-registration-number;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am on DVLAs Vehicles Information Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I proceed to check vehicles specific details",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.i_am_on_DVLAs_Vehicles_Information_Page()"
});
formatter.result({
  "duration": 514213997,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.i_proceed_to_check_vehicles_specific_details()"
});
formatter.result({
  "duration": 688982284,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "The user enters an invalid formatted vehicle registration number",
  "description": "",
  "id": "user;the-user-enters-an-invalid-formatted-vehicle-registration-number;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Test-Done"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "I enter vehicle registration number ABC1234 in the searchBox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "press the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "an error message should be displayed",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ABC1234",
      "offset": 36
    }
  ],
  "location": "SearchSteps.i_enter_vehicle_registration_number_KN_KTP(String)"
});
formatter.result({
  "duration": 92682883,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.press_the_continue_button()"
});
formatter.result({
  "duration": 602964650,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "message",
      "offset": 9
    }
  ],
  "location": "SearchSteps.an_error_should_be_displayed(String)"
});
formatter.result({
  "duration": 84793379,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 38,
  "name": "The user searches for a vehicle using external data \u003cfile-name\u003e",
  "description": "",
  "id": "user;the-user-searches-for-a-vehicle-using-external-data-\u003cfile-name\u003e",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 39,
  "name": "I get external test data \u003cfile-name\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I enter a vehicles registration number in the searchBox",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "press the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I should be taken to the relevant page",
  "keyword": "Then "
});
formatter.examples({
  "line": 43,
  "name": "",
  "description": "",
  "id": "user;the-user-searches-for-a-vehicle-using-external-data-\u003cfile-name\u003e;",
  "rows": [
    {
      "cells": [
        "file-name"
      ],
      "line": 44,
      "id": "user;the-user-searches-for-a-vehicle-using-external-data-\u003cfile-name\u003e;;1"
    },
    {
      "cells": [
        "file1.csv"
      ],
      "line": 45,
      "id": "user;the-user-searches-for-a-vehicle-using-external-data-\u003cfile-name\u003e;;2"
    },
    {
      "cells": [
        "file2.csv"
      ],
      "line": 46,
      "id": "user;the-user-searches-for-a-vehicle-using-external-data-\u003cfile-name\u003e;;3"
    },
    {
      "cells": [
        "file3.csv"
      ],
      "line": 47,
      "id": "user;the-user-searches-for-a-vehicle-using-external-data-\u003cfile-name\u003e;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am on DVLAs Vehicles Information Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I proceed to check vehicles specific details",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.i_am_on_DVLAs_Vehicles_Information_Page()"
});
formatter.result({
  "duration": 520018327,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.i_proceed_to_check_vehicles_specific_details()"
});
formatter.result({
  "duration": 1008883030,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "The user searches for a vehicle using external data file1.csv",
  "description": "",
  "id": "user;the-user-searches-for-a-vehicle-using-external-data-\u003cfile-name\u003e;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Test-Done"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "I get external test data file1.csv",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I enter a vehicles registration number in the searchBox",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "press the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I should be taken to the relevant page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "file1.csv",
      "offset": 25
    }
  ],
  "location": "SearchSteps.i_get_external_test_data(String)"
});
formatter.result({
  "duration": 1571579,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.i_enter_a_vehicles_registration_number_in_the_searchBox()"
});
formatter.result({
  "duration": 93810658,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.press_the_continue_button()"
});
formatter.result({
  "duration": 575366374,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.i_should_be_taken_to_the_relevant_page()"
});
formatter.result({
  "duration": 32434,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am on DVLAs Vehicles Information Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I proceed to check vehicles specific details",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.i_am_on_DVLAs_Vehicles_Information_Page()"
});
formatter.result({
  "duration": 830299109,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.i_proceed_to_check_vehicles_specific_details()"
});
formatter.result({
  "duration": 2107541851,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "The user searches for a vehicle using external data file2.csv",
  "description": "",
  "id": "user;the-user-searches-for-a-vehicle-using-external-data-\u003cfile-name\u003e;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Test-Done"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "I get external test data file2.csv",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I enter a vehicles registration number in the searchBox",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "press the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I should be taken to the relevant page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "file2.csv",
      "offset": 25
    }
  ],
  "location": "SearchSteps.i_get_external_test_data(String)"
});
formatter.result({
  "duration": 1202085,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.i_enter_a_vehicles_registration_number_in_the_searchBox()"
});
formatter.result({
  "duration": 95672494,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.press_the_continue_button()"
});
formatter.result({
  "duration": 580634116,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.i_should_be_taken_to_the_relevant_page()"
});
formatter.result({
  "duration": 30791,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am on DVLAs Vehicles Information Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I proceed to check vehicles specific details",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.i_am_on_DVLAs_Vehicles_Information_Page()"
});
formatter.result({
  "duration": 573468409,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.i_proceed_to_check_vehicles_specific_details()"
});
formatter.result({
  "duration": 603829675,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "The user searches for a vehicle using external data file3.csv",
  "description": "",
  "id": "user;the-user-searches-for-a-vehicle-using-external-data-\u003cfile-name\u003e;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Test-Done"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "I get external test data file3.csv",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I enter a vehicles registration number in the searchBox",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "press the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I should be taken to the relevant page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "file3.csv",
      "offset": 25
    }
  ],
  "location": "SearchSteps.i_get_external_test_data(String)"
});
formatter.result({
  "duration": 5050974,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.i_enter_a_vehicles_registration_number_in_the_searchBox()"
});
formatter.result({
  "duration": 95580942,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.press_the_continue_button()"
});
formatter.result({
  "duration": 481566799,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.i_should_be_taken_to_the_relevant_page()"
});
formatter.result({
  "duration": 42286,
  "status": "passed"
});
});