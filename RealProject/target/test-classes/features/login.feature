Feature: Secure Functionality verification
	I want to use this feature file to test the invoice features


Scenario Outline: Secure Module Login
Given open the browser
When I want to getin to the URL with "<url>"
When I use the username as "<username>"
When I use the password as "<password>"
When I click the login button
Then I want to login to the application successfully
	

Examples:
|url|username|password|
|http://downloads.smartbear.com/samples/TestComplete10/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete10%2fWebOrders%2fdefault.aspx|Tester|test|
#|http://downloads.smartbear.com/samples/TestComplete10/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete10%2fWebOrders%2fdefault.aspx|Tester|test|
#|http://downloads.smartbear.com/samples/TestComplete10/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete10%2fWebOrders%2fdefault.aspx|Tester|test|