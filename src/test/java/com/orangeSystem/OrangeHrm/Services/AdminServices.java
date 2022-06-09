package com.orangeSystem.OrangeHrm.Services;

import com.orangeSystem.OrangeHrm.Configuration.BaseConfiguration;
import com.orangeSystem.OrangeHrm.ObjectRepo.AdminObjectRepo;
import com.orangeSystem.OrangeHrm.ObjectRepo.LoginObjectRepo;
import com.orangeSystem.OrangeHrm.Utils.CommonUtlis;
import com.orangeSystem.OrangeHrm.Utils.ExcelReader;

public class AdminServices extends BaseConfiguration {

    LoginObjectRepo loginObjectRepo = new LoginObjectRepo();
    AdminObjectRepo adminObjectRepo = new AdminObjectRepo();
    ExcelReader excelReader = new ExcelReader();

    public void openOrangeHrmApp() {
        invokeBrowser();
    }

    public void loginToOrangeHrmApp() {
        CommonUtlis.insertText("xpath", loginObjectRepo.getObjects().getProperty("hrm_username_xpath"), excelReader.setSheetAndGetData("user_login","username",1));
        CommonUtlis.insertText("xpath", loginObjectRepo.getObjects().getProperty("hrm_password_xpath"), excelReader.setSheetAndGetData("user_login","password",1));
        CommonUtlis.clickButton("xpath", loginObjectRepo.getObjects().getProperty("hrm_submit_button_xpath"));
    }

    public void navigateToAdminAndSelectCompanyInfo() {
        CommonUtlis.moveToElement("class", adminObjectRepo.getObjects().getProperty("admin_menu_class"));
        CommonUtlis.moveToElement("xpath", adminObjectRepo.getObjects().getProperty("company_info_xpath"));

    }

    public void navigatedToGeneralAndFillTheCompanyInfo() {

        CommonUtlis.clickButton("xpath", adminObjectRepo.getObjects().getProperty("general_xpath"));
        CommonUtlis.switchToFrame("id", adminObjectRepo.getObjects().getProperty("swiich_to_frame_id"));
        CommonUtlis.clickButton("id", adminObjectRepo.getObjects().getProperty("edit_button_id"));
        CommonUtlis.clearText("id","company_name_id");
        CommonUtlis.insertText("id", adminObjectRepo.getObjects().getProperty("company_name_id"), "Anil.co");
        CommonUtlis.clearText("id","tax_id");
        CommonUtlis.insertText("id", adminObjectRepo.getObjects().getProperty("tax_id"), "456");
        CommonUtlis.clearText("id","phone_n0_id");
        CommonUtlis.insertText("id", adminObjectRepo.getObjects().getProperty("phone_n0_id"), "787665434");
        CommonUtlis.selectFromDropDown("id", adminObjectRepo.getObjects().getProperty("general_company_info_country_id"),"text","India");
        CommonUtlis.insertText("id",adminObjectRepo.getObjects().getProperty("address_id"),"Addagutta marredpally sec-bad");
        CommonUtlis.insertText("id", adminObjectRepo.getObjects().getProperty("city_id"), "Hyd");
        CommonUtlis.insertText("id", adminObjectRepo.getObjects().getProperty("zipcode_id"), "007");
        CommonUtlis.insertText("id", adminObjectRepo.getObjects().getProperty("comment_id"), "Hello");
        CommonUtlis.insertText("id", adminObjectRepo.getObjects().getProperty("naics_id"), "999880");
        CommonUtlis.insertText("id", adminObjectRepo.getObjects().getProperty("fax_id"), "7766");
        CommonUtlis.insertText("id", adminObjectRepo.getObjects().getProperty("address1_id"), "Marrredpally");
        CommonUtlis.insertText("id", adminObjectRepo.getObjects().getProperty("state_id"), "Telangana");
        CommonUtlis.clickButton("id", adminObjectRepo.getObjects().getProperty("save_id"));
        CommonUtlis.switchToDefaultContent();




    }
}
