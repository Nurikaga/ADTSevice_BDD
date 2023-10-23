package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class HealthSeniorPage {
    public HealthSeniorPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
    @FindBy(xpath = "//div[@id='parent-padding-654710006']//div[@class='col-12 col-12 col-xs-12 col-sm-12 col-md-12 col-lg-4  ']")
    public List<WebElement> pictures;

    @FindBy(xpath = "//div[@id='parent-padding-654710006']//div[@class='adt7-text-multi aem-GridColumn aem-GridColumn--default--12']")
    public List<WebElement> textUnderPic;

    @FindBy(xpath = "//div[@id='parent-padding-654710006']//div[@class='adt7-text-multi aem-GridColumn aem-GridColumn--default--12']")
    public List<WebElement> onlineSpecialBtn;
}
