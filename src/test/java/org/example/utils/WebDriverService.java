package org.example.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class WebDriverService {

    //Serviço para definir configurações para o web-driver (navegador automatizado)
    //Esse serviço também é usado para chamar o 'driver' nas classes de page (sem precisar inicializá-lo nelas todas)

    //Inicialização padrão do driver
    private WebDriver webDriver;
    public WebDriver webDriver() {
        return webDriver;
    }

    //Método que define configurações de como o webdriver irá iniciar e qual webdriver será usado
    public void setup(String browser) {
        switch (browser.toLowerCase()) {
            case "firefox" -> webDriver = new FirefoxDriver();
            case "edge" -> webDriver = new EdgeDriver();
            default -> webDriver = new ChromeDriver(); // Chrome é o padrão
        }
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    //Após o Java 12 podemos usar o lambda no switch, tratando as
    // informações de maneira mais abreviada e mais fácil de entender,
    // dessa forma omitindo o uso do 'break' em cada case.
}
