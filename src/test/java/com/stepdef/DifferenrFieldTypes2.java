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

public class DifferenrFieldTypes2 extends BaseClass {
	
	
	public static Pojoclass pojo = new Pojoclass();
	
	
	
	
	
	@Then("user will check user should able to select the visualization field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_visualization_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "visualization");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"visualization");
		Thread.sleep(4000);
		if (pojo.visualization.isDisplayed()) {
			   logInfo("visualization field is selectable in field dropdown");
			}
			else 
			{
				logInfo("visualization field is not selectable in field dropdown");
			}
		btnClick(pojo.visualization);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);

	}
	@Then("user will check validation message should appear when user selects the visualization field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_visualization_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "visualization");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"visualization");
		Thread.sleep(4000);
		btnClick(pojo.visualization);
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
	@Then("user will check visualization field should be created after selecting the visualization field in the field type by adding data in the name field and saving it")
	public void user_will_check_visualization_field_should_be_created_after_selecting_the_visualization_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "visualization");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"visualization");
		Thread.sleep(4000);
		btnClick(pojo.visualization);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		
	}
	@Then("user will check visualization field should not be created after selecting the visualization field  in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_visualization_field_should_not_be_created_after_selecting_the_visualization_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "visualization");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"visualization");
		Thread.sleep(4000);
		btnClick(pojo.visualization);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	}	
	@Then("user will check user should able to select the Horizontal space field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_horizontal_space_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "Horizontal space");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Horizontal space");
		Thread.sleep(4000);
		if (pojo.horizontalspace.isDisplayed()) {
			   logInfo("Horizontal space field is selectable in field dropdown");
			}
			else 
			{
				logInfo("Horizontal space field is not selectable in field dropdown");
			}
		btnClick(pojo.horizontalspace);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);


	}
	@Then("user will check validation message should appear when user selects the Horizontal space field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_horizontal_space_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "Horizontal space");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Horizontal space");
		Thread.sleep(4000);
		btnClick(pojo.horizontalspace);
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
	@Then("user will check Horizontal space  field should be created after selecting the Horizontal space field in the field type by adding data in the name field and saving it")
	public void user_will_check_horizontal_space_field_should_be_created_after_selecting_the_horizontal_space_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "Horizontal space");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Horizontal space");
		Thread.sleep(4000);
		btnClick(pojo.horizontalspace);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		
	}
	@Then("user will check Horizontal space  field should not be created after selecting the Horizontal space  field  in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_horizontal_space_field_should_not_be_created_after_selecting_the_horizontal_space_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "Horizontal space");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Horizontal space");
		Thread.sleep(4000);
		btnClick(pojo.horizontalspace);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check user should able to select the wizard section field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_wizard_section_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "wizard section");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"wizard section");
		Thread.sleep(4000);
		if (pojo.wizardsection.isDisplayed()) {
			   logInfo("wizard section field is selectable in field dropdown");
			}
			else 
			{
				logInfo("wizard section field is not selectable in field dropdown");
			}
		btnClick(pojo.wizardsection);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);

	}
	@Then("user will check validation message should appear when user selects the wizard section field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_wizard_section_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "wizard section");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"wizard section");
		Thread.sleep(4000);
		btnClick(pojo.wizardsection);
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
	@Then("user will check wizard section field should be created after selecting the wizard section field in the field type by adding data in the name field and saving it")
	public void user_will_check_wizard_section_field_should_be_created_after_selecting_the_wizard_section_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "wizard section");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"wizard section");
		Thread.sleep(4000);
		btnClick(pojo.wizardsection);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		
	}
	@Then("user will check wizard section  field should not be created after selecting the wizard section  field  in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_wizard_section_field_should_not_be_created_after_selecting_the_wizard_section_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "wizard section");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"wizard section");
		Thread.sleep(4000);
		btnClick(pojo.wizardsection);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check user should able to select the Word Document Download field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_word_document_download_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "Word Document Download");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Word Document Download");
		Thread.sleep(4000);
		if (pojo.worddocumentdownload.isDisplayed()) {
			   logInfo("Word Document Download field is selectable in field dropdown");
			}
			else 
			{
				logInfo("Word Document Download field is not selectable in field dropdown");
			}
		btnClick(pojo.worddocumentdownload);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);

	}
	@Then("user will check validation message should appear when user selects the Word Document Download field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_word_document_download_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "Word Document Download");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Word Document Download");
		Thread.sleep(4000);
		btnClick(pojo.worddocumentdownload);
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
	@Then("user will check Word Document Download field should be created after selecting the Word Document Download field in the field type by adding data in the name field and saving it")
	public void user_will_check_word_document_download_field_should_be_created_after_selecting_the_word_document_download_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "word document download");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Word Document Download");
		Thread.sleep(4000);
		btnClick(pojo.worddocumentdownload);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		
	}
	@Then("user will check word Document Download  field should not be created after selecting the Word Document Download  field  in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_word_document_download_field_should_not_be_created_after_selecting_the_word_document_download_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "Word Document Download");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"Word Document Download");
		Thread.sleep(4000);
		btnClick(pojo.worddocumentdownload);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
	
	}
	@Then("user will check user should able to select the PDF Viewer field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_pdf_viewer_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "pdf Viewer");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"PDF Viewer");
		Thread.sleep(4000);
		if (pojo.pdfviewer.isDisplayed()) {
			   logInfo("PDF Viewer field is selectable in field dropdown");
			}
			else 
			{
				logInfo("PDF Viewer field is not selectable in field dropdown");
			}
		btnClick(pojo.pdfviewer);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);

	}
	@Then("user will check validation message should appear when user selects the PDF Viewer field in the field type and make an empty name field and save it")
	public void user_will_check_validation_message_should_appear_when_user_selects_the_pdf_viewer_field_in_the_field_type_and_make_an_empty_name_field_and_save_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "PDF Viewer");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"PDF Viewer");
		Thread.sleep(4000);
		btnClick(pojo.pdfviewer);
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
	@Then("user will check PDF Viewer field should be created after selecting the PDF Viewer field in the field type by adding data in the name field and saving it")
	public void user_will_check_pdf_viewer_field_should_be_created_after_selecting_the_pdf_viewer_field_in_the_field_type_by_adding_data_in_the_name_field_and_saving_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "pdf Viewer");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"PDF Viewer");
		Thread.sleep(4000);
		btnClick(pojo.pdfviewer);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		
	}
	@Then("user will check PDF Viewer field should not be created after selecting the PDF Viewer  field  in the field type and add data in the name field and clicking on the cancel button")
	public void user_will_check_pdf_viewer_field_should_not_be_created_after_selecting_the_pdf_viewer_field_in_the_field_type_and_add_data_in_the_name_field_and_clicking_on_the_cancel_button() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "pdf Viewer");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"PDF Viewer");
		Thread.sleep(4000);
		btnClick(pojo.pdfviewer);
		Thread.sleep(2000);
		btnClick(pojo.cancelbtn);
		
	}
	@Then("user will check user should able to select the integration field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_integration_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "integration");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"integration");
		Thread.sleep(4000);
		if (pojo.integrationfields.isDisplayed()) {
			   logInfo("integration field is selectable in field dropdown");
			}
			else 
			{
				logInfo("integration field is not selectable in field dropdown");
			}
		btnClick(pojo.integrationfields);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);


	}
	@Then("user will check validation message should appear in the name field when the user selects the integration  field in the field type with an empty Name field  and saves it")
	public void user_will_check_validation_message_should_appear_in_the_name_field_when_the_user_selects_the_integration_field_in_the_field_type_with_an_empty_name_field_and_saves_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		//fill(pojo.fieldname1, "integration");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"integration");
		Thread.sleep(4000);
		btnClick(pojo.integrationfields);
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
	@Then("user will check validation message should appear in the Select Integration Field Type field when the user selects the integration  fields in the field type with an empty Select Integration Field Type field  and saves it")
	public void user_will_check_validation_message_should_appear_in_the_select_integration_field_type_field_when_the_user_selects_the_integration_fields_in_the_field_type_with_an_empty_select_integration_field_type_field_and_saves_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "integration");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"integration");
		Thread.sleep(4000);
		btnClick(pojo.integrationfields);
		Thread.sleep(2000);
		btnClick(pojo.integrationfieldtypeselection);
		Thread.sleep(2000);
		fill(pojo.integrationfieldtypeselection, "dnb duns search");
		Thread.sleep(2000);
		btnClick(pojo.dnbdunssearch1);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);
		
	}
	@Then("user will check integration fields should be  created after selecting the integration fields in the field type with add data in the name field and select the integration field  Type  and save it")
	public void user_will_check_integration_fields_should_be_created_after_selecting_the_integration_fields_in_the_field_type_with_add_data_in_the_name_field_and_select_the_integration_field_type_and_save_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "integration");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"integration");
		Thread.sleep(4000);
		btnClick(pojo.integrationfields);
		Thread.sleep(2000);
		btnClick(pojo.integrationfieldtypeselection);
		Thread.sleep(2000);
		fill(pojo.integrationfieldtypeselection, "dnb duns search");
		Thread.sleep(2000);
		btnClick(pojo.dnbdunssearch1);
		Thread.sleep(2000);
		btnClick(pojo.cancelfield1);
		
	}
	@Then("user will check user should able to select the dropdown\\(multi) field from the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_dropdown_multi_field_from_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "dropdown multi");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"dropdown multi");
		Thread.sleep(4000);
		if (pojo.dropdownmulti.isDisplayed()) {
			   logInfo("dropdown multi field is selectable in field dropdown");
			}
			else 
			{
				logInfo("dropdown multi field is not selectable in field dropdown");
			}
		btnClick(pojo.dropdownmulti);
		Thread.sleep(2000);
		//btnClick(pojo.cancelfield1);


	}
	@Then("user will check user should able to click on the Add options under the  option source section")
	public void user_will_check_user_should_able_to_click_on_the_add_options_under_the_option_source_section() {
		if (pojo.dropdownmultiaddoption1.isDisplayed()) {
			   logInfo("add option for dopdown multi is clickable");
			}
			else 
			{
				logInfo("add option for dopdown multi is not clickable");
			}
		
	}
	@Then("user will check dialogue box should appear when User clicks on the add option button")
	public void user_will_check_dialogue_box_should_appear_when_user_clicks_on_the_add_option_button() throws InterruptedException {
		btnClick(pojo.dropdownmultiaddoption1);
		Thread.sleep(2000);
		
		if (pojo.dropdownnmultiaddoptionpopup1.isDisplayed()) {
			   logInfo("add option dialogue box is appear");
			}
			else 
			{
				logInfo("add option dialogue box is not appear");
			}
		
	}
	@Then("user will check user should able to fill the add Option model  fields and click on the add button")
	public void user_will_check_user_should_able_to_fill_the_add_option_model_fields_and_click_on_the_add_button() throws InterruptedException {
		Thread.sleep(2000);
		fill(pojo.dropdownmultiaddoptionlable1, "Lable");
		fill(pojo.dropdownmultiaddoptionvalue1, "Value");
		Thread.sleep(2000);
		btnClick(pojo.addbuttonforaddoptionmultidropdown1);
		Thread.sleep(2000);
	}
	@Then("user will check user should able to add multiple Data on the options  field")
	public void user_will_check_user_should_able_to_add_multiple_data_on_the_options_field() throws InterruptedException {
		
		btnClick(pojo.dropdownmultiaddoption1);
		Thread.sleep(2000);
		fill(pojo.dropdownmultiaddoptionlable1, "Lable1");
		fill(pojo.dropdownmultiaddoptionvalue1, "Value1");
		Thread.sleep(2000);
		btnClick(pojo.addbuttonforaddoptionmultidropdown1);
		Thread.sleep(2000);
		btnClick(pojo.dropdownmultiaddoption1);
		Thread.sleep(2000);
		fill(pojo.dropdownmultiaddoptionlable1, "Lable2");
		fill(pojo.dropdownmultiaddoptionvalue1, "Value2");
		Thread.sleep(2000);
		btnClick(pojo.addbuttonforaddoptionmultidropdown1);
		
	}
	@Then("user will check user should able to create the dropdown multi field  by filling the name field and field type and clicking on the save button")
	public void user_will_check_user_should_able_to_create_the_dropdown_multi_field_by_filling_the_name_field_and_field_type_and_clicking_on_the_save_button() {
		btnClick(pojo.savefield1);
	}
	@Then("user will check user should able to select the table field in the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_table_field_in_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "table");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"table");
		Thread.sleep(4000);
		if (pojo.table.isDisplayed()) {
			   logInfo("table field is selectable in field dropdown");
			}
			else 
			{
				logInfo("table field is not selectable in field dropdown");
			}
		btnClick(pojo.table);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);

	}
	@Then("user will check validation message should appear in the name field when the user selects the table  field in the field type with an empty Name field  and saves it")
	public void user_will_check_validation_message_should_appear_in_the_name_field_when_the_user_selects_the_table_field_in_the_field_type_with_an_empty_name_field_and_saves_it() {
		if (pojo.alertforselecttabletype1.isDisplayed()) {
			   logInfo("select table type alert is appear");
			}
			else 
			{
				logInfo("select table type alert is not appear");
			}

	}
	@Then("user will check the table fields should be created after selecting the table fields in the field type with add data in the name field and table Type field and save it")
	public void user_will_check_the_table_fields_should_be_created_after_selecting_the_table_fields_in_the_field_type_with_add_data_in_the_name_field_and_table_type_field_and_save_it() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "table");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"table");
		Thread.sleep(4000);
		btnClick(pojo.table);
		Thread.sleep(2000);
		btnClick(pojo.selectchildworkflowtable);
		Thread.sleep(2000);
		btnClick(pojo.savefield1);

	}
	@Then("user will check user should able to select the Radio field from the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_radio_field_from_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "radio");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"radio");
		Thread.sleep(4000);
		if (pojo.radio.isDisplayed()) {
			   logInfo("radio field is selectable in field dropdown");
			}
			else 
			{
				logInfo("radio field is not selectable in field dropdown");
			}
		btnClick(pojo.radio);
		Thread.sleep(2000);
		//btnClick(pojo.cancelfield1);

	}
	@Then("user will check user should able to click on the add options under the  option source field")
	public void user_will_check_user_should_able_to_click_on_the_add_options_under_the_option_source_field() {
		if (pojo.radioaddoption.isDisplayed()) {
			   logInfo("add option for radio is clickable");
			}
			else 
			{
				logInfo("add option for radio is not clickable");
			}
		
	}
	@Then("user will Check dialogue box should appear when user clicks on the add option button")
	public void user_will_Check_dialogue_box_should_appear_when_user_clicks_on_the_add_option_button() throws InterruptedException {
		Thread.sleep(2000);
		btnClick(pojo.radioaddoption);
		if (pojo.radioaddoptionpopup.isDisplayed()) {
			   logInfo("add option for radio is clickable");
			}
			else 
			{
				logInfo("add option for radio is not clickable");
			}
		
	}
	@Then("user will Check User should able to fill the add option model  fields and click on the add button")
	public void user_will_Check_user_should_able_to_fill_the_add_option_model_fields_and_click_on_the_add_button() throws InterruptedException {
		Thread.sleep(2000);
		fill(pojo.radioaddoptionlable, "Lable");
		fill(pojo.radioaddoptionvalue, "Value");
		Thread.sleep(2000);
		btnClick(pojo.radioaddoptionaddbtn);
		Thread.sleep(2000);

	}
	@Then("user will Check user should able to add multiple data on the options  field")
	public void user_will_check_User_should_able_to_add_multiple_data_on_the_options_field() throws InterruptedException {
		btnClick(pojo.radioaddoption);
		Thread.sleep(2000);
		fill(pojo.radioaddoptionlable, "Lable1");
		fill(pojo.radioaddoptionvalue, "Value1");
		Thread.sleep(2000);
		btnClick(pojo.radioaddoptionaddbtn);
		Thread.sleep(2000);
		btnClick(pojo.radioaddoption);
		Thread.sleep(2000);
		fill(pojo.radioaddoptionlable, "Lable2");
		fill(pojo.radioaddoptionvalue, "Value2");
		Thread.sleep(2000);
		btnClick(pojo.radioaddoptionaddbtn);
		Thread.sleep(2000);
	}
	@Then("user will check user should able to create the Radio field  by filling the name field and field type and clicking on the save button")
	public void user_will_check_user_should_able_to_create_the_radio_field_by_filling_the_name_field_and_field_type_and_clicking_on_the_save_button() {
		btnClick(pojo.savefield1);
	}
	@Then("user will check user should able to select the groupd checkbox field from the field type on the field configuration screen")
	public void user_will_check_user_should_able_to_select_the_groupd_checkbox_field_from_the_field_type_on_the_field_configuration_screen() throws InterruptedException {
		Thread.sleep(4000);
		btnClick(pojo.clickaddfield);
		Thread.sleep(2000);
		fill(pojo.fieldname1, "group checkbox");
		Thread.sleep(6000);
		btnClick(pojo.clickfielddropdown);	
		Thread.sleep(6000);
		fill(pojo.clickfielddropdown,"group checkbox");
		Thread.sleep(4000);
		if (pojo.groupedcheckbox.isDisplayed()) {
			   logInfo("group checkbox field is selectable in field dropdown");
			}
			else 
			{
				logInfo("group checkbox field is not selectable in field dropdown");
			}
		btnClick(pojo.groupedcheckbox);
		Thread.sleep(2000);
		//btnClick(pojo.cancelfield1);

	}
	@Then("user will check user should able to click on the add group button under the option source field and Add Checkbox Group model open")
	public void user_will_check_user_should_able_to_click_on_the_add_group_button_under_the_option_source_field_and_add_checkbox_group_model_open() throws InterruptedException {
		if (pojo.groupcheckboxaddgroup.isDisplayed()) {
			   logInfo("Add group is clickable");
			}
			else 
			{
				logInfo("Add group is not clickable");
			}
		Thread.sleep(2000);
		btnClick(pojo.groupcheckboxaddgroup);
	}
	@Then("user will check user should able to fill the add checkbox group model fields and click on the add button")
	public void user_will_check_user_should_able_to_fill_the_add_checkbox_group_model_fields_and_click_on_the_add_button() throws InterruptedException {
		Thread.sleep(2000);
		fill(pojo.groupcheckboxaddgroup, "groupcheckbox");
		Thread.sleep(2000);
		btnClick(pojo.addgroupcheckboxbtn);
		Thread.sleep(2000);
		
	}
	@Then("user will check after adding the group name user should able to click on the add options button under the  option source field")
	public void user_will_check_after_adding_the_group_name_user_should_able_to_click_on_the_add_options_button_under_the_option_source_field() throws InterruptedException {
		Thread.sleep(2000);
		if (pojo.groupcheckboxaddoption1.isDisplayed()) {
			   logInfo("Add option in group checkbox is clickable");
			}
			else 
			{
				logInfo("Add option in group checkbox is not clickable");
			}
		Thread.sleep(2000);
		btnClick(pojo.groupcheckboxaddoption1);
		
		
	}
	@Then("user will check Dialogue box should appears when user clicks on the add option button")
	public void user_will_check_dialogue_box_should_appears_when_user_clicks_on_the_add_option_button() throws InterruptedException {
		Thread.sleep(2000);
		if (pojo.addoptioncheckboxforgroupcheckbox1.isDisplayed()) {
			   logInfo("Add option dialoguebox is appear");
			}
			else 
			{
				logInfo("Add option dialoguebox is not appear");
			}
		btnClick(pojo.addoptioncheckboxforgroupcheckbox1);
	}
	@Then("user will check User should able to fill the add option model  fields and click on the add button")
	public void user_will_check_User_should_able_to_fill_the_add_option_model_fields_and_click_on_the_add_button() throws InterruptedException {
		Thread.sleep(2000);
		fill(pojo.addgroupcheckboxlable1, "Lable");
		fill(pojo.addgroupcheckboxvalue1, "Value");
		Thread.sleep(2000);
		btnClick(pojo.addbtnforgroupcheckboxaddoption1);
		Thread.sleep(2000);

	}
	@Then("user will check User should able to add multiple data on the options  field")
	public void user_will_Check_User_should_able_to_add_multiple_data_on_the_options_field() throws InterruptedException {
		btnClick(pojo.addoptioncheckboxforgroupcheckbox1);
		Thread.sleep(2000);
		fill(pojo.addgroupcheckboxlable1, "Lable1");
		fill(pojo.addgroupcheckboxvalue1, "Value1");
		Thread.sleep(2000);
		btnClick(pojo.addbtnforgroupcheckboxaddoption1);
		Thread.sleep(2000);
		btnClick(pojo.addoptioncheckboxforgroupcheckbox1);
		Thread.sleep(2000);
		fill(pojo.addgroupcheckboxlable1, "Lable2");
		fill(pojo.addgroupcheckboxvalue1, "Value2");
		Thread.sleep(2000);
		btnClick(pojo.addbtnforgroupcheckboxaddoption1);
		Thread.sleep(2000);
		

	}
	@Then("user will check user should able to create the group checkbox field  by filling the name field and field type and click on the save button")
	public void user_will_check_user_should_able_to_create_the_group_checkbox_field_by_filling_the_name_field_and_field_type_and_click_on_the_save_button() {
		btnClick(pojo.savefield1);
	}

	






}
