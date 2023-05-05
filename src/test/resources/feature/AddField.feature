@addfield
Feature: to verify the functionality of add field in step

@smoke11
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

Examples: 

|username|password|
|kunkkumaraj+testing@getcerta.com|Tamilkunfu@01|



@smoke12
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
Then user will drag And drop field in step
Then user will check the add field button is visible to user under the step level
Then user will check Click on the +add field button and check +add field is clickable
Then user will check click on the field on canvas and check field button is clickable or not
Then user will check add field pop-up appears when user hover on the field on canvas 
Then user will check click on the field on canvas and check search bar is opened to search the fields
Then user will check Click on the search bar from the canvas and search any field as Boolean, Char,Dropdown etc
Then user will check select any field from the search bar and drop it on the swimlane
Then user will check select any field from the search bar drag this field and drop it on the swimlane then side field configuration should opened
Then user will check field should created when user fills the name field of field configuration screen and click on the save button
Then user will check Validation message should appears when user clicks on the save button withan  empty name field
Then user will check field should not be created when user fills the mandatory field and click on the cancel button
Then user will check click on the field and selecting Configure Field Properties then field configuration screen should opened
Then user will check Update the name of field from the name field of field configuration and save it and name of field should updated
Then user will check field search bar is opened when user press f alphabet on the keyboard




Examples: 

|username|password|
|kunkkumaraj+testing@getcerta.com|Tamilkunfu@01|





