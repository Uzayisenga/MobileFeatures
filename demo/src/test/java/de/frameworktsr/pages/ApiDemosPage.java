package de.frameworktsr.pages;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;

public class ApiDemosPage extends BasePage {
    By viewsLinkBy = AppiumBy.accessibilityId("Views");
    By dragAndDropBy = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]");
    //We are going to tap on View section
    
    public ApiDemosPage navigateToViews() {
        getElement(viewsLinkBy).click();
        return this;
    }

    
}
 