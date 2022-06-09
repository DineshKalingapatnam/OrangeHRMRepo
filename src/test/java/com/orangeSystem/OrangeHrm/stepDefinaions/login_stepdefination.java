package com.orangeSystem.OrangeHrm.stepDefinaions;

import com.orangeSystem.OrangeHrm.Configuration.BaseConfiguration;
import com.orangeSystem.OrangeHrm.ObjectRepo.LoginObjectRepo;
import com.orangeSystem.OrangeHrm.Utils.CommonUtlis;
import com.orangeSystem.OrangeHrm.Utils.ExcelReader;
import io.cucumber.java.en.Given;

public class login_stepdefination extends BaseConfiguration {
    LoginObjectRepo loginObjectRepo = new LoginObjectRepo();
    ExcelReader excelReader = new ExcelReader();

    @Given("user logins to orange hrm application")
    public void user_logins_to_orange_hrm_application() {
        invokeBrowser();
        CommonUtlis.insertText("xpath", loginObjectRepo.getObjects().getProperty("hrm_username_xpath"), excelReader.setSheetAndGetData("user_login","username",1));
        CommonUtlis.insertText("xpath", loginObjectRepo.getObjects().getProperty("hrm_password_xpath"), excelReader.setSheetAndGetData("user_login","password",1));
        CommonUtlis.clickButton("xpath", loginObjectRepo.getObjects().getProperty("hrm_submit_button_xpath"));

    }
}
