package com.orangeSystem.OrangeHrm.stepDefinaions;

import com.orangeSystem.OrangeHrm.Configuration.BaseConfiguration;
import com.orangeSystem.OrangeHrm.Utils.CommonUtlis;
import com.orangeSystem.OrangeHrm.Utils.ExcelReader;
import com.orangeSystem.OrangeHrm.pageObjects.LoginPageObjects;
import io.cucumber.java.en.Given;

public class login_stepdefination extends BaseConfiguration {
    LoginPageObjects loginPageObjects = new LoginPageObjects();
    ExcelReader excelReader = new ExcelReader();

    @Given("user logins to orange hrm application")
    public void user_logins_to_orange_hrm_application() {

        CommonUtlis.enterTextInTextBox(loginPageObjects.hrm_username_xpath, "admin");
        CommonUtlis.enterTextInTextBox(loginPageObjects.hrm_password_xpath, "admin");
      CommonUtlis.clickOnButton(loginPageObjects.hrm_submit_button_xpath);
    }
}
