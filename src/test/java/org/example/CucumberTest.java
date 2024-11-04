package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //Anotação JUnit para identificar o framework de teste

@CucumberOptions( // Anotação do framework para definir o funcionamento do Cucumber
        features = "src/test/resources/org/example/features", // Caminho para os arquivos de feature
        glue = "org.example", // Pacote onde estão as definições de passo
        plugin = {
                "pretty", // Formatação de saída legível
                "html:src/reports/sample/report.html", // Relatório em HTML
                "json:src/reports/sample/report.json", // Relatório em JSON
                "junit:src/reports/sample/report.xml" // Relatório em XML para integração contínua
        },
        monochrome = true// Configuração para saída de console mais legível
)

public class CucumberTest {}
