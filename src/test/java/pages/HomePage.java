package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class HomePage {

    public HomePage(){

        PageFactory.initElements(BrowserUtils.getDriver(), this); }

    @FindBy (css = ".logo > img[alt='ADT LOGO']")
    public WebElement adtLogoBtn;

    @FindBy (css = ".dropdown-menu.show")
    public WebElement dropDownMenu;

    @FindBy (css =".tfn-wrapper > a[title='Call'] > img[alt='Call icon']")
    public WebElement callBtn;
}
