package StepDefinitions;

import Utilies.BaseWebDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public void before(){

    }

    @After
    public void after(){
        BaseWebDriver.quitDriver();
    }
}
