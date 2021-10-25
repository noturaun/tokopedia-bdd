package com.noturaun.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Base{

    @FindBy(xpath = "//div[@id='search-container']//input")
    WebElement searchBox;

    @FindBy(css = "button[data-testid=\"btnSRPProductTab\"]")
    WebElement productTab;

    @FindBy(xpath = "//div[@data-testid='dSRPSearchInfo']")
    WebElement resultHeader;

    public HomePage(WebDriver browser) {
        super(browser);
        PageFactory.initElements(browser, this);
    }

    public void loadPage(String url){
        getDriver().get(url);
    }

    public void enterKeyword(String phrase){
        searchBox.sendKeys(phrase);
        searchBox.sendKeys(Keys.ENTER);
    }

    public String waitResult(){
        getWait().until(ExpectedConditions.visibilityOf(resultHeader));
        return resultHeader.getText();
    }
}
