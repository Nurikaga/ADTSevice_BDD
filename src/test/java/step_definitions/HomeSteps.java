package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.interactions.Actions;
import pages.CommonPage;
import pages.HomePage;
import utils.BrowserUtils;
import utils.CucumberLogUtils;

public class HomeSteps implements CommonPage {
    HomePage page;
    String mainWindowHandle;

    public HomeSteps() {
        page = new HomePage();

    }

    @Given("I open url of homepage")
    public void i_open_url_of_homepage() {
        BrowserUtils.getDriver();
    }

    @Then("Verify Title of Home page is {string}")
    public void verifyTitleOfHomePageIs(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
    }

    @Then("Verify the Title of Home & Personal page is {string}")
    public void verifyTheTitleOfHomePersonalPageIs(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
    }

    @Then("Verify ADT logo button is displayed")
    public void verifyADTLogoButtonIsDisplayed() throws InterruptedException {
        BrowserUtils.isDisplayed(page.adtLogoBtn);
        Thread.sleep(3000);
    }

    @And("Verify the drop down menu should be visible")
    public void verifyTheDropDownMenuShouldBeVisible() {
        BrowserUtils.isDisplayed(page.dropDownMenu);
    }

    @And("Verify {string} are enable")
    public void verifyAreEnable(String buttons) {
        BrowserUtils.isEnabled(BrowserUtils.getDriver().findElement
                (By.xpath(String.format(XPATH_TEMPLATE_TEXT, buttons))));
    }

    @Then("Verify {string} button is displayed")
    public void verifyButtonIsDisplayed(String shopNowBtn) {
        BrowserUtils.isDisplayed(page.shopNowBtn);
    }

    @And("Verify {string} button is enabled")
    public void verifyButtonIsEnabled(String shopNowBtn) {
        BrowserUtils.isEnabled(page.shopNowBtn);
    }


    @And("I verify the {string} is displayed")
    public void iVerifyTheIsDisplayed(String image) {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_IMG, image))).isDisplayed();
    }

