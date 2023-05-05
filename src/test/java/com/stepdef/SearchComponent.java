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

public class SearchComponent extends BaseClass{
	
	
	public static Pojoclass pojo  = new Pojoclass();
	

	
	
	
	@Then("user will check search component icon should visible on the top left corner of screen")
	public void user_will_check_search_component_icon_should_visible_on_the_top_left_corner_of_screen() {
		if (pojo.searchcomponent1.isDisplayed()) {
			   logInfo("search component icon is visible");
			}
			else 
			{
				logInfo("search component icon is not visible");
			}
	}
	@Then("user will check search component icon should clickable")
	public void user_will_check_search_component_icon_should_clickable() {
		if (pojo.searchcomponent1.isEnabled()) {
			   logInfo("search component icon is clickable");
			}
			else 
			{
				logInfo("search component icon is not clickable");
			}
	}
	@Then("user will check search component toolbar should appear after hover on the search component icon")
	public void user_will_check_search_component_toolbar_should_appear_after_hover_on_the_search_component_icon() throws InterruptedException {
		moveToEle(pojo.searchcomponent1);
		Thread.sleep(2000);
		if (pojo.searchcomponentpopup.isDisplayed()) {
			   logInfo("search component popup is appear");
			}
			else 
			{
				logInfo("search component popup is not appear");
			}
	}
	@Then("user will check after clicking on the search component icon then search bar should open")
	public void user_will_check_after_clicking_on_the_search_component_icon_then_search_bar_should_open() throws InterruptedException, AWTException {
		btnClick(pojo.searchcomponent1);
		Thread.sleep(2000);
		if (pojo.searchbarforsearchcomponent.isDisplayed()) {
			   logInfo("search component search bar popup is appear");
			}
			else 
			{
				logInfo("search component search bar is not appear");
			}
		Esc();
	}
	@Then("user will check search bar should open after clicking  the  shortcut keys as ctrl+f")
	public void user_will_check_search_bar_should_open_after_clicking_the_shortcut_keys_as_ctrl_f() throws AWTException {
		ctrlp();
		F();
		ctrlr();
		
	}
	@Then("user will check user should able to write any name on the search bar")
	public void user_will_check_user_should_able_to_write_any_name_on_the_search_bar() throws InterruptedException {
		Thread.sleep(2000);
		fill(pojo.searchbarforsearchcomponent, "Swimlane");
		
	}
	@Then("user will check cross icon should visible to user on the search bar")
	public void user_will_check_cross_icon_should_visible_to_user_on_the_search_bar() {
		if (pojo.crossiconsearchbar.isDisplayed()) {
			   logInfo("cross icon is visible");
			}
			else 
			{
				logInfo("cross icon is not visible");
			}
	}
	@Then("user will check alphabets should vanished after click on the cross icon of search bar")
	public void user_will_check_alphabets_should_vanished_after_click_on_the_cross_icon_of_search_bar() throws InterruptedException {
		Thread.sleep(2000);
		btnClick(pojo.crossiconsearchbar);
		Thread.sleep(2000);
		getTxt(pojo.searchbarforsearchcomponent);
		
	}
	@Then("user will check user should able to search any name on the search bar from the search component")
	public void user_will_check_user_should_able_to_search_any_name_on_the_search_bar_from_the_search_component() {
		fill(pojo.searchbarforsearchcomponent, "STEP");
	}
	@Then("user will check after pressing the ESC button then search bar should disappear")
	public void user_will_check_after_pressing_the_esc_button_then_search_bar_should_disappear() throws AWTException {
		Esc();
		if (pojo.searchbarforsearchcomponent.isDisplayed()) {
			   logInfo("search component search bar is appear after click esc btn");
			}
			else 
			{
				logInfo("search component search bar is not appear after click esc btn");
			}
	}
	@Then("user will check user should able to write the existing swimlane name on the search bar")
	public void user_will_check_user_should_able_to_write_the_existing_swimlane_name_on_the_search_bar() {
		btnClick(pojo.searchcomponent1);
		fill(pojo.searchbarforsearchcomponent, "swimlane");
		//btnClick(pojo.crossiconsearchbar);
		
	}
	@Then("user will check after selecting the swimlane name from the search bar options then swimlane name should get focuse")
	public void user_will_check_after_selecting_the_swimlane_name_from_the_search_bar_options_then_swimlane_name_should_get_focuse() {
		btnClick(pojo.searchbarswimselection);
		if (pojo.swimlanefocus.isDisplayed()) {
			   logInfo("sawimlane get focused");
			}
			else 
			{
				logInfo("sawimlane not focused");
			}
		
	}
	@Then("user will check user should able to write the existing step name on the search bar")
	public void user_will_check_user_should_able_to_write_the_existing_step_name_on_the_search_bar() {
		btnClick(pojo.searchcomponent1);
		btnClick(pojo.crossiconsearchbar);
		fill(pojo.searchbarforsearchcomponent, "Step");
	}
	@Then("user will check after selecting the existing step name from the search bar options then step name should get focuse")
	public void user_will_check_after_selecting_the_existing_step_name_from_the_search_bar_options_then_step_name_should_get_focuse() {
		btnClick(pojo.searchbarstepselection1);
		if (pojo.stepfocus1.isDisplayed()) {
			   logInfo("step get focused");
			}
			else 
			{
				logInfo("step not focused");
			}
	}
	@Then("user will check user should able to write the existing field name on the search bar")
	public void user_will_check_user_should_able_to_write_the_existing_field_name_on_the_search_bar() {
		btnClick(pojo.searchcomponent1);
		btnClick(pojo.crossiconsearchbar);
		fill(pojo.searchbarforsearchcomponent, "array");
		//btnClick(pojo.crossiconsearchbar);
	}	
	@Then("user will check after selecting the existing field name from the search bar options then field name should get focuse")
	public void user_will_check_after_selecting_the_existing_field_name_from_the_search_bar_options_then_field_name_should_get_focuse() {
		btnClick(pojo.searchbarfieldselection1);
		if (pojo.fieldfocus1.isDisplayed()) {
			   logInfo("field get focused");
			}
			else 
			{
				logInfo("field not focused");
			}
	}



}
