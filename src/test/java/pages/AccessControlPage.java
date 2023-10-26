package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class AccessControlPage {
    public AccessControlPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(xpath = "//button[@id='submit_banner_form_437']")
    public WebElement callMeBtn;
    @FindBy(xpath = "//div[@id='container-form-banner-id']")
    public WebElement callMeMessage;
    @FindBy(xpath = "//button[@id='Btn_Industry_437']")
    public WebElement industryBtn;
    @FindBy(xpath = "//button[@id='Btn_Company_Size_437']//span[@class='flabel'][normalize-space()='Company Size']")
    public WebElement companySizeBtn;
    @FindBy(xpath = "//ul[@class='dropdown-menu show']//a[contains(text(),'Other')]")
    public WebElement Other;
    @FindBy(xpath = "//ul[@class='dropdown-menu show']//a[contains(text(),'100 - 1,000 sq. ft.')]")
    public WebElement companySize;


 }
