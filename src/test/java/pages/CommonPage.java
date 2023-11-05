package pages;

public interface CommonPage {
    String XPATH_TEMPLATE_BUTTON = "//button[text()='%s']";
    String XPATH_TEMPLATE_TEXT_TITLE = "//a[@title='%s']";
    String XPATH_TEMPLATE_LINKTEXT = "//a[text()='%s']";
    String XPATH_TEMPLATE_LINKTEXT2 = "//h5[normalize-space()='%s']";
    String XPATH_TEMPLATE_TEXT = "//*[text()='%s']";
    String XPATH_TEMPLATE_TEXT_h4 = "//h4[@class='adt7-txa-6326 adt7-txa'][contains(text(), '%s')]";
    String XPATH_TEMPLATE_TEXT_h5 = "//h5[contains(text(), '%s')]";
    String XPATH_TEMPLATE_TEXT_p = "//p[contains(text(), '%s')]";
    String XPATH_TEMPLATE_INPUT_FIELD = "//input[@placeholder='%s']";
    String XPATH_TEMPLATE_INPUT_FIELD2 = "//div[@id='adt-header-id']//input[@type='text'][@class='form-control'][@name='%s']";
    String XPATH_TEMPLATE_TEXT_ShopNow = "//div[@class='col-12 ']//span[@class='btn-cta-text'][normalize-space()='%s']";
    String XPATH_TEMPLATE_TEXT_CONTAINS = "//*[contains(text(), '%s')]";
    String XPATH_TEMPLATE_TEXT2_CONTAINS = "(//a[contains(text(), '%s')])[2]";
    String XPATH_TEMPLATE_CLASS = "//*[@class='%s']";
    String XPATH_TEMPLATE_CLASS_DIV = "//div[@class='%s']";
    String XPATH_TEMPLATE_TEXT2 = "//div[@class='menu-bg']//a[contains(@href,'%s')]";
    String XPATH_TEMPLATE_LINKTEXT_HREF = "//a[@href='%s']";
    String XPATH_TEMPLATE_IMG = "//img[@id='%s')]";
    String XPATH_TEMPLATE_NUR = "//div[@class='col-12 col-12 col-xs-12 col-sm-12 col-md-12 col-lg-4  ']";

    String XPATH_TEMPLATE_INPUT_FIELD3 = "//*[@id='%s']";

    String XPATH_TEMPLATE_TEXT_CLASS = "//div[@class='adt-footer-links-section d-none d-lg-block']//a[text()='%s']";
    String CSS_TEMPLATE_IMG = "img[alt='%s']";
    String CSS_TEMPLATE_INPUT = "div[class='form-field-collection'] input[name='%s']";






}