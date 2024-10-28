package org.example.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverService {

    //Serviço para definir configurações para o web-driver (navegador automatizado)
    //Esse serviço também é usado para chamar o 'driver' nas classes de page (sem precisar inicializá-lo nelas todas)


    //Inicialização padrão do driver
    private WebDriver webDriver;
    public WebDriver webDriver() {
        return webDriver;
    }

    //Método que define configurações de como o driver irá iniciar
    public void setup() {
        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
}
