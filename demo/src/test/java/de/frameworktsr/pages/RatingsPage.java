package de.frameworktsr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;

public class RatingsPage extends BasePage {
    By ratingScores = AppiumBy.id("io.appium.android.apis:id/indicator_ratingbar");
    static By ratingsBy = AppiumBy.id("io.appium.android.apis:id/ratingbar2") ;
    public boolean isRatingsScoreUpdated(double expectedRating) {
        WebElement ratingsScoreElement = getElement(By.id("io.appium.android.apis:id/indicator_ratingbar")); 
        String currentScore = ratingsScoreElement.getText(); 
        System.out.println("************************************************** CURRENT SCORE = " + currentScore);
        return currentScore.equals(String.valueOf(expectedRating)); // Convert the expected rating to a string and compare
    }
    public static void clickOnRatingIcon() {
       getElement(ratingsBy).click();
    }
    
}
