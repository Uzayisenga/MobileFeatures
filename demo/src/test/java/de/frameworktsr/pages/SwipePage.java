package de.frameworktsr.pages;
import io.appium.java_client.AppiumBy;
import io.opentelemetry.sdk.metrics.View;
import org.openqa.selenium.By;
import static org.junit.Assert.assertEquals; 

public class SwipePage extends BasePage {
    By tapTheGallery = AppiumBy.accessibilityId("Gallery");
    By tapOnThePhotoSwipe = AppiumBy.accessibilityId("1. Photos");
    By theFirstImage = AppiumBy.xpath("//android.widget.ImageView[@index=0]");
    By theSecondImage = AppiumBy.xpath("//android.widget.ImageView[@index=1]");
    By theThirdImage = AppiumBy.xpath("//android.widget.ImageView[@index=2]");

    public void tapTheGalleryTocheckIage(){
        getElement(tapTheGallery).click();

    }
    public void tapOnThePhotoSwipeImage(){
        getElement(tapOnThePhotoSwipe).click();
    }

    public void tapingOnTheFirstImage(){
        getElement(theFirstImage).click();
    }
    public void tapingOnTheSecondImage(){
        getElement(theSecondImage).click();
    }

    //public void swipedTotheLastImage(){
        //getElement(theTtheThirdImage).isImageSwiped();
    //}
    public void isImageSwiped() {
        String firstImageFocusable = getElement(theFirstImage).getAttribute("focusable");
        String secondImageFocusable = getElement(theSecondImage).getAttribute("focusable");
        assertEquals(firstImageFocusable, "false");
        assertEquals(secondImageFocusable, "true");
    }
}
