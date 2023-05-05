package com.stepdef;

import java.io.IOException;
import java.util.List;

import com.Base.BaseClass;
import com.pojo.Pojoclass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AppDeletion extends BaseClass {
	
	public static Pojoclass pojo = new Pojoclass();
	
	
	@Then("User will check the three dots on the top right screen is visible or not")
	public void user_will_check_the_three_dots_on_the_top_right_screen_is_visible_or_not() throws InterruptedException {
		Thread.sleep(2000);
		btnClick(pojo.navigattoprocesslandingpage1);
		
		if (pojo.click3dot.isDisplayed()) {
			   logInfo("Three dots on the top right screen is visible");
			}
			else 
			{
			   logInfo("Three dots on the top right screen is not visible");
			}
		
	}
	@Then("User Will check the three dots on the right screen is clickable or not")
	public void user_will_check_the_three_dots_on_the_right_screen_is_clickable_or_not() {
		if (pojo.click3dot.isEnabled()) {
			logInfo("Three dots on the top right screen is clickable");
		} 
		else
		{
			logInfo("Three dots on the top right screen is not clickable");
		}
	}
	
	@Then("user will click dots")
	public void user_will_click_dots() throws InterruptedException {
		Thread.sleep(1000);
		btnClick(pojo.click3dot);
		
		}
		
	
	@Then("User Will check the edit app button,edit name & description and delete button appears or not after clicking on the three dots")
	public void user_will_check_the_edit_app_button_edit_name_description_and_delete_button_appears_or_not_after_clicking_on_the_three_dots() throws InterruptedException {
		Thread.sleep(2000);
		if (pojo.drop3dot.isDisplayed()) {
			   logInfo("Edit app button,Edit name & Description and Delete button is appears");
			}
			else 
			{
			   logInfo("Edit app button,Edit name & Description and Delete button is not appears");
			}
		
	}
	@Then("User will click delete app in dropdown")
	public void user_will_click_delete_app_in_dropdown() {
		btnClick(pojo.deleteapp);
		
	}
	@Then("User will check dialog box is appare or not")
	public void user_will_check_dialog_box_is_appare_or_not() {
		if (pojo.deleteappdialogbox.isDisplayed()) {
			   logInfo("Delete app Dialog box is appears");
			}
			else 
			{
			   logInfo("Delete app Dialog box is not appears");
			}
		
	}
//	@Then("User will click cancel buton in dialog box")
//	public void user_will_click_cancel_buton_in_dialog_box() {
//		btnClick(pojo.canceldeleteapp);
//		
//	}
	@Then("User will click delete app button")
	public void user_will_click_delete_app_button() {
		btnClick(pojo.btndeleteapp);
		
	}
	@Then("User will check app is deleted or not")
	public void user_will_check_app_is_deleted_or_not() {
		logInfo("app deleted");
		
	}


}
