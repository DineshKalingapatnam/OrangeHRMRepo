package com.orangeSystem.OrangeHrm.pageObjects;

import com.orangeSystem.OrangeHrm.Configuration.BaseConfiguration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPageObjects extends BaseConfiguration {

    public AdminPageObjects() {
        PageFactory.initElements(driver, this);
    }

   /* admin_menu_class = drop
            company_info_xpath = //span[text()='Company Info']
            general_xpath = //span[text()='General']
                    swiich_to_frame_id = rightMenu
    edit_button_id = editBtn
            company_name_id = //input[@id="txtCompanyName"]
            tax_id = //input[@id="txtTaxID"]
                    phone_n0_id = txtPhone
    general_company_info_country_id = cmbCountry
            address_id = txtStreet1
    city_id = cmbCity
            zipcode_id = txtZIP
    comment_id = txtComments
            naics_id = txtNAICS
    fax_id = txtFax
            address1_id = txtStreet2
    state_id = txtState
            save_id = editBtn*/


    @FindBy(xpath = "//input[@type='text']")
    public WebElement hrm_username_xpath;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement hrm_password_xpath;

    @FindBy(xpath = "//input[@type='Submit']")
    public WebElement hrm_submit_button_xpath;
}
