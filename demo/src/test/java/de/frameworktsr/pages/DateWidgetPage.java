package de.frameworktsr.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class DateWidgetPage extends BasePage{
    By changeDateBy = AppiumBy.accessibilityId("change the date");
    By changeTimeBy = AppiumBy.accessibilityId("change the time");
    By changeSpinnerBy = AppiumBy.accessibilityId("change the time (spinner)");
    By updatingDateBy = AppiumBy.xpath("//android.view.View[@content-desc=\"15 March 2024\"]");
    By confirmaBy =AppiumBy.id("android:id/button1");
    By changeTheTimeBy = AppiumBy.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"15\"]");
    By confirmTimeBy =AppiumBy.id("android:id/button1");
    By okBtnBy = AppiumBy.id("android:id/button1");
    

    public void naviagateToChangeButton(){
        getElement(changeDateBy).click();
    }
    public void navigateToChangeTime(){
        getElement(changeTimeBy).click();
    }
    public void navigateToSpinner(){
        getElement(changeSpinnerBy).click();
    }
    public void navigateToCalenderAndUpdateDate(){
        getElement(updatingDateBy).click();
    }
}
