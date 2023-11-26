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

    public VideoSurveillanceSteps() {
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

    @Then("I click on {string} link button that forwarding to the Video Surveillance page")
    public void iClickOnLinkButtonThatForwardingToTheVideoSurveillancePage(String linkBtn) {
        BrowserUtils.click( BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT2_CONTAINS, linkBtn))));
    }
}




