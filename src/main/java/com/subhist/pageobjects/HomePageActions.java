package com.subhist.pageobjects;

import com.subhist.config.AppiumBaseDriver;
import com.subhist.config.Helper;
import io.appium.java_client.AppiumDriver;

public class HomePageActions  extends AppiumBaseDriver {

    HomePageLocators homePageLocators;
    public HomePageActions(AppiumDriver driver) {
    this.homePageLocators=new HomePageLocators(driver);
    }

    public void addText(){
        Helper.SingleTap(homePageLocators.getAddNoteImg());

    }

    public void skipTutorial(){
        Helper.SingleTap(homePageLocators.getSkipTutorial());
    }
}
