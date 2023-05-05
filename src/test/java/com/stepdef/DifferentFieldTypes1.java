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

public class DifferentFieldTypes1 extends BaseClass {

	
	public static Pojoclass pojo = new Pojoclass();
	
	
	
	@Then("user will check user should able to select the cascader field from the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_cascader_field_from_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "cascader");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Cascader");
		Thread.sleep(4000);
		if (pojo.cascader.isDisplayed()) {
			   logInfo("Cascader field is selectable in field dropdown");
			}
			else 
			{
				logInfo("Cascader field is not selectable in field dropdown");
			}
		btnClick(pojo.cascader);
		Thread.sleep(2000);
		//btnClick(pojo.cancelfield1);
	}
	@Then("user will Check user should able to click on the add options under the  option source section")
	public void user_will_check_user_should_able_to_click_on_the_add_options_under_the_option_source_section() {
		
		if (pojo.cascaderaddoptionclick1.isDisplayed()) {
			   logInfo("Add option is clickable for Cascader field");
			}
			else 
			{
				logInfo("Add option is not clickable for Cascader field");
			}
		btnClick(pojo.cascaderaddoptionclick1);
	}
	@Then("user will check dialogue box should appear when user clicks on the add option button")
	public void user_will_check_dialogue_box_should_appear_when_user_clicks_on_the_add_option_button() throws InterruptedException {
		Thread.sleep(3000);
		if (pojo.addoptionpopupforcascader1.isDisplayed()) {
			   logInfo("Add option popup is appear");
			}
			else 
			{
				logInfo("Add option popup is not appear");
			}
	}
	@Then("user will Check user should able to fill the add option model  fields and click on the add button")
	public void user_will_check_user_should_able_to_fill_the_add_option_model_fields_and_click_on_the_add_button() throws InterruptedException {
		Thread.sleep(3000);
		fill(pojo.cascaderaddoptionlable, "Lable1");
		fill(pojo.cascaderaddoptionvalue, "Value1");
		Thread.sleep(2000);
		btnClick(pojo.cascaderaddoptionaddbutton);


	}
	@Then("user will Ceck user should able to add multiple data on the options  field")
	public void user_will_ceck_user_should_able_to_add_multiple_data_on_the_options_field() throws InterruptedException {
		Thread.sleep(3000);
		btnClick(pojo.cascaderaddoptionclick1);
		fill(pojo.cascaderaddoptionlable, "Lable2");
		fill(pojo.cascaderaddoptionvalue, "Value2");
		Thread.sleep(2000);
		btnClick(pojo.cascaderaddoptionaddbutton);
		Thread.sleep(3000);
		btnClick(pojo.cascaderaddoptionclick1);
		fill(pojo.cascaderaddoptionlable, "Lable3");
		fill(pojo.cascaderaddoptionvalue, "Value3");
		Thread.sleep(2000);
		btnClick(pojo.cascaderaddoptionaddbutton);


	}
	@Then("user will check user should able to create the cascader field  by filling the name field and field type and clicking on the save button")
	public void user_will_check_user_should_able_to_create_the_cascader_field_by_filling_the_name_field_and_field_type_and_clicking_on_the_save_button() throws InterruptedException {
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
	}
	@Then("user will check user should able to select the currency field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_currency_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "currency");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Currency");
		Thread.sleep(4000);
		if (pojo.currency.isDisplayed()) {
			   logInfo("Cascader field is selectable in field dropdown");
			}
			else 
			{
				logInfo("Cascader field is not selectable in field dropdown");
			}
		btnClick(pojo.currency);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check validation message should appear when user selects the currency field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_currency_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "currency");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Currency");
		Thread.sleep(4000);
		btnClick(pojo.currency);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		if (pojo.fieldnamealert.isDisplayed()) {
			   logInfo("field name alert message is displayed");
			}
			else 
			{
				logInfo("field name alert message is not displayed");
			}
		btnClick(pojo.cancelfield1);
	}
	@Then("user will check currency field should be created after selecting the currency field in the field type by adding data in the name field and saving it")
	public void user_will_check_currency_field_should_be_created_after_selecting_the_currency_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "currency");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Currency");
		Thread.sleep(4000);
		btnClick(pojo.currency);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);

	}
	@Then("user will check currency field should not be created after selecting the currency field in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_currency_field_should_not_be_created_after_selecting_the_currency_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "currency");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Currency");
		Thread.sleep(4000);
		btnClick(pojo.currency);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will user should able to select the date\\(timezone aware) field in the field type on the field configuration screen")
	public void user_will_user_should_able_to_select_the_date_timezone_aware_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "date(timezone)");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"date");
		Thread.sleep(4000);
		if (pojo.datetimezone.isDisplayed()) {
			   logInfo("Date (timezone aware) field is selectable in field dropdown");
			}
			else 
			{
				logInfo("Date (timezone aware) field is not selectable in field dropdown");
			}
		btnClick(pojo.datetimezone);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	
	}
	@Then("user will check validation message should appear when user selects the date\\(timezone aware) field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_date_timezone_aware_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "date(timezone)");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"date");
		Thread.sleep(4000);
		btnClick(pojo.datetimezone);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		if (pojo.fieldnamealert.isDisplayed()) {
			   logInfo("field name alert message is displayed");
			}
			else 
			{
				logInfo("field name alert message is not displayed");
			}
		btnClick(pojo.cancelfield1);
	
	}
	@Then("user will check date\\(timezone aware) field should be created after selecting the date\\(timezone aware) field in the field type by adding data in the name field and saving it")
	public void user_will_check_date_timezone_aware_field_should_be_created_after_selecting_the_date_timezone_aware_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "date(timezone)");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"date");
		Thread.sleep(4000);
		btnClick(pojo.datetimezone);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		
	}
	@Then("user will check date\\(timezone aware) field should not be created after selecting the date\\(timezone aware) field in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_date_timezone_aware_field_should_not_be_created_after_selecting_the_date_timezone_aware_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "date(timezone)");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"date");
		Thread.sleep(4000);
		btnClick(pojo.datetimezone);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check user should able to select the download attachmen field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_download_attachmen_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "download attachment");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"download");
		Thread.sleep(4000);
		if (pojo.downloadattachment.isDisplayed()) {
			   logInfo("download attachment field is selectable in field dropdown");
			}
			else 
			{
				logInfo("download attachment field is not selectable in field dropdown");
			}
		btnClick(pojo.downloadattachment);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	
	}
	@Then("user will check validation message should appear when user selects the download attachment field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_download_attachment_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "download attachment)");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"download");
		Thread.sleep(4000);
		btnClick(pojo.downloadattachment);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		if (pojo.fieldnamealert.isDisplayed()) {
			   logInfo("field name alert message is displayed");
			}
			else 
			{
				logInfo("field name alert message is not displayed");
			}
		btnClick(pojo.cancelfield1);
	
	}
	@Then("user will check download attachment field should be created after selecting the download attachment field in the field type by adding data in the name field and saving it")
	public void user_will_check_download_attachment_field_should_be_created_after_selecting_the_download_attachment_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "download attachment)");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"download");
		Thread.sleep(4000);
		btnClick(pojo.downloadattachment);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		
	}
	@Then("user will check download attachment field should not be created after selecting the download attachment field in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_download_attachment_field_should_not_be_created_after_selecting_the_download_attachment_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "download attachment)");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"download");
		Thread.sleep(4000);
		btnClick(pojo.downloadattachment);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	}
	@Then("user will check user should able to select the Dynamic Group JSON field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_dynamic_group_json_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "dynamic group json");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"dynamic");
		Thread.sleep(4000);
		if (pojo.dynamicgroupjson.isDisplayed()) {
			   logInfo("dynamic group json field is selectable in field dropdown");
			}
			else 
			{
				logInfo("dynamic group json field is not selectable in field dropdown");
			}
		btnClick(pojo.dynamicgroupjson);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	}
	@Then("user will check validation message should appear when user selects the Dynamic Group JSONt field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_dynamic_group_jso_nt_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "dynamic group json");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"dynamic group json");
		Thread.sleep(4000);
		btnClick(pojo.dynamicgroupjson);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		if (pojo.fieldnamealert.isDisplayed()) {
			   logInfo("field name alert message is displayed");
			}
			else 
			{
				logInfo("field name alert message is not displayed");
			}
		btnClick(pojo.cancelfield1);
	

	}
	@Then("user will check Dynamic Group JSON field should be created after selecting the Dynamic Group JSON field in the field type by adding data in the name field and saving it")
	public void user_will_check_dynamic_group_json_field_should_be_created_after_selecting_the_dynamic_group_json_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "dynamic group json");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"dynamic group json");
		Thread.sleep(4000);
		btnClick(pojo.dynamicgroupjson);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		
	}
	@Then("user will check Dynamic Group JSON field should not be created after selecting the Dynamic Group JSON field in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_dynamic_group_json_field_should_not_be_created_after_selecting_the_dynamic_group_json_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "dynamic group json");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"dynamic group json");
		Thread.sleep(4000);
		btnClick(pojo.dynamicgroupjson);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check user should able to select the Embed video field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_embed_video_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "embed video");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"embed video");
		Thread.sleep(4000);
		if (pojo.embedvideo.isDisplayed()) {
			   logInfo("embed video field is selectable in field dropdown");
			}
			else 
			{
				logInfo("embed video field is not selectable in field dropdown");
			}
		btnClick(pojo.embedvideo);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	}
	@Then("user will check validation message should appear when user selects the embed video field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_embed_video_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "embed video");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"embed video");
		Thread.sleep(4000);
		btnClick(pojo.embedvideo);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		if (pojo.fieldnamealert.isDisplayed()) {
			   logInfo("field name alert message is displayed");
			}
			else 
			{
				logInfo("field name alert message is not displayed");
			}
		btnClick(pojo.cancelfield1);
	
	}
	@Then("user will check Embed video field should be created after selecting the Embed video field in the field type by adding data in the name field and saving it")
	public void user_will_check_embed_video_field_should_be_created_after_selecting_the_embed_video_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "embed video");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"embed video");
		Thread.sleep(4000);
		btnClick(pojo.embedvideo);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		
	}
	@Then("user will check Embed video field should not be created after selecting the Embed video field in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_embed_video_field_should_not_be_created_after_selecting_the_embed_video_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "embed video");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"embed video");
		Thread.sleep(4000);
		btnClick(pojo.embedvideo);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
		
	}@Then("user will check user should able to select the Google Address Search field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_google_address_search_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "google address search");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"google");
		Thread.sleep(4000);
		if (pojo.googleaddresssearch.isDisplayed()) {
			   logInfo("google address search field is selectable in field dropdown");
			}
			else 
			{
				logInfo("google address search field is not selectable in field dropdown");
			}
		btnClick(pojo.googleaddresssearch);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	
	}
	@Then("user will check validation message should appear when user selects the Google Address Search field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_google_address_search_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "google address search");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"google");
		Thread.sleep(4000);
		btnClick(pojo.googleaddresssearch);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		if (pojo.fieldnamealert.isDisplayed()) {
			   logInfo("field name alert message is displayed");
			}
			else 
			{
				logInfo("field name alert message is not displayed");
			}
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check Google Address Search field should be created after selecting the Google Address Search field in the field type by adding data in the name field and saving it")
	public void user_will_check_google_address_search_field_should_be_created_after_selecting_the_google_address_search_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "google address search");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"google");
		Thread.sleep(4000);
		btnClick(pojo.googleaddresssearch);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
	}
	@Then("user will check Google Address Search field should not be created after selecting the Google Address Search field in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_google_address_search_field_should_not_be_created_after_selecting_the_google_address_search_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "google address search");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"google");
		Thread.sleep(4000);
		btnClick(pojo.googleaddresssearch);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	}
	@Then("user will check user should able to select the info\\/Description box field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_info_description_box_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "info description");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"info");
		Thread.sleep(4000);
		if (pojo.infodescriptionbox.isDisplayed()) {
			   logInfo("info discription field is selectable in field dropdown");
			}
			else 
			{
				logInfo("info discription field is not selectable in field dropdown");
			}
		btnClick(pojo.infodescriptionbox);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	
	}
	@Then("user will check validation message should appear on the Type of the info box when user selects the info\\/Description box field in the field type and make an empty Type of the info box field and save it")
	public void user_will_check_validation_message_should_appear_on_the_type_of_the_info_box_when_user_selects_the_info_description_box_field_in_the_field_type_and_make_an_empty_type_of_the_info_box_field_and_save_it() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "info description");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"info");
		Thread.sleep(4000);
		btnClick(pojo.infodescriptionbox);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		if (pojo.namefieldvalidationmsg.isDisplayed()) {
			   logInfo("field name alert message is displayed");
			}
			else 
			{
				logInfo("field name alert message is not displayed");
			}
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check validation message should appear when user selects the info\\/Description box field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_info_description_box_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "info description");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"info");
		Thread.sleep(4000);
		btnClick(pojo.infodescriptionbox);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		if (pojo.namefieldvalidationmsg.isDisplayed()) {
			   logInfo("field name alert message is displayed");
			}
			else 
			{
				logInfo("field name alert message is not displayed");
			}
		btnClick(pojo.cancelfield1);
		

	}
	@Then("user will check the info\\/description box field should be created after selecting the  info\\/description box field in the field type with add data in the name field and Type of the info box field and save it")
	public void user_will_check_the_info_description_box_field_should_be_created_after_selecting_the_info_description_box_field_in_the_field_type_with_add_data_in_the_name_field_and_type_of_the_info_box_field_and_save_it() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "info description");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"info");
		Thread.sleep(4000);
		btnClick(pojo.infodescriptionbox);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
	}
	@Then("user will check Type of the info box field should not be created after selecting the Type of the info box field in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_type_of_the_info_box_field_should_not_be_created_after_selecting_the_type_of_the_info_box_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "info description");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"info");
		Thread.sleep(4000);
		btnClick(pojo.infodescriptionbox);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	}
	@Then("user will check user should able to select the JSON code field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_json_code_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "json code");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"json");
		Thread.sleep(4000);
		if (pojo.jsoncode.isDisplayed()) {
			   logInfo("json code field is selectable in field dropdown");
			}
			else 
			{
				logInfo("json code field is not selectable in field dropdown");
			}
		btnClick(pojo.jsoncode);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	}
	@Then("user will check validation message should appear when user selects the JSON code field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_json_code_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "json code");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"json");
		Thread.sleep(4000);
		btnClick(pojo.jsoncode);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		if (pojo.fieldnamealert.isDisplayed()) {
			   logInfo("field name alert message is displayed");
			}
			else 
			{
				logInfo("field name alert message is not displayed");
			}
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user wiill check JSON code field should be created after selecting the JSON code Search field in the field type by adding data in the name field and saving it")
	public void user_wiill_check_json_code_field_should_be_created_after_selecting_the_json_code_search_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "json code");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"json");
		Thread.sleep(4000);
		btnClick(pojo.jsoncode);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		
	}
	@Then("uswr will check JSON code field should not be created after selecting the JSON code Search field in the field type and add data in the name field and clicking on the cancel button")
	public void uswr_will_check_json_code_field_should_not_be_created_after_selecting_the_json_code_search_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "json code");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"json");
		Thread.sleep(4000);
		btnClick(pojo.jsoncode);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check user should able to select the Process Linking Alpha field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_process_linking_alpha_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "process linking");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"process");
		Thread.sleep(4000);
		if (pojo.processlinking.isDisplayed()) {
			   logInfo("process linking field is selectable in field dropdown");
			}
			else 
			{
				logInfo("process linking field is not selectable in field dropdown");
			}
		btnClick(pojo.jsoncode);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	}
	@Then("user will check validation message should appear when user selects the Process Linking Alpha field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_process_linking_alpha_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "process linking");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"process");
		Thread.sleep(4000);
		btnClick(pojo.processlinking);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		if (pojo.fieldnamealert.isDisplayed()) {
			   logInfo("field name alert message is displayed");
			}
			else 
			{
				logInfo("field name alert message is not displayed");
			}
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check Process Linking Alpha field should be created after selecting the Process Linking Alpha  field in the field type by adding data in the name field and saving it")
	public void user_will_check_process_linking_alpha_field_should_be_created_after_selecting_the_process_linking_alpha_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "process linking");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"process");
		Thread.sleep(4000);
		btnClick(pojo.processlinking);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		
	}
	@Then("user will check Process Linking Alpha field should not be created after selecting the Process Linking Alpha field  in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_process_linking_alpha_field_should_not_be_created_after_selecting_the_process_linking_alpha_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "process linking");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"process");
		Thread.sleep(4000);
		btnClick(pojo.processlinking);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check user should able to select the Region field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_region_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "region");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"region");
		Thread.sleep(4000);
		if (pojo.region.isDisplayed()) {
			   logInfo("Region field is selectable in field dropdown");
			}
			else 
			{
				logInfo("Region field is not selectable in field dropdown");
			}
		btnClick(pojo.region);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	}
	@Then("user will check validation message should appear when user selects the Region field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_region_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "region");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"region");
		Thread.sleep(4000);
		btnClick(pojo.region);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		if (pojo.fieldnamealert.isDisplayed()) {
			   logInfo("field name alert message is displayed");
			}
			else 
			{
				logInfo("field name alert message is not displayed");
			}
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check Region field should be created after selecting the Region  field in the field type by adding data in the name field and saving it")
	public void user_will_check_region_field_should_be_created_after_selecting_the_region_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "region");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"region");
		Thread.sleep(4000);
		btnClick(pojo.region);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
	}
	@Then("user will check Region field should not be created after selecting the Region field  in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_region_field_should_not_be_created_after_selecting_the_region_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "region");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"region");
		Thread.sleep(4000);
		btnClick(pojo.region);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	
	}
	@Then("user will check user should able to select the Rich text editor field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_rich_text_editor_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "rich text editor");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"rich text editor");
		Thread.sleep(4000);
		if (pojo.richtexteditor.isDisplayed()) {
			   logInfo("rich text editor field is selectable in field dropdown");
			}
			else 
			{
				logInfo("rich text editor field is not selectable in field dropdown");
			}
		btnClick(pojo.richtexteditor);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	}
	@Then("user will check validation message should appear when user selects the rich text editor field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_rich_text_editor_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "rich text editor");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"rich text editor");
		Thread.sleep(4000);
		btnClick(pojo.richtexteditor);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		if (pojo.fieldnamealert.isDisplayed()) {
			   logInfo("field name alert message is displayed");
			}
			else 
			{
				logInfo("field name alert message is not displayed");
			}
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check Rich text editor field should be created after selecting the Rich text editor  field in the field type by adding data in the name field and saving it")
	public void user_will_check_rich_text_editor_field_should_be_created_after_selecting_the_rich_text_editor_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "rich text editor");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"rich text editor");
		Thread.sleep(4000);
		btnClick(pojo.richtexteditor);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		
	}
	@Then("user will check Rich text editor field should not be created after selecting the Rich text editor field  in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_rich_text_editor_field_should_not_be_created_after_selecting_the_rich_text_editor_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "rich text editor");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"rich text editor");
		Thread.sleep(4000);
		btnClick(pojo.richtexteditor);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check user should able to select the Section line field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_section_line_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "section line field");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"section line field");
		Thread.sleep(4000);
		if (pojo.sectionlink.isDisplayed()) {
			   logInfo("section line field field is selectable in field dropdown");
			}
			else 
			{
				logInfo("section line field field is not selectable in field dropdown");
			}
		btnClick(pojo.sectionlink);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);

	}
	@Then("user will check validation message should appear when user selects the Section line field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_section_line_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "section line field");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"section line field");
		Thread.sleep(4000);
		btnClick(pojo.sectionlink);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		if (pojo.fieldnamealert.isDisplayed()) {
			   logInfo("field name alert message is displayed");
			}
			else 
			{
				logInfo("field name alert message is not displayed");
			}
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check Section line field should be created after selecting the Section line field in the field type by adding data in the name field and saving it")
	public void user_will_check_section_line_field_should_be_created_after_selecting_the_section_line_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "section line field");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"section line field");
		Thread.sleep(4000);
		btnClick(pojo.sectionlink);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		
	}
	@Then("user will check Section line field should not be created after selecting the Section line field  in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_section_line_field_should_not_be_created_after_selecting_the_section_line_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "section line field");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"section line field");
		Thread.sleep(4000);
		btnClick(pojo.sectionlink);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check user should able to select the slider field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_slider_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "slider");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"slider");
		Thread.sleep(4000);
		if (pojo.slider.isDisplayed()) {
			   logInfo("slider field is selectable in field dropdown");
			}
			else 
			{
				logInfo("slider field is not selectable in field dropdown");
			}
		btnClick(pojo.slider);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);


	}
	@Then("user will check validation message should appear when user selects the slider field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_slider_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "slider");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"slider");
		Thread.sleep(4000);
		btnClick(pojo.slider);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		if (pojo.fieldnamealert.isDisplayed()) {
			   logInfo("field name alert message is displayed");
			}
			else 
			{
				logInfo("field name alert message is not displayed");
			}
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check Slider field should be created after selecting the Slider field in the field type by adding data in the name field and saving it")
	public void user_will_check_slider_field_should_be_created_after_selecting_the_slider_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "slider");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"slider");
		Thread.sleep(4000);
		btnClick(pojo.slider);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		
	}
	@Then("user will check Slider field should not be created after selecting the slider line field  in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_slider_field_should_not_be_created_after_selecting_the_slider_line_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "slider");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"slider");
		Thread.sleep(4000);
		btnClick(pojo.slider);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check user should able to select the supplier creation field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_supplier_creation_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "supplier");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"supplier");
		Thread.sleep(4000);
		if (pojo.suppliercreation.isDisplayed()) {
			   logInfo("supplier creation field is selectable in field dropdown");
			}
			else 
			{
				logInfo("supplier creation field is not selectable in field dropdown");
			}
		btnClick(pojo.suppliercreation);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);


	}
	@Then("user will check validation message should appear when user selects the supplier creation field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_supplier_creation_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "supplier creation");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"supplier creation");
		Thread.sleep(4000);
		btnClick(pojo.suppliercreation);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		if (pojo.fieldnamealert.isDisplayed()) {
			   logInfo("field name alert message is displayed");
			}
			else 
			{
				logInfo("field name alert message is not displayed");
			}
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check supplier creation field should be created after selecting the supplier creation field in the field type by adding data in the name field and saving it")
	public void user_will_check_supplier_creation_field_should_be_created_after_selecting_the_supplier_creation_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "supplier creation");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"supplier creation");
		Thread.sleep(4000);
		btnClick(pojo.suppliercreation);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		
	}
	@Then("user will check supplier creation field should not be created after selecting the supplier creation field  in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_supplier_creation_field_should_not_be_created_after_selecting_the_supplier_creation_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "supplier creation");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"supplier creation");
		Thread.sleep(4000);
		btnClick(pojo.suppliercreation);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	
	}
	@Then("user will check user should able to select the system field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_system_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "system field");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"system field");
		Thread.sleep(4000);
		if (pojo.systemfield.isDisplayed()) {
			   logInfo("supplier creation field is selectable in field dropdown");
			}
			else 
			{
				logInfo("supplier creation field is not selectable in field dropdown");
			}
		btnClick(pojo.systemfield);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);

	}
	@Then("user will check validation message should appear when user selects the system field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_system_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "system field");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"system field");
		Thread.sleep(4000);
		btnClick(pojo.systemfield);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		if (pojo.namealertforsystemfield.isDisplayed()) {
			   logInfo("field name alert message is displayed");
			}
			else 
			{
				logInfo("field name alert message is not displayed");
			}
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check validation message should appears on the source mapping field")
	public void user_will_check_validation_message_should_appears_on_the_source_mapping_field() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "system field");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"system field");
		Thread.sleep(4000);
		btnClick(pojo.systemfield);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		if (pojo.sourcemappingalertforsystemfield.isDisplayed()) {
			   logInfo("source mapping field validation alert message is displayed");
			}
			else 
			{
				logInfo("source mapping field validation alert message is not displayed");
			}
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check system field should be created after selecting the supplier creation field in the field type by adding data in the name and source mapping field and saving it")
	public void user_will_check_system_field_should_be_created_after_selecting_the_supplier_creation_field_in_the_field_type_by_adding_data_in_the_name_and_source_mapping_field_and_saving_it() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "system field");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"system field");
		Thread.sleep(4000);
		btnClick(pojo.systemfield);
		Thread.sleep(2000);
		btnClick(pojo.sourcemappingforsystemfield);
		Thread.sleep(2000);
		fill(pojo.sourcemappingforsystemfield, "workflow name");
		Thread.sleep(2000);
		btnClick(pojo.workflownameforsourcemappingsystemfield);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);

	}
	@Then("user will check system  field should not be created after selecting the supplier creation field  in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_system_field_should_not_be_created_after_selecting_the_supplier_creation_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "system field");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"system field");
		Thread.sleep(4000);
		btnClick(pojo.systemfield);
		Thread.sleep(2000);
		btnClick(pojo.sourcemappingforsystemfield);
		Thread.sleep(2000);
		fill(pojo.sourcemappingforsystemfield, "workflow name");
		Thread.sleep(2000);
		btnClick(pojo.workflownameforsourcemappingsystemfield);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
	}
	@Then("user will check user should able to select the upload file field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_upload_file_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "upload file");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"upload file");
		Thread.sleep(4000);
		if (pojo.uploadfile.isDisplayed()) {
			   logInfo("upload file field is selectable in field dropdown");
			}
			else 
			{
				logInfo("upload file field is not selectable in field dropdown");
			}
		btnClick(pojo.uploadfile);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);


	}
	@Then("user will check validation message should appear when user selects the upload file field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_upload_file_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "upload file");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"upload file");
		Thread.sleep(4000);
		btnClick(pojo.uploadfile);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		if (pojo.namefieldvalidationmsg.isDisplayed()) {
			   logInfo("upload file field validation alert message is displayed");
			}
			else 
			{
				logInfo("upload file field validation alert message is not displayed");
			}
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check Upload file field should be created after selecting the upload file field in the field type by adding data in the name field and saving it")
	public void user_will_check_upload_file_field_should_be_created_after_selecting_the_upload_file_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "upload file");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"upload file");
		Thread.sleep(4000);
		btnClick(pojo.uploadfile);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
	
	}
	@Then("user will check upload file field should not be created after selecting the upload file field  in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_upload_file_field_should_not_be_created_after_selecting_the_upload_file_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "upload file");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"upload file");
		Thread.sleep(4000);
		btnClick(pojo.uploadfile);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	
	}
	@Then("user will check user should able to select the Multi file upload field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_multi_file_upload_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "multi file upload");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"multi file upload");
		Thread.sleep(4000);
		if (pojo.multifileupload.isDisplayed()) {
			   logInfo("multi file upload field is selectable in field dropdown");
			}
			else 
			{
				logInfo("multi file upload field is not selectable in field dropdown");
			}
		btnClick(pojo.multifileupload);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);

	}
	@Then("user will check validation message should appear when user selects the Multi file upload field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_multi_file_upload_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "multi file upload");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"multi file upload");
		Thread.sleep(4000);
		btnClick(pojo.multifileupload);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		if (pojo.fieldnamealert.isDisplayed()) {
			   logInfo("field name alert message is displayed");
			}
			else 
			{
				logInfo("field name alert message is not displayed");
			}
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check Multi file upload field should be created after selecting the Multi file upload field in the field type by adding data in the name field and saving it")
	public void user_will_check_multi_file_upload_field_should_be_created_after_selecting_the_multi_file_upload_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "multi file upload");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"multi file upload");
		Thread.sleep(4000);
		btnClick(pojo.multifileupload);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		
	}
	@Then("user will check Multi file upload field should not be created after selecting the Multi file upload field  in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_multi_file_upload_field_should_not_be_created_after_selecting_the_multi_file_upload_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(6000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "multi file upload");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"multi file upload");
		Thread.sleep(4000);
		btnClick(pojo.multifileupload);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
		
	}





	
	













}
