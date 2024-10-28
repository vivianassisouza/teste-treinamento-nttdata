package org.example.pages;

import org.example.utils.WebDriverService;
import org.openqa.selenium.support.PageFactory;


public class BasePage {

    protected final WebDriverService webDriverService;

    public BasePage(WebDriverService webDriverService) {
        this.webDriverService = webDriverService;
        PageFactory.initElements(webDriverService.webDriver(), this);
    }

}
