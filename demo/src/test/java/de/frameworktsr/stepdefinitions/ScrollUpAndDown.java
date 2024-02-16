package de.frameworktsr.stepdefinitions;
//import static de.frameworktsr.pages.BasePage.wait;

import de.frameworktsr.pages.ApiDemosPage;
import de.frameworktsr.pages.PopUpPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class ScrollUpAndDown extends ApiDemosPage {
ApiDemosPage apiDemosPage = new ApiDemosPage();
PopUpPage popUpPage;
//WebElement textClockElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.AccessibilityId("TextClock")));
//textClockElement.click();
@When("a user taps on views link")
public void the_user_taps_on_view_link() {
apiDemosPage.navigateToViews();
}
@Then("the user scroll down to TextClock link")
public void the_user_scroll_down() {
   System.out.println("ScrollDown");
   apiDemosPage.scrl();
}
@Then ("the user scroll up to Animation link")
public void scroll_up_to_Animation_link(){
    apiDemosPage.scrlup();
}
    
}
