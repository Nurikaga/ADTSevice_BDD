package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class SmallBusinessPage {

    public SmallBusinessPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
    @FindBy(xpath = "//button[@id='mainNav']")
    public WebElement homeAndPersonalBtn;

    @FindBy(xpath = "(//span[text()='Small Business'])[1]")
    public WebElement smallBusinessBtn;

}
