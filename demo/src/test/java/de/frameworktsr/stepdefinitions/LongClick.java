package de.frameworktsr.stepdefinitions;
import de.frameworktsr.pages.ApiDemosPage;
import de.frameworktsr.pages.DragAndDropPage;
import de.frameworktsr.pages.ExpandablePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LongClick {
    ApiDemosPage apiDemosPage = new ApiDemosPage();
@When("the user taps exapandable list")
public void the_user_taps_exapandable_list() {
    // Write code here that turns the phrase above into concrete actions
   ApiDemosPage.visitTheExpandableLink();
}
@When("the user taps customs adapter")
public void the_user_taps_customs_adapter() {
    // Write code here that turns the phrase above into concrete actions
    ApiDemosPage.viewCustomsAdapter();
}
@When("the user do long click on names")
public void the_user_do_long_click_on_names() {
    // Write code here that turns the phrase above into concrete actions
    ApiDemosPage.tryLongClickFunction();
}
@Then("the PopUp screen should be displayed")
public void the_pop_up_screen_should_be_displayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
    
}
