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

public class Add_Swimlane extends BaseClass {
	
	public static Pojoclass pojo = new Pojoclass();	

	
	
	@Then("user will check lane is visibile on canvas or not")
	public void user_will_check_lane_is_visibile_on_canvas_or_not() {
		if (pojo.swimlane.isDisplayed()) {
			   logInfo("lane is visibile on canvas");
			}
			else 
			{
				logInfo("lane is not visibile on canvas");
			}
			
		
	}
	@Then("user will check lane button is clickable or not")
	public void user_will_check_lane_button_is_clickable_or_not() {
		if (pojo.swimlane.isEnabled()) {
			   logInfo("lane button is clickable");
			}
			else 
			{
				logInfo("lane button is not clickable");
			}
		
		
	}
	@Then("user will check Hover on the Lane button and add swimlane pop is appearing or not")
	public void user_will_check_hover_on_the_lane_button_and_add_swimlane_pop_is_appearing_or_not() throws InterruptedException {
		moveToEle(pojo.swimlane);
		Thread.sleep(3000);
		if (pojo.swimlanepopup.isDisplayed()) {
			   logInfo("Swimlane pop is appearing");
			}
			else 
			{
				logInfo("swimlane pop is not appearing");
			}
		
	}
	@Then("user will check the configuration screen is opened when click on the lane and drop it on the screen")
	public void user_will_check_the_configuration_screen_is_opened_when_click_on_the_lane_and_drop_it_on_the_screen() throws AWTException, InterruptedException {
		Thread.sleep(3000);
		L();
		Thread.sleep(3000);
		jsClk(pojo.studiopage);
		Thread.sleep(1000);
		
		if (pojo.swimconfig.isDisplayed()) {
			   logInfo("Swimlane configuration is appearing");
			}
			else 
			{
				logInfo("swimlane configuration is not appearing");
			}
		
	}
	@Then("user will check swimlane is not created when user clicks on the cancel button on the configuration screen")
	public void user_will_check_swimlane_is_not_created_when_user_clicks_on_the_cancel_button_on_the_configuration_screen() throws InterruptedException {
		Thread.sleep(1000);
		btnClick(pojo.cancelswim);
		
		
	}
	@Then("user will swimlane is selected when user press the L keyword")
	public void user_will_swimlane_is_selected_when_user_press_the_l_keyword() throws AWTException {
		L();
		
		
	}


}
