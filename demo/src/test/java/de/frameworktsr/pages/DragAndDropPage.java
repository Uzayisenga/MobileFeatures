package de.frameworktsr.pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class DragAndDropPage extends BasePage {
    By textlessCircle = AppiumBy.id("io.appium.android.apis:id/drag_dot_1");
    By textmessage = AppiumBy.id("io.appium.android.apis:id/drag_result_text");

    public void dragTextlessCircle(){
        dragAndDrop(textlessCircle, 1077, 1696);

    }
    public void isElementDropped(String expectedDragResultMessage) {
        String dragResultMessage = getElement(textmessage).getText();
        checkTheSimillarities(expectedDragResultMessage, dragResultMessage);
    }
}


