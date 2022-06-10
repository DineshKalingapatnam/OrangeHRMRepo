package com.orangeSystem.OrangeHrm.runners;

import com.cucumber.listener.ExtentProperties;
import com.orangeSystem.OrangeHrm.Configuration.BaseConfiguration;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@CucumberOptions(
        plugin = {},
        features = {"src/test/resource/features"},
        glue = {"com.orangeSystem.OrangeHrm.stepDefinaions"},
        tags = "@admin_flow_test01",
        dryRun = false
)
@Test
public class OrangeHRMRunner extends AbstractTestNGCucumberTests {


    @BeforeTest
    void openHrmApplication(){
        BaseConfiguration.invokeBrowser();
    }
}
