package pages;


import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import java.util.List;

public class HealthSeniorPage {


    public HealthSeniorPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
    @FindBy(css = ".dropdown-menu.show")
    public WebElement dropDownMenu;
    @FindBy(xpath = "/html//header[@id='nav-menu']//div[@class='dropdown-menu show']/a[@href='/health']")
    public WebElement healthSeniorSafetyBtn;

    @FindBy(xpath = "//div[@id='parent-padding-654710006']//div[@class='col-12 col-12 col-xs-12 col-sm-12 col-md-12 col-lg-4  ']")
    public List<WebElement> pictures;

    @FindBy(xpath = "//div[@id='parent-padding-654710006']//div[@class='adt7-text-multi aem-GridColumn aem-GridColumn--default--12']")
    public List<WebElement> textUnderPic;

    @FindBy(xpath = "//div[@id='parent-padding-654710006']//div[@class='adt7-text-multi aem-GridColumn aem-GridColumn--default--12']")
    public List<WebElement> onlineSpecialBtn;

    @FindBy(xpath = "(//span[@class='btn-cta-text'])[1]")
    public WebElement shopNowBtn;
    @FindBy(xpath = "(//span[@class='btn-cta-text'])[2]")
    public WebElement shopNowBtn2;
    @FindBy(xpath = "(//span[@class='btn-cta-text'])[3]")
    public WebElement shopNowBtn3;
    @FindBy(xpath = "(//span[@class='btn-cta-text'])[4]")
    public WebElement shopNowBtn4;
    @FindBy(xpath = "//div[@class='legal']//u[contains(text(),'Click here.')]")
    public WebElement clickHereBtn;
    @FindBy(xpath = "//div[@class='vid-img-overlay row no-gutters d-flex align-items-center align-self-center']")
    public WebElement videoImg;
    @FindBy(xpath = "//*[@class='img-fluid split-container-img']")
    public WebElement bigImg;

    @FindBy(xpath = "//span[@class='btn-video-icon video-blue-btn']")
    public WebElement playBtn;
    @FindBy(xpath = "//div[@class='tfn-wrapper']")
    public WebElement phoneIcon;
  
    @FindBy(xpath = "//div[@class='nav-end']//a[@href='/customer/login']")
    public WebElement customerIcon;
    @FindBy(xpath = "//div[@id='myCardModal']//div[@class='aem-Grid aem-Grid--12 aem-Grid--default--12 ']//img")
    public List<WebElement> images;

    @FindBy(xpath = "//p[contains(text(),'When you need help quickly, ADT is there for you. ')]")
    public WebElement descriptionUnderHeaderText;

    @FindBy(xpath = "//div[@class='feature-container']")
    public List<WebElement> threeButtons;
   @FindBy(xpath = "//a[@href='/about-adt/legal/home-health-term-and-conditions'][@title='See terms and pricing']")
    public WebElement clickHereBtn2;
   @FindBy(xpath = "//p[@class='adt7-txa-2385 adt7-txa']")
    public WebElement text;
    @FindBy(css = ".adt7-txa-7975.adt7-txa")
    public WebElement header;


    @FindBy(xpath = "//div[@class='adt-footer-links-section d-none d-lg-block']//a[@title='Support']")
    public WebElement supportBtn;

    @FindBy(xpath = "//div[@class='adt-footer-links-section d-none d-lg-block']//a[@title='Contact Us']")
    public WebElement contactUsBtn;

    @FindBy(xpath = "//div[@class='footerWidget4 slds-col slds-p-around_small slds-size_1-of-1 slds-medium-size_1-of-5']//a[contains(text(),'Leave Website Feedback')]")
    public WebElement leaveWebFeedbackBtn;

    @FindBy(xpath = "//img[@alt='Image']")
    public WebElement adtEmblem;
}


