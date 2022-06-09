package com.orangeSystem.OrangeHrm.Utils;

import com.orangeSystem.OrangeHrm.Configuration.BaseConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonUtlis extends BaseConfiguration {

    public static void clickButton(String identifiedBy, String locator) {

        if (identifiedBy.equalsIgnoreCase("id")) {
            driver.findElement(By.id(locator)).click();
        } else if (identifiedBy.equalsIgnoreCase("css")) {
            driver.findElement(By.cssSelector(locator)).click();
        } else if (identifiedBy.equalsIgnoreCase("name")) {
            driver.findElement(By.className(locator)).click();
        } else if (identifiedBy.equalsIgnoreCase("xpath")) {
            driver.findElement(By.xpath(locator)).click();
        } else if (identifiedBy.equalsIgnoreCase("link")) {
            driver.findElement(By.linkText(locator)).click();
        }
    }

    public static void insertText(String identifiedBy, String locator, String value) {

        if (identifiedBy.equalsIgnoreCase("id")) {
            driver.findElement(By.id(locator)).sendKeys(value);
        } else if (identifiedBy.equalsIgnoreCase("css")) {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        } else if (identifiedBy.equalsIgnoreCase("name")) {
            driver.findElement(By.className(locator)).sendKeys(value);
        } else if (identifiedBy.equalsIgnoreCase("xpath")) {
            driver.findElement(By.xpath(locator)).sendKeys(value);
        }
    }

    public static void moveToElement(String identifiedBy, String locator) {
        if (identifiedBy.equalsIgnoreCase("id")) {
            WebElement element = driver.findElement(By.id(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        } else if (identifiedBy.equalsIgnoreCase("class")) {
            WebElement element = driver.findElement(By.className(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        } else if (identifiedBy.equalsIgnoreCase("xpath")) {
            WebElement element = driver.findElement(By.xpath(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        } else if (identifiedBy.equalsIgnoreCase("css")) {
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        } else if (identifiedBy.equalsIgnoreCase("link")) {
            WebElement element = driver.findElement(By.linkText(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        }
    }


    public static void clearText(String identifiedBy, String locator) {
        if (identifiedBy.equalsIgnoreCase("id")) {
            driver.findElement(By.id(locator)).clear();
        } else if (identifiedBy.equalsIgnoreCase("xpath")) {
            driver.findElement(By.xpath(locator)).clear();

        } else if (identifiedBy.equalsIgnoreCase("css")) {
            driver.findElement(By.cssSelector(locator)).clear();

        } else if (identifiedBy.equalsIgnoreCase("name")) {
            driver.findElement(By.name(locator)).clear();

        } else if (identifiedBy.equalsIgnoreCase("link")) {
            driver.findElement(By.linkText(locator)).clear();

        }

    }

    public static void switchToFrame(String identifiedBy, String value) {
        if (identifiedBy.equalsIgnoreCase("name")) {
            driver.switchTo().frame(value);
        } else if (identifiedBy.equalsIgnoreCase("id")) {
            driver.switchTo().frame(value);
        } else if (identifiedBy.equalsIgnoreCase("index")) {
            driver.switchTo().frame(String.valueOf(value));
        }


    }

    public static void selectFromDropDown(String identifiedBy, String locator, String type, String value) {
        Select select = null;

        if (identifiedBy.equalsIgnoreCase("id")) {
            select = new Select(driver.findElement(By.id(locator)));
        } else if (identifiedBy.equalsIgnoreCase("xpath")) {
            select = new Select(driver.findElement(By.xpath(locator)));
        } else if (identifiedBy.equalsIgnoreCase("css")) {
            select = new Select(driver.findElement(By.cssSelector(locator)));
        } else if (identifiedBy.equalsIgnoreCase("name")) {
            select = new Select(driver.findElement(By.name(locator)));
        } else if (identifiedBy.equalsIgnoreCase("class")) {
            select = new Select(driver.findElement(By.className(locator)));
        } else if (identifiedBy.equalsIgnoreCase("link")) {
            select = new Select(driver.findElement(By.linkText(locator)));
        }
        if (type.equalsIgnoreCase("text")) {
            select.selectByVisibleText(value);
        } else if (type.equalsIgnoreCase("index")) {
            select.selectByIndex(Integer.parseInt(value));
        } else if (type.equalsIgnoreCase("value")) {
            select.selectByValue(value);
        }
    }
    public static void switchToDefaultContent(){
        driver.switchTo().defaultContent();

    }


}


