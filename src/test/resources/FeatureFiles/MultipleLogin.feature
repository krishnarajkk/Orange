Feature: Login 
Scenario Outline: Login the Application with valid and invalid inputs

Given the user navigates to the login page
When the user enter the "<username>" and "<password>" 
And click the login button
Then the user should verify the outcomes for the respective input

Examples:
|username|password|
|Admin|admin123|
|Admin|Admin321|
|admin|admin123|
|admin123|admin|