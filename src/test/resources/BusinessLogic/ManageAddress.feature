Feature: Manage Address Functionality
Background: User is on his profle page
Given user open "Chrome" browser with exe path as "D:\\PerfectLearn\\Automation Support\\chromedriver.exe"
Given user enter "https://www.flipkart.com/" as url
Given user click on cancel button to close login pop-up
Given user hover mouse on Login button
Given user click on My Profile button
Given user enter "aniket9497@gmail.com" as username
Given user enter "aniket97" as password
Given user click on Login button


@RegressionTest
Scenario: To check Manage Address functionality
When user click on Manage Address button
When user click on Add New Address button
When user enter "Aniket Deshmukh" as name
When user enter "9890935583" as mobile number
When user enter "422003" as pincode
When user enter "Panchavati" as locality
When user enter "Flat No=5, Shree Samartha Appt, Damodar Nagar,Opposite Rajlaxmi Bank, Hirawadi Road" as address
When user select Home as address type
When user click on Save button
Then application shows new address on profile page