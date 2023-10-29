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

    @FindBy(xpath = "//div[contains(@class,'adt-form-res-835 res-form')]//div[contains(@class,'res-form-sbtl-p2')][normalize-space()='Fill out this form and an ADT specialist will contact you to discuss ADT security solutions.']")
    public WebElement fillOutThisF;
    @FindBy(xpath = "(//div[@class='res-form-title-h3 ha3'])[1]")
    public WebElement weWillCallYou;

    @FindBy(xpath = "//div[contains(@class,'adt-form-res-835 res-form')]//div[contains(@class,'card-title sb ha2')][normalize-space()='Thank You, we will reach out shortly.']")
    public WebElement thankYouText;
}


