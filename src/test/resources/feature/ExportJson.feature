@exportjson
Feature: to verify the functionality of exportjson

@smoke20
Scenario: to validate the funtionality of step level rules 
Given user login into studio appliction 
And user will enter the user name <username> 
And user will enter the password <password>  
Then user will clicks the login button 
And User will click on the studio icon
Then user will Click the create new app button
Then user will Enter the app name
Then user will Click create app button
Then User will click add process button
Then User will select new process
Then User will add process name in name field
Then User will Click Add process
Then User will add swimlane
Then user will enter the swimlane name 
Then user will click save button
Then User will add step in swimlane
Then User will enter the step name
Then User Will click save button 
Then user will drag and drop field in step
Then user will enter the field name 
Then user will click Save button 
Then export JSON button should visible on the side toolbar 





Examples: 

|username|password|
|kunkkumaraj+testing@getcerta.com|Tamilkunfu@01|
