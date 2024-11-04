package org.example.pages;

import org.example.utils.WebDriverService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class BasePage {

    protected final WebDriverService webDriverService;

    //Classe para centralizar configurações das pages, como incluir o padrão PageFactory em todas
    public BasePage(WebDriverService webDriverService) {
        this.webDriverService = webDriverService;
        PageFactory.initElements(webDriverService.webDriver(), this);
    }

    //A classe base page serve também para todos os métodos específicos que formos usar nas pages
    public void selectOptionByValue(String selectId, String value){
        WebElement selectElement = webDriverService.webDriver().findElement(By.id(selectId));
        Select select = new Select(selectElement);
        select.selectByValue(value);
    }

    public void selectOptionByVisibleText(String selectId, String text){
        WebElement selectElement = webDriverService.webDriver().findElement(By.id(selectId));
        Select select = new Select(selectElement);
        select.selectByVisibleText(text);
    }
}
