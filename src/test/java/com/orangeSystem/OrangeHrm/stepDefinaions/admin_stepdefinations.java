package com.orangeSystem.OrangeHrm.stepDefinaions;

import com.orangeSystem.OrangeHrm.ObjectRepo.AdminObjectRepo;
import com.orangeSystem.OrangeHrm.Utils.CommonUtlis;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class admin_stepdefinations {

    AdminObjectRepo adminObjectRepo = new AdminObjectRepo();


    @When("user navigates to company info from dashboard")
    public void user_navigates_to_company_info_from_dashboard() {
        CommonUtlis.moveToElement("class", adminObjectRepo.getObjects().getProperty("admin_menu_class"));
        CommonUtlis.moveToElement("xpath", adminObjectRepo.getObjects().getProperty("company_info_xpath"));

    }
    @And("user selects general")
    public void userSelectsGeneral() {
        CommonUtlis.clickButton("xpath", adminObjectRepo.getObjects().getProperty("general_xpath"));
    }
    @And("user edit the company info")
    public void userEditTheCompanyInfo() throws InterruptedException {
        Thread.sleep(5000);
        CommonUtlis.switchToFrame("id", adminObjectRepo.getObjects().getProperty("swiich_to_frame_id"));
        CommonUtlis.clickButton("id", adminObjectRepo.getObjects().getProperty("edit_button_id"));
        Thread.sleep(5000);
    }
    @When("user enters company name : {string}, tax id: {string},phone:{string},naics:{string},fax:{string}")
    public void user_enters_company_name_tax_id_phone_naics_fax(String company_name, String tax_id, String phone, String naics, String fax) throws InterruptedException {
        Thread.sleep(5000);
        CommonUtlis.clearText("xpath", adminObjectRepo.getObjects().getProperty("company_name_id"));
        CommonUtlis.insertText("xpath", adminObjectRepo.getObjects().getProperty("company_name_id"), company_name);
      CommonUtlis.clearText("xpath", adminObjectRepo.getObjects().getProperty("tax_id"));
        CommonUtlis.insertText("xpath", adminObjectRepo.getObjects().getProperty("tax_id"), tax_id);
        CommonUtlis.clearText("id", adminObjectRepo.getObjects().getProperty("phone_n0_id"));
        CommonUtlis.insertText("id", adminObjectRepo.getObjects().getProperty("phone_n0_id"), phone);
        CommonUtlis.clearText("id", adminObjectRepo.getObjects().getProperty("naics_id"));
        CommonUtlis.insertText("id", adminObjectRepo.getObjects().getProperty("naics_id"), naics);
        CommonUtlis.clearText("id", adminObjectRepo.getObjects().getProperty("fax_id"));
        CommonUtlis.insertText("id", adminObjectRepo.getObjects().getProperty("fax_id"), fax);
    }

    @And("user select the country: {string}")
    public void userSelectTheCountry(String country) {
        CommonUtlis.selectFromDropDown("id", adminObjectRepo.getObjects().getProperty("general_company_info_country_id"), "text", country);
    }

    @And("user enters addressone :{string}, city:{string}, zipcode:{string},addresstwo:{string},state:{string}")
    public void userEntersAddressoneCityZipcodeAddresstwoState(String addressone, String city, String zipcode, String addresstwo, String state) {
        CommonUtlis.insertText("id", adminObjectRepo.getObjects().getProperty("address_id"), addressone);
        CommonUtlis.insertText("id", adminObjectRepo.getObjects().getProperty("city_id"), city);
        CommonUtlis.insertText("id", adminObjectRepo.getObjects().getProperty("zipcode_id"), zipcode);
        CommonUtlis.insertText("id", adminObjectRepo.getObjects().getProperty("address1_id"), addresstwo);
        CommonUtlis.insertText("id", adminObjectRepo.getObjects().getProperty("state_id"), state);
    }

    @And("user save the company info")
    public void userSaveTheCompanyInfo() {
        CommonUtlis.clickButton("id", adminObjectRepo.getObjects().getProperty("save_id"));
        CommonUtlis.switchToDefaultContent();

    }
}
