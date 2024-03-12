package de.frameworktsr.stepdefinitions;

import de.frameworktsr.pages.ApiDemosPage;
import de.frameworktsr.pages.DragAndDropPage;
import de.frameworktsr.pages.SwipePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class SwipeImage {
    ApiDemosPage apiDemosPage = new ApiDemosPage();
    SwipePage swipePage;

    @When("the user taps on Gallery link")
    public void the_user_taps_on_gallery_link() {
        apiDemosPage.tapTheGalleryTocheckIage();
    }

    @When("the user taps on Photos link")
    public void the_user_taps_on_photos_link() {
        apiDemosPage.tapOnThePhotoSwipeImage();
    }

    @When("the user swipes left on the first image")
    public void the_user_swipes_left_on_the_first_image() {
        apiDemosPage.tapingOnTheFirstImage();
    }

    @Then("the second image should be in focus")
    public void the_second_image_should_be_in_focus() {
        apiDemosPage.tapingOnTheSecondImage();
    }

}
