package org.example.pages;

import org.example.utils.WebDriverService;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHomePage extends BasePage {

    public GoogleHomePage(WebDriverService webDriverService) {
        super(webDriverService);
    }

    @FindBy(css = "[title='Pesquisar']")
    private WebElement searchBar;

    public void navegarParaGoogleHomePage() {
        webDriverService.webDriver().navigate().to(
                "https://google.com.br");
    }

    public void digitarTextoNaBarraDeBusca(String text) {
        searchBar.sendKeys(text);
    }

    public void pressionarEnter(){
        searchBar.sendKeys(Keys.ENTER);
    }

}
