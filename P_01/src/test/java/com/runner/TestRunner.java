package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features = "src\\test\\resources\\Features\\18_Checkvideo.feature",
glue = "com.stepdefinition", 
dryRun = false,
monochrome = true,
snippets = SnippetType.CAMELCASE )
public class TestRunner {
	

}

 

