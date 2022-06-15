package com.subhist.pageobjects;

import com.subhist.config.AppiumBaseDriver;
import com.subhist.config.BaseSetup;
import com.subhist.config.Helper;
import io.appium.java_client.AppiumDriver;

public class HomePageActions  extends AppiumBaseDriver {

    HomePageLocators homePageLocators;
    public HomePageActions(AppiumDriver driver) {
    this.homePageLocators=new HomePageLocators(driver);
    }


  //click on Add Img
    public void goToadd(){
        Helper.SingleTap(homePageLocators.getAddNoteImg());

    }



    //delete a Reminder
    public void deleteReminder(){
        Helper.tapAndHold(homePageLocators.getReminderTitle());
        Helper.SingleTap(homePageLocators.getDeleteReminderButton());
        Helper.SingleTap(homePageLocators.getConfirmDeleteButton());
        Helper.waitForElementToBeVisible(homePageLocators.getAddNoteImg());
        BaseSetup.softAssert.assertTrue(homePageLocators.getAddNoteImg().isDisplayed());
    }


    //search for a notes
    public void searchTheNotes(){
       String searchText= homePageLocators.getReminderTitle().getText();
        Helper.SingleTap(homePageLocators.getSearchButtonToSearchNotes());
       homePageLocators.getTypeTheItemToSearch().sendKeys(searchText);
       BaseSetup.softAssert.assertTrue(homePageLocators.getReminderTitle().isDisplayed());


    }

    //go to calender
    public void goToCalender(){
        Helper.SingleTap(homePageLocators.getCalenderButton());
    }


    //add a reminder or calender using + button
    public void goToAddUsingPlusButton(){
        Helper.SingleTap(homePageLocators.getPlusButtonToAddNotes());
    }


    //view and Backup Options
    public void goToViewAndBackUpOptions(){
        Helper.SingleTap(homePageLocators.getViewTypeAndBackupOption());
    }

    //select View
    public void goToViewOptions(){
        Helper.SingleTap(homePageLocators.getSelectViewOption());
    }

    //select a grid view
    public void selectGridView(){
        Helper.SingleTap(homePageLocators.getSelectGridView());
        BaseSetup.softAssert.assertTrue(homePageLocators.getGridviewVerification().isDisplayed());
    }
}
