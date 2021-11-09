package com.noturaun.utils;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/google",
glue = {""}, plugin = {
        "pretty",
        "json:target/cucumber-report/Google.json",
        "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"
})
public class GoogleRunnerTest {}
