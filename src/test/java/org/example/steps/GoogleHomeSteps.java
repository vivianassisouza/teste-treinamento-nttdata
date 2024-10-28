package org.example.steps;

import io.cucumber.java.en.And;
import org.example.pages.GoogleHomePage;


public class GoogleHomeSteps {

    private final GoogleHomePage googleHomePage;

    //Construtor
    public GoogleHomeSteps(GoogleHomePage googleHomePage) {
        this.googleHomePage = googleHomePage;
    }

    // Actions
    @And("que acesso a página inicial do Google")
    public void navegarParaGoogleHomePage() {
        googleHomePage.navegarParaGoogleHomePage();
    }

    @And("busco por {string}")
    public void digitarTextoNaBarraDeBusca(String text) {
        googleHomePage.digitarTextoNaBarraDeBusca(text);
    }

    @And("pressiono Enter para buscar")
    public void pressionarEnter() {
        googleHomePage.pressionarEnter();
    }
}