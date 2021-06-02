package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks extends Utils {
    HomePage homepage = new HomePage();
    @Before
    public void openBrowser() throws IOException, InterruptedException {
        // open browser
        homepage.openBrowser();
        //driver.get();

    }

    @After
    public void closeBrowser(){
        driver.quit();
    }

}
