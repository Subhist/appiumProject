package com.subhist.config;

import com.beust.jcommander.Parameters;
import com.subhist.pageobjects.AddNotePageActions;
import com.subhist.pageobjects.AddNotePageLocators;
import com.subhist.pageobjects.HomePageActions;
import com.subhist.pageobjects.HomePageLocators;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseSetup extends AppiumBaseDriver{

    private String deviceName;
    private String platformVersion;

    private String yourlaptopusername;
    private String apppackage;

    public  HomePageLocators homePageLocators;
    public HomePageActions homePageActions;


    public AddNotePageLocators addNotePageLocators;
    public AddNotePageActions addNotePageActions;


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
        capabilities.setCapability("appActivity", "com.socialnmobile.colornote.activity.Main");
        //capabilities.setCapability("app", appPath);
        driver = DriverConfig.getInstance().setDriver(new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities));
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        this.homePageLocators=new HomePageLocators(driver);
        this.homePageActions=new HomePageActions(driver);
        this.addNotePageLocators=new AddNotePageLocators(driver);
        this.addNotePageActions=new AddNotePageActions(driver);

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
}
