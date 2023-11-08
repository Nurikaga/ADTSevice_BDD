package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.CommercialPage;
import pages.CommonPage;
import utils.BrowserUtils;
import utils.CucumberLogUtils;

public class CommercialSteps implements CommonPage {
    CommercialPage page = new CommercialPage();

    public CommercialSteps() {
        page = new CommercialPage();
    }
    Actions actions = new Actions(BrowserUtils.getDriver());
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

    @When("I navigate to the {string}")
    public void iNavigateToThe(String PoweredByExTitle) {
        BrowserUtils.assertEquals(page.sectionTitlePoweredByEx.getText(),"Powered by Experience. Driven by Excellence.™");
        BrowserUtils.highlightElement(page.sectionTitlePoweredByEx);
    }

    @Then("I should see a button labeled {string}")
    public void iShouldSeeAButtonLabeled(String navBtn) {
    String navBtnAdv = page.OurAdvBtn.getText();
        Assert.assertTrue(navBtnAdv.equalsIgnoreCase(navBtn));
        BrowserUtils.highlightElement(page.OurAdvBtn);
    }

    @And("I should be able to click on the {string} button")
    public void iShouldBeAbleToClickOnTheButton(String navBtn) {
        switch (navBtn.toLowerCase()){
            case "our advantage":
               // ((JavascriptExecutor) BrowserUtils.getDriver()).executeScript("arguments[0].scrollIntoView(true);", page.OurAdvBtn);
                BrowserUtils.sleep(2000);
                actions.moveToElement(page.OurAdvBtn).click().perform();
                BrowserUtils.highlightElement(page.OurAdvBtn);
               // BrowserUtils.click(page.OurAdvBtn);
                break;
        }
    }
}
