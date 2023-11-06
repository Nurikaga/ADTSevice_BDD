package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class AccessControlPage {
    public AccessControlPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(xpath = "//form[@id='adt-banner-form-id']//button[@name='submit_banner_form']")
    public WebElement callMeBtn;
    @FindBy(xpath = "//div[@id='container-form-banner-id']")
    public WebElement callMeMessage;
    @FindBy(xpath = "//div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]")
    public WebElement industryBtn;
    @FindBy(xpath = "//div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/button[1]")
    public WebElement companySizeBtn;
    @FindBy(xpath = "//ul[@class='dropdown-menu show']//a[contains(text(),'Other')]")
    public WebElement Other;
    @FindBy(xpath = "//ul[@class='dropdown-menu show']//a[contains(text(),'100 - 1,000 sq. ft.')]")
    public WebElement companySize;
    @FindBy(xpath = "/html//form[@id='adt-banner-form-id']//input[@name='Customer_Full_Name']")
    public WebElement fullNameInput;
    @FindBy(xpath = "/html//form[@id='adt-banner-form-id']//input[@name='E_Mail_Address']")
    public WebElement emailInput;
    @FindBy(xpath = "/html//form[@id='adt-banner-form-id']/div[@class='form-field-collection']//input[@name='Phone_Number_Primary']")
    public WebElement phoneInput;
    @FindBy(xpath = "/html//form[@id='adt-banner-form-id']//input[@name='Business_Name']")
    public WebElement companyName;
@FindBy(xpath = "/html//form[@id='adt-banner-form-id']/div[@class='form-field-collection']//input[@name='Postal_Code']")
    public WebElement zipCode;

public void fillOutForm(String fullName, String email, String phone, String company, String zip) {
    fullNameInput.sendKeys(fullName);
    emailInput.sendKeys(email);
    phoneInput.sendKeys(phone);
    companyName.sendKeys(company);
    zipCode.sendKeys(zip);
}





}
