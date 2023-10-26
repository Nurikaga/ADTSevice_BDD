package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class HomePage {
    public HomePage() {

        PageFactory.initElements(BrowserUtils.getDriver(), this);}

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
    }

