package com.noturaun.steps.tokopedia.ticket;

import com.noturaun.Pages.tokopedia.TicketPage;
import com.noturaun.steps.tokopedia.Tokopedia;
import io.cucumber.java.en.*;

import static com.noturaun.setups.BrowserInstance.getBrowserInstance;
import static org.assertj.core.api.Assertions.*;

public class SelectDepartureStationStep extends Tokopedia {

    TicketPage actor = new TicketPage(getBrowserInstance());

    @Given("User already on tokopedia ticket web page")
    public void user_alredy_on_tokopedia_ticket_web_page() {
        openTicketPage();
    }


    @When("{string} click on departure station box")
    public void click_on_departure_station_box(String string) {
        actor.clickOnDepartureBox();
    }

    @Then("s?he can see the origin station option")
    public void s_he_can_see_the_origin_stations_selection_list() {
        assertThat(actor.getVisibilityOfOriginStationOption()).isTrue();
    }

    @And("s?he select {string} as departure station")
    public void s_he_select_as_departure_station(String station) {
        actor.selectDepartureStation(station);
    }

    @Then("s?he should see that her?his departure station {string} is selected")
    public void s_he_should_see_that_her_his_departure_station_is_selected(String expected) {
        assertThat(actor.getDepartureStation(expected)).isEqualTo(expected);
    }

    @When("{string} click on arrival station box")
    public void click_on_arrival_station_box(String string) {
        actor.clickOnArrivalBox();
    }

    @Then("s?he can see the destination station option")
    public void s_he_can_see_the_destination_stations_selection_list() {
        assertThat(actor.getVisibilityOfDestinationStationOption()).isTrue();
    }

    @And("s?he select {string} as arrival station")
    public void s_he_select_as_arrival_station(String station) {
        actor.selectArrivalStation(station);
    }

    @Then("s?he should see that her?his arrival station {string} is selected")
    public void s_he_should_see_that_her_his_arrival_station_is_selected(String expected) {
        assertThat(actor.getArrivalStation(expected)).isEqualTo(expected);
    }

}
