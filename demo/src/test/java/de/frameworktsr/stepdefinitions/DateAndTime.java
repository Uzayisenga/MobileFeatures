package de.frameworktsr.stepdefinitions;

import de.frameworktsr.pages.ApiDemosPage;
import de.frameworktsr.pages.DateWidgetPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DateAndTime {
    ApiDemosPage apiDemosPage = new ApiDemosPage();
    DateWidgetPage dateWidgetPage = new DateWidgetPage();

    @When("the user taps on the date and widgets link")
    public void the_user_taps_on_the_date_and_widgets_link() {
        // Write code here that turns the phrase above into concrete actions
        apiDemosPage.navigateToDateWidget();
    }

    @When("the user taps on the dialog link")
    public void the_user_taps_on_the_dialog_link() {
        // Write code here that turns the phrase above into concrete actions
        apiDemosPage.navigateToDialog();
    }

    @When("the user change the date")
    public void the_user_change_the_date() {
        // Write code here that turns the phrase above into concrete actions
      dateWidgetPage.naviagateToChangeButton();
    }

    @Then("the user changed date should visible")
    public void the_user_changed_date_should_visible() {
        // Write code here that turns the phrase above into concrete actions
        dateWidgetPage.navigateToChangeTime();
    }
    @Then("the user taps change time Button")
    public void the_user_taps_change_time_button() {
        // Write code here that turns the phrase above into concrete actions
        dateWidgetPage.navigateToCalenderAndUpdateDate();
    }
    @Then("click Ok or Cancel")
    public void click_ok_or_cancel() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

 

    @Then("the user changes the time")
    public void the_user_changes_the_time() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user taps on Ok button or Cancel")
    public void the_user_taps_on_ok_button_or_cancel() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user taps on spinner time button")
    public void the_user_taps_on_spinner_time_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user sets the spinner time")
    public void the_user_sets_the_spinner_time() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user taps on Ok button")
    public void the_user_taps_on_ok_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the spinner timer should be updated")
    public void the_spinner_timer_should_be_updated() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
