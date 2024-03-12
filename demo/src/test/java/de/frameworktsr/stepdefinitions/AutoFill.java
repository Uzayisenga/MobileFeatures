package de.frameworktsr.stepdefinitions;

import java.util.Objects;

import org.openqa.selenium.Dimension;

import de.frameworktsr.pages.ApiDemosPage;
import de.frameworktsr.pages.AutoCompletePage;
import de.frameworktsr.pages.BasePage;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
//import org.openqa.selenium.Dimension;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@SuppressWarnings("deprecation")
public class AutoFill extends BasePage {
  private static final PerformsTouchActions driver = null;
  ApiDemosPage apiDemosPage = new ApiDemosPage();
  AutoCompletePage autoCompletePage;

  @When("the user taps on AutoComplete")
  public void the_user_taps_on_auto_complete() {
    apiDemosPage.navigateToAutoComplete();

  }

  @When("the user taps on screen top")
  public void the_user_taps_on_screen_top() {
    apiDemosPage.naviagateToautoFill();
  }

  @SuppressWarnings("rawtypes")
  @When("the user fillin {string}")
  public void the_user_does_autofill_by_country_as_rwanda(String string) {
    
    apiDemosPage.navigateToCountry(string);


  }

  @Then("the user should be able to pick the country")
  public void the_user_should() {

  }

}
