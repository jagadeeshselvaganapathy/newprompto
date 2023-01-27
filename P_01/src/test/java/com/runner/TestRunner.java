package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\19_CheckDragAndDrop.feature",glue = "com.stepdefinition", dryRun = false
,monochrome = true,
 snippets = SnippetType.CAMELCASE )
public class TestRunner {
	

}

 
//clkIcon
//ChkNewTab
//clktab
//clkpopups --helpbutton doubt
//ClkTextfield
//clkupload
