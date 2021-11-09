package com.noturaun.steps.tokopedia;

import com.noturaun.Pages.tokopedia.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.noturaun.setups.BrowserInstance.getBrowserInstance;
import static org.junit.jupiter.api.Assertions.*;

public class HomePageSteps {
    HomePage actor = new HomePage(getBrowserInstance());

    @Given("{string} on Tokopedia homepage")
    public void userOnTokopediaHomepage(String user) {
        actor.loadPage("https://tokopedia.com");
    }

    @When("he enter {string} name on the search bar")
    public void userEnterProductNameOnTheSearchBar(String keyword) {
        actor.enterKeyword(keyword);
    }

    @Then("he should be redirected to search result page for {string} or {string}")
    public void userShouldBeRedirectedToSearchResultPage(String expectedResult, String alt) {
        assertTrue(actor.waitResult().contains(expectedResult));
    }
}
