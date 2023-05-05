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

public class AddStep extends BaseClass {
	
	public static Pojoclass pojo = new Pojoclass();
	
	
	
	@Then("User will add step in swimlane")
	public void user_add_step_in_swimlane() throws InterruptedException, AWTException {
		Thread.sleep(3000);
		S();
		Thread.sleep(3000);
		jsClk(pojo.stepadd1);
		
		
	}
	@Then("User will enter the step name")
	public void user_will_enter_the_step_name() throws InterruptedException {
		Thread.sleep(3000);
		fill(pojo.stepname, "STEP");
		
	}
	@Then("User Will click save button")
	public void User_will_click_save_button() {
		btnClick(pojo.savestep);
		
		
	}



}
