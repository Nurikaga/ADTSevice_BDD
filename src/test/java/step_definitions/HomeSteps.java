package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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


    @And("I verify the {string} is displayed")
    public void iVerifyTheIsDisplayed(String image) {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_IMG, image))).isDisplayed();
    }
    }




