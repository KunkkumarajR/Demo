@tag
Feature:   to verfiy the functionality of studio application  
@smoke1
Scenario: to validate the Funtionality of app creation
Given user login into studio appliction 
And user will enter the user name <username> 

And user will enter the password <password>  

Then user will clicks the login button 
And User will click on the studio icon
Then User will check the create new app button is clickable
Then User will check the  check the dialogue box appears or not
Then User will check app name field and description field are visible to user on dialogue box
When User will click on create new app

Examples: 

|username|password|
|kunkkumaraj+testing@getcerta.com|Tamilkunfu@01|


@smoke2
Scenario: to create app in studio
Given user login into studio appliction 
And user will enter the user name <username> 

And user will enter the password <password>  

Then user will clicks the login button 
And User will click on the studio icon
Then User will click the create new app button 
Then User will enter the app name
Then User will click cancel button

Examples: 

|username|password|
|kunkkumaraj+testing@getcerta.com|Tamilkunfu@01|


@smoke3
Scenario: to create app and app name is Automation test
Given user login into studio appliction 
And user will enter the user name <username> 

And user will enter the password <password>  

Then user will clicks the login button 
And User will click on the studio icon
Then user will Click the create new app button
Then user will Enter the app name
Then user will Click create app button


Examples: 

|username|password|
|kunkkumaraj+testing@getcerta.com|Tamilkunfu@01|
