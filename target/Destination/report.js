$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/addcomment.feature");
formatter.feature({
  "line": 2,
  "name": "Add comment to online shop",
  "description": "",
  "id": "add-comment-to-online-shop",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@all"
    }
  ]
});
formatter.before({
  "duration": 36672602900,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#user should be able to add comment"
    }
  ],
  "line": 5,
  "name": "User should be able to add comment successfully",
  "description": "",
  "id": "add-comment-to-online-shop;user-should-be-able-to-add-comment-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter comment",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user should be able see comment added successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepsDefs.user_is_on_home_page()"
});
formatter.result({
  "duration": 1659677100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsDefs.user_enter_comment()"
});
formatter.result({
  "duration": 10185589700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsDefs.user_should_be_able_see_comment_added_successfully()"
});
formatter.result({
  "duration": 192291000,
  "status": "passed"
});
formatter.after({
  "duration": 1087093200,
  "status": "passed"
});
formatter.uri("src/test/resources/features/currency.feature");
formatter.feature({
  "line": 2,
  "name": "Currency change of product price",
  "description": "",
  "id": "currency-change-of-product-price",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@all"
    }
  ]
});
formatter.before({
  "duration": 15306963600,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#user should be able to change currency with success"
    }
  ],
  "line": 6,
  "name": "User should be able change currency successfully",
  "description": "",
  "id": "currency-change-of-product-price;user-should-be-able-change-currency-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@test2"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user change currency from selector menu",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user should be able see changed currency successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepsDefs.user_is_on_home_page()"
});
formatter.result({
  "duration": 518500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsDefs.user_change_currency_from_selector_menu()"
});
formatter.result({
  "duration": 3119314900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsDefs.user_should_be_able_see_changed_currency_successfully()"
});
formatter.result({
  "duration": 297797200,
  "status": "passed"
});
formatter.after({
  "duration": 944558400,
  "status": "passed"
});
formatter.uri("src/test/resources/features/registration.feature");
formatter.feature({
  "line": 2,
  "name": "Registration",
  "description": "",
  "id": "registration",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@all"
    }
  ]
});
formatter.before({
  "duration": 13271981000,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#user should be able to register"
    }
  ],
  "line": 5,
  "name": "User should be able to register",
  "description": "",
  "id": "registration;user-should-be-able-to-register",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@test3"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on register page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "when user enter all registration details",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user should be able to register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepsDefs.user_is_on_register_page()"
});
formatter.result({
  "duration": 2500876100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsDefs.when_user_enter_all_registration_details()"
});
formatter.result({
  "duration": 11265948000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsDefs.user_should_be_able_to_register_successfully()"
});
formatter.result({
  "duration": 62212900,
  "status": "passed"
});
formatter.after({
  "duration": 1151204200,
  "status": "passed"
});
});