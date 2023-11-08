package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.CommercialPage;
import pages.CommonPage;
import utils.BrowserUtils;
import utils.CucumberLogUtils;

public class CommercialSteps implements CommonPage {
    CommercialPage page;

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

    @When("I scroll down to the footer of the page")
    public void iScrollDownToTheFooterOfThePage() {
        BrowserUtils.moveIntoView(page.footerCopyRight);
    }

    @Then("I verify that text is displayed page")
    public void iVerifyThatTextIsDisplayedPage() {
        String text = "© 2023 ADT Commercial LLC. All rights reserved. The product/service names listed in this document are marks and/or registered marks of their respective owners and used under license or with permission. Unauthorized use strictly prohibited. Licenses held under ADT Commercial LLC available at https://www.adt.com/commercial/licenses.";
        BrowserUtils.assertEquals(page.footerCopyRight.getText(), text);
    }
}
