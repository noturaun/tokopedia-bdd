package com.noturaun.utils;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/Google.feature",
glue = {""}, plugin = {"json:target/cucumber-report/Google.json", "html:target/cluecumber/Google.html"})
public class Runner {}
