package com.stepdef;

import java.io.IOException;
import java.util.List;

import com.Base.BaseClass;
import com.pojo.Pojoclass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StudioClass extends BaseClass {
	public static Pojoclass pojo = new Pojoclass();
	
	

@Given("user login into studio appliction")
public void userLoginIntoStudioAppliction() throws IOException, InterruptedException {
	launchChrome();
	
	   winMax();
	   String Urlload = proptxt("Urlload");
	   loadUrl(Urlload);
	 	 pojo = new Pojoclass();
		 implicit(10);
		 btnClick(pojo.login);
		 Thread.sleep(2000);
		 btnClick(pojo.loginchangeclick);

}

@And("^user will enter the user name (.*)")
public void userWillEnterTheUserName(String username) {
	logInfo("Enter username " + username);
	fill(pojo.username,username); 
}

@And("^user will enter the password (.*)")
public void userWillEnterThePassword(String password) {
   fill(pojo.password, password);
}

@Then("user will clicks the login button")
public void userWillClicksTheLoginButton() throws IOException, InterruptedException {
  btnClick(pojo.loginclick);
  
}

@Then("User will click on the studio icon")
public void user_will_click_on_the_studio_icon() throws InterruptedException {
	Thread.sleep(10000);
	btnClick(pojo.studio);
	switchWindows();
   
}
	

}
