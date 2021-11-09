package com.noturaun.utils;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/tokopedia",
        glue = {""}, plugin = {"json:target/cucumber-report/Tokopedia.json", "html:target/cluecumber/Tokopedia.html"})
public class TokopediaRunnerTest {
}
