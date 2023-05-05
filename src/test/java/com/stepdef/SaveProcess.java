package com.stepdef;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import com.Base.BaseClass;
import com.pojo.Pojoclass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SaveProcess extends BaseClass {

	public static Pojoclass pojo = new Pojoclass();

	
	
	
	@Then("User Will Drag and drop step in swimlane")
	public void user_will_drag_and_drop_step_in_swimlane() throws InterruptedException, AWTException {
		Thread.sleep(3000);
		S();
		Thread.sleep(3000);
		jsClk(pojo.stepadd1);
		
	}
	@Then("User Will Enter the step name")
	public void user_will_enter_the_step_name() throws InterruptedException {
		Thread.sleep(3000);
		fill(pojo.stepname, "STEP");
		
	}
	@Then("User Will Click save Button")
	public void user_will_click_save_Button() {
		btnClick(pojo.savestep);
		
	}
	@Then("user will drag And drop field In step")
	public void user_will_drag_and_drop_field_in_step() throws AWTException {
        F();
		
		btnClick(pojo.selectallinfield);
		draganddrop_javascript(pojo.arrayfield, pojo.addfield);		
	}
	@Then("user will enter The field name")
	public void user_will_enter_the_field_name() throws InterruptedException {
		Thread.sleep(2000);
		fill(pojo.fieldname1, "Array");
		
	}
	@Then("user will Click Save button")
	public void user_will_click_save_button() {
		btnClick(pojo.savefield1);	
		
	}
	@Then("user will check save button should visible to user on the right top corner of screen")
	public void user_will_check_save_button_should_visible_to_user_on_the_right_top_corner_of_screen() {
		if (pojo.saveprocessinstudio1.isDisplayed()) {
			   logInfo("save button is visible");
			}
			else 
			{
				logInfo("save button is not visible");
			}
	}
	@Then("User will check save button should be clickable")
	public void user_will_check_save_button_should_be_clickable() {
		if (pojo.saveprocessinstudio1.isEnabled()) {
			   logInfo("save button is enable");
			}
			else 
			{
				logInfo("save button is not enable");
			}
	}
	@Then("user will check save process pop-up should appears when the user hover over the save button")
	public void user_will_check_save_process_pop_up_should_appears_when_the_user_hover_over_the_save_button() throws InterruptedException {
		moveToEle(pojo.saveprocessinstudio1);
		Thread.sleep(1000);
		if (pojo.savepopup1.isDisplayed()) {
			   logInfo("save process popup is appears");
			}
			else 
			{
				logInfo("save process popup is not appears");
			}
	}
	@Then("user will check app should be saved when user click on the save button")
	public void user_will_check_app_should_be_saved_when_user_click_on_the_save_button() throws InterruptedException {
		btnClick(pojo.saveprocessinstudio1);
		Thread.sleep(2000);
		moveToEle(pojo.hovertosavedclud);
		if (pojo.savedmsg.isDisplayed()) {
			   logInfo("All changes have been saved");
			}
			else 
			{
				logInfo("changes not saved");
			}
		
	}
	@Then("user will check submit button should clickable")
	public void user_will_check_submit_button_should_clickable() {
		if (pojo.submitbtn.isEnabled()) {
			   logInfo("submit button is enable");
			}
			else 
			{
				logInfo("submit button is not enable");
			}
	}
	@Then("user will check After clicking on the submit button Edit button should visible to user")
	public void user_will_check_after_clicking_on_the_submit_button_edit_button_should_visible_to_user() throws InterruptedException {
		btnClick(pojo.submitbtn);
		Thread.sleep(3000);
		if (pojo.editbtn.isEnabled()) {
			   logInfo("Edit button is visible");
			}
			else 
			{
				logInfo("Edit button is not visible");
			}
		
	}
	@Then("user will check after clicking on the submit button edit button should visible to user on the screen")
	public void user_will_check_after_clicking_on_the_submit_button_edit_button_should_visible_to_user_on_the_screen() {
		if (pojo.editbtn.isEnabled()) {
			   logInfo("Edit button is visible");
			}
			else 
			{
				logInfo("Edit button is not visible");
			}
	}
	@Then("user will check both edit button should be clickable")
	public void user_will_check_both_edit_button_should_be_clickable() {
		if (pojo.editbtn.isEnabled() && pojo.onscreeneditbtn.isEnabled()){
			   logInfo("Both Edit button is clickble");
			}
			else 
			{
				logInfo("Both Edit button is not clickble");
			}
	}
	@Then("user will check user should  navigates to the process landing page")
	public void user_will_check_user_should_navigates_to_the_process_landing_page() {
		btnClick(pojo.navigattoprocesslandingpage1);
		
	}
	@Then("user will check deploy button should visible to user on the process landing page")
	public void user_will_check_deploy_button_should_visible_to_user_on_the_process_landing_page() {
		if (pojo.deploy.isEnabled()) {
			   logInfo("Deploy button is visible");
			}
			else 
			{
				logInfo("Deploy button is not visible");
			}
	}
	@Then("user will check click on the deploy button dialogue box should appears")
	public void user_will_check_click_on_the_deploy_button_dialogue_box_should_appears() {
		btnClick(pojo.deploy);
		if (pojo.deploydialogbox.isDisplayed()) {
			   logInfo("deploy dialogue is appears");
			}
			else 
			{
				logInfo("deploy dialogue is not appears");
			}
	}
	@Then("user will check user should able to deploy the app")
	public void user_will_check_user_should_able_to_deploy_the_app() throws InterruptedException {
		fill(pojo.deploydescription, "first commit");
		Thread.sleep(2000);
		btnClick(pojo.clicksaveanddeploy);
		
	}

	
}
