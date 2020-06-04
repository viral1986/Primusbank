$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 183700,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "User is successfully logged in",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user opens the \"chrome\" browser and exe \"F:\\\\DRIVERS AUTOMATIONS\\\\ChromeDriver.exe\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters the url \"http://primusbank.qedgetech.com/\"",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 16
    },
    {
      "val": "F:\\\\DRIVERS AUTOMATIONS\\\\ChromeDriver.exe",
      "offset": 41
    }
  ],
  "location": "Login.user_opens_the_browser_and_exe(String,String)"
});
formatter.result({
  "duration": 6422122200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://primusbank.qedgetech.com/",
      "offset": 21
    }
  ],
  "location": "Login.user_enters_the_url(String)"
});
formatter.result({
  "duration": 2421510100,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login Functionality for valid Username and  Unvalid Password",
  "description": "",
  "id": "login-feature;login-functionality-for-valid-username-and--unvalid-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user enters \"Admin\" as a username",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user enters \"Admin\" as a password",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user click on Login button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user is on \"Admin\" main page and get masg welcome to Admin",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 13
    }
  ],
  "location": "Login.user_enters_as_a_username(String)"
});
formatter.result({
  "duration": 222076000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 13
    }
  ],
  "location": "Login.user_enters_as_a_password(String)"
});
formatter.result({
  "duration": 172361200,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_click_on_Login_button()"
});
formatter.result({
  "duration": 1651307300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 12
    }
  ],
  "location": "Login.user_is_on_main_page_and_get_masg_welcome_to_Admin(String)"
});
formatter.result({
  "duration": 105061000,
  "status": "passed"
});
formatter.after({
  "duration": 156300,
  "status": "passed"
});
formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "Search Feature",
  "description": "",
  "id": "search-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 164600,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "User is successfully logged in",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user opens the \"chrome\" browser and exe \"F:\\\\DRIVERS AUTOMATIONS\\\\ChromeDriver.exe\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters the url \"http://primusbank.qedgetech.com/\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters \"Admin\" as a username",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters \"Admin\" as a password",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user click on Login button",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "chrome",
      "offset": 16
    },
    {
      "val": "F:\\\\DRIVERS AUTOMATIONS\\\\ChromeDriver.exe",
      "offset": 41
    }
  ],
  "location": "Login.user_opens_the_browser_and_exe(String,String)"
});
formatter.result({
  "duration": 5693531900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://primusbank.qedgetech.com/",
      "offset": 21
    }
  ],
  "location": "Login.user_enters_the_url(String)"
});
formatter.result({
  "duration": 1660446800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 13
    }
  ],
  "location": "Login.user_enters_as_a_username(String)"
});
formatter.result({
  "duration": 184140600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 13
    }
  ],
  "location": "Login.user_enters_as_a_password(String)"
});
formatter.result({
  "duration": 212569600,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_click_on_Login_button()"
});
formatter.result({
  "duration": 1066015200,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Search functionality with validate",
  "description": "",
  "id": "search-feature;search-functionality-with-validate",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user click on branches",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user select \"INDIA\" as a counrty",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user select \"MAHARASTRA\" as a state",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user select \"SHIRDI\" as a city",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user click on Search button",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Application shows search result for \"SHIRDI\" city",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.user_click_on_branches()"
});
formatter.result({
  "duration": 569501000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "INDIA",
      "offset": 13
    }
  ],
  "location": "Search.user_select_as_a_counrty(String)"
});
formatter.result({
  "duration": 166686600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MAHARASTRA",
      "offset": 13
    }
  ],
  "location": "Search.user_select_as_a_state(String)"
});
formatter.result({
  "duration": 341962800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SHIRDI",
      "offset": 13
    }
  ],
  "location": "Search.user_select_as_a_city(String)"
});
formatter.result({
  "duration": 348009900,
  "status": "passed"
});
formatter.match({
  "location": "Search.user_click_on_Search_button()"
});
formatter.result({
  "duration": 284799500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SHIRDI",
      "offset": 37
    }
  ],
  "location": "Search.application_shows_search_result_for_city(String)"
});
formatter.result({
  "duration": 37758800,
  "status": "passed"
});
formatter.after({
  "duration": 37000,
  "status": "passed"
});
});