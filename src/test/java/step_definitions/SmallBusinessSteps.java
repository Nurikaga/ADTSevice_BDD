package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
Nurik
import org.openqa.selenium.support.ui.Select;
import pages.CommonPage;

import pages.CommonPage;
import pages.HomePage;
main
import pages.SmallBusinessPage;
import utils.BrowserUtils;

public class SmallBusinessSteps implements CommonPage {
 Nurik


 main
    SmallBusinessPage page;

    public SmallBusinessSteps() {
        page = new SmallBusinessPage();

    }
 Nurik

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
}


=======
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

    @Then("I verify the title of the page {string}")
    public void iVerifyTheTitleOfThePage(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
    }

}



main