//    @Then("I click on {string} hovered-over button")
//    public void iClickOnHoveredOverButton(String callBtn) throws InterruptedException {
//        BrowserUtils.click(page.callBtn);
//        Thread.sleep(5000);
//        Alert alert = BrowserUtils.getDriver().switchTo().alert();
//        alert.dismiss();
//    }

    @Then("I hover over call button")
    public void iHoverOverCallButton() throws InterruptedException {
        Actions actions = new Actions(BrowserUtils.getDriver());
        actions.moveToElement(page.callBtn).perform();
        Thread.sleep(3000);
        CucumberLogUtils.logPass("Image is displayed", true);
    }
    @And("Verify phone number under icon is {string}")
    public void verifyPhoneNumberUnderIconIs(String phoneNumber) throws InterruptedException {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, phoneNumber))).click();
    }

    @And("Verify {string} under icon is displayed")
    public void verifyUnderIconIsDisplayed() {
        BrowserUtils.isDisplayed(page.phoneNumber);
    }

    @Then("I click on Customer Login icon")
    public void iClickOnCustomerLoginIcon() {
        BrowserUtils.click(page.customerIcon);
    }

    @When("I click on Shopping cart icon")
    public void iClickOnShoppingCartIcon() {
        BrowserUtils.getDriver().findElement(By.xpath("//div[@class='right-container']//img[@alt='cart icon']")).click();
    }

    @Then("I click on Get a free quote button")
    public void iClickOnGetAFreeQuoteButton() {
        BrowserUtils.click(page.getFreeQuoteBtn);
    }

    @And("Verify the window is displayed")
    public void verifyTheWindowIsDisplayed() {
        BrowserUtils.sleep(1000);
        BrowserUtils.isDisplayed(page.getFreeQuoteWindow);
    }

    @When("I scroll down")
    public void iScrollDown() {
        BrowserUtils.moveIntoView(page.footerSocialMediaIcons);
    }

    @Then("Verify the {string} button is displayed")
    public void verifyTheButtonIsDisplayed(String facebookIcon) {
        BrowserUtils.isDisplayed(page.facebookIcon);
    }

    @Then("Verify the {string} button is enabled")
    public void verifyTheButtonIsEnabled(String facebookIcon) {
        BrowserUtils.isEnabled(page.facebookIcon);
    }

    @And("I click on {string} icon and change Window to the new tab")
    public void iClickOnIconAndChangeWindowToTheNewTab(String facebookIcon) throws InterruptedException {
        mainWindowHandle = BrowserUtils.getDriver().getWindowHandle();
        BrowserUtils.click(page.facebookIcon);
        BrowserUtils.switchToNewWindow();
        Thread.sleep(3000);
    }

    @Then("Verify the title of the FaceBook page is {string}")
    public void verifyTheTitleOfTheFaceBookPageIs(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
        BrowserUtils.getDriver().switchTo().window(mainWindowHandle);
    }

    @Then("Verify Twitter button {string}  is displayed")
    public void verifyTwitterButtonIsDisplayed(String twitterIcon) {
        BrowserUtils.isDisplayed(page.twitterIcon);
    }

    @Then("Verify Twitter {string}  is enabled")
    public void verifyTwitterIsEnabled(String twitterIcon) {
        BrowserUtils.isEnabled(page.twitterIcon);
    }

    @And("I click on button {string} icon and change Window to the new tab")
    public void iClickOnButtonIconAndChangeWindowToTheNewTab(String twitterIcon) throws InterruptedException {
        mainWindowHandle = BrowserUtils.getDriver().getWindowHandle();
        BrowserUtils.click(page.twitterIcon);
        BrowserUtils.switchToNewWindow();
        Thread.sleep(3000);
    }

    @Then("Verify the title of the Twitter page is {string}")
    public void verifyTheTitleOfTheTwitterPageIs(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
        BrowserUtils.getDriver().switchTo().window(mainWindowHandle);
    }

    @Then("Verify Pinterest button {string}  is displayed")
    public void verifyPinterestButtonIsDisplayed(String pinterestIcon) {
        BrowserUtils.isDisplayed(page.pinterestIcon);
    }

    @Then("Verify Pinterest {string}  is enabled")
    public void verifyPinterestIsEnabled(String pinterestIcon) {
        BrowserUtils.isEnabled(page.pinterestIcon);
    }

    @And("I click Pinterest button {string} icon and change Window to the new tab")
    public void iClickPinterestButtonIconAndChangeWindowToTheNewTab(String pinterestIcon) throws InterruptedException {
        mainWindowHandle = BrowserUtils.getDriver().getWindowHandle();
        BrowserUtils.click(page.pinterestIcon);
        BrowserUtils.switchToNewWindow();
        Thread.sleep(3000);
    }

    @Then("Verify the title of the Pinterest page is {string}")
    public void verifyTheTitleOfThePinterestPageIs(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
        BrowserUtils.getDriver().switchTo().window(mainWindowHandle);
    }

    @Then("Verify Instagram button {string}  is displayed")
    public void verifyInstagramButtonIsDisplayed(String instagramIcon) {
        BrowserUtils.isDisplayed(page.instagramIcon);
    }

    @Then("Verify Instagram {string}  is enabled")
    public void verifyInstagramIsEnabled(String instagramIcon) {
        BrowserUtils.isEnabled(page.instagramIcon);
    }

    @And("I click Instagram button {string} icon and change Window to the new tab")
    public void iClickInstagramButtonIconAndChangeWindowToTheNewTab(String instagramIcon) throws InterruptedException {
        mainWindowHandle = BrowserUtils.getDriver().getWindowHandle();
        BrowserUtils.click(page.instagramIcon);
        BrowserUtils.switchToNewWindow();
        Thread.sleep(3000);
    }

    @Then("Verify the title of theInstagram page is {string}")
    public void verifyTheTitleOfTheInstagramPageIs(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
        BrowserUtils.getDriver().switchTo().window(mainWindowHandle);
    }

    @Then("Verify YouTube button {string}  is displayed")
    public void verifyYouTubeButtonIsDisplayed(String youtubeIcon) {
        BrowserUtils.isDisplayed(page.youtubeIcon);
    }

    @Then("Verify YouTube {string}  is enabled")
    public void verifyYouTubeIsEnabled(String youtubeIcon) {
        BrowserUtils.isEnabled(page.youtubeIcon);
    }

    @And("I click YouTube button {string} icon and change Window to the new tab")
    public void iClickYouTubeButtonIconAndChangeWindowToTheNewTab(String youtubeIcon) throws InterruptedException {
        mainWindowHandle = BrowserUtils.getDriver().getWindowHandle();
        BrowserUtils.click(page.youtubeIcon);
        BrowserUtils.switchToNewWindow();
        Thread.sleep(3000);
    }

    @Then("Verify the title of YouTube page is {string}")
    public void verifyTheTitleOfYouTubePageIs(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
    }



    @Then("Verify Not sure where to start? question is displayed when you scroll down towards the middle")
    public void verifyNotSureWhereToStartQuestionIsDisplayedWhenYouScrollDownTowardsTheMiddle() {
        BrowserUtils.isDisplayed(page.notSureQuestion);
    }

    @Then("Verify that the {string} button is displayed")
    public void verifyThatTheButtonIsDisplayed(String takeAQuiz) {
        //BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, takeAQuiz))));
        BrowserUtils.isDisplayed(page.takeAQuizBtn);
    }

    @When("I click on Take a quiz button")
    public void iClickOnTakeAQuizButton() throws InterruptedException {

        BrowserUtils.getDriver().findElement(By.xpath("//span[contains(text(), 'Take a quiz')]")).click();
    }

    @When("I scroll up little")
    public void iScrollUpLittle() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) BrowserUtils.getDriver();
        js.executeScript("window.scrollBy(0, -500)");
//        Actions actions = new Actions(BrowserUtils.getDriver());
//        actions.moveToElement(page.takeAQuizBtn).perform();
//        Thread.sleep(5000);
    }
}



