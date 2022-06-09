package com.orangeSystem.OrangeHrm.TestScripts;

import com.orangeSystem.OrangeHrm.Services.AdminServices;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AdminTestScripts {
    AdminServices adminServices = new AdminServices();

    @BeforeTest
    public void init() throws InterruptedException {
        adminServices.openOrangeHrmApp();
        adminServices.loginToOrangeHrmApp();
    }

    @Test(description = "Update the company info in general section", priority = 0)
    public void login() {
//        adminServices.navigateToAdminAndSelectCompanyInfo();
//        adminServices.navigatedToGeneralAndFillTheCompanyInfo();
    }
}
