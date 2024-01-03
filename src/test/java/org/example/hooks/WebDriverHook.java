package org.example.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.example.utils.WebDriverService;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class WebDriverHook {

    private final WebDriverService webDriverService;

    public WebDriverHook(WebDriverService webDriverService) {
        this.webDriverService = webDriverService;
    }

    @Before("@selenium")
    public void setup() {
        webDriverService.setup();
    }

    @AfterStep
    public void takeScreenShot(Scenario scenario){
        byte[] ss = ((TakesScreenshot) webDriverService.webDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(ss, "image/png", "evidencia.png");
    }

    @After("@selenium")
    public void tearDown() {
        webDriverService.webDriver().quit();
    }
}
