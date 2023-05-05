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

public class AddSwimlane extends BaseClass{

	public static Pojoclass pojo = new Pojoclass();
	
	
	
	@Then("User will add swimlane")
	public void user_will_add_swimlane() throws AWTException, InterruptedException {
		Thread.sleep(3000);
		L();
		Thread.sleep(3000);
		jsClk(pojo.studiopage);
		
	}
	@Then("user will enter the swimlane name")
	public void user_will_enter_the_swimlane_name() throws InterruptedException {
		Thread.sleep(1000);
		fill(pojo.swimename1, "Swimelane");
		
	}
	@Then("user will click save button")
	public void user_will_click_save_button() {
		btnClick(pojo.saveswim);
		
	}
	


	
}
