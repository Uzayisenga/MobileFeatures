package de.frameworktsr.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class AutoCompletePage extends BasePage {
     By country = AppiumBy.id("\tio.appium.android.apis:id/edit");

     public void navigateToCountry(){
        getElement(country);
    }
    
}
