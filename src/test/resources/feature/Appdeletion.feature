@appdeletion1
Feature: to verify the functionality of app deletion

@smoke6
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
Then User will check the three dots on the top right screen is visible or not
Then User Will check the three dots on the right screen is clickable or not
Then user will click dots
Then User Will check the edit app button,edit name & description and delete button appears or not after clicking on the three dots
Then User will click delete app in dropdown
Then User will check dialog box is appare or not 
#Then User will click cancel buton in dialog box
Then User will click delete app button
Then User will check app is deleted or not



Examples: 

|username|password|
|kunkkumaraj+testing@getcerta.com|Tamilkunfu@01|
