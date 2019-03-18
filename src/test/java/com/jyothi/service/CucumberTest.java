package com.jyothi.service;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
//@CucumberOptions(features="src/test/resources/com/jyothi/service", glue ={"src/test/resources/com/jyothi/service"})
@CucumberOptions(
	    features = {"src/test/resources/DrawingApp.feature"},
	    glue = {"com.jyothi.service"}
	 	)

public class CucumberTest {}