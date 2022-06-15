package com.subhist.pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class CalanderPageLocators {

    public CalanderPageLocators(AppiumDriver driver) {
        // TODO Auto-generated constructor stub
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "month_view")
    private MobileElement calenderView;

    @AndroidFindBy(id = "add")
    private MobileElement addButton;




    public MobileElement getCalenderView() {
        return calenderView;
    }

    public void setCalenderView(MobileElement calenderView) {
        this.calenderView = calenderView;
    }

    public MobileElement getAddButton() {
        return addButton;
    }

    public void setAddButton(MobileElement addButton) {
        this.addButton = addButton;
    }


}
