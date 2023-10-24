package step_definitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.HealthSeniorPage;
import utils.BrowserUtils;

public class HealthSeniorSteps implements CommonPage {
    HealthSeniorPage page;

    public HealthSeniorSteps() {
        page = new HealthSeniorPage();
    }

    @When("I click  {string} button")
    public void iClickHoveredOverButton(String homePersonalBtn) {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, homePersonalBtn))).click();
    }

    @When("I click on {string} button")
    public void iClickOnButton(String healthSafetyBtn) {
        BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, healthSafetyBtn))).click();
    }

}
