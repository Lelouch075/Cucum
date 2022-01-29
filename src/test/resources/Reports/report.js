$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/LoginPage.feature");
formatter.feature({
  "name": "Verifying Adactin Details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying adactin login with valid credentials.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the adactin page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should enter \"\u003cusername\u003e\"\"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should click login button",
  "keyword": "And "
});
formatter.step({
  "name": "User should select \"\u003clocation\u003e\" ,\"\u003chotel\u003e\" ,\"\u003croomType\u003e\" ,\"\u003cnoOfRoom\u003e\" ,\"\u003ccheckIn\u003e\" ,\"\u003ccheckOut\u003e\",\"\u003cadults\u003e\",\"\u003cchilds\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should verify \"Select Hotel\" message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "location",
        "hotel",
        "roomType",
        "noOfRoom",
        "checkIn",
        "checkOut",
        "adults",
        "childs"
      ]
    },
    {
      "cells": [
        "SheebaBuvana",
        "Sheeba@24",
        "New York",
        "Hotel Sunshine",
        "Deluxe",
        "2 - Two",
        "25/01/2022",
        "26/01/2022",
        "1 - One",
        "1 - One"
      ]
    },
    {
      "cells": [
        "SheebaBuvana",
        "Sheeba@24",
        "New York",
        "Hotel Sunshine",
        "Deluxe",
        "2 - Two",
        "25/01/2022",
        "26/01/2022",
        "1 - One",
        "1 - One"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying adactin login with valid credentials.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefn.user_is_on_the_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"SheebaBuvana\"\"Sheeba@24\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefn.user_should_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefn.user_should_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select \"New York\" ,\"Hotel Sunshine\" ,\"Deluxe\" ,\"2 - Two\" ,\"25/01/2022\" ,\"26/01/2022\",\"1 - One\",\"1 - One\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefn.user_should_select(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should verify \"Select Hotel\" message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefn.user_should_verify_message(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying adactin login with valid credentials.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefn.user_is_on_the_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter \"SheebaBuvana\"\"Sheeba@24\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefn.user_should_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefn.user_should_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should select \"New York\" ,\"Hotel Sunshine\" ,\"Deluxe\" ,\"2 - Two\" ,\"25/01/2022\" ,\"26/01/2022\",\"1 - One\",\"1 - One\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefn.user_should_select(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should verify \"Select Hotel\" message",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefn.user_should_verify_message(String)"
});
formatter.result({
  "status": "passed"
});
});