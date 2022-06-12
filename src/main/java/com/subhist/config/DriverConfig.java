package com.subhist.config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class DriverConfig {

    private static DriverConfig config = null;
    private AppiumDriver driver = null;
    private AndroidDriver driver1=null;

    /*Method to get instance of driver */
    public static DriverConfig getInstance(){

        synchronized (DriverConfig.class) {
            if (config == null)  {
                config = new DriverConfig();
            }
        }
        return  config;
    }

    /*Method to generate driver */
    public AndroidDriver getDriver() {
        return (AndroidDriver) driver;
    }

    /*Method to set driver */
    public AppiumDriver setDriver(AndroidDriver iosDriver) {
        return this.driver=iosDriver ;
    }
}