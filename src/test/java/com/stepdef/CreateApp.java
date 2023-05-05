package com.stepdef;

import java.io.IOException;
import java.util.List;

import com.Base.BaseClass;
import com.pojo.Pojoclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CreateApp extends BaseClass {

	public static Pojoclass pojo = new Pojoclass();


	@Then("User will click the create new app button")
	public void user_will_click_the_create_new_app_button() {
		 pojo = new Pojoclass();
		btnClick(pojo.creatnew);
	}
	@Then("User will enter the app name")
	public void user_will_enter_the_app_name() {
		fill(pojo.untitledapp,"automation test");
		
	}
	@Then("User will click cancel button")
	public void user_will_click_cancel_button() {
		btnClick(pojo.cancelbtn);
	}

}
