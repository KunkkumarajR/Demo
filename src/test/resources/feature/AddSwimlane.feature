@addswimlane
Feature: to verify the functionality of add swimlane

@smoke7
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
Then user will check lane is visibile on canvas or not 
Then user will check lane button is clickable or not
Then user will check Hover on the Lane button and add swimlane pop is appearing or not
Then user will check the configuration screen is opened when click on the lane and drop it on the screen
Then user will check swimlane is not created when user clicks on the cancel button on the configuration screen
Then user will swimlane is selected when user press the L keyword


Examples: 

|username|password|
|kunkkumaraj+testing@getcerta.com|Tamilkunfu@01|



@smoke8
Scenario: to add swimlane 
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



Examples: 

|username|password|
|kunkkumaraj+testing@getcerta.com|Tamilkunfu@01|
