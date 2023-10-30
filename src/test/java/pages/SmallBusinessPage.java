package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class SmallBusinessPage {

    @FindBy(xpath = "//button[@id='mainNav']")
    public WebElement homeAndPersonalBtn;
    @FindBy(css = "//header[@id='nav-menu']//div[@class='adt7-btn-desktop']//a[@title='Open Form']")
    public WebElement freeRiskAssessmentBtn;
    @FindBy(xpath = "//div[@class='card-main-content']")
    public List<WebElement> pictureTitles;
    @FindBy(xpath = "//div[@class='card-text c-bl-text']")
    public List<WebElement> textUnderPictures;
    @FindBy(xpath = "//div[@class='card-main-content']//div[@class='tertiary-link-text']")
    public List<WebElement> learnMoreBtns;
    @FindBy(xpath = "//div[@class='mainc-69392292']/div/div")
    public List<WebElement> imageList4;
    @FindBy(xpath = "//span[@class='btn-equal-web-icon']")
    public WebElement accessabilityBtn;
    @FindBy(xpath = "/html//div[@id='productCategories']")
    public WebElement footerProductCategories;
    @FindBy(css = "div[class='adt-footer-links-section d-none d-lg-block'] a[title='Become an ADT Dealer']")
    public WebElement becomeDealerBtn;
    @FindBy(css = "div[class='adt-footer-links-section d-none d-lg-block'] a[title='Dealer Lookup']")
    public WebElement dealerLookupBtn;
    @FindBy(css = "div[class='adt-footer-links-section d-none d-lg-block'] a[title='Local Service Areas']")
    public WebElement localServiceAreasBtn;
    public SmallBusinessPage() {

        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
}


