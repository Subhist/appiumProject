package com.subhist.config;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.apache.commons.lang3.RandomStringUtils;

import java.sql.Timestamp;


public class Helper extends AppiumBaseDriver{

    public static void SingleTap(MobileElement element) {
        TouchAction touchAction=new TouchAction((PerformsTouchActions) DriverConfig.getInstance().getDriver());
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(element))).perform();
    }

    public static String generateRandomString(){
        String generatedString = RandomStringUtils.random(10, true, false);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        return generatedString+ " "+timestamp;
    }
}
