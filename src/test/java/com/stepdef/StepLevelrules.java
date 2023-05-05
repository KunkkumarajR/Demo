package com.stepdef;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;
import com.pojo.Pojoclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepLevelrules extends BaseClass {
	
	public static Pojoclass pojo = new Pojoclass();
	
	@Then("user should able to click on the step and select the Configure Step Properties option from the component toolbar")
	public void user_should_able_to_click_on_the_step_and_select_the_configure_step_properties_option_from_the_component_toolbar() throws AWTException, InterruptedException {
		F();
		btnClick(pojo.selectallinfield);
		draganddrop_javascript(pojo.pdflink, pojo.addfield);		
		Thread.sleep(2000);
		fill(pojo.fieldname1, "pdf");
		btnClick(pojo.savefield1);
	
		F();
		btnClick(pojo.selectallinfield);
		draganddrop_javascript(pojo.email, pojo.addfield);		
		Thread.sleep(2000);
		fill(pojo.fieldname1, "email");
		btnClick(pojo.savefield1);

		btnClick(pojo.selectstepinswim1);
		btnClick(pojo.selectconfigurestepproperties);
		
		
	}
	@Then("after clicking on the configure step properties option step configuration screen should appear")
	public void after_clicking_on_the_configure_step_properties_option_step_configuration_screen_should_appear() {
		if (pojo.stepconfiguration.isDisplayed()) {
			   logInfo("step congiguration screen is appear");
			}
			else 
			{
				logInfo("step congiguration screen is not appear");
			}
	}
	@Then("five rules should appear under the rules section of the configuration step screen")
	public void five_rules_should_appear_under_the_rules_section_of_the_configuration_step_screen() throws InterruptedException {
		//implicit(10);
		Thread.sleep(3000);
		jsTop(pojo.scrollforrules1);
		btnClick(pojo.clickrules1);
		
	}
	@Then("when user  click on the conditional access rule then add rule button should appears")
	public void when_user_click_on_the_conditional_access_rule_then_add_rule_button_should_appears() {
		btnClick(pojo.conditionalaccessrules);
		if (pojo.conditionaccessrulebtn.isDisplayed()) {
			   logInfo("condition access rule button is appear");
			}
			else 
			{
				logInfo("condition access rule button is not appear");
			}
		btnClick(pojo.conditionaccessrulebtn);
	}
	@Then("after click on add rule button upstream rule of conditional access rule should visible to user")
	public void after_click_on_add_rule_button_upstream_rule_of_conditional_access_rule_should_visible_to_user() throws InterruptedException {
		if (pojo.conditionalaccessrulescreen1.isDisplayed()) {
			   logInfo("condition access rule is visible");
			}
			else 
			{
				logInfo("condition access rule is not visible");
			}
		
	}
	@Then("icons should appear on the step level after click on the add rule button")
	public void icons_should_appear_on_the_step_level_after_click_on_the_add_rule_button() throws InterruptedException {
		Thread.sleep(3000);
		if (pojo.conditionaccessruleicon.isDisplayed()) {
			   logInfo("rule icon is appear in step");
			}
			else 
			{
				logInfo("rule icon is not appear in step");
			}
		
	}
	@Then("rule should created when user fills the mandatory fields of conditional access rule in upstream rule and clicks on the save button")
	public void rule_should_created_when_user_fills_the_mandatory_fields_of_conditional_access_rule_in_upstream_rule_and_clicks_on_the_save_button() throws InterruptedException {
		btnClick(pojo.comparefieldforconditionaccessrule);
		Thread.sleep(3000);
		btnClick(pojo.selectfieldforconditionaccessrule);
		
		btnClick(pojo.conditionaccessrulesavebtn);
		Thread.sleep(3000);
		btnClick(pojo.closeconditionaccessrule);
	
	}
	@Then("when user add a rule on the step level icon should appear on the step level")
	public void when_user_add_a_rule_on_the_step_level_icon_should_appear_on_the_step_level() {
		if (pojo.conditionaccessruleicon.isDisplayed()) {
			   logInfo("rule icon is appear in step level");
			}
			else 
			{
				logInfo("rule icon is not appear in step level");
			}
	}
	@Then("pdf rule should be visible to user under the rules section")
	public void pdf_rule_should_be_visible_to_user_under_the_rules_section(String json) throws InterruptedException, AWTException {
		btnClick(pojo.selectstepinswim1);
		Thread.sleep(3000);
		btnClick(pojo.selectconfigurestepproperties);
		Thread.sleep(3000);
		jsTop(pojo.scrollforrules1);
		Thread.sleep(3000);
		btnClick(pojo.clickotherconfiguration);
		Thread.sleep(3000);
		jsTop(pojo.scrollpdfconfig);
		Thread.sleep(20000);
		
		clearXpath(pojo.jsonsodefill);
		fill(pojo.jsonsodefill, json);
	
		Thread.sleep(2000);
		btnClick(pojo.savepdfjson);
		btnClick(pojo.selectstepinswim1);
		btnClick(pojo.selectconfigurestepproperties);
		Thread.sleep(3000);
		jsTop(pojo.scrollforrules1);
		btnClick(pojo.clickrules1);
		if (pojo.pdfrule.isDisplayed()) {
			   logInfo("pdf rule is visible");
			}
			else 
			{
				logInfo("pdf rule is not visible");
			}
	}
	@Then("user should able to click on the pdf rule configure in the step configuration screen")
	public void user_should_able_to_click_on_the_pdf_rule_configure_in_the_step_configuration_screen() throws InterruptedException {
		if (pojo.clickpdfrule.isDisplayed()) {
			   logInfo("pdf rule configure is clickable");
			}
			else 
			{
				logInfo("pdf rule configure is not clickable");
			}
		Thread.sleep(2000);
		btnClick(pojo.clickpdfrule);
	}
	@Then("add rule button should appears after click on the pdf rule configure")
	public void add_rule_button_should_appears_after_click_on_the_pdf_rule_configure() {
		if (pojo.clickaddruleforpdfrule.isDisplayed()) {
			   logInfo("add rule button for pdf rule configure is appear");
			}
			else 
			{
				logInfo("add rule button for pdf rule configure is not appear");
			}
	}
	@Then("upstream rule of pdf rule should appears after click on the add step button")
	public void upstream_rule_of_pdf_rule_should_appears_after_click_on_the_add_step_button() {
		btnClick(pojo.clickaddruleforpdfrule);
		if (pojo.pdfruleconfigurationscreen.isDisplayed()) {
			   logInfo("pdf upstream rule is appear");
			}
			else 
			{
				logInfo("pdf upstream rule is not appear");
			}
	}
	@Then("user should able to add  pdf name  in the pdf config\\(json editor) under the other configuration section to fill the step for pdf configuration field in the pdf rule")
	public void user_should_able_to_add_pdf_name_in_the_pdf_config_json_editor_under_the_other_configuration_section_to_fill_the_step_for_pdf_configuration_field_in_the_pdf_rule() {
		
	}
	@Then("pdf rule should be created after fill the mandatory field and click on the save button")
	public void pdf_rule_should_be_created_after_fill_the_mandatory_field_and_click_on_the_save_button() {
		
	}
	@Then("when user add a pdf rule on the step level icon should appear on the step level")
	public void when_user_add_a_pdf_rule_on_the_step_level_icon_should_appear_on_the_step_level() {
		
	}
	@Then("visibility rule should be visible to user under the rules section")
	public void visibility_rule_should_be_visible_to_user_under_the_rules_section() throws InterruptedException {
		btnClick(pojo.selectstepinswim1);
		Thread.sleep(3000);
		btnClick(pojo.selectconfigurestepproperties);
		Thread.sleep(3000);
		jsTop(pojo.scrollforrules1);
		btnClick(pojo.clickrules1);
		//implicit(10);
		//btnClick(pojo.closeconditionaccessrule);
//		Thread.sleep(3000);
//		btnClick(pojo.importjson1);
		
	}
	@Then("user should able to click on the visibility rule configure in the step configuration screen")
	public void user_should_able_to_click_on_the_visibility_rule_configure_in_the_step_configuration_screen() throws InterruptedException {
		Thread.sleep(3000);
		jsTop(pojo.visibilityrulescroll);
		Thread.sleep(3000);
		btnClick(pojo.visibilityrulebtn1);
	}
	@Then("add rule button should appear after clicking on the visibility rule configure")
	public void add_rule_button_should_appear_after_clicking_on_the_visibility_rule_configure() {
		btnClick(pojo.visiibilityruleaddrulebtn1);
	}
	@Then("after clicking on the add visibility rule then upstream rule should  appears")
	public void after_clicking_on_the_add_visibility_rule_then_upstream_rule_should_appears() throws InterruptedException {
		Thread.sleep(3000);
		btnClick(pojo.comparefieldforvisibilityrule);
		Thread.sleep(3000);
		btnClick(pojo.selectfieldforvisivillityrule);
	}
	@Then("visibility rule should be created after fill the mandatory field and clicking on the save button")
	public void visibility_rule_should_be_created_after_fill_the_mandatory_field_and_clicking_on_the_save_button() throws InterruptedException {
		Thread.sleep(3000);
		btnClick(pojo.visibilityrulesavebtn);
		btnClick(pojo.closeconditionaccessrule);
	}
	@Then("rule icons should created on upstream and downstream rules after visibility rule is created")
	public void rule_icons_should_created_on_upstream_and_downstream_rules_after_visibility_rule_is_created() {
		if (pojo.visibilityruleicon.isDisplayed()) {
			   logInfo("rule icon is appear in step level");
			}
			else 
			{
				logInfo("rule icon is not appear in step level");
			}
	}
	@Then("Auto-submit Auto-revert  rule should be visible to user under the rules section")
	public void auto_submit_auto_revert_rule_should_be_visible_to_user_under_the_rules_section() throws InterruptedException {
		btnClick(pojo.selectstepinswim1);
		Thread.sleep(3000);
		btnClick(pojo.selectconfigurestepproperties);
		Thread.sleep(3000);
		jsTop(pojo.scrollforrules1);
		btnClick(pojo.clickrules1);
	}
	@Then("user should able to click on Auto-submit Auto-revert  rule configure in the step configuration screen")
	public void user_should_able_to_click_on_auto_submit_auto_revert_rule_configure_in_the_step_configuration_screen() throws InterruptedException {
		Thread.sleep(3000);
		jsTop(pojo.visibilityrulescroll);
		Thread.sleep(3000);
		btnClick(pojo.clickautosubmitautorevertrules);
		
	}
	@Then("add rule button should appear after clicking on Auto-submit\\/Auto-revert  rule configure")
	public void add_rule_button_should_appear_after_clicking_on_auto_submit_auto_revert_rule_configure() {
		btnClick(pojo.autosubmitruleaddbtn1);
	}
	@Then("After clicking on the add rule of the auto-submit upstream rule should appears")
	public void after_clicking_on_the_add_rule_of_the_auto_submit_upstream_rule_should_appears() throws InterruptedException {
		Thread.sleep(3000);
		btnClick(pojo.comparefieldforautosubmitrule1);
		Thread.sleep(3000);
		btnClick(pojo.selectfieldforautosubmitrule1);
		
	}
	@Then("Auto-submit Auto-revert  rule should be created after fill the mandatory field and clicking on the save button")
	public void auto_submit_auto_revert_rule_should_be_created_after_fill_the_mandatory_field_and_clicking_on_the_save_button() throws InterruptedException {
		Thread.sleep(3000);
		btnClick(pojo.conditionaccessrulesavebtn);
		Thread.sleep(3000);
		btnClick(pojo.closeconditionaccessrule);

	}
	@Then("After creating the auto-submit rule on the step-level icon should appears on the step level")
	public void after_creating_the_auto_submit_rule_on_the_step_level_icon_should_appears_on_the_step_level() {
		if (pojo.autosubmitruleicon.isDisplayed()) {
			   logInfo("rule icon is appear in step level");
			}
			else 
			{
				logInfo("rule icon is not appear in step level");
			}
	}
	@Then("Notifications Rules should be visible to user under the rules section")
	public void notifications_rules_should_be_visible_to_user_under_the_rules_section() throws InterruptedException {
		btnClick(pojo.selectstepinswim1);
		Thread.sleep(3000);
		btnClick(pojo.selectconfigurestepproperties);
		Thread.sleep(3000);
		jsTop(pojo.scrollforrules1);
		btnClick(pojo.clickrules1);

	}
	@Then("user should able to click on Notifications Rules configure in the step configuration screen")
	public void user_should_able_to_click_on_notifications_rules_configure_in_the_step_configuration_screen() throws InterruptedException {
		Thread.sleep(3000);
		jsTop(pojo.visibilityrulescroll);
		Thread.sleep(3000);
		btnClick(pojo.clicknotificationrule);
	}
	@Then("add rule button should appear after clicking on Notifications Rules configure")
	public void add_rule_button_should_appear_after_clicking_on_notifications_rules_configure() {
		btnClick(pojo.notificationruleaddbtn);
	}
	@Then("Notifications Rules should be created after fill the mandatory field and clicking on the save button")
	public void notifications_rules_should_be_created_after_fill_the_mandatory_field_and_clicking_on_the_save_button() throws InterruptedException {
		Thread.sleep(3000);
		jsTop(pojo.scrollfornotificationrule);
		Thread.sleep(3000);
		fill(pojo.fillnamefornotificationrule1, "automatiion");
		Thread.sleep(3000);
		btnClick(pojo.selectstepcompletedfornotificationrule);
		Thread.sleep(3000);
		btnClick(pojo.selectemailtemplatefornotificationrule);
		Thread.sleep(3000);
		btnClick(pojo.selectmailtemplate);
		Thread.sleep(3000);
		btnClick(pojo.clickemailfieldinnotificationrule);
		Thread.sleep(3000);
		btnClick(pojo.selectemailinemailfield);
		Thread.sleep(3000);
		btnClick(pojo.savenotificationrule1);
		
		
	
	}
	@Then("after adding the notification rule on the step-level rule icons should  appears on the step level")
	public void after_adding_the_notification_rule_on_the_step_level_rule_icons_should_appears_on_the_step_level() {
		if (pojo.visibilityruleicon.isDisplayed()) {
			   logInfo("rule icon is appear in step level");
			}
			else 
			{
				logInfo("rule icon is not appear in step level");
			}
	}









}
