package stepdefinitons;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Mystepdefinition {



    @Given("^I want to access to the jaypore application$")
    public void i_want_to_access_to_the_jaypore_application() throws Throwable {
        System.out.println("Hello i am acess to application");

    }

    @And("^i click on login$")
    public void i_click_on_login(){
        System.out.println("Hello i am in step 2");
    }
    @Given("i add seach something")
    public void i_add_seach_something() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("i am in search");
    }
    @Given("i went to my account page")
    public void i_went_to_my_account_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("i am in my account");
    }
}
