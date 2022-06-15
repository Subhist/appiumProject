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

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Reminder']")
    private MobileElement reminderButton;

    @AndroidFindBy(xpath = "////android.widget.TextView[@text='Send']")
    private MobileElement sendButton;

    @AndroidFindBy(xpath = "////android.widget.TextView[@text='Lock']")
    private MobileElement lockButton;

    @AndroidFindBy(xpath = "////android.widget.TextView[@text='Discard']")
    private MobileElement discardButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='DONE']")
    private MobileElement doneButton;

    @AndroidFindBy(xpath = "//android.widget.Toast")
    private MobileElement toastForSaveConfirmation;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Calendar']")
    private MobileElement saveCalenderButton;


    public MobileElement getSaveCalenderButton() {
        return saveCalenderButton;
    }

    public void setSaveCalenderButton(MobileElement saveCalenderButton) {
        this.saveCalenderButton = saveCalenderButton;
    }

    public MobileElement getToastForSaveConfirmation() {
        return toastForSaveConfirmation;
    }

    public void setToastForSaveConfirmation(MobileElement toastForSaveConfirmation) {
        this.toastForSaveConfirmation = toastForSaveConfirmation;
    }

    public MobileElement getDoneButton() {
        return doneButton;
    }

    public void setDoneButton(MobileElement doneButton) {
        this.doneButton = doneButton;
    }

    public MobileElement getReminderButton() {
        return reminderButton;
    }

    public void setReminderButton(MobileElement reminderButton) {
        this.reminderButton = reminderButton;
    }

    public MobileElement getSendButton() {
        return sendButton;
    }

    public void setSendButton(MobileElement sendButton) {
        this.sendButton = sendButton;
    }

    public MobileElement getLockButton() {
        return lockButton;
    }

    public void setLockButton(MobileElement lockButton) {
        this.lockButton = lockButton;
    }

    public MobileElement getDiscardButton() {
        return discardButton;
    }

    public void setDiscardButton(MobileElement discardButton) {
        this.discardButton = discardButton;
    }

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
