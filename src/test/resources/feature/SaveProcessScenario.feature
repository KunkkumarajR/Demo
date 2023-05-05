@savprocessscenario
Feature:   to verify the functionality of save process creation
@smoke13
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
Then user will check save button should visible to user on the right top corner of screen
Then User will check save button should be clickable
Then user will check save process pop-up should appears when the user hover over the save button
Then user will check app should be saved when user click on the save button
Then user will check submit button should clickable
Then user will check After clicking on the submit button Edit button should visible to user
Then user will check after clicking on the submit button edit button should visible to user on the screen
Then user will check both edit button should be clickable
Then user will check user should  navigates to the process landing page
Then user will check deploy button should visible to user on the process landing page
Then user will check click on the deploy button dialogue box should appears
Then user will check user should able to deploy the app



Examples: 

|username|password|
|kunkkumaraj+testing@getcerta.com|Tamilkunfu@01|
