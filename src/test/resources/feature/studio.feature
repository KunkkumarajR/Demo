@tag1
Feature:   to verfiy the functionality of studio application  
@smoke
Scenario: to validate the funtionality of slackcart login page 
Given user login into studio appliction 
And user will enter the user name <username> 
And user will enter the password <password>  
Then user will clicks the login button 
And User will click on the studio icon

Examples: 

|username|password|
|kunkkumaraj+testing@getcerta.com|Tamilkunfu@01|

