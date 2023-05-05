@steplevelrules
Feature: to verify the functionality of step level rules

@smoke19
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
Then user should able to click on the step and select the Configure Step Properties option from the component toolbar
Then after clicking on the configure step properties option step configuration screen should appear
Then five rules should appear under the rules section of the configuration step screen
Then when user  click on the conditional access rule then add rule button should appears
Then after click on add rule button upstream rule of conditional access rule should visible to user
Then icons should appear on the step level after click on the add rule button
Then rule should created when user fills the mandatory fields of conditional access rule in upstream rule and clicks on the save button
Then when user add a rule on the step level icon should appear on the step level
Then pdf rule should be visible to user under the rules section
"""
{
"name_format": "{pdfname}{pidsnapshot}{_pdf_date_utc}",
"target_field": "field18645",
"adjudication_comments": true,
"extra_sections": [],
"parent_steps_to_print": [
"step1"
]
}
"""
Then user should able to click on the pdf rule configure in the step configuration screen
Then add rule button should appears after click on the pdf rule configure
Then upstream rule of pdf rule should appears after click on the add step button
Then user should able to add  pdf name  in the pdf config(json editor) under the other configuration section to fill the step for pdf configuration field in the pdf rule 
Then pdf rule should be created after fill the mandatory field and click on the save button
Then when user add a pdf rule on the step level icon should appear on the step level
Then visibility rule should be visible to user under the rules section
Then user should able to click on the visibility rule configure in the step configuration screen
Then add rule button should appear after clicking on the visibility rule configure
Then after clicking on the add visibility rule then upstream rule should  appears
Then visibility rule should be created after fill the mandatory field and clicking on the save button
Then rule icons should created on upstream and downstream rules after visibility rule is created
Then Auto-submit Auto-revert  rule should be visible to user under the rules section
Then user should able to click on Auto-submit Auto-revert  rule configure in the step configuration screen
Then add rule button should appear after clicking on Auto-submit/Auto-revert  rule configure
Then After clicking on the add rule of the auto-submit upstream rule should appears
Then Auto-submit Auto-revert  rule should be created after fill the mandatory field and clicking on the save button
Then After creating the auto-submit rule on the step-level icon should appears on the step level
Then Notifications Rules should be visible to user under the rules section
Then user should able to click on Notifications Rules configure in the step configuration screen
Then add rule button should appear after clicking on Notifications Rules configure
Then Notifications Rules should be created after fill the mandatory field and clicking on the save button
Then after adding the notification rule on the step-level rule icons should  appears on the step level




Examples: 

|username|password|
|kunkkumaraj+testing@getcerta.com|Tamilkunfu@01|
