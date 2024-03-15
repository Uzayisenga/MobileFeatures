package de.frameworktsr.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class DateWidgetPage extends BasePage {
    By changeDateBy = AppiumBy.accessibilityId("change the date");
    By changeTimeBy = AppiumBy.accessibilityId("change the time");
    By guhinduraIgiheBy = AppiumBy
            .xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"3\"]");
    By changeSpinnerBy = AppiumBy.accessibilityId("change the time (spinner)");
    By changeSpinnerByTime2 = AppiumBy.xpath(
            "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TimePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[2]/android.widget.Button[2]\r\n"
                    + //
                    "");
    By changeTimeToPM = AppiumBy.xpath(
            "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TimePicker/android.widget.LinearLayout/android.widget.NumberPicker/android.widget.Button\r\n"
                    + //
                    "");
    By updatingDateBy = AppiumBy.accessibilityId("16 March 2024");
    By confirmaBy = AppiumBy.id("android:id/button1");
    By changeTheTimeBy = AppiumBy
            .xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"15\"]");
    By confirmTimeBy = AppiumBy.id("android:id/button1");
    By okBtnBy = AppiumBy.id("android:id/button1");

    public void naviagateToChangeButton() {
        getElement(changeDateBy).click();
    }

    public void navigateToChangeTime() {
        getElement(changeTimeBy).click();
    }

    public void navigateToSpinner() {
        getElement(changeSpinnerBy).click();
    }

    public void navigateToCalenderAndUpdateDate() {
        getElement(updatingDateBy).click();
    }

    public void navigateToConfirm() {
        getElement(confirmaBy).click();
    }

    public void navigateTochangeTimeby() {
        getElement(changeTheTimeBy).click();
    }

    public void navigateToConfirmTime() {
        getElement(confirmTimeBy).click();
    }

    public void navigateToTapOnOkButton() {
        getElement(okBtnBy).click();
    }

    public void jyaGuhinduraIgihe() {
        getElement(guhinduraIgiheBy).click();
    }

    public void naviagateToChangehour() {
        getElement(changeSpinnerByTime2).click();
    }

    public void navigateToChangeTimeByPM() {
        getElement(changeTimeToPM).click();
    }
}
