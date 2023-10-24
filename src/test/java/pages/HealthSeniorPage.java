package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class HealthSeniorPage {
    @FindBy(css = ".dropdown-menu.show")
    public WebElement dropDownMenu;
    @FindBy(xpath = "/html//header[@id='nav-menu']//div[@class='dropdown-menu show']/a[@href='/health']")
    public WebElement healthSeniorSafetyBtn;

    public HealthSeniorPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
}
