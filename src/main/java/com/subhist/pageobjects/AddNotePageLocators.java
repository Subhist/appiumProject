package com.subhist.pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AddNotePageLocators {

    public AddNotePageLocators(AppiumDriver driver) {
        // TODO Auto-generated constructor stub
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Text']")
    private MobileElement addTextButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Checklist']")
    private MobileElement addCheckList;

    @AndroidFindBy(id = "edit_note")
    private MobileElement addEditText;

    @AndroidFindBy(id = "menu_btn")
    private MobileElement noteMenuButton;

    public MobileElement getAddTextButton() {
        return addTextButton;
    }

    public void setAddTextButton(MobileElement addTextButton) {
        this.addTextButton = addTextButton;
    }

    public MobileElement getAddEditText() {
        return addEditText;
    }

    public void setAddEditText(MobileElement addEditText) {
        this.addEditText = addEditText;
    }

    public MobileElement getNoteMenuButton() {
        return noteMenuButton;
    }

    public void setNoteMenuButton(MobileElement noteMenuButton) {
        this.noteMenuButton = noteMenuButton;
    }



    public MobileElement getAddCheckList() {
        return addCheckList;
    }

    public void setAddCheckList(MobileElement addCheckList) {
        this.addCheckList = addCheckList;
    }
}
