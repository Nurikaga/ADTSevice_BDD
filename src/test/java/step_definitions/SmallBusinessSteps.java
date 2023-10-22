package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.CommonPage;
import pages.SmallBusinessPage;
import utils.BrowserUtils;

public class SmallBusinessSteps implements CommonPage {

    SmallBusinessPage page;

    public SmallBusinessSteps() {
        page = new SmallBusinessPage();

    }

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


