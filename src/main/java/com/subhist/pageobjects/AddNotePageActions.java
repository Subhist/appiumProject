package com.subhist.pageobjects;

import com.subhist.config.AppiumBaseDriver;
import com.subhist.config.BaseSetup;
import com.subhist.config.Helper;
import io.appium.java_client.AppiumDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static com.subhist.config.BaseSetup.softAssert;

public class AddNotePageActions extends AppiumBaseDriver {


    AddNotePageLocators addNotePageLocators;
    public AddNotePageActions(AppiumDriver driver) {
        this.addNotePageLocators=new AddNotePageLocators(driver);
    }

    //add a Text or calender based on the Parameter
    public void addText(String reminder){
        Helper.SingleTap(addNotePageLocators.getAddTextButton());
        addNotePageLocators.getAddEditText().sendKeys(Helper.generateRandomString());
        Helper.SingleTap(addNotePageLocators.getNoteMenuButton());
        if(reminder.contains("reminder")) {
            Helper.SingleTap(addNotePageLocators.getReminderButton());
        }
        else{
            Helper.SingleTap(addNotePageLocators.getSaveCalenderButton());
        }
        softAssert.assertTrue(addNotePageLocators.getToastForSaveConfirmation().toString().equalsIgnoreCase("Saved"));
        Helper.waitForElementToBeVisible(addNotePageLocators.getDoneButton());
        Helper.SingleTap(addNotePageLocators.getDoneButton());
        Helper.waitForElementToBeVisible(addNotePageLocators.getNoteMenuButton());
        softAssert.assertTrue(addNotePageLocators.getNoteMenuButton().isDisplayed());
        Helper.androidBackButton();
        Helper.androidBackButton();


    }
}
