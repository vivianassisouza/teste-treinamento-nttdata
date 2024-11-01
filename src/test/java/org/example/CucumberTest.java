package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //Anotação JUnit para identificar o framework de teste

@CucumberOptions( //Anotação do framework para definir o funcionamento do Cucumber
        plugin = {"pretty", "html:src/reports/sample/report.html"}
)

public class CucumberTest {}
