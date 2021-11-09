package com.noturaun.Pages.tokopedia;

import com.noturaun.Pages.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class TicketPage extends Base {

    @FindBy(css = "input[data-testid=\"selectorAsal\"]")
    WebElement departureBox;

    @FindBy(css = "input[data-testid=\"selectorTujuan\"]")
    WebElement arrivalBox;

    @FindBy(className = "optionText")
    List<WebElement> stationOption;

    @FindBy(xpath = "//div[contains(text(), 'ASAL')]")
    WebElement origin;

    @FindBy(xpath = "//div[contains(text(), 'TUJUAN')]")
    WebElement destination;



    public TicketPage(WebDriver browser) {
        super(browser);
        PageFactory.initElements(browser, this);
    }

    public void clickOnDepartureBox(){
        departureBox.click();
    }

    public void clickOnArrivalBox(){
        arrivalBox.click();
    }

    public boolean getVisibilityOfOriginStationOption() {
        return origin.isDisplayed();
    }

    public void selectDepartureStation(String station){
        getWait().until(ExpectedConditions.visibilityOf(origin));
        for (WebElement option : stationOption) {
            if (option.getText().equals(station)){
                option.getText();
                option.click();
            }
        }
    }

    public boolean getVisibilityOfDestinationStationOption() {
        return destination.isDisplayed();
    }
    public void selectArrivalStation(String station){
        getWait().until(ExpectedConditions.visibilityOf(destination));
        for (WebElement option : stationOption) {
            if (option.getText().equals(station)){
                option.getText();
                option.click();
            }
        }
    }

    public String getDepartureStation(String expected){
        getWait().until(ExpectedConditions.attributeContains(departureBox,"value",expected));

        return departureBox.getAttribute("value");
    }

    public String getArrivalStation(String expected){
        getWait().until(ExpectedConditions.attributeContains(arrivalBox,"value",expected));
        System.out.println("Selected : " + arrivalBox.getCssValue("value"));
        return arrivalBox.getAttribute("value");
    }

}
