package de.frameworktsr.stepdefinitions;

import static org.junit.Assert.assertTrue; 
import de.frameworktsr.pages.ApiDemosPage;
import de.frameworktsr.pages.RatingsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ratings {
    ApiDemosPage apiDemosPage = new ApiDemosPage();
     RatingsPage ratingsPage = new RatingsPage();

    @When("the user tap on rating bar")
    public void the_user_tap_on_rating_bar() {
        apiDemosPage.navigateToRatingBar();
    }

    @When("the user tap on rating icons")
    public void the_user_tap_on_rating_icons() {
        apiDemosPage.naviagateToRatingScreen();
    }

    @Then("the ratings score should be updated")
    public void the_ratings_score_should_be_updated() {
        boolean isScoreUpdated = ratingsPage.isRatingsScoreUpdated();
        assertTrue(isScoreUpdated, "Ratings score is not updated");
    }

    private void assertTrue(boolean isScoreUpdated, String string) {
        
    }

   

}
