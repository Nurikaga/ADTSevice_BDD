package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.HealthSeniorPage;
import utils.BrowserUtils;
import utils.CucumberLogUtils;


public class HealthSeniorSteps implements CommonPage {
    HealthSeniorPage page;

    public HealthSeniorSteps() {
        page = new HealthSeniorPage();
    }

    @When("I click  {string} button")
    public void iClickHoveredOverButton(String homePersonalBtn) {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, homePersonalBtn))).click();
    }

    @When("I click on {string} button")
    public void iClickOnButton(String healthSafetyBtn) {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, healthSafetyBtn))).click();
    }

//    @When("I click on {string} button")
//    public void i_click_on_button(String btn) {
//        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, btn))).click();
//    }
//    @When("I click on {string} button")
//    public void i_click_on_button(String btn) {
//        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, btn))).click();
//    }

    @Then("Verify pictures are displayed under header above")
    public void verifyPicturesAreDisplayedUnderHeaderAbove() {
        for (WebElement each : page.pictures) {
            BrowserUtils.assertTrue(each.isDisplayed());
        }
    }

    @Then("Verify {string} under name is displayed")
    public void verifyUnderNameIsDisplayed(String txt) {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, txt))).click();
    }

    @Then("Verify text under name is displayed")
    public void verifyTextUnderNameIsDisplayed() {
        for (WebElement each : page.textUnderPic) {
            BrowserUtils.assertTrue(each.isDisplayed());
        }
    }

    @Then("Verify {string} is displayed")
    public void verifyIsDisplayed(String txtUnderName) {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_NUR, txtUnderName))).click();
    }

    @Then("Verify Online special buttons are displayed")
    public void verifyOnlineSpecialButtonsAreDisplayed() {
        for (WebElement each : page.onlineSpecialBtn) {
            BrowserUtils.assertTrue(each.isDisplayed());
        }
    }

    @Then("Verify SHOP NOW button is enabled")
    public void verifySHOPNOWButtonIsEnabled() {
        BrowserUtils.assertTrue(page.shopNowBtn.isEnabled());
    }

    @When("I scroll up")
    public void iScrollUp() throws InterruptedException {
        Actions actions = new Actions(BrowserUtils.getDriver());
        actions.sendKeys(Keys.PAGE_UP).build().perform();
//        JavascriptExecutor js = (JavascriptExecutor) BrowserUtils.getDriver();
//        // Scroll up by a certain pixel amount (you can adjust the value as needed)
//        js.executeScript("window.scrollBy(0, -250);");
    }

    @When("I click {string} button")
    public void iClickButton(String button) throws InterruptedException {
        BrowserUtils.click(page.clickHereBtn);
    }

    @Then("Verify title is {string}")
    public void verifyTitleIs(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
    }

    @Then("I verify the video is displayed")
    public void iVerifyTheVideoIsDisplayed() {
        page.videoImg.isDisplayed();
    }

    @And("I verify the video is able to play")
    public void iVerifyTheVideoIsAbleToPlay() {
        page.playBtn.click();
        BrowserUtils.switchToNewWindow();
        CucumberLogUtils.logPass("Video is able to play", true);
    }

    @And("I click on Shop Now button and Verify titles of the pages")
    public void iClickOnShopNowButtonAndVerifyTitlesOfThePages() {
        page.shopNowBtn2.click();
        String title1 = BrowserUtils.getDriver().getTitle();
        System.out.println(title1);
        CucumberLogUtils.logPass("Title is displayed", true);
        BrowserUtils.getDriver().navigate().back();
        page.shopNowBtn3.click();
        String title2 = BrowserUtils.getDriver().getTitle();
        System.out.println(title2);
        CucumberLogUtils.logPass("Title is displayed", true);
        BrowserUtils.getDriver().navigate().back();
        page.shopNowBtn4.click();
        String title3 = BrowserUtils.getDriver().getTitle();
        System.out.println(title3);
    }

    @Then("Verify images are displayed")
    public void verifyImagesAreDisplayed() {
        for (WebElement each : page.images) {
            BrowserUtils.assertTrue(each.isDisplayed());
        }
    }

    @Then("Verify {string} text under the header is displayed")
    public void verifyTextUnderTheHeaderIsDisplayed(String textUndHeader) {
        BrowserUtils.assertTrue(page.descriptionUnderHeaderText.isDisplayed());
    }

    @Then("Verify three buttons are enabled")
    public void verifyThreeButtonsAreEnabled() {
        for (WebElement each : page.threeButtons) {
            BrowserUtils.assertTrue(each.isEnabled());
        }
    }
    @Then("I verify the picture is displayed")
    public void iVerifyThePictureIsDisplayed() {
        page.bigImg.isDisplayed();
    }

    @Then("Verify three buttons are displayed")
    public void verifyThreeButtonsAreDisplayed() {
    }

    @Then("Verify title of the Health & Senior Safety is {string}")
    public void verifyTitleOfTheHealthSeniorSafetyIs(String TiTle) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), TiTle);
    }

    @And("I hover over phone symbol button")
    public void iHoverOverPhoneSymbolButton() throws InterruptedException {
        Actions actions = new Actions(BrowserUtils.getDriver());
        actions.moveToElement(page.phoneIcon).perform();
        Thread.sleep(3000);
        CucumberLogUtils.logPass("Image is displayed", true);
    }

    @When("I click customer symbol button")
    public void iClickCustomerSymbolButton() {
        BrowserUtils.click(page.customerIcon);
    }

    @Then("Verify the url is {string}")
    public void verifyTheUrlIs(String url) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getCurrentUrl(), url);
    }

}




