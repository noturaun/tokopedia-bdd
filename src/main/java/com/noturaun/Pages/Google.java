package com.noturaun.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Google {
    private WebDriver browser;

    @FindBy(name = "q")
    WebElement input;

    @FindBy(xpath = "//div[@class='g']//h3")
    List<WebElement> results;

    public Google(WebDriver browser) {
        this.browser = browser;
        PageFactory.initElements(browser, this);
    }

    public Google() {
    }

    public void inputKeyword(String keyword){
        input.sendKeys(keyword);
    }

    public void hitEnter(){
        input.sendKeys(Keys.ENTER);
    }

    public List<WebElement> resultLink(){
        return results;
    }
}
