package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class SmallBusinessPage {


    public SmallBusinessPage() {

        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(xpath = "//button[@id='mainNav']")
    public WebElement homeAndPersonalBtn;

    @FindBy(xpath = "(//span[text()='Small Business'])[1]")
    public WebElement smallBusinessBtn;


    @FindBy(xpath = "//div[@class='card-main-content']")
    public List<WebElement> pictureTitles;

    @FindBy(xpath = "//div[@class='card-text c-bl-text']")
    public List<WebElement> textUnderPictures;

    @FindBy(xpath = "//div[@class='card-main-content']//div[@class='tertiary-link-text']")
    public List<WebElement> learnMoreBtns;
}


