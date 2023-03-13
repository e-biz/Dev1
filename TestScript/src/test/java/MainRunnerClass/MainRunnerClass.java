package MainRunnerClass;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\admin\\Documents\\Java workspace\\TestScript\\src\\test\\resoures\\FeatureFile\\Test.feature",
glue= {"MainClass","AppHooks"},
monochrome = true,
plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
tags = "@tag1"
)
public class MainRunnerClass {

}
