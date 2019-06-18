$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features\\taggedhooks.feature");
formatter.feature({
  "line": 1,
  "name": "Test Tagged Hooks",
  "description": "",
  "id": "test-tagged-hooks",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "This is First Scenario",
  "description": "",
  "id": "test-tagged-hooks;this-is-first-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@First"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "this is the first step",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "this is the second step",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "this is the third step",
  "keyword": "Then "
});
formatter.match({
  "location": "TaggedhooksStepDefinition.this_is_the_first_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TaggedhooksStepDefinition.this_is_the_second_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TaggedhooksStepDefinition.this_is_the_third_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 10,
  "name": "This is Second Scenario",
  "description": "",
  "id": "test-tagged-hooks;this-is-second-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Second"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "this is the first step",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "this is the second step",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "this is the third step",
  "keyword": "Then "
});
formatter.match({
  "location": "TaggedhooksStepDefinition.this_is_the_first_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TaggedhooksStepDefinition.this_is_the_second_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TaggedhooksStepDefinition.this_is_the_third_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 16,
  "name": "This is Third Scenario",
  "description": "",
  "id": "test-tagged-hooks;this-is-third-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Third"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "this is the first step",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "this is the second step",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "this is the third step",
  "keyword": "Then "
});
formatter.match({
  "location": "TaggedhooksStepDefinition.this_is_the_first_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TaggedhooksStepDefinition.this_is_the_second_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TaggedhooksStepDefinition.this_is_the_third_step()"
});
formatter.result({
  "status": "skipped"
});
});