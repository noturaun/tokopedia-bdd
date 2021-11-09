package com.noturaun.steps;

import com.noturaun.Pages.google.Google;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

import static com.noturaun.setups.BrowserInstance.getBrowserInstance;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class GoogleSearchSteps {

    Google google = new Google(getBrowserInstance());

    @Given("{string} on Google homepage")
    public void user_on_google_homepage(String actor) {
        getBrowserInstance().get("https://google.com");
    }
    @When("s?he enter search {string}")
    public void s_he_enter_search_keyword(String keyword) {
        google.inputKeyword(keyword);
    }
    @Then("s?he should be redirected to result page for {string} or {string}")
    public void s_he_should_be_redirected_to_search_result_pages(String expectedResult, String alt) {
        List<String> resultString = new ArrayList<>();
        assertNotNull(google.resultLink(expectedResult, alt));
        google.resultLink(expectedResult, alt).forEach(
                result -> assertThat(result).containsAnyOf(expectedResult, alt)
        );
    }
}
