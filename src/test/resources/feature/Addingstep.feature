@Addingstep
Feature: to verify the functionality of add step in swimlane

@smoke9
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

Examples: 

|username|password|
|kunkkumaraj+testing@getcerta.com|Tamilkunfu@01|



@smoke10
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
Then user will check add step is clickable
Then user will check step should be visible on the canvas
Then user will check step should be clickable on the canvas
Then user will check step pop-up should appears when user hover on the step of canvas
Then user will Drag and drop step in swimlane
Then user will check step configuration screen should open when drag and drop step in swim
Then user will check Validation message should appears when click on the save button with empty name of step field
Then user will check step should not be created when user fill the mandatory field and click on the cancel button
Then user will check step should be selected when user press S alphabet on the keyboard
Then user will check step should created when user fill the name of step field and click on the save button 




Examples: 

|username|password|
|kunkkumaraj+testing@getcerta.com|Tamilkunfu@01|







