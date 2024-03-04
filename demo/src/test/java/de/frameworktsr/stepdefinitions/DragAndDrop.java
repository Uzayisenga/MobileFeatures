package de.frameworktsr.stepdefinitions;



import de.frameworktsr.pages.ApiDemosPage;
import de.frameworktsr.pages.DragAndDropPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DragAndDrop {
    ApiDemosPage apiDemosPage = new ApiDemosPage();
    DragAndDropPage dragdropPage ;


    @When("a user tap on views link")
    public void a_user_tap_on_views_link() {
        // Write code to navigate to the registration page
        apiDemosPage.navigateToViews();

    }

    @When("the user tap on Drag and Drop link")
    public void the_user_tap_on_Drag_and_Drop_link(){
        dragdropPage = apiDemosPage.clickonDrangAndDroplink();

    }

    @When("the user drag and drop on the textless circle in the corner")
    public void  the_user_on_clicks (){
        dragdropPage.dragTextlessCircle();


    }
    
    @Then("the message {string} should be displayed")
    public void the_message_should_be_displayed(String string) {
    dragdropPage.isElementDropped(string);
   
}
}
