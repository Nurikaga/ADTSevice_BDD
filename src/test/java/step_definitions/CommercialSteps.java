package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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

    @Then("I click on {string} link button that forwarding to the Commercial page")
    public void iClickOnLinkButtonThatForwardingToTheCommercialPage(String CommercialBusinessBtn) {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, CommercialBusinessBtn))).click();
    }

    @Then("I verify title of the page {string}")
    public void iVerifyTitleOfThePage(String title) {
        String actualTitle = BrowserUtils.getDriver().getTitle();
        BrowserUtils.assertEquals(actualTitle, title);
    }
}
