package de.frameworktsr.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class PopUpPage extends BasePage {

    By preferences = AppiumBy.id("Preference");
    By preferenceDependencies = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]\r\n" + //
                "");
    By preferencesDependencyWifiCheckbox = AppiumBy.id("android:id/checkbox");
    By wifiSettings = AppiumBy.xpath("//android.widget.TextView[@text=\"WiFi settings\"]");
    By wifiSettingInputFieldPopup = AppiumBy.id("android:id/edittext_container");
    By clickingOnOkeyButton = AppiumBy.id("android:id/button1");


    public void openWifiSettingsPopUp() {
        getElement(preferences).click();
    }



    public void wifiSettingInputFieldPopupBy(String name) {
        addTextToField(wifiSettingInputFieldPopup, name);
    }

    public void clickingOnOkeyButtonBy() {
        getElement(clickingOnOkeyButton).click();
    }

    public void preferencesDependencyWifiCheckboxby() {
        getElement(preferencesDependencyWifiCheckbox).click();
    }
    
}
