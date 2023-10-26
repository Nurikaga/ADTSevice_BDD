package step_definitions;


import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.DataTable;

import io.cucumber.messages.types.TableRow;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AccessControlPage;
import pages.CommonPage;
import utils.BrowserUtils;

import java.util.List;
import java.util.Map;

public class AccessControlSteps<V> implements CommonPage {
    AccessControlPage page;

    public AccessControlSteps() {
        page = new AccessControlPage();
    }

    @And("I click on {string} link button that takes to the Access Control page")
    public void iClickOnLinkButtonThatTakesToTheAccessControlPage(String accessControlBtn) {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, accessControlBtn))).click();
    }


    @Then("I verify a text {string} in the page")
    public void iVerifyATextInThePage(String text) {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT, text))).click();
    }

    @And("I verify the button {string} in the page clickable and takes to the new page")
    public void iVerifyTheButtonInThePageClickableAndTakesToTheNewPage(String callMeBtn) {

        page.callMeBtn.click();
    }

    @When("the user fills out the form with the following data")
    public void the_user_fills_out_the_form_with_the_following_data(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> asMaps = dataTable.asMaps();
        for (Map<String, String> each : asMaps) {
            BrowserUtils.sendKeys(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD2, each.get("Field"))))
                    , each.get("Value"));
            BrowserUtils.sleep(1000);

        }
    }

    @And("I verify the Message is displayed in the pop-up window")
    public void iVerifyTheMessageIsDisplayedInThePopUpWindow() {
        page.callMeMessage.isDisplayed();
        BrowserUtils.getText(page.callMeMessage);
        BrowserUtils.sleep(3000);
    }

    @And("I verify the select box is clickable and has the following options")
    public void iVerifyTheSelectBoxIsClickableAndHasTheFollowingOptions() {
        WebElement radioButton = page.industryBtn;
        radioButton.click();
        page.Other.click();
        WebElement radioButton1 = page.companySizeBtn;
        radioButton1.click();
        page.companySize.click();


    }
}


