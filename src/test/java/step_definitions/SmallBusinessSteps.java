package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.SmallBusinessPage;
import utils.BrowserUtils;
import utils.CucumberLogUtils;


public class SmallBusinessSteps implements CommonPage {
    SmallBusinessPage page;
    String mainWindowHandle;

    public SmallBusinessSteps() {
        page = new SmallBusinessPage();

    }

    @When("I click on Home & Personal button")
    public void iClickOnHomePersonalButton() throws InterruptedException {
        BrowserUtils.click(page.homeAndPersonalBtn);
    }

    @And("I click on Small Business button")
    public void iClickOnSmallBusinessButton() throws InterruptedException {
        BrowserUtils.getDriver().findElement(By.xpath("(//span[text()='Small Business'])[1]")).click();
        Thread.sleep(5000);
    }

    @Then("Verify {string} are displayed")
    public void verifyAreDisplayed(String btns) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, btns))));
    }

    @Then("Verify {string} are enabled")
    public void verifyAreEnabled(String Buttons) {
        BrowserUtils.isEnabled(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, Buttons))));
    }

    @When("I click {string} hovered-over button")
    public void iClickHoveredOverButton(String homePersonalBtn) {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, homePersonalBtn))).click();
    }

    @Then("I click on {string} link button that forwarding to the Small Business page")
    public void iClickOnLinkButtonThatForwardingToTheSmallBusinessPage(String smallBusinessBtn) {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, smallBusinessBtn))).click();
    }

    @And("I change Window to the new tab")
    public void iChangeWindowToTheNewTab() {
        BrowserUtils.switchToNewWindow();
    }

    @Then("I navigate to {string} drop down menu")
    public void iNavigateToDropDownMenu(String solutionLink) {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, solutionLink))).click();
    }

    @And("I click on {string} link button that takes to the Intrusion Detection page")
    public void iClickOnLinkButtonThatTakesToTheIntrusionDetectionPage(String intrusionDetectionLink) {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, intrusionDetectionLink))).click();
    }

    @And("I verify the header {string} in the page")
    public void iVerifyTheHeaderInThePage(String header) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, header))).getText(), header);
    }

    @Then("Verify {string} text in header is displayed")
    public void verifyTextInHeaderIsDisplayed(String headerText) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, headerText))));
    }

    @Then("Verify {string} text under header is displayed")
    public void verifyTextUnderHeaderIsDisplayed(String text) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, text))));
    }

    @Then("Verify pictures are displayed")
    public void verifyPicturesAreDisplayed() throws InterruptedException {

        for (WebElement each : page.pictureTitles) {
            BrowserUtils.assertTrue(each.isDisplayed());
        }
    }

    @Then("Verify the texts under pictures are displayed")
    public void verifyTheTextsUnderPicturesAreDisplayed() {
        for (WebElement element : page.textUnderPictures) {
            BrowserUtils.assertTrue(element.isDisplayed());
            System.out.println(element.getText());
        }
    }

    @Then("Verify Learn more buttons are displayed")
    public void verifyLearnMoreButtonsAreDisplayed() {
        for (WebElement element : page.learnMoreBtns) {
            BrowserUtils.isDisplayed(element);
            System.out.println(element.getText());
        }
    }

    @Then("I verify the title of the page {string}")
    public void iVerifyTheTitleOfThePage(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
    }

    @And("Verify  all {string} are displayed")
    public void verifyAllAreDisplayed(String links) {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, links))).isDisplayed();
    }

    @And("I verify the image,title,text is displayed")
    public void iVerifyTheImageTitleTextIsDisplayed() {
        for (WebElement each : page.imageList4) {
            BrowserUtils.isDisplayed(each);
        }
    }

    @And("I take screenshot of test")
    public void iTakeScreenshotOfTest() {
        CucumberLogUtils.logPass("Image is displayed", true);
    }

    @Then("Verify pop-up window with Accessibility menu buttons is display on the right top of the page")
    public void verifyPopUpWindowWithAccessibilityMenuButtonsIsDisplayOnTheRightTopOfThePage() {
        BrowserUtils.sleep(5000);
        CucumberLogUtils.logPass("Accessibility menu buttons is display on the right top of the page", true);
    }

    @Then("I navigate to Accessibility button in the footer and click it")
    public void iNavigateToAccessibilityButtonInTheFooterAndClickIt() {
        JavascriptExecutor js = (JavascriptExecutor) BrowserUtils.getDriver();
        js.executeScript("window.scrollBy(0,350)", page.accessabilityBtn);
        BrowserUtils.click(page.accessabilityBtn);
    }

    @When("user clicks on {string} link's header button")
    public void userClicksOnLinkSHeaderButton(String linkHeader) {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT2, linkHeader))).click();
    }

    @Then("verify the linkHeader is {string}")
    public void verifyTheLinkHeaderIs(String header) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT2, header))).getText(), header);
    }

    @Then("Verify {string} link buttons are enabled")
    public void verifyLinkButtonsAreEnabled(String productLinks) {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CLASS, productLinks))).click();
    }

    @Then("Verify {string} of each page")
    public void verifyOfEachPage(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
    }


    @And("I click on Become an ADT Dealer button and Window to the new tab")
    public void iClickOnBecomeAnADTDealerButtonAndWindowToTheNewTab() throws InterruptedException {
        mainWindowHandle = BrowserUtils.getDriver().getWindowHandle();
        Thread.sleep(3000);
        BrowserUtils.click(page.becomeDealerBtn);
        BrowserUtils.switchToNewWindow();
    }

    @Then("Verify title of the Become an ADT Dealer page is {string}")
    public void verifyTitleOfTheBecomeAnADTDealerPageIs(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
        BrowserUtils.getDriver().switchTo().window(mainWindowHandle);
    }

    @And("I click on Dealer Lookup button and Window to the new tab")
    public void iClickOnDealerLookupButtonAndWindowToTheNewTab() throws InterruptedException {
        mainWindowHandle = BrowserUtils.getDriver().getWindowHandle();
        Thread.sleep(3000);
        BrowserUtils.click(page.dealerLookupBtn);
        BrowserUtils.switchToNewWindow();
    }

    @Then("Verify title of the Dealer Lookup page is {string}")
    public void verifyTitleOfTheDealerLookupPageIs(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
        BrowserUtils.getDriver().switchTo().window(mainWindowHandle);
    }

    @Then("I click Local Service Areas button and change Window to the new tab")
    public void iClickLocalServiceAreasButtonAndChangeWindowToTheNewTab() throws InterruptedException {
        mainWindowHandle = BrowserUtils.getDriver().getWindowHandle();
        Thread.sleep(3000);
        BrowserUtils.click(page.localServiceAreasBtn);
        BrowserUtils.switchToNewWindow();
    }

    @Then("I verify title of the Local Service Areas page is {string}")
    public void iVerifyTitleOfTheLocalServiceAreasPageIs(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
    }

    @Then("I click on {string} text link")
    public void iClickOnHyberLink(String textLink) {
        BrowserUtils.click(page.privacyPolicy);
    }

    @And("Verify the text {string} is displayed")
    public void verifyTheTextIsDisplayed(String text) throws InterruptedException {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_PRIVACY, text))));
        System.out.println(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_PRIVACY))));

    }


}











