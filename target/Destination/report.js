$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/registration.feature");
formatter.feature({
  "line": 1,
  "name": "Registration feature",
  "description": "",
  "id": "registration-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10533176600,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should able to register successfully,so that user can use all",
  "description": "functionality on my website",
  "id": "registration-feature;user-should-able-to-register-successfully,so-that-user-can-use-all",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@trail"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user clicks on register button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters all required registration deatils",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user should able to register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.user_is_on_homepage()"
});
formatter.result({
  "duration": 1199674100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_clicks_on_register_button()"
});
formatter.result({
  "duration": 3538578400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_enters_all_required_registration_deatils()"
});
formatter.result({
  "duration": 271401066299,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_should_able_to_register_successfully()"
});
formatter.result({
  "duration": 644656900,
  "status": "passed"
});
formatter.after({
  "duration": 90331800,
  "status": "passed"
});
});