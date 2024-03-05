package de.frameworktsr.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;

public class ExpandablePage extends BasePage {

    By tapingOnPeopleByLongClickin = AppiumBy.xpath("//android.widget.TextView[@text=\"People Names\"]");

    public void tryLongClickFunction(){
        longClick(tapingOnPeopleByLongClickin);
        
    }
    // public void isElementClicked(String expecteResultMessage) {
    //     String resultMessage = getElement(resultMessage).getText();
    //     checkTheSimillarities(expecteResultMessage, resultMessage);
    // }
  
}
