package de.frameworktsr.stepdefinitions;

import de.frameworktsr.pages.ApiDemosPage;
import de.frameworktsr.pages.DragAndDropPage;
import de.frameworktsr.pages.SwipePage;

public class SwipeImage extends apiDemosPage  {
 ApiDemosPage apiDemosPage = new ApiDemosPage();
 SwipePage swipePage;
 
@When("a user tap on views link")
public void a_user_tap_on_views_link() {
apiDemosPage.navigateToViews();
}     
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
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("the second image should be in focus")
public void the_second_image_should_be_in_focus() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
    
}
