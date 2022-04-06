package com.dayone;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src\\test\\resources\\Featurefiles\\facebookpage.feature",
glue="com.stepdef",monochrome=true,dryRun=false,tags= {"@TC01"},
strict=true,snippets=SnippetType.CAMELCASE,plugin= {"pretty","junit:target/Reports/data.xml",
"json:target/Reports/data.json","html:target/Reports"})

public class TestRunner {

}
