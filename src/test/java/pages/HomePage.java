package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class HomePage {
    public HomePage() {

        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
    @FindBy(css = ".logo > img[alt='ADT LOGO']")
    public WebElement adtLogoBtn;
    @FindBy(css = ".dropdown-menu.show")
    public WebElement dropDownMenu;
    @FindBy(xpath = "//span[contains(text(),'Shop Now')]")
    public WebElement shopNowBtn;
    @FindBy(css = ".tfn-wrapper > a[title='Call'] > img[alt='Call icon']")
    public WebElement callBtn;
    @FindBy(xpath = "//b//span[contains(@class,'phn-clr campaign-tfn-number')][normalize-space()='(800) 510-9061']")
    public WebElement phoneNumber;
    @FindBy(css = ".right-container > .icon > img[alt='customer icon']")
    public WebElement customerIcon;
    @FindBy(xpath = "//a[@class='btn-cta btn-cta-blue btn-cta-sm d-flex align-items-center js-open-adt-form-header']//span[@class='btn-cta-text'][normalize-space()='Get Free Quote']")
    public WebElement getFreeQuoteBtn;
    @FindBy(xpath = "//div[@class='coreheader-adt-form-header hidden-sm-down']")
    public WebElement getFreeQuoteWindow;
    @FindBy(css = ".d-lg-block.d-none.footer-social-container")
    public WebElement footerSocialMediaIcons;
    @FindBy(css = ".d-lg-block [title='FaceBook']")
    public WebElement facebookIcon;
    @FindBy(css = ".d-lg-block.d-none.footer-social-container  a[title='Twitter']")
    public WebElement twitterIcon;
    @FindBy(css = ".d-lg-block [title='Pinterest']")
    public WebElement pinterestIcon;
    @FindBy(css = ".d-lg-block [title='Instagram']")
    public WebElement instagramIcon;
    @FindBy(css = ".d-lg-block [title='Youtube']")
    public WebElement youtubeIcon;

@FindBy(xpath = "//h4[text()='Not sure where to start? ']")
public WebElement notSureQuestion;

    @FindBy(xpath = "//span[contains(text(), 'Take a quiz')]")
    public WebElement takeAQuizBtn;

    @FindBy(xpath = "(//p[contains(text(), 'Get in touch with America’s #1 smart home security provider')])[2]")
    public WebElement getInTouchText;

    @FindBy(xpath = "//div[@class='adt7-btn adt7-btn-6316 text-center text-md-center text-lg-left']")
    public WebElement phoneNumberBtn;

    @FindBy(xpath = "//p[contains(text(), 'An ADT security expert can help you customize the perfect solution.')]")
    public WebElement anAdtSecText;
}

