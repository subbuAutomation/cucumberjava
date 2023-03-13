package stepdefinitons;


import io.cucumber.java.Before;

public class Hooks {

    @Before("@myacconunt")
    public void before(){
        System.out.println("sabse pheele me  hi aaya");
    }
}
