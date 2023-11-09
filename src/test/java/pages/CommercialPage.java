package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class CommercialPage{
    public CommercialPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
    @FindBy(xpath = "//section[1]/div[2]/ul[1]/li")
    public List<WebElement> nineteenIcons;


    @FindBy(xpath = "//div/h2[contains(text(),'Powered by Experience. Driven by Excellence.')]")
    public WebElement sectionTitlePoweredByEx;

    @FindBy(xpath = "//a[normalize-space()='OUR ADVANTAGE']")
    public WebElement OurAdvBtn;
    @FindBy(xpath = "//p[@class='text-justify pb-2 pb-lg-0']")
    public WebElement footerCopyRight;

}
