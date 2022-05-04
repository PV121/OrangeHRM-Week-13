package com.orangehrm.demo_opensource.testbase;


import com.orangehrm.demo_opensource.propertyreader.PropertyReader;
import com.orangehrm.demo_opensource.utility.Utility;
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
