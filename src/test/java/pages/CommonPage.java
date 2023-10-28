package pages;

public interface CommonPage {
    String XPATH_TEMPLATE_BUTTON = "//button[text()='%s']";
    String XPATH_TEMPLATE_LINKTEXT = "//a[text()='%s']";
    String XPATH_TEMPLATE_TEXT = "//*[text()='%s']";
    String XPATH_TEMPLATE_TEXT_SPAN = "//span[@class='ha6'][text()='%s']";
    String XPATH_TEMPLATE_INPUT_FIELD = "//input[@placeholder='%s']";
    String XPATH_TEMPLATE_INPUT_FIELD2 = "/html//form[@id='adt-banner-form-id']//input[@name='%s']";
    String XPATH_TEMPLATE_TEXT_ShopNow = "//div[@class='col-12 ']//span[@class='btn-cta-text'][normalize-space()='%s']";
    String XPATH_TEMPLATE_TEXT_CONTAINS = "//*[contains(text(), '%s')]";
    String XPATH_TEMPLATE_TEXT2_CONTAINS = "(//a[contains(text(), '%s')])[2]";
    String XPATH_TEMPLATE_CLASS = "//*[@class='%s']";
    String XPATH_TEMPLATE_CLASS_DIV = "//div[@class='%s']";
    String XPATH_TEMPLATE_TEXT2 = "//div[@class='menu-bg']//a[contains(@href,'%s')]";
    String XPATH_TEMPLATE_LINKTEXT_HREF = "//a[@href='%s']";
    String XPATH_TEMPLATE_IMG= "//img[@id='%s')]";
    String XPATH_TEMPLATE_NUR = "//div[@class='col-12 col-12 col-xs-12 col-sm-12 col-md-12 col-lg-4  ']";



}