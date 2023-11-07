package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommercialPage;
import pages.CommonPage;
import utils.BrowserUtils;
import utils.CucumberLogUtils;

public class CommercialSteps implements CommonPage {
    CommercialPage page = new CommercialPage();

    public CommercialSteps() {
        page = new CommercialPage();
    }

    @Given("I open url of Commercial page")
    public void iOpenUrlOfCommercialPage() {
        BrowserUtils.getDriver().get("https://www.adt.com/commercial");
    }

    @Then("I verify that nineteen icons are present")
    public void iVerifyThatNineteenIconsArePresent() {
        CucumberLogUtils.logPass("Icons are present", true);
        for (WebElement each : page.nineteenIcons) {
            BrowserUtils.isDisplayed(each);

        }
    }

    @When("I scroll down to the footer of the page")
    public void iScrollDownToTheFooterOfThePage() {
        BrowserUtils.moveIntoView(page.footerCopyRight);
    }

    @Then("I verify that text is displayed page")
    public void iVerifyThatTextIsDisplayedPage() {
        String text = "© 2023 ADT. All rights reserved. The product/service names listed in this document are marks and/or registered marks of their respective owners and used under license. Unauthorized use strictly prohibited.";
        BrowserUtils.assertEquals(page.footerCopyRight.getText(), text);
    }
}