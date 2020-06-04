Feature: Login Feature



Background: User is successfully logged in
When  user opens the "chrome" browser and exe "F:\\DRIVERS AUTOMATIONS\\ChromeDriver.exe"
When user enters the url "http://primusbank.qedgetech.com/"



@SmokeTest
Scenario: Login Functionality for valid Username and  valid Password
When user enters "Admin" as a username
When user enters "Admin" as a password
When user click on Login button
Then user is on "Admin" main page and get masg welcome to Admin


         



