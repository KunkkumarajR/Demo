@processcreation
Feature:   to verify the functionality of process creation
@smoke4
Scenario:  to add process validation in app
Given user login into studio appliction 
And user will enter the user name <username> 

And user will enter the password <password>  

Then user will clicks the login button 
And User will click on the studio icon
Then user will Click the Create new app button
Then user will Enter the app Name
Then User will Check create App button is clickable or not
Then user will Click create App button
Then user will check add process button will clickable or not
Then user will click add process
Then user will check add a new proces and import process from json appears
Then user will select add new process
Then user will check add new process dialogue box appears or not
Then user will check process name and description are appears or not 
Then user will click add process button 
Then user will check alert message for without name on name field 
Then user will check alert message for space on name field

Examples: 

|username|password|
|kunkkumaraj+testing@getcerta.com|Tamilkunfu@01|


@smoke5
Scenario: to add process in app
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



Examples: 

|username|password|
|kunkkumaraj+testing@getcerta.com|Tamilkunfu@01|
