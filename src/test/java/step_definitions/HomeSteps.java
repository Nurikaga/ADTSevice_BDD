package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.HomePage;
import utils.BrowserUtils;

public class HomeSteps implements CommonPage {
    HomePage page;

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
    public void verifyADTLogoButtonIsDisplayed() {
        BrowserUtils.isDisplayed(page.adtLogoBtn);
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
}



