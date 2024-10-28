@smoke
Feature: Parabank Login Testing
Scenario: As a user I want to login to Parabank website using valid credentials
Given The browser is open
And Pass the Parabank URL "https://parabank.parasoft.com/parabank/index.htm"
And Enter Username in username Field "FarhanS"
And Enter Password in password field "Farhan96"
Then Click on login button
Then Validate Login is successful
Then Quit the browser