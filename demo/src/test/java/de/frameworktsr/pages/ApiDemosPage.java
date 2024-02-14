package de.frameworktsr.pages;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;
import io.opentelemetry.sdk.metrics.View;

public class ApiDemosPage extends BasePage {
    By viewsLinkBy = AppiumBy.accessibilityId("Views");
    By dragAndDropBy = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]");
    By preferences = AppiumBy.accessibilityId("Preference");
    By preferenceDependencies = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]\r\n" + //
                "");
    By preferencesDependencyWifiCheckbox = AppiumBy.id("android:id/checkbox");
    
    By wifiSettings = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout\r\n" + //
                "");
    By wifiSettingInputFieldPopup = AppiumBy.id("android:id/edittext_container");
    By clickingOnOkeyButton = AppiumBy.id("android:id/button1");
    //We are going to tap on View section
    
    public void navigateToViews() {
        getElement(viewsLinkBy).click();
    }

    public DragAndDropPage clickonDrangAndDroplink(){
        getElement(dragAndDropBy).click();
        return new DragAndDropPage();

    }

    public void navigateToPreferences() {
        // TODO Auto-generated method stub
       getElement(preferences).click();
    }

    public void navigateToPreferencesDependencies() {
        getElement(preferenceDependencies).click();
    }
    
    public void clickOnCheckBoxToActivateWifi() {
        getElement(preferencesDependencyWifiCheckbox).click();
    }
    public void openWifiSettingsPopUp() {
        getElement(wifiSettings).click();
    }

    public void addWifiSettingsName(String name) {
        addTextToField(wifiSettingInputFieldPopup, name);
    }

    public void clickOkBtn() {
        getElement(clickingOnOkeyButton).click();
    }



    
    
}
 