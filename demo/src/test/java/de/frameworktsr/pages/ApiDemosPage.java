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
    By wifiSettingInputFieldPopup = AppiumBy.id("android:id/edit");
    By clickingOnOkeyButton = AppiumBy.id("android:id/button1");
    By vistViewLink = AppiumBy.id("Views");
    By scrollDownforTextClock = AppiumBy.accessibilityId("TextClock");
    By scrollUpForAnimation = AppiumBy.accessibilityId("Animation");
    By ChecktheRadionGroup = AppiumBy.accessibilityId("Radio Group");
    By CheckingRadionButton = AppiumBy.accessibilityId("Dinner");
    By clearingTheSelectedItem = AppiumBy.accessibilityId("Clear");
    By tapTheGallery = AppiumBy.accessibilityId("Gallery");
    By tapOnThePhotoSwipe = AppiumBy.accessibilityId("1. Photos");
    By theFirstImage = AppiumBy.xpath("//android.widget.ImageView[@index=0]");
    By theSecondImage = AppiumBy.xpath("//android.widget.ImageView[@index=1]");
    By theExapandableList = AppiumBy.accessibilityId("Expandable Lists");
    By customsAdapter = AppiumBy.accessibilityId("1. Custom Adapter");
    By tapingOnPeopleByLongClickin = AppiumBy.xpath("//android.widget.TextView[@text=\"People Names\"]");
    By stringNames = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.FrameLayout/android.widget.TextView");
    By autoComplete = AppiumBy.accessibilityId("Auto Complete");
    By autoFill = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"1. Screen Top\"]");
    By country = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.AutoCompleteTextView");
    //By countryList =AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.AutoCompleteTextView\r\n");
    By clickingRatingBar = AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Rating Bar\"]");
    By rating =AppiumBy.accessibilityId("Rating Bar");
    By ratingsBy = AppiumBy.id("io.appium.android.apis:id/ratingbar2") ;

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
    
    

    public void scrl(){
        scrollupdown("TextClock");
    }

    public void scrlup(){
        scrollupdown("Animation");
    }

    public void navigateToRadionLink(){
    scrollupdown("Radio Group");
    
    getElement(ChecktheRadionGroup).click();
    }

    public void navigateToViewRadioButton(){
        getElement(CheckingRadionButton).click();
    }

    public void clearingTheSelectedItem (){
        getElement(clearingTheSelectedItem).click();
    }

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

    public void visitTheExpandableLink(){
        getElement(theExapandableList).click();
    }
    public ExpandablePage viewCustomsAdapter(){
        getElement(customsAdapter).click();
        return new ExpandablePage();
    }

    public void tryLongClickFunction(){
        getElement(tapingOnPeopleByLongClickin).click();
        
    }

    public void checkCodes(){
        getElement(stringNames);
        
    }
    public void navigateToAutoComplete(){
        getElement(autoComplete).click();
    }

    public void naviagateToautoFill(){
        getElement(autoFill).click();
    }
    public void navigateToCountry(String string){
        getElement(country).click();
        getElement(country).sendKeys(string);
        getElement(country).click();
    
    }

    public void navigateToRatingBar(){
        scrollupdown("Rating Bar");
        getElement(clickingRatingBar).click();
    }
    // public void naviagateToRatingScreen(Double rating){

    //     // detect the value of a rating and give its corresponding star

    //     // rating 1.5
    //     // rating 2.0
    //     for (double i = 0; i < rating; i++) {
    //         RatingsPage.clickOnRatingIcon(); 
        
    //     getElement(ratingsBy).click();
    // }
//}
}
 