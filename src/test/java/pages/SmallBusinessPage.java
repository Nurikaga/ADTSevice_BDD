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
    @FindBy(css = "a[title='Privacy Policy']")
    public WebElement privacyPolicy;
    @FindBy(xpath = "//p[@class='text-justify pb-2 pb-lg-0']")
    public WebElement footerText;
    @FindBy(xpath = "/html//a[@id='dropdownMenuLink']")
    public WebElement dropdownTerms;
    @FindBy(xpath = "//a[@title='Advertising Choice']")
    public WebElement advertisingChoiceTerms;
    @FindBy(xpath = "//div[contains(text(),'Fill out')]")
    public WebElement fillOutThisF;
    @FindBy(xpath = "(//div[@class='res-form-title-h3 ha3'])[1]")
    public WebElement weWillCallYou;
    @FindBy(xpath = "//h1")
    public WebElement headerText;
    @FindBy(xpath = "//a[@title='En Español']")
    public WebElement espanolBtn;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
    public WebElement industryBtnRadio2;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
    public WebElement companySizeBtnRadio2;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    public WebElement fullNameInput2;
    @FindBy(xpath = "/html//div[@id='adt-content-id']/div[@class='main-content']/div/div/div[3]/div[@class='res-footer-form']/div[@class='adt-form-res-170 res-form']/div/div//form//input[@name='E_Mail_Address']")
    public WebElement emailInput2;
    @FindBy(xpath = "/html//div[@id='adt-content-id']/div[@class='main-content']/div/div/div[3]/div[@class='res-footer-form']/div[@class='adt-form-res-170 res-form']/div/div//form//input[@name='Phone_Number_Primary']")
    public WebElement phoneInput2;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    public WebElement companyName2;
    @FindBy(xpath = "/html//div[@id='adt-content-id']/div[@class='main-content']/div/div/div[3]/div[@class='res-footer-form']/div[@class='adt-form-res-170 res-form']/div/div//form//input[@name='Postal_Code']")
    public WebElement zipCode2;
    @FindBy(xpath = "//html//div[@id='adt-content-id']/div[@class='main-content']/div/div/div[3]/div[@class='res-footer-form']/div[@class='adt-form-res-170 res-form']/div/div/div[@class='adt7-res-form']/div[@class='adt7-form-cnt']/div[@class='container-fluid res-form-cnt']//form//ul[@class='dropdown-menu show']/li[7]/a[@href='javascript:void(0);']")
    public WebElement other2;
    @FindBy(xpath = "/html//div[@id='adt-content-id']/div[@class='main-content']/div/div/div[3]/div[@class='res-footer-form']/div[@class='adt-form-res-170 res-form']/div/div/div[@class='adt7-res-form']/div[@class='adt7-form-cnt']/div[@class='container-fluid res-form-cnt']//form//ul[@class='dropdown-menu show']/li[1]/a[@href='javascript:void(0);']")
    public WebElement companySize2;
    public void fillOutForm(String fullName, String email, String phone, String company, String zip) {
        fullNameInput2.sendKeys(fullName);
        emailInput2.sendKeys(email);
        phoneInput2.sendKeys(phone);
        companyName2.sendKeys(company);
        zipCode2.sendKeys(zip);
    }


    }





