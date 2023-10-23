package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BrowserUtils;
import utils.CucumberLogUtils;

import java.util.List;

public class VideoSurveillancePage {
    public VideoSurveillancePage() {
    }
    @FindBy(xpath = "//a[normalize-space()='Video Surveillance']")
    public WebElement videoSurveillanceBtn;
    @FindBy(xpath = "//div[@class=' col-12 col-xs-12 col-sm-12 col-md-3 col-lg-3 col-xg-3 ']")
    public List<WebElement> picTitleText;

    @FindBy(id = "img-4828")
    public WebElement pic1;

    }

