package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.CucumberLogUtils;

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

    @FindBy(xpath = "//u[normalize-space()='Click here.']")
    public WebElement clickHereBtn;

    @FindBy(xpath = "//div[@class='vid-img-overlay row no-gutters d-flex align-items-center align-self-center']")
    public WebElement videoImg;

    @FindBy(xpath = "//span[@class='btn-video-icon video-blue-btn']")
    public WebElement playBtn;

    @FindBy(xpath = "//div[@id='parent-padding-795230662']//span[@class='btn-cta-text']")
    public List<WebElement> shopNowBtns;

    public void clickShopNowBtn() {
        Actions actions = new Actions(BrowserUtils.getDriver());
        for (WebElement shopBtn : shopNowBtns) {
            shopBtn.click();
            BrowserUtils.getDriver().navigate().back();

          // String title= BrowserUtils.getDriver().getTitle();
          // System.out.println(title);
           //CucumberLogUtils.logPass("Title is: "+title, true);;
           // BrowserUtils.getDriver().findElement(By.xpath("//a[@class='backButton']")).click();
            BrowserUtils.sleep(2000);



        }
    }
}


