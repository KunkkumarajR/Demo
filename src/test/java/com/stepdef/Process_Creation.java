package com.stepdef;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import com.Base.BaseClass;
import com.pojo.Pojoclass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Process_Creation extends BaseClass {
	
	public static Pojoclass pojo = new Pojoclass();
	
	@Then("User will click add process button")
	public void user_will_click_add_process_button() throws InterruptedException {
		Thread.sleep(10000);
		pojo = new Pojoclass();
		
		btnClick(pojo.clickaddprocess);
		
	}

	@Then("User will select new process")
	public void user_will_select_new_process() throws InterruptedException {
		Thread.sleep(3000);
		btnClick(pojo.clicknewprocess);
		
	}
	@Then("User will add process name in name field")
	public void user_will_add_process_name_in_name_field() {
		
		try {
			LocalDateTime now = LocalDateTime.now();
			String appname = "Automationtest" + now;
			fill(pojo.processname1,appname);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
	@Then("User will Click Add process")
	public void user_will_click_add_process() {
		btnClick(pojo.clickproc10);
		
	}


}
