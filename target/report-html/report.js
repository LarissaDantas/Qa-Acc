$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/sampleapp.feature");
formatter.feature({
  "line": 2,
  "name": "SampleApp",
  "description": "",
  "id": "sampleapp",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": ": Vehicle Insurance Application",
  "description": "",
  "id": "sampleapp;:-vehicle-insurance-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I make a vehicle insurance request",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I fill out the Insert Vehicle Data form \u003ckw\u003e, \u003cListPrice\u003e, \u003cAnnualMileage\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I fill out the Enter Insurance Data form \u003cFirstName\u003e, \u003cLastName\u003e, \u003cDateofBirth\u003e, \u003cCountry\u003e, \u003cZipCode\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I fill out the Enter Product Data form \u003cStartDate\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I fill out the Select Price Option form",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I fill out the Send Quote form \u003cEmail\u003e, \u003cUsarname\u003e, \u003cPassword\u003e, \u003cConfirmPassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I see the message \u003cmessageSucess\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "sampleapp;:-vehicle-insurance-application;",
  "rows": [
    {
      "cells": [
        "kw",
        "ListPrice",
        "AnnualMileage",
        "FirstName",
        "LastName",
        "DateofBirth",
        "Country",
        "ZipCode",
        "StartDate",
        "Email",
        "Usarname",
        "Password",
        "ConfirmPassword",
        "messageSucess"
      ],
      "line": 14,
      "id": "sampleapp;:-vehicle-insurance-application;;1"
    },
    {
      "cells": [
        "100",
        "45000",
        "1000",
        "Camila",
        "Silva",
        "10/29/1993",
        "Brazil",
        "09210200",
        "04/27/2021",
        "camilla.silva@gmail.com",
        "camillaSilva",
        "123@Ab5678",
        "123@Ab5678",
        "Sending e-mail success!"
      ],
      "line": 15,
      "id": "sampleapp;:-vehicle-insurance-application;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": ": Vehicle Insurance Application",
  "description": "",
  "id": "sampleapp;:-vehicle-insurance-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I make a vehicle insurance request",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I fill out the Insert Vehicle Data form 100, 45000, 1000",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I fill out the Enter Insurance Data form Camila, Silva, 10/29/1993, Brazil, 09210200",
  "matchedColumns": [
    3,
    4,
    5,
    6,
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I fill out the Enter Product Data form 04/27/2021",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I fill out the Select Price Option form",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I fill out the Send Quote form camilla.silva@gmail.com, camillaSilva, 123@Ab5678, 123@Ab5678",
  "matchedColumns": [
    9,
    10,
    11,
    12
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I see the message Sending e-mail success!",
  "matchedColumns": [
    13
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.ImakeAVehicleInsuranceRequest()"
});
formatter.result({
  "duration": 19196371700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 40
    },
    {
      "val": "45000",
      "offset": 45
    },
    {
      "val": "1000",
      "offset": 52
    }
  ],
  "location": "Steps.iFillOutTheInsertVehicleDataForm(String,String,String)"
});
formatter.result({
  "duration": 9820810600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Camila",
      "offset": 41
    },
    {
      "val": "Silva",
      "offset": 49
    },
    {
      "val": "10/29/1993",
      "offset": 56
    },
    {
      "val": "Brazil",
      "offset": 68
    },
    {
      "val": "09210200",
      "offset": 76
    }
  ],
  "location": "Steps.iFillOutTheEnterInsuranceDataFormFirstNameLastNameCountryZipCode(String,String,String,String,String)"
});
formatter.result({
  "duration": 1223209200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "04/27/2021",
      "offset": 39
    }
  ],
  "location": "Steps.iFillOutTheEnterProductDataForm(String)"
});
formatter.result({
  "duration": 874957300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.iFillOutTheSelectPriceOptionForm()"
});
formatter.result({
  "duration": 226949700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "camilla.silva@gmail.com",
      "offset": 31
    },
    {
      "val": "camillaSilva",
      "offset": 56
    },
    {
      "val": "123@Ab5678",
      "offset": 70
    },
    {
      "val": "123@Ab5678",
      "offset": 82
    }
  ],
  "location": "Steps.iFillOutTheSendQuoteFormEmailPhoneUsarnamePasswordConfirmPassword(String,String,String,String)"
});
formatter.result({
  "duration": 1170540400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sending e-mail success!",
      "offset": 18
    }
  ],
  "location": "Steps.iSeeTheMessageMessage(String)"
});
formatter.result({
  "duration": 9286060900,
  "status": "passed"
});
});