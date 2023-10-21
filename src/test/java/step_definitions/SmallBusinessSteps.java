package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.HomePage;
import pages.SmallBusinessPage;
import utils.BrowserUtils;

public class SmallBusinessSteps implements CommonPage {
    SmallBusinessPage page;

    public SmallBusinessSteps() {
        page = new SmallBusinessPage();

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
    }



