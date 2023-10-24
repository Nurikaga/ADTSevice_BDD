package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.CommonPage;
import pages.VideoSurveillancePage;
import utils.BrowserUtils;


public class VideoSurveillanceSteps implements CommonPage {
    VideoSurveillancePage page;

    VideoSurveillanceSteps() {
        page = new VideoSurveillancePage();
    }

    @And("I click on {string} link button that takes to the page")
    public void iClickOnLinkButtonThatTakesToThePage(String link) {
        BrowserUtils.click(page.videoSurveillanceBtn);
    }



    @Then("I verify a header,pictures, titles and texts on the page")
    public void iVerifyAHeaderPicturesTitlesAndTextsOnThePage() {
        for (WebElement each : page.imageList4) {
            BrowserUtils.isDisplayed(each);

    }}

    @And("I verify the pictures, titles, and texts are displayed in the page")
    public void iVerifyThePicturesTitlesAndTextsAreDisplayedInThePage() {
        Actions at = new Actions(BrowserUtils.getDriver());
        at.sendKeys(Keys.PAGE_UP).build().perform();
        at.moveToElement(page.pic1).build().perform();
        BrowserUtils.sleep(2000);

             BrowserUtils.isDisplayed(page.pic1);

            }
}

        BrowserUtils.isDisplayed(page.pic1);
    }


}




