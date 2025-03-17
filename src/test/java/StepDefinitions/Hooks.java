package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void before(){
        System.out.println("scenario started ");
    }

    @After
    public void after(){
        //  System.out.println("scenario finished");
        // if it works true, I will call quit
        GWD.quitDriver();
    }


}
