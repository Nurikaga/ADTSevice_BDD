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

    @FindBy(xpath = "//p[@class='text-justify pb-2 pb-lg-0']")
    public WebElement footerText;

    @FindBy(xpath = "/html//a[@id='dropdownMenuLink']")
public WebElement dropdownTerms;












    public SmallBusinessPage() {

        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }


}


