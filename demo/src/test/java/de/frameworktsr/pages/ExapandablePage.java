package de.frameworktsr.pages;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class ExapandablePage extends BasePage {

    By tapingOnPeopleByLongClickin = AppiumBy.xpath("//android.widget.TextView[@text=\"People Names\"]");

    public void tryLongClickFunction(){
        getElement(tapingOnPeopleByLongClickin).click();
        
    }

}
