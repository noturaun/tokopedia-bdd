package com.noturaun.steps.tokopedia;

import static com.noturaun.setups.BrowserInstance.getBrowserInstance;

public class Tokopedia {

    static String url = "https://tiket.tokopedia.com/kereta-api/";


    public static void openTicketPage(){
        getBrowserInstance().get(url);
    }
}
