package org.example.pages;

import org.example.utils.WebDriverService;


public class GoogleSearchPage extends BasePage {

    public GoogleSearchPage(WebDriverService webDriverService) {
        super(webDriverService);
    }

    //Checks
    public boolean validaSeTextoPresente(String text) {
        return webDriverService.webDriver().getTitle().contains(text)
            && webDriverService.webDriver().getCurrentUrl().contains(text);
    }
}
