Feature: Login Functionality
Background: User is on Flipkart home page and hover mouse to Login button
Given user open "Chrome" browser with exe path as "D:\\PerfectLearn\\Automation Support\\chromedriver.exe"
Given user enter "https://www.flipkart.com/" as url
Given user click on cancel button to close login pop-up
Given user hover mouse on Login button

@SmokeTest
Scenario: To check Login Functionality using valid credentials
When user click on My Profile button
When user enter "aniket9497@gmail.com" as username
When user enter "aniket97" as password
When user click on Login button
Then appliaction shows profile to user