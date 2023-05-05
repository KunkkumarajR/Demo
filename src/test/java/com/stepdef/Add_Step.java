package com.stepdef;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

//import org.openqa.selenium.TakesScreenshot;

import com.Base.BaseClass;
import com.pojo.Pojoclass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Add_Step extends BaseClass {
	
	public static Pojoclass pojo = new Pojoclass();
	
	
	
	@Then("user will check add step is clickable")
	public void user_will_check_add_step_is_clickable() {
		if (pojo.addstepswim1.isEnabled()) {
			   logInfo("Add step is clickable");
			}
			else 
			{
				logInfo("Add step is not clickable");
			}
	
		
	}
	@Then("user will check step should be visible on the canvas")
	public void user_will_check_step_should_be_visible_on_the_canvas() throws InterruptedException {
		Thread.sleep(3000);
		if (pojo.step.isDisplayed()) {
			   logInfo("Step is visible on canvas");
			}
			else 
			{
				logInfo("Step is not visible on canvas");
			}
		
	}
	@Then("user will check step should be clickable on the canvas")
	public void user_will_check_step_should_be_clickable_on_the_canvas() throws InterruptedException {
		Thread.sleep(2000);
		if (pojo.step.isEnabled()) {
			   logInfo("Step is clickable");
			}
			else 
			{
				logInfo("step is not clickable");
			}
		
	}
	@Then("user will check step pop-up should appears when user hover on the step of canvas")
	public void user_will_check_step_pop_up_should_appears_when_user_hover_on_the_step_of_canvas() throws InterruptedException {
		Thread.sleep(2000);
		moveToEle(pojo.step);
		Thread.sleep(2000);
		if (pojo.steppopup1.isDisplayed()) {
			   logInfo("Step popup is visible");
			}
			else 
			{
				logInfo("Step popup is not visible");
			}
		
	}
	@Then("user will Drag and drop step in swimlane")
	public void user_will_drag_and_drop_step_in_swimlane() throws InterruptedException, AWTException {
		Thread.sleep(3000);
		S();
		Thread.sleep(3000);
		jsClk(pojo.stepadd1);
		
	}
	@Then("user will check step configuration screen should open when drag and drop step in swim")
	public void user_will_check_step_configuration_screen_should_open_when_drag_and_drop_step_in_swim() {
		if (pojo.stepconfiguration.isDisplayed()) {
			   logInfo("Step configuration is displayed");
			}
			else 
			{
				logInfo("Step configuration is not displayed");
			}
		
	}
	@Then("user will check Validation message should appears when click on the save button with empty name of step field")
	public void user_will_check_validation_message_should_appears_when_click_on_the_save_button_with_empty_name_of_step_field() throws InterruptedException {
		Thread.sleep(2000);
		btnClick(pojo.savestep);
		Thread.sleep(2000);
		if (pojo.alertmsgstepname1.isDisplayed()) {
			   logInfo("name alert message is displayed");
			}
			else 
			{
				logInfo("name alert message is not displayed");
			}
		btnClick(pojo.cancelstep1);
	}
	@Then("user will check step should not be created when user fill the mandatory field and click on the cancel button")
	public void user_will_check_step_should_not_be_created_when_user_fill_the_mandatory_field_and_click_on_the_cancel_button() throws InterruptedException, AWTException {
		
		Thread.sleep(3000);
		btnClick(pojo.addsteppp1);
		S();
		Thread.sleep(3000);
		jsClk(pojo.stepadd1);
		Thread.sleep(3000);
		fill(pojo.stepname, "STEP");
		btnClick(pojo.cancelstep1);
		
          
		
	}
	@Then("user will check step should be selected when user press S alphabet on the keyboard")
	public void user_will_check_step_should_be_selected_when_user_press_s_alphabet_on_the_keyboard() throws AWTException {
		S();
		//logInfo("hi next step");
		
	}
	@Then("user will check step should created when user fill the name of step field and click on the save button")
	public void user_will_check_step_should_created_when_user_fill_the_name_of_step_field_and_click_on_the_save_button() throws AWTException, InterruptedException {
		//S();
		Thread.sleep(2000);
		jsClk(pojo.stepadd1);
		fill(pojo.stepname, "STEP");
		btnClick(pojo.savestep);
		
	}

	


}
