package com.stepdef;

import java.io.IOException;
import java.util.List;

import com.Base.BaseClass;
import com.pojo.Pojoclass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ProcessCreation extends BaseClass {

	public static Pojoclass pojo = new Pojoclass();
	
	@Then("user will Click the Create new app button")
	public void user_will_click_the_create_new_app_button() {
		 pojo = new Pojoclass();
btnClick(pojo.creatnew);
		
	}
	@Then("user will Enter the app Name")
	public void user_will_enter_the_app_name() {
		fill(pojo.untitledapp,"automation test");
		
	}
	@Then("User will Check create App button is clickable or not")
	public void user_will_check_create_app_button_is_clickable_or_not() {
		if (pojo.createappbtn.isDisplayed()) {
			   logInfo("Create App button is clickable");
			}
			else 
			{
				logInfo("Create App button is not clickable");
			}
		
	}
	
	@Then("user will Click create App button")
	public void user_will_click_create_app_button() {
		//btnClick(pojo.createappbtn);
		
	}
	@Then("user will check add process button will clickable or not")
	public void user_will_check_add_process_button_will_clickable_or_not() {
		if (pojo.clickaddprocess.isDisplayed()) {
			   logInfo("Create add process button is clickable");
			}
			else 
			{
				logInfo("Create add process button is not clickable");
			}
		
	}
	@Then("user will click add process")
	public void user_will_click_add_process() {
		//btnClick(pojo.clickaddprocess);
	}
	
	@Then("user will check add a new proces and import process from json appears")
	public void user_will_check_add_a_new_proces_and_import_process_from_json_appears() {
		if (pojo.clicknewprocess.isDisplayed() && pojo.importjson.isDisplayed()) {
			   logInfo("New proces and import process from json is appears");
			}
			else 
			{
				logInfo("New proces and import process from json is not appears");
			}
	}
	
	@Then("user will select add new process")
	public void user_will_select_add_new_process() {
		//btnClick(pojo.clicknewprocess);
		
	}
	
	@Then("user will check add new process dialogue box appears or not")
	public void user_will_check_add_new_process_dialogue_box_appears_or_not() {
		if (pojo.addprocessdialoguebox.isDisplayed()) {
			   logInfo("Add new process dialogue box is appears");
			}
			else 
			{
				logInfo("Add new process dialogue box ois not appears");
			}
		
	}
	@Then("user will check process name and description are appears or not")
	public void user_will_check_process_name_and_description_are_appears_or_not() {
		if (pojo.processname1.isDisplayed() && pojo.processdscription1.isDisplayed()) {
			   logInfo("name and description field is appears");
			}
			else 
			{
				logInfo("name and description field is not appears");
			}
		
	}
	@Then("user will click add process button")
	public void user_will_click_add_process_button() {
		btnClick(pojo.clickproc10);		
		
	}
	@Then("user will check alert message for without name on name field")
	public void user_will_check_alert_message_for_without_name_on_name_field() {
		getTxt(pojo.processnamemsg);		
		
		
	}
	@Then("user will check alert message for space on name field")
	public void user_will_check_alert_message_for_space_on_name_field() {
		fill(pojo.processname1, "   ");
		btnClick(pojo.clickproc10);
		getTxt(pojo.alertmsg1);
	
	}

}
