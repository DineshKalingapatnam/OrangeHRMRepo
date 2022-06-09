package com.orangeSystem.OrangeHrm.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        plugin = {},
        features = {"src/test/resource/features"},
        glue = {"com.orangeSystem.OrangeHrm.stepDefinaions"},
        tags = "@admin_flow_test01",
        dryRun = false
)
@Test
public class OrangeHRMRunner extends AbstractTestNGCucumberTests {

}
