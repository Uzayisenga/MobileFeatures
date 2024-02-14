package de.frameworktsr.stepdefinitions;

import de.frameworktsr.pages.ApiDemosPage;
import de.frameworktsr.pages.DragAndDropPage;
import de.frameworktsr.pages.PopUpPage;
import io.cucumber.java.en.When;

public class PopUp {
    ApiDemosPage apiDemosPage = new ApiDemosPage();
    PopUpPage popUpPage;
    
    @When("a user tap on preferences link")
    public void a_user_tap_on_pereferance_link() {
        // Write code to navigate to the registration page
        apiDemosPage.navigateToPreferences();

    }

    @When("the user tap on preferences dependancies link")
    public void the_user_ap_on_preferences_dependancies_link(){
        apiDemosPage.navigateToPreferencesDependencies();
    }

    @When("the user check the checkbox to allow the wifiSettings")
    public void the_user_check_the_checkbox_to_allow_the_wifiSettings(){
        apiDemosPage.clickOnCheckBoxToActivateWifi();
    }

    @When("the user taps on wifiSettings")
    public void the_user_taps_on_wifiSettings(){
        apiDemosPage.openWifiSettingsPopUp();
    }
}
