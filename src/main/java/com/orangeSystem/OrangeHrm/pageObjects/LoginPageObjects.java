package com.orangeSystem.OrangeHrm.pageObjects;

import com.orangeSystem.OrangeHrm.Configuration.BaseConfiguration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects extends BaseConfiguration {

    public LoginPageObjects() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@type='text']")
    public WebElement hrm_username_xpath;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement hrm_password_xpath;

    @FindBy(xpath = "//input[@type='Submit']")
    public WebElement hrm_submit_button_xpath;
}
