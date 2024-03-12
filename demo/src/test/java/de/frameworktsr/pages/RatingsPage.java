package de.frameworktsr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;

public class RatingsPage extends BasePage {
    By ratingScores = AppiumBy.id("io.appium.android.apis:id/indicator_ratingbar");
    public boolean isRatingsScoreUpdated() {
        WebElement ratingsScoreElement = getElement(By.id("io.appium.android.apis:id/indicator_ratingbar")); // Replace with actual locator
        String currentScore = ratingsScoreElement.getText(); // Get the current score from the element
        String expectedScore = "5"; // Assuming the expected score is 5
        return currentScore.equals(expectedScore); // Return true if the current score matches the expected score
    }
    
}
