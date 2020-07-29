package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;




public class Hooks extends Util
{
    BrowserManager browserManager = new BrowserManager();//create object for Browsermanager class

    @Before  //before tag
    public void openBrowser() {
        browserManager.setUpBrowser();

    }
    @After  //after tag
    public void closerBrowser(){


        browserManager.closeBrowser();
    }
}

