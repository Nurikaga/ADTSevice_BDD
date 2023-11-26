package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.CucumberLogUtils;

import java.util.List;

public class VideoSurveillancePage {
    public VideoSurveillancePage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);

    }
    @FindBy(xpath = "//a[normalize-space()='Video Surveillance']")
    public WebElement videoSurveillanceBtn;
    @FindBy(xpath = "//div[@id='parent-padding-69392292']/div")
    public List<WebElement> imageList;
    @FindBy(xpath = "//div[@class='mainc-69392292']/div/div")
    public List<WebElement> imageList4;




    }

