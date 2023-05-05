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

public class AddField extends BaseClass {
	
	public static Pojoclass pojo = new Pojoclass();
	
	
	@Then("user will drag and drop field in step")
	public void user_will_drag_and_drop_field_in_step() throws AWTException {
		F();
		
		btnClick(pojo.selectallinfield);
		draganddrop_javascript(pojo.arrayfield, pojo.addfield);		
	}
	@Then("user will enter the field name")
	public void user_will_enter_the_field_name() throws InterruptedException {
		Thread.sleep(3000);
		fill(pojo.fieldname1, "Array");
		
	}
	@Then("user will click Save button")
	public void user_will_click_Save_button() {
		btnClick(pojo.savefield1);	
	}


}
