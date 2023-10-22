package pages;

import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class HealthSeniorPage {
    public HealthSeniorPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
}
