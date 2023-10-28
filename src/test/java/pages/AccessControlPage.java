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


 }
