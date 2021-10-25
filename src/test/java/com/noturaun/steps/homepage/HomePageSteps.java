package com.noturaun.steps.homepage;

import com.noturaun.Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.noturaun.setups.BrowserInstance.getBrowserInstance;
import static org.junit.jupiter.api.Assertions.*;

public class HomePageSteps {
    HomePage hp = new HomePage(getBrowserInstance());

    @Given("User on Tokopedia homepage")
    public void userOnTokopediaHomepage() {
        hp.loadPage("https://tokopedia.com");
    }

    @When("User enter product name on the search bar")
    public void userEnterProductNameOnTheSearchBar() {
        hp.enterKeyword("buku");
    }

    @And("Press on Enter key")
    public void hitEnter() {

    }

    @Then("User should be redirected to search result page")
    public void userShouldBeRedirectedToSearchResultPage() {
        assertTrue(hp.waitResult().contains("buku"));
//        hp.waitResult();
    }
}
