package com.noturaun.setups;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup extends BrowserInstance {
    ChromeDriver browser;

    protected void startBrowser(){
        WebDriverManager.chromedriver().setup();
        browser = new ChromeDriver();
        setBrowserInstance(browser);
    }

    protected void quitBrowser(){
        browser.quit();
    }

}
