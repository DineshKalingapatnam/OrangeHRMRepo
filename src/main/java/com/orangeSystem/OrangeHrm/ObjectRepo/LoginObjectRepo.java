package com.orangeSystem.OrangeHrm.ObjectRepo;

import java.io.FileInputStream;
import java.util.Properties;

public class LoginObjectRepo {
    public FileInputStream fis = null;
    public Properties prop = null;

    public Properties getObjects(){

        try {
            FileInputStream fis = new FileInputStream("src//test//resource//pageObjects//loginObjects.properties");
            prop = new Properties();
            prop.load(fis);
        } catch (Exception e) {

            e.printStackTrace();
        }
        return prop;
    }
}
