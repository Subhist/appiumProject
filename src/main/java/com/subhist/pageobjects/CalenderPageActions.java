package com.subhist.pageobjects;

import com.subhist.config.AppiumBaseDriver;
import com.subhist.config.Helper;
import io.appium.java_client.AppiumDriver;

public class CalenderPageActions extends AppiumBaseDriver {

    CalanderPageLocators calanderPageLocators;

    public CalenderPageActions(AppiumDriver driver) {
        this.calanderPageLocators=new CalanderPageLocators(driver);
    }

    //select a date from calender
    public void selectDateToAddtoCalnder(){
        Helper.SingleTap(calanderPageLocators.getCalenderView());
        Helper.SingleTap(calanderPageLocators.getAddButton());
    }


}
