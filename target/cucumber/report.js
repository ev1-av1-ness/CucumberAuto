$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Login.feature");
formatter.feature({
  "name": "Application Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Home page default login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@WebTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User login into application with \"jin\" and \"1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_login_into_application_with_something_and_something(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.home_page_is_populated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Cards displayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.cards_displayed_are_something(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Home page default login with many parameters",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@WebTest"
    }
  ]
});
formatter.step({
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.step({
  "name": "User login into with \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.step({
  "name": "Cards displayed are \"true\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "user1",
        "pass1"
      ]
    },
    {
      "cells": [
        "user2",
        "pass2"
      ]
    },
    {
      "cells": [
        "user3",
        "pass3"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Home page default login with many parameters",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@WebTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User login into with user1 and pass1",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_login_into_with_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.home_page_is_populated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Cards displayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.cards_displayed_are_something(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Home page default login with many parameters",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@WebTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User login into with user2 and pass2",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_login_into_with_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.home_page_is_populated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Cards displayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.cards_displayed_are_something(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Home page default login with many parameters",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@WebTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on NetBanking landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_is_on_netbanking_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User login into with user3 and pass3",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_login_into_with_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Home page is populated",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.home_page_is_populated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Cards displayed are \"true\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.cards_displayed_are_something(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});