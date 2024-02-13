package de.frameworktsr.pages;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;
import io.opentelemetry.sdk.metrics.View;

public class ApiDemosPage extends BasePage {
    By viewsLinkBy = AppiumBy.accessibilityId("Views");
    By dragAndDropBy = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]");
    //We are going to tap on View section
    
    public void navigateToViews() {
        getElement(viewsLinkBy).click();
    }

    public DragAndDropPage clickonDrangAndDroplink(){
        getElement(dragAndDropBy).click();
        return new DragAndDropPage();

    }

    
}
 