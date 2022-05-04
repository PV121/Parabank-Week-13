package com.parasoft.parabank.testbase;


import com.parasoft.parabank.propertyreader.PropertyReader;
import com.parasoft.parabank.utility.Utility;
import org.junit.Before;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod// before method testng annotations
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod// after method testng annotations
    public void tearDown(){
        closeBrowser();
    }
}
