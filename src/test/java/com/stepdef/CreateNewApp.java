package com.stepdef;

import java.awt.AWTException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.poi.ss.formula.functions.Count;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

import com.Base.BaseClass;
import com.pojo.Pojoclass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CreateNewApp extends BaseClass {
	
	public static Pojoclass pojo = new Pojoclass();
	public static Integer count = 0;

	@Then("user will Click the create new app button")
	public void user_will_click_the_create_new_app_button() {
		 pojo = new Pojoclass();
		btnClick(pojo.creatnew);
		
	}
	@Then("user will Enter the app name")
	public void user_will_enter_the_app_name() throws AWTException {
//		if(count == 0){
//			fill(pojo.untitledapp,CreateNewApp.getAlphaNumericString());
//		}else{
//			btnClick(pojo.untitledapp);
//			ctrlp();
//			a();
//			ctrlr();
//			backspace();		
//			
//
//			fill(pojo.untitledapp,"automation test"+count);
//		}
//	
//		List listOfApp=driver.findElements(By.xpath("//tbody[@class='ant-table-tbody']/tr/td[1]/a/div/div[2]/span[1]"));
//				for(int i=0;i<listOfApp.size();i++) {
//					String text="automation test";
//					if(listOfApp.getText().get(i).contains(text)) {
//						
//					}
//				}
		

		LocalDateTime now = LocalDateTime.now();
		String appname = "Automation test" + now;
		fill(pojo.untitledapp,appname);
		
	}
	
//	static String getAlphaNumericString()
//	 {
//	 int n=20;
//	  // choose a Character random from this String
//	  String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
//	         + "0123456789"
//	         + "abcdefghijklmnopqrstuvxyz";
//	 
//	  // create StringBuffer size of AlphaNumericString
//	  StringBuilder sb = new StringBuilder(n);
//	 
//	  for (int i = 0; i < n; i++) {
//	 
//	   // generate a random number between
//	   // 0 to AlphaNumericString variable length
//	   int index
//	    = (int)(AlphaNumericString.length()
//	      * Math.random());
//	 
//	   // add Character one by one in end of sb
//	   sb.append(AlphaNumericString
//	      .charAt(index));
//	  }
//	 
//	  return sb.toString();
//	 }
	
	
	private By ByXPath(String string) {
		return null;
	}
	@Then("user will Click create app button")
	public void user_will_click_create_app_button() throws InterruptedException, AWTException {
		btnClick(pojo.createappbtn);
		Thread.sleep(15000);
		try {
		if (pojo.appnameerrormsg.isDisplayed()) {
			count++;
			user_will_enter_the_app_name();
			user_will_click_create_app_button();
		}
		getTxt(pojo.appcount);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}


}
