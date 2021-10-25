package com.noturaun.steps;

import com.noturaun.Pages.Google;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;
import org.hamcrest.core.StringContains;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

import static com.noturaun.setups.BrowserInstance.getBrowserInstance;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class GoogleSearchSteps {

    Google google = new Google(getBrowserInstance());

    @Given("User on Google homepage")
    public void user_on_google_homepage() {
        getBrowserInstance().get("https://google.com");
    }
    @When("User enter search keyword")
    public void user_enter_search_keyword() {
        google.inputKeyword("Panda");
    }
    @When("Hit enter")
    public void hit_enter() {
        google.hitEnter();
    }
    @Then("User should be redirected to search result pages")
    public void user_should_be_redirected_to_search_result_pages() {
        List<String> resultString = new ArrayList<>();
        assertNotNull(google.resultLink());
        google.resultLink().forEach( result -> resultString.add(result.getText()));
        assertThat(resultString, containsInAnyOrder(StringContains.containsString("\"Panda\""), StringContains.containsString("panda")));
    }
}
