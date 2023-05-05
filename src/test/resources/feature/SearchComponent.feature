@searchcomponent
Feature: to verify the functionality of different field types
@smoke17
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
Then user will check search component icon should visible on the top left corner of screen
Then user will check search component icon should clickable 
Then user will check search component toolbar should appear after hover on the search component icon
Then user will check after clicking on the search component icon then search bar should open
Then user will check search bar should open after clicking  the  shortcut keys as ctrl+f
Then user will check user should able to write any name on the search bar
Then user will check cross icon should visible to user on the search bar
Then user will check alphabets should vanished after click on the cross icon of search bar
Then user will check user should able to search any name on the search bar from the search component
Then user will check after pressing the ESC button then search bar should disappear
Then user will check user should able to write the existing swimlane name on the search bar
Then user will check after selecting the swimlane name from the search bar options then swimlane name should get focuse
Then user will check user should able to write the existing step name on the search bar
Then user will check after selecting the existing step name from the search bar options then step name should get focuse
Then user will check user should able to write the existing field name on the search bar
Then user will check after selecting the existing field name from the search bar options then field name should get focuse 

Examples: 

|username|password|
|kunkkumaraj+testing@getcerta.com|Tamilkunfu@01|

