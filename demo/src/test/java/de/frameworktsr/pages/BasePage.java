package de.frameworktsr.pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

import de.frameworktsr.utils.DriverManager;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {
    private AppiumDriver driver;
    private static WebDriverWait wait;

    public BasePage() {
        this.driver = new DriverManager().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }

    public static WebElement getElement(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void longClick(By locator) {
        WebElement element = getElement(locator);
        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(), "duration", 1000));
    }

    public void dragAndDrop(By locator, int endX, int endY) {
        WebElement element = getElement(locator);
        ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "endX", endX,
                "endY", endY));
    }

    public void checkTheSimillarities(String text1, String text2) {
        Assert.assertEquals(text1, text2);
    }

    public void popUp(By locator) {
        WebElement element = driver.findElement(locator);
        if (element instanceof RemoteWebElement) {
            String elementId = ((RemoteWebElement) element).getId();
            ((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
                    "element", elementId));
        } // else {
          // System.out.println("Element is not a RemoteWebElement.");
          // }
    }

    public void addTextToField(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public String getTextValueOfField(By locator) {
        return getElement(locator).getAttribute("text");
    }

    public void scrollupdown(String elementText) {
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(" +
                        "new UiSelector().textContains(\"" + elementText + "\"))"));
    }

    public void clickByCoordinate(int x, int y) {
        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
              "x",x,
              "y",y));
    }
}
