package com.subhist.pageobjects;

import com.subhist.config.AppiumBaseDriver;
import com.subhist.config.Helper;
import io.appium.java_client.AppiumDriver;

public class AddNotePageActions extends AppiumBaseDriver {


    AddNotePageLocators addNotePageLocators;
    public AddNotePageActions(AppiumDriver driver) {
        this.addNotePageLocators=new AddNotePageLocators(driver);
    }
    public void addText(){
        Helper.SingleTap(addNotePageLocators.getAddTextButton());
        addNotePageLocators.getAddEditText().sendKeys(Helper.generateRandomString());
        Helper.SingleTap(addNotePageLocators.getNoteMenuButton());


    }
}
