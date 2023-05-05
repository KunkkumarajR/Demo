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

public class Add_Field extends BaseClass {


	public static Pojoclass pojo = new Pojoclass();
	
	
	
	@Then("user will drag And drop field in step")
	public void user_will_drag_and_drop_field_in_step() throws AWTException, InterruptedException {
		F();
		btnClick(pojo.selectallinfield);
		draganddrop_javascript(pojo.arrayfield, pojo.addfield);
		Thread.sleep(3000);
		btnClick(pojo.cancelfield1);
	}
	@Then("user will check the add field button is visible to user under the step level")
	public void user_will_check_the_add_field_button_is_visible_to_user_under_the_step_level() throws InterruptedException {
		Thread.sleep(3000);
		if (pojo.addfieldbtn.isDisplayed()) {
				logInfo("+add field is visible");
			}
			else 
			{
				logInfo("+add field is not visible");
			}
		
	}
	@Then("user will check Click on the +add field button and check +add field is clickable")
	public void user_will_check_click_on_the_add_field_button_and_check_add_field_is_clickable() throws InterruptedException {
		Thread.sleep(3000);
		if (pojo.addfieldbtn.isEnabled()) {
			   logInfo("+add field is clickable");
			}
			else 
			{
				logInfo("+add field is not clickable");
			}
	}
	@Then("user will check click on the field on canvas and check field button is clickable or not")
	public void user_will_check_click_on_the_field_on_canvas_and_check_field_button_is_clickable_or_not() throws InterruptedException {
		Thread.sleep(3000);
		if (pojo.field.isEnabled()) {
			   logInfo("field on canvas is clickable");
			}
			else 
			{
				logInfo("field on canvase is not clickable");
			}
		
	}
	@Then("user will check add field pop-up appears when user hover on the field on canvas")
	public void user_will_check_add_field_pop_up_appears_when_user_hover_on_the_field_on_canvas() throws InterruptedException {
		Thread.sleep(2000);
		moveToEle(pojo.field);
		Thread.sleep(2000);
		if (pojo.fieldpopup.isDisplayed()) {
			   logInfo("field popup is visible");
			}
			else 
			{
				logInfo("field popup is not visible");
			}
	}
	@Then("user will check click on the field on canvas and check search bar is opened to search the fields")
	public void user_will_check_click_on_the_field_on_canvas_and_check_search_bar_is_opened_to_search_the_fields() throws InterruptedException {
		Thread.sleep(3000);
		btnClick(pojo.field);
		Thread.sleep(2000);
		if (pojo.fieldsearch.isDisplayed()) {
			   logInfo("field search bar is opened");
			}
			else 
			{
				logInfo("field search bqar is not opened");
			}
		
	}
	@Then("user will check Click on the search bar from the canvas and search any field as Boolean, Char,Dropdown etc")
	public void user_will_check_click_on_the_search_bar_from_the_canvas_and_search_any_field_as_boolean_char_dropdown_etc() {
		fill(pojo.fieldsearch,"Boolean");
		
	}
	@Then("user will check select any field from the search bar and drop it on the swimlane")
	public void user_will_check_select_any_field_from_the_search_bar_and_drop_it_on_the_swimlane() throws InterruptedException {
		draganddrop_javascript(pojo.booleanfield, pojo.addfield);
		Thread.sleep(3000); 
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check select any field from the search bar drag this field and drop it on the swimlane then side field configuration should opened")
	public void user_will_check_select_any_field_from_the_search_bar_drag_this_field_and_drop_it_on_the_swimlane_then_side_field_configuration_should_opened() throws InterruptedException {
		Thread.sleep(3000);
		btnClick(pojo.field);
		Thread.sleep(2000);
		fill(pojo.fieldsearch,"Boolean");
		draganddrop_javascript(pojo.booleanfield, pojo.addfield);
		Thread.sleep(2000);
		if (pojo.fieldconfiguration.isDisplayed()) {
			   logInfo("field configuration is opened");
			}
			else 
			{
				logInfo("field configuration is not opened");
			}
	}
	@Then("user will check field should created when user fills the name field of field configuration screen and click on the save button")
	public void user_will_check_field_should_created_when_user_fills_the_name_field_of_field_configuration_screen_and_click_on_the_save_button() {
		fill(pojo.fieldname1, "boolean");
		btnClick(pojo.savefield1);
		
	}
	@Then("user will check Validation message should appears when user clicks on the save button withan  empty name field")
	public void user_will_check_validation_message_should_appears_when_user_clicks_on_the_save_button_withan_empty_name_field() throws InterruptedException {
		Thread.sleep(3000);
		btnClick(pojo.field);
		Thread.sleep(2000);
		fill(pojo.fieldsearch,"Boolean");
		draganddrop_javascript(pojo.booleanfield, pojo.addfield);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		if (pojo.namefieldvalidationmsg.isDisplayed()) {
			   logInfo("Validation message is appears for name field");
			}
			else 
			{
				logInfo("Validation message iss not appears for name field");
			}
	}
	@Then("user will check field should not be created when user fills the mandatory field and click on the cancel button")
	public void user_will_check_field_should_not_be_created_when_user_fills_the_mandatory_field_and_click_on_the_cancel_button() {
		fill(pojo.fieldname1, "boolean");
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check click on the field and selecting Configure Field Properties then field configuration screen should opened")
	public void user_will_check_click_on_the_field_and_selecting_configure_field_properties_then_field_configuration_screen_should_opened() throws InterruptedException {
		Thread.sleep(2000);
		btnClick(pojo.fieldboolean);
		Thread.sleep(1000);
		btnClick(pojo.fieldconfig1);
		Thread.sleep(2000);
		if (pojo.fieldconfiguration.isDisplayed()) {
			   logInfo("field configuration is opened");
			}
			else 
			{
				logInfo("field configuration is not opened");
			}
		btnClick(pojo.clickcancelfieldsearch);
	}
	@Then("user will check Update the name of field from the name field of field configuration and save it and name of field should updated")
	public void user_will_check_update_the_name_of_field_from_the_name_field_of_field_configuration_and_save_it_and_name_of_field_should_updated() throws InterruptedException {
		Thread.sleep(2000);
		btnClick(pojo.fieldconfig1);
		dClick(pojo.fieldconfig1);
		//pojo.fieldname1.clear();
		fill(pojo.fieldname1, "boolean1");
		btnClick(pojo.savefield1);

	}
	@Then("user will check field search bar is opened when user press f alphabet on the keyboard")
	public void user_will_check_field_search_bar_is_opened_when_user_press_f_alphabet_on_the_keyboard() throws AWTException {
		F();
		if (pojo.fieldsearch.isDisplayed()) {
			   logInfo("field search bar is opened");
			}
			else 
			{
				logInfo("field search bar is not opened");
			}		
	Esc();
	}
	
}
