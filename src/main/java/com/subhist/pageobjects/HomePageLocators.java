package com.subhist.pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePageLocators {

    public HomePageLocators(AppiumDriver driver) {
        // TODO Auto-generated constructor stub
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "btn_start_skip")
    private MobileElement skipTutorial;

    @AndroidFindBy(id = "img_add")
    private MobileElement addNoteImg;

    @AndroidFindBy(id = "bottom_fab")
    private MobileElement plusButtonToAddNotes;

    @AndroidFindBy(id = "page_search")
    private MobileElement searchButtonToSearchNotes;

    @AndroidFindBy(id = "page_more")
    private MobileElement moreOptions;

    @AndroidFindBy(id = "title_layout")
    private MobileElement sortButton;

    @AndroidFindBy(id = "page_calendar")
    private MobileElement calenderButton;

    @AndroidFindBy(id = "main_btn1")
    private MobileElement colorChangeButton;

    @AndroidFindBy(id = "main_btn3")
    private MobileElement viewTypeAndBackupOption;

    @AndroidFindBy(id = "title")
    private MobileElement reminderTitle;


    @AndroidFindBy(id = "bottom_menu_delete")
    private MobileElement deleteReminderButton;

    @AndroidFindBy(id = "button1")
    private MobileElement confirmDeleteButton;

    @AndroidFindBy(id = "edit_search")
    private MobileElement typeTheItemToSearch;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='View']")
    private MobileElement selectViewOption;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Grid']")
    private MobileElement selectGridView;

    @AndroidFindBy(xpath = "//android.widget.GridView")
    private MobileElement gridviewVerification;

    public MobileElement getGridviewVerification() {
        return gridviewVerification;
    }

    public void setGridviewVerification(MobileElement gridviewVerification) {
        this.gridviewVerification = gridviewVerification;
    }

    public MobileElement getSelectGridView() {
        return selectGridView;
    }

    public void setSelectGridView(MobileElement selectGridView) {
        this.selectGridView = selectGridView;
    }

    public MobileElement getSelectViewOption() {
        return selectViewOption;
    }

    public void setSelectViewOption(MobileElement selectViewOption) {
        this.selectViewOption = selectViewOption;
    }

    public MobileElement getTypeTheItemToSearch() {
        return typeTheItemToSearch;
    }

    public void setTypeTheItemToSearch(MobileElement typeTheItemToSearch) {
        this.typeTheItemToSearch = typeTheItemToSearch;
    }

    public MobileElement getConfirmDeleteButton() {
        return confirmDeleteButton;
    }

    public void setConfirmDeleteButton(MobileElement confirmDeleteButton) {
        this.confirmDeleteButton = confirmDeleteButton;
    }

    public MobileElement getDeleteReminderButton() {
        return deleteReminderButton;
    }

    public void setDeleteReminderButton(MobileElement deleteReminderButton) {
        this.deleteReminderButton = deleteReminderButton;
    }

    public MobileElement getReminderTitle() {
        return reminderTitle;
    }

    public void setReminderTitle(MobileElement reminderTitle) {
        this.reminderTitle = reminderTitle;
    }

    public MobileElement getSkipTutorial() {
        return skipTutorial;
    }

    public void setSkipTutorial(MobileElement skipTutorial) {
        this.skipTutorial = skipTutorial;
    }

    public MobileElement getAddNoteImg() {
        return addNoteImg;
    }

    public void setAddNoteImg(MobileElement addNoteImg) {
        this.addNoteImg = addNoteImg;
    }

    public MobileElement getPlusButtonToAddNotes() {
        return plusButtonToAddNotes;
    }

    public void setPlusButtonToAddNotes(MobileElement plusButtonToAddNotes) {
        this.plusButtonToAddNotes = plusButtonToAddNotes;
    }

    public MobileElement getSearchButtonToSearchNotes() {
        return searchButtonToSearchNotes;
    }

    public void setSearchButtonToSearchNotes(MobileElement searchButtonToSearchNotes) {
        this.searchButtonToSearchNotes = searchButtonToSearchNotes;
    }

    public MobileElement getMoreOptions() {
        return moreOptions;
    }

    public void setMoreOptions(MobileElement moreOptions) {
        this.moreOptions = moreOptions;
    }

    public MobileElement getSortButton() {
        return sortButton;
    }

    public void setSortButton(MobileElement sortButton) {
        this.sortButton = sortButton;
    }

    public MobileElement getCalenderButton() {
        return calenderButton;
    }

    public void setCalenderButton(MobileElement calenderButton) {
        this.calenderButton = calenderButton;
    }

    public MobileElement getColorChangeButton() {
        return colorChangeButton;
    }

    public void setColorChangeButton(MobileElement colorChangeButton) {
        this.colorChangeButton = colorChangeButton;
    }

    public MobileElement getViewTypeAndBackupOption() {
        return viewTypeAndBackupOption;
    }

    public void setViewTypeAndBackupOption(MobileElement viewTypeAndBackupOption) {
        this.viewTypeAndBackupOption = viewTypeAndBackupOption;
    }
}
