package org.example.steps;

import io.cucumber.java.en.And;
import org.example.pages.GoogleSearchPage;
import org.junit.Assert;


public class GoogleSearchSteps {

    private final GoogleSearchPage googleSearchPage;

    //Construtor
    public GoogleSearchSteps(GoogleSearchPage googleSearchPagePage) {
        this.googleSearchPage = googleSearchPagePage;
    }

    // Checks
    @And("encontro resultados sobre {string}")
    public void validaSeTextoPresente(String text) {
        Assert.assertTrue(googleSearchPage.validaSeTextoPresente(text));
    }
}