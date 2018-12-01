$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Googlesearch.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author:thevakajan3@gmail.com"
    }
  ],
  "line": 2,
  "name": "Validate google search",
  "description": "I want to use this template for my feature file",
  "id": "validate-google-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Title of your scenario",
  "description": "",
  "id": "validate-google-search;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I open a browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I navigate to google page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I validate the search text field",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearch.i_open_a_browser()"
});
formatter.result({
  "duration": 13889099756,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearch.i_navigate_to_google_page()"
});
formatter.result({
  "duration": 2456995450,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearch.i_validate_the_search_text_field()"
});
formatter.result({
  "duration": 34607757,
  "status": "passed"
});
});