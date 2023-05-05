package com.stepdef;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;
import com.pojo.Pojoclass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DifferentFieldTypes extends BaseClass{
	
	
	public static Pojoclass pojo = new Pojoclass();
	
	
	
	
	
	@Then("user will check user should able to select the boolean field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_boolean_field_in_the_field_type_on_the_field_configuration_screen() throws AWTException, InterruptedException {
		F();
		
		btnClick(pojo.selectallinfield);
		draganddrop_javascript(pojo.boolean1, pojo.addfield);
		Thread.sleep(2000);
		btnClick(pojo.clickfielddropdown);
		fill(pojo.clickfielddropdown, "Boolean");
		Thread.sleep(4000);
		if (pojo.boolean1.isDisplayed()) {
			   logInfo("user can select boolean in field");
			}
			else 
			{
				logInfo("user can't select boolean in field");
			}
			btnClick(pojo.cancelfield1);
	}
	@Then("user will check the boolean field should not be created after selecting the boolean field in the field type and adding data in the name field and clicking on the cancel button")
	public void user_will_check_the_boolean_field_should_not_be_created_after_selecting_the_boolean_field_in_the_field_type_and_adding_data_in_the_name_field_and_clicking_on_the_cancel_button() throws IOException, AWTException {
		F();
		
		btnClick(pojo.selectallinfield);
		draganddrop_javascript(pojo.boolean1, pojo.addfield);
		fill(pojo.fieldname1, "Boolean");
		
		btnClick(pojo.cancelfield1);
     	
	}
	@Then("user will check the boolean field should created after selecting the boolean field in the field type and add data in the name field and save it")
	public void user_will_check_the_boolean_field_should_created_after_selecting_the_boolean_field_in_the_field_type_and_add_data_in_the_name_field_and_save_it() throws AWTException, InterruptedException {
		
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "Bollean");
		Thread.sleep(2000);
		btnClick(pojo.clickfielddropdown);
		fill(pojo.clickfielddropdown, "Boo");
		Thread.sleep(4000);
		btnClick(pojo.boolean1);
		if (pojo.boolean1.isDisplayed()) {
			   logInfo("Boolean field is created");
			}
			else 
			{
				logInfo("Boolean field is not created");
			}
		btnClick(pojo.savefield1);
	}
	@Then("user will check user should able to select the char field in field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_char_field_in_field_type_on_the_field_configuration_screen() throws AWTException, InterruptedException {
		btnClick(pojo.clickaddfield);
		//fill(pojo.fieldname1, "Char");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"char");
		Thread.sleep(4000);
		btnClick(pojo.char1);
		if (pojo.char1.isDisplayed()) {
			   logInfo("Char field is visible in dropdown");
			}
			else 
			{
				logInfo("Char field is not visible in dropdown");
			}
		
		//F();
	
//		btnClick(pojo.selectallinfield);
//		draganddrop_javascript(pojo.char1, pojo.addfield);
//		fill(pojo.fieldname1, "Char");
		//fill(pojo.clickfielddropdown, "Char");
		//btnClick(pojo.savefield1);
		
	}
	@Then("user will check validation message should appears when user selects the char field in the field type and make empty name field and save it")
	public void user_will_check_validation_message_should_appears_when_user_selects_the_char_field_in_the_field_type_and_make_empty_name_field_and_save_it() throws InterruptedException {
		//btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "");
		//Thread.sleep(2000);
		//btnClick(pojo.clickfielddropdown);
		//fill(pojo.clickfielddropdown, "Char");
		Thread.sleep(4000);
		btnClick(pojo.savefield1);
		if (pojo.fieldnamealert.isDisplayed()) {
			   logInfo("Field name alert message is appears");
			}
			else 
			{
				logInfo("Field name alert message is not appears");
			}
		btnClick(pojo.cancelfield1);
		//btnClick(pojo.savefield1);
	}
	@Then("user will check char field should creat after selecting the char field in the field type and add data in the name field and save it")
	public void user_will_check_char_field_should_creat_after_selecting_the_char_field_in_the_field_type_and_add_data_in_the_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(2000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "char");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Char");
		Thread.sleep(4000);
		btnClick(pojo.char1);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		
	}
	@Then("user will check char field should not be created after selecting the char field in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_char_field_should_not_be_created_after_selecting_the_char_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(2000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "char");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Char");
		Thread.sleep(4000);
		btnClick(pojo.char1);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	}
	@Then("user will check user should able to select the email field in field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_email_field_in_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "email");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Email");
		Thread.sleep(4000);
		btnClick(pojo.email);
		if (pojo.email.isDisplayed()) {
			   logInfo("Email field is visible in dropdown");
			}
			else 
			{
				logInfo("Email field is not visible in dropdown");
			}
	}
	@Then("user will check validation message should appears when user selects the email field in the field type and make empty name field and save it")
	public void user_will_check_validation_message_should_appears_when_user_selects_the_email_field_in_the_field_type_and_make_empty_name_field_and_save_it() throws InterruptedException {
		btnClick(pojo.savefield1);
		Thread.sleep(2000);

	}
	@Then("user will check email field should create after selecting the email field in the field type and add data in the name field and save it")
	public void user_will_check_email_field_should_create_after_selecting_the_email_field_in_the_field_type_and_add_data_in_the_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "email1");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Email");
		Thread.sleep(4000);
		btnClick(pojo.email);
		btnClick(pojo.savefield1);
		
	}
	@Then("user will check email field should not be created after selecting the email field in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_email_field_should_not_be_created_after_selecting_the_email_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "email1");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Email");
		Thread.sleep(4000);
		btnClick(pojo.email);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check user should able to select the checkbox field from the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_checkbox_field_from_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "checkbox");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"checkbox");
		Thread.sleep(4000);
		if (pojo.checkbox.isDisplayed()) {
			   logInfo("checkbox field is visible in dropdown");
			}
			else 
			{
				logInfo("checkbox field is not visible in dropdown");
			}
		btnClick(pojo.checkbox);
	}
	@Then("user will check user should able to click on the add options under the  option source section")
	public void user_will_check_user_should_able_to_click_on_the_add_options_under_the_option_source_section() {
		if (pojo.checkboxaddoption.isDisplayed()) {
			   logInfo("checkbox add option is clickable");
			}
			else 
			{
				logInfo("checkbox add option is not clickable");
			}
	}
	@Then("user will check dialogue box should appears when user clicks on the add option button")
	public void user_will_check_dialogue_box_should_appears_when_user_clicks_on_the_add_option_button() throws InterruptedException {
		btnClick(pojo.checkboxaddoption);
		Thread.sleep(2000);
		if (pojo.checkboxaddoptionpopup1.isDisplayed()) {
			   logInfo("checkbox add option popup is appears");
			}
			else 
			{
				logInfo("checkbox add option popup is not appears");
			}
	}
	@Then("user will check user should able to fill the add option model  fields and click on the add button")
	public void user_will_check_user_should_able_to_fill_the_add_option_model_fields_and_click_on_the_add_button() throws InterruptedException {
		Thread.sleep(2000);
		fill(pojo.checkboxaddoptionlable1, "Lable");
		fill(pojo.checkboxaddoptionvalue1, "Value");
		Thread.sleep(2000);
		btnClick(pojo.addbuttonforcheckboxaddoption);
		
	}
	@Then("user will check user should able to add multiple data on the options  field")
	public void user_will_check_user_should_able_to_add_multiple_data_on_the_options_field() throws InterruptedException {
		Thread.sleep(2000);
		btnClick(pojo.checkboxaddoption);
		Thread.sleep(2000);
		fill(pojo.checkboxaddoptionlable1, "Lable1");
		fill(pojo.checkboxaddoptionvalue1, "Value1");
		Thread.sleep(2000);
		btnClick(pojo.addbuttonforcheckboxaddoption);
		Thread.sleep(2000);
		btnClick(pojo.checkboxaddoption);
		Thread.sleep(2000);
		fill(pojo.checkboxaddoptionlable1, "Lable2");
		fill(pojo.checkboxaddoptionvalue1, "Value2");
		Thread.sleep(2000);
		btnClick(pojo.addbuttonforcheckboxaddoption);
		Thread.sleep(2000);
		
	}
	@Then("user will check user should able to create the checkbox field  by filling the name field and field type and click on the save button")
	public void user_will_check_user_should_able_to_create_the_checkbox_field_by_filling_the_name_field_and_field_type_and_click_on_the_save_button() throws InterruptedException {
		Thread.sleep(3000);
		btnClick(pojo.savefield1);
	}
	@Then("user will check user should able to select the date field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_date_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "date");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"date");
		Thread.sleep(4000);
		btnClick(pojo.date);
		Thread.sleep(2000);
		if (pojo.date.isDisplayed()) {
			   logInfo("Date field is visible in dropdown");
			}
			else 
			{
				logInfo("Dtae field is not visible in dropdown");
			}
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	}
	@Then("user will check validation message should appear when user selects the date field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_date_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		//Thread.sleep(2000);
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"date");
		Thread.sleep(4000);
		btnClick(pojo.date);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		if (pojo.fieldnamealert.isDisplayed()) {
			   logInfo("Date field name alert is appears");
			}
			else 
			{
				logInfo("Date field name alert is not appears");
			}
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check date field should be created after selecting the date field in the field type with adding data in the name field and saving it")
	public void user_will_check_date_field_should_be_created_after_selecting_the_date_field_in_the_field_type_with_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "date");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"date");
		Thread.sleep(4000);
		btnClick(pojo.date);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		
	}
	@Then("user will check date field should not be created after selecting the date field in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_date_field_should_not_be_created_after_selecting_the_date_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "date");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"date");
		Thread.sleep(4000);
		btnClick(pojo.date);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check user should able to select the dropdown field from the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_dropdown_field_from_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "dropdownsingle");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"drop");
		Thread.sleep(4000);
		btnClick(pojo.dropdownsingle);
		Thread.sleep(2000);
		if (pojo.dropdownsingle.isDisplayed()) {
			   logInfo("Dropdown single field is selectable");
			}
			else 
			{
				logInfo("Dropdown single field is not selectable");
			}
		Thread.sleep(2000);
		//btnClick(pojo.savefield1);
		
	}
	@Then("user will cheeck user should able to fill the add option model fields and click on the add button")
	public void user_will_cheeck_user_should_able_to_fill_the_add_option_model_fields_and_click_on_the_add_button() throws InterruptedException {
		if (pojo.checkboxaddoption.isDisplayed()) {
			   logInfo("checkbox add option is clickable");
			}
			else 
			{
				logInfo("checkbox add option is not clickable");
			}
		btnClick(pojo.checkboxaddoption);
		Thread.sleep(2000);
		fill(pojo.checkboxaddoptionlable1, "Lable");
		fill(pojo.checkboxaddoptionvalue1, "Value");
		Thread.sleep(2000);
		btnClick(pojo.addbuttonforcheckboxaddoption);
	}
	@Then("user will check user should able to add multiple data on the options ield")
	public void user_will_check_user_should_able_to_add_multiple_data_on_the_options_ield() throws InterruptedException {
		Thread.sleep(2000);
		btnClick(pojo.checkboxaddoption);
		Thread.sleep(2000);
		fill(pojo.checkboxaddoptionlable1, "Lable1");
		fill(pojo.checkboxaddoptionvalue1, "Value1");
		Thread.sleep(2000);
		btnClick(pojo.addbuttonforcheckboxaddoption);
		Thread.sleep(2000);
		btnClick(pojo.checkboxaddoption);
		Thread.sleep(2000);
		fill(pojo.checkboxaddoptionlable1, "Lable2");
		fill(pojo.checkboxaddoptionvalue1, "Value2");
		Thread.sleep(2000);
		btnClick(pojo.addbuttonforcheckboxaddoption);
		Thread.sleep(2000);
	}
	@Then("user will check user should able to create the dropdown field  by filling the name field and field type and clicking on the save button")
	public void user_will_check_user_should_able_to_create_the_dropdown_field_by_filling_the_name_field_and_field_type_and_clicking_on_the_save_button() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "dropdownsingle");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"drop");
		Thread.sleep(4000);
		btnClick(pojo.dropdownsingle);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
	}
	@Then("user will check user should able to select the Number\\(decimal) field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_number_decimal_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "number decimal");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"decimal");
		Thread.sleep(4000);
		btnClick(pojo.numberdecimal);
		Thread.sleep(2000);
		//btnClick(pojo.savefield1);
		if (pojo.numberdecimal.isDisplayed()) {
			   logInfo("Number (decimal) field is selectable");
			}
			else 
			{
				logInfo("Number (decimal) field is not selectable");
			}
		btnClick(pojo.cancelfield1);
	}
	@Then("user will check validation message should appear when user selects the Number\\(decimal) field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_number_decimal_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "number decimal");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"decimal");
		Thread.sleep(4000);
		btnClick(pojo.numberdecimal);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		if (pojo.fieldnamealert.isDisplayed()) {
			   logInfo("Number (decimal) field name alert is appears");
			}
			else 
			{
				logInfo("Number (decimal) field name alert is not appears");
			}
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check Number\\(decimal) field should be created after selecting the date field in the field type by adding data in the name field and saving it")
	public void user_will_check_number_decimal_field_should_be_created_after_selecting_the_date_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "number decimal");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"decimal");
		Thread.sleep(4000);
		btnClick(pojo.numberdecimal);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
	}
	@Then("user will check date field should not be created after selecting the Number\\(decimal) field in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_date_field_should_not_be_created_after_selecting_the_number_decimal_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "number decimal");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"decimal");
		Thread.sleep(4000);
		btnClick(pojo.numberdecimal);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	}
	@Then("user will check user should able to select the Number\\(integer) field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_number_integer_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "number integer");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"integer");
		Thread.sleep(4000);
		btnClick(pojo.numberinteger);
		Thread.sleep(2000);
		if (pojo.numberinteger.isDisplayed()) {
			   logInfo("Number (integer) field name alert is appears");
			}
			else 
			{
				logInfo("Number (integer) field name alert is not appears");
			}
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	}
	@Then("user will check validation message should appear when user selects the Number\\(integer) field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_number_integer_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "number integer");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"integer");
		Thread.sleep(4000);
		btnClick(pojo.numberinteger);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		if (pojo.fieldnamealert.isDisplayed()) {
			   logInfo("Number (integer) field name alert is appears");
			}
			else 
			{
				logInfo("Number (integer) field name alert is not appears");
			}
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	}
	@Then("user will check Number\\(integer) field should be created after selecting the date field in the field type by adding data in the name field and saving it")
	public void user_will_check_number_integer_field_should_be_created_after_selecting_the_date_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "number integer");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"integer");
		Thread.sleep(4000);
		btnClick(pojo.numberinteger);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
	}
	@Then("user will check date field should not be created after selecting the Number\\(integer) field in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_date_field_should_not_be_created_after_selecting_the_number_integer_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "number integer");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"integer");
		Thread.sleep(4000);
		btnClick(pojo.numberinteger);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	}
	@Then("user will check user should able to select the Paragraph and Heading field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_Paragraph_and_Heading_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "paragraph");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Paragraph");
		Thread.sleep(4000);
		btnClick(pojo.paragraph);
		Thread.sleep(2000);
		if (pojo.paragraph.isDisplayed()) {
			   logInfo("Paragraph field is selectable in field dropdown");
			}
			else 
			{
				logInfo("Paragraph field is not selectable in field dropdown");
			}
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check validation message should appear when user selects the paragraph\\/Heading field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_paragraph_heading_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "paragraph");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Paragraph");
		Thread.sleep(4000);
		btnClick(pojo.paragraph);
		Thread.sleep(2000);
		if (pojo.fieldnamealert.isDisplayed()) {
			   logInfo("Paragraph field name alert message is appears");
			}
			else 
			{
				logInfo("Paragraph field name alert message is not appears");
			}
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check Paragraph\\/Heading field should be created after selecting the date field in the field type by adding data in the name field and saving it")
	public void user_will_check_paragraph_heading_field_should_be_created_after_selecting_the_date_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "paragraph");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Paragraph");
		Thread.sleep(4000);
		btnClick(pojo.paragraph);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
	}
	@Then("user will check date field should not be created after selecting the Paragraph\\/Heading field in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_date_field_should_not_be_created_after_selecting_the_paragraph_heading_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "paragraph");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Paragraph");
		Thread.sleep(4000);
		btnClick(pojo.paragraph);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	}
	@Then("user will check user should able to select the phone field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_phone_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "phone");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Phone");
		Thread.sleep(4000);
		btnClick(pojo.phone);
		Thread.sleep(2000);
		if (pojo.phone.isDisplayed()) {
			   logInfo("Phone field is selectable in field dropdown");
			}
			else 
			{
				logInfo("Phone field is not selectable in field dropdown");
			}
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check validation message should appear when user selects the phone field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_phone_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "phone");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Phone");
		Thread.sleep(4000);
		btnClick(pojo.phone);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		if (pojo.phone.isDisplayed()) {
			   logInfo("Phone field name alert message is appear");
			}
			else 
			{
				logInfo("Phone field name alert message is not appear");
			}
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check phone field should be created after selecting the date field in the field type by adding data in the name field and saving it")
	public void user_will_check_phone_field_should_be_created_after_selecting_the_date_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "phone");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Phone");
		Thread.sleep(4000);
		btnClick(pojo.phone);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		
	}
	@Then("user will check phone field should not be created after selecting the phone field in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_phone_field_should_not_be_created_after_selecting_the_phone_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "phone");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Phone");
		Thread.sleep(4000);
		btnClick(pojo.phone);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check user should able to select the array field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_array_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "array");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Array");
		Thread.sleep(4000);
		btnClick(pojo.arrayfield);
		Thread.sleep(2000);
		if (pojo.arrayfield.isDisplayed()) {
			   logInfo("Array field is selectable in field dropdown");
			}
			else 
			{
				logInfo("Array field is not selectable in field dropdown");
			}
		btnClick(pojo.cancelfield1);
	}
	@Then("user will check validation message should appear when user selects the array field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_array_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "array");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Array");
		Thread.sleep(4000);
		btnClick(pojo.arrayfield);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		if (pojo.arrayfield.isDisplayed()) {
			   logInfo("Array field name alert message is appear");
			}
			else 
			{
				logInfo("Array field name alert message is not appear");
			}
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	}
	@Then("user will check array field should be created after selecting the date field in the field type by adding data in the name field and saving it")
	public void user_will_check_array_field_should_be_created_after_selecting_the_date_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "array");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Array");
		Thread.sleep(4000);
		btnClick(pojo.arrayfield);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
	}
	@Then("user will check array field should not be created after selecting the array field in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_array_field_should_not_be_created_after_selecting_the_array_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "array");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Array");
		Thread.sleep(4000);
		btnClick(pojo.arrayfield);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	}
	@Then("user will check user should able to select the business unit field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_business_unit_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "business unit");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Business");
		Thread.sleep(4000);
		btnClick(pojo.businessunit);
		Thread.sleep(2000);
		if (pojo.businessunit.isDisplayed()) {
			   logInfo("Business unit field is selectable in field dropdown");
			}
			else 
			{
				logInfo("Business unit field is not selectable in field dropdown");
			}
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	}
	@Then("user will check validation message should appear when user selects the business unit field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_business_unit_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "business unit");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Business");
		Thread.sleep(4000);
		btnClick(pojo.businessunit);
		Thread.sleep(2000);
		if (pojo.fieldnamealert.isDisplayed()) {
			   logInfo("Business unit field name alert is appears");
			}
			else 
			{
				logInfo("Business unit field name alert is not appears");
			}
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	}
	@Then("user will check business unit field should be created after selecting the business unit field in the field type by adding data in the name field and saving it")
	public void user_will_check_business_unit_field_should_be_created_after_selecting_the_business_unit_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "business unit");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Business");
		Thread.sleep(4000);
		btnClick(pojo.businessunit);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
	}
	@Then("user will check business unit field should not be created after selecting the business unit field in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_business_unit_field_should_not_be_created_after_selecting_the_business_unit_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "business unit");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Business");
		Thread.sleep(4000);
		btnClick(pojo.businessunit);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	}



}
