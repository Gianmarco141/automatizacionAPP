package com.nttdata.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = "com.nttdata.stepsdefinitions",
        tags ="@Login1"
)
public class CucumberTestSuite {
}
