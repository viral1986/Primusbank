Feature: Search Feature



Background: User is successfully logged in
When  user opens the "chrome" browser and exe "F:\\DRIVERS AUTOMATIONS\\ChromeDriver.exe"
When user enters the url "http://primusbank.qedgetech.com/"
When user enters "Admin" as a username
When user enters "Admin" as a password
When user click on Login button

@SmokeTest
Scenario: Search functionality with validatation
When user click on branches
When user select "INDIA" as a counrty
When user select "MAHARASTRA" as a state
When user select "SHIRDI" as a city
When user click on Search button
Then Application shows search result for "SHIRDI" city


