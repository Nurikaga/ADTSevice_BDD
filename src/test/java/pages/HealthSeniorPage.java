package pages;


import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;


import java.util.List;



public class HealthSeniorPage {
    @FindBy(css = ".dropdown-menu.show")
    public WebElement dropDownMenu;
    @FindBy(xpath = "/html//header[@id='nav-menu']//div[@class='dropdown-menu show']/a[@href='/health']")
    public WebElement healthSeniorSafetyBtn;

    public HealthSeniorPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

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
    @FindBy(xpath = "//u[normalize-space()='Click here.']")
    public WebElement clickHereBtn;


    @FindBy(xpath = "//div[@class='vid-img-overlay row no-gutters d-flex align-items-center align-self-center']")
    public WebElement videoImg;

    @FindBy(xpath = "//span[@class='btn-video-icon video-blue-btn']")
    public WebElement playBtn;







    @FindBy(xpath = "//div[@id='myCardModal']//div[@class='aem-Grid aem-Grid--12 aem-Grid--default--12 ']//img")
    public List<WebElement> images;

    @FindBy(xpath = "//p[contains(text(),'When you need help quickly, ADT is there for you. ')]")
    public WebElement descriptionUnderHeaderText;


    @FindBy(xpath = "//div[@class='feature-container']")
    public List<WebElement> threeButtons;

}


