package com.Runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.Base.JVMReports;
//import com.stepdef.Hooks;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature",
glue="com.stepdef",
dryRun=false, 
tags="@steplevelrules",
monochrome = true,
publish = true,
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})



public class RunnerClass {

	




}

