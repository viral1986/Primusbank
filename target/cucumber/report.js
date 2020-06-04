$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 565735100,
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
  "duration": 6944566600,
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
  "duration": 1783665600,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login Functionality for valid Username and  valid Password",
  "description": "",
  "id": "login-feature;login-functionality-for-valid-username-and--valid-password",
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
  "duration": 383063100,
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
  "duration": 113230600,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_click_on_Login_button()"
});
formatter.result({
  "duration": 1186465700,
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
  "duration": 58040300,
  "status": "passed"
});
formatter.after({
  "duration": 2528391000,
  "status": "passed"
});
formatter.before({
  "duration": 142882700,
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
  "duration": 6186742100,
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
  "duration": 1610362500,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Login Functionality for unvalid Username and  unvalid Password",
  "description": "",
  "id": "login-feature;login-functionality-for-unvalid-username-and--unvalid-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "user enters \"ADMIN\" as a username",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user enters \"AdM123\" as a password",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user click on Login button",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user gets error msg",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "ADMIN",
      "offset": 13
    }
  ],
  "location": "Login.user_enters_as_a_username(String)"
});
formatter.result({
  "duration": 129390000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AdM123",
      "offset": 13
    }
  ],
  "location": "Login.user_enters_as_a_password(String)"
});
formatter.result({
  "duration": 94752500,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_click_on_Login_button()"
});
formatter.result({
  "duration": 1068644700,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_gets_error_msg()"
});
formatter.result({
  "duration": 22007800,
  "error_message": "java.lang.ArrayIndexOutOfBoundsException: 0\r\n\tat bank.methods.SeleniumOperations.validationfail(SeleniumOperations.java:373)\r\n\tat bank.cucumbermap.Login.user_gets_error_msg(Login.java:94)\r\n\tat ✽.Then user gets error msg(Login.feature:24)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 109665000,
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
  "duration": 160006600,
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
  "duration": 6133862700,
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
  "duration": 1731257000,
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
  "duration": 129128900,
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
  "duration": 116083700,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_click_on_Login_button()"
});
formatter.result({
  "duration": 1069645600,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Search functionality with validatation",
  "description": "",
  "id": "search-feature;search-functionality-with-validatation",
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
  "duration": 767021200,
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
  "duration": 337897100,
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
  "duration": 581724200,
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
  "duration": 106153800,
  "status": "passed"
});
formatter.match({
  "location": "Search.user_click_on_Search_button()"
});
formatter.result({
  "duration": 232379700,
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
  "duration": 38798100,
  "status": "passed"
});
formatter.after({
  "duration": 59887800,
  "status": "passed"
});
});