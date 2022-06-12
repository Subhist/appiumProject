package com.subhist.config;

import com.beust.jcommander.Parameters;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;

public class BaseSetup extends AppiumBaseDriver{

    private String deviceName;
    private String platformVersion;

    private String yourlaptopusername;
    private String apppackage;

    @BeforeMethod(alwaysRun = true)

    public void setUp() throws Exception {

        FileInputStream fileInputStream=new FileInputStream("src/main/resources/deviceDetails.properties");


        Properties properties=new Properties();
        properties.load(fileInputStream);
        this.deviceName=properties.getProperty("devicename");
        System.out.println(this.deviceName);
        this.platformVersion=properties.getProperty("osversion");
        this.apppackage=properties.getProperty("apppackage");






        DesiredCapabilities capabilities=new DesiredCapabilities();

        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("deviceName", this.deviceName);
        capabilities.setCapability("udid", this.deviceName);
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", this.platformVersion);
        capabilities.setCapability("appWaitForLaunch", "false");
        capabilities.setCapability("adbExecTimeout", 50000);
        capabilities.setCapability("systemPort", "8200");
        capabilities.setCapability("appPackage", this.apppackage);
        capabilities.setCapability("autoGrantPermissions", "true");
        capabilities.setCapability("autoAcceptAlerts", "true");
        capabilities.setCapability("--session-override",true);
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("fullReset", false);
        capabilities.setCapability("appActivity", "co.bytemark.splash.SplashScreenActivity");
        //capabilities.setCapability("app", appPath);
        driver = DriverConfig.getInstance().setDriver(new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities));

    }
}
