package com.orangeSystem.OrangeHrm.ObjectRepo;

import java.io.FileInputStream;
import java.util.Properties;

public class AdminObjectRepo {
    public FileInputStream fis = null;
    public Properties prop = null;

    public Properties getObjects(){

        try {
             fis = new FileInputStream("src//test//resource//pageObjects//adminObjects.properties");
            prop = new Properties();
            prop.load(fis);
        } catch (Exception e) {

            e.printStackTrace();
        }
        return prop;
    }

}
