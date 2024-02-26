package de.frameworktsr.stepdefinitions;
import de.frameworktsr.pages.ApiDemosPage;

//import de.frameworktsr.ScrollUpAndDown;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RadionButtons extends ApiDemosPage {
    ApiDemosPage apiDemosPage = new ApiDemosPage();
    RadionButtons radionButtons;

@When("a user tapson views link")
public void a_user_tapson_views_link() {
    apiDemosPage.navigateToViews();
}
@When("the user scrollDown to RadionGroup link")
public void the_user_scroll_down_to_radion_group_link() {
    apiDemosPage.navigateToRadionLink();
}

@When("the user chooses dinner with RadionButtons from Views-RadionButtons")
public void the_user_chooses_dinner_with_RadionButtons(){
    apiDemosPage.navigateToViewRadioButton();

}
@Then("the item should be selcted")
public void the_item_should_be_selcted(){


}
@When ("the user taps on clear")
public void  the_user_taps_on_clear(){
    apiDemosPage.clearingTheSelectedItem();

}
@Then ("the selected item should be disappear.")
public void the_selected_item_should_be_disappear(){

}
}
