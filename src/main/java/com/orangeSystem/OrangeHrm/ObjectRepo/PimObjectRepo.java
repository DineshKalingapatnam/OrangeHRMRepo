package com.orangeSystem.OrangeHrm.ObjectRepo;

import java.io.FileInputStream;
import java.util.Properties;

public class PimObjectRepo {
    FileInputStream fis = null;
    Properties prop = null;
    public Properties getObjects() {
        try {
            fis = new FileInputStream("src//test//resource/pageObjects//pimObjects.properties");
            prop = new Properties();
            prop.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop;
    }
}