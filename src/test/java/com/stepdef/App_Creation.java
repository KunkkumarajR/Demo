package com.stepdef;

import java.io.IOException;
import java.util.List;

//import org.openqa.selenium.WebElement;

import com.Base.BaseClass;
import com.pojo.Pojoclass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class App_Creation extends BaseClass {
	
	public static Pojoclass pojo = new Pojoclass();

@Then("User will check the create new app button is clickable")
public void user_will_check_the_create_new_app_button_is_clickable() throws InterruptedException {
	Thread.sleep(5000);
	
	if (pojo.creatnew.isDisplayed() && pojo.creatnew.isEnabled()) {
	   logInfo("creatnew app button is clickable");
	}
	else 
	{
		logInfo("creatnew app button is not clickable");
	}
	
   
}
@Then("User will check the  check the dialogue box appears or not")
public void user_will_check_the_check_the_dialogue_box_appears_or_not() throws InterruptedException {
	 pojo = new Pojoclass();
btnClick(pojo.creatnew);
	Thread.sleep(3000);

	if (pojo.dialoguebox.isDisplayed()) {
	   logInfo("dialoguebox appears successfully");
	}
	else 
	{
		logInfo("dialoguebox not appears");
	}
    
}
@Then("User will check app name field and description field are visible to user on dialogue box")
public void user_will_check_app_name_field_and_description_field_are_visible_to_user_on_dialogue_box() throws InterruptedException {
	Thread.sleep(3000);
	if (pojo.untitledapp.isDisplayed() && pojo.appdescription.isDisplayed()) {
		   logInfo("App name field is visible");
		   logInfo("description field is visible");
		}
		else 
		{
			logInfo("App name field and discription field is not visible");
		}
	fill(pojo.untitledapp,"  ");
	
}
@When("User will click on create new app")
public void user_will_click_on_create_new_app() throws InterruptedException {
	btnClick(pojo.createappbtn);
	Thread.sleep(3000);
	getTxt(pojo.msg1);
	
}


}
