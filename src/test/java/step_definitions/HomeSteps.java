package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;

import org.openqa.selenium.Alert;
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

    @Then("I click on {string} hovered-over button")
    public void iClickOnHoveredOverButton(String callBtn) throws InterruptedException {
        BrowserUtils.click(page.callBtn);
        Thread.sleep(5000);
        Alert alert = BrowserUtils.getDriver().switchTo().alert();
        alert.dismiss();
    }

    @And("Verify {string} under icon is displayed")
    public void verifyUnderIconIsDisplayed() {
        BrowserUtils.isDisplayed(page.phoneNumber);
    }

    @Then("I hover over call button")
    public void iHoverOverCallButton() {
        BrowserUtils.moveIntoView(page.callBtn);
    }

    @Then("I click on Customer Login icon")
    public void iClickOnCustomerLoginIcon() {
        BrowserUtils.click(page.customerIcon);

    }
    @When("I click on Shopping cart icon")
    public void iClickOnShoppingCartIcon() {
        BrowserUtils.getDriver().findElement(By.xpath("//div[@class='right-container']//img[@alt='cart icon']")).click();
    }

}



