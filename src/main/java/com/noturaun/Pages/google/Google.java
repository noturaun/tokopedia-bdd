package com.noturaun.Pages.google;

import com.noturaun.Pages.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class Google extends Base {
    private WebDriver browser;

    @FindBy(name = "q")
    WebElement input;

    @FindBy(xpath = "//div[@class='g']//a//h3")
    List<WebElement> results;

    @FindBy(id = "res")
    WebElement resultContainer;

    public Google(WebDriver browser) {
        super(browser);
        PageFactory.initElements(browser, this);
    }


    public void inputKeyword(String keyword){
        input.sendKeys(keyword);
        input.sendKeys(Keys.ENTER);
    }

    public List<String> resultLink(String expected, String alt){
        getWait().until(ExpectedConditions.visibilityOf(resultContainer));
        List<String> resultsList = new ArrayList<>();
        results.forEach(item -> {
            if (item.getText().contains(expected) || item.getText().contains(alt)){
                resultsList.add(item.getText());
            }
        });
        return resultsList;
    }
}
