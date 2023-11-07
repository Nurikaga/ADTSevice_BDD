package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.CommercialPage;
import pages.CommonPage;
import utils.BrowserUtils;
import utils.CucumberLogUtils;
import utils.Screenshot;

import javax.imageio.ImageIO;
import java.io.File;

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
        for (WebElement each : page.nineteenIcons) {
            BrowserUtils.isDisplayed(each);
            CucumberLogUtils.logPass("Icon is present", true);
        }
    }

    @Then("I click on {string} link button that forwarding to the Commercial page")
    public void iClickOnLinkButtonThatForwardingToTheCommercialPage(String commercial) {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, commercial))).click();
    }
}

