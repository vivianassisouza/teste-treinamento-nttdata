package org.example.steps;

import io.cucumber.java.en.And;
import org.example.pages.GoogleHomePage;

public class GoogleSteps {

    private final GoogleHomePage googleHomePage;

    public GoogleSteps(GoogleHomePage googleHomePage) {
        this.googleHomePage = googleHomePage;
    }

    @And("a search for dog")
    public void searchForDog() {
        googleHomePage.navigateToGoogle();
        googleHomePage.search("dog");
    }

    @And("im find results about dogs")
    public void resultAboutDog() {
        // faz depois
    }
}
