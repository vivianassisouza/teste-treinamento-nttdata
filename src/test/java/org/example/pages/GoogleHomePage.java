package org.example.pages;

import org.example.utils.WebDriverService;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHomePage extends BasePage {

    public GoogleHomePage(WebDriverService webDriverService) {
        super(webDriverService);
    }

    @FindBy(css = "[type=search]")
    private WebElement searchBar;

    public void navigateToGoogle() {

        webDriverService.webDriver().navigate().to(
                "https://google.com.br");
    }

    public void search(String text) {
        searchBar.sendKeys(text);
        searchBar.sendKeys(Keys.ENTER);
    }
}
