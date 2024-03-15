package de.frameworktsr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;

public class RatingsPage extends BasePage {
    By ratingScores = AppiumBy.id("io.appium.android.apis:id/indicator_ratingbar");
     By ratingsBy = AppiumBy.id("io.appium.android.apis:id/ratingbar2") ;
    public boolean isRatingsScoreUpdated(double expectedRating) {
        WebElement ratingsScoreElement = getElement(By.id("io.appium.android.apis:id/indicator_ratingbar")); 
        String currentScore = ratingsScoreElement.getText(); 
        System.out.println("************************************************** CURRENT SCORE = " + currentScore);
        return currentScore.equals(String.valueOf(expectedRating)); // Convert the expected rating to a string and compare
    }
    public void clickOnRatingIcon(Double rating) {
       int x=0;
       int y=0;
       if (rating==0.5){
        x=87;
        y=431;
       }
       else if (rating==1.5){
        x=128;
        y=424;
       }
       else if(rating==2.0){
        x=269;
        y=410;
       }

       else if(rating==3){
        x=464;
        y=417;
       }
       clickByCoordinate(x,y);
    }
    
}
